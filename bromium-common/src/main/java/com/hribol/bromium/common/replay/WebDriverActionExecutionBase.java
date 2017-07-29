package com.hribol.bromium.common.replay;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ReplayFiltersFacade;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import com.hribol.bromium.replay.report.LoadingTimes;
import com.hribol.bromium.replay.settings.ReplayManager;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hvrigazov on 16.03.17.
 */
public class WebDriverActionExecutionBase implements WebDriverActionExecution {

    public WebDriverActionExecutionBase(ExecutorBuilder executor) throws IOException, URISyntaxException {
        this.executor = executor;
        this.proxyFacade = executor.getProxyFacade();
        this.automationResult = AutomationResult.NOT_STARTED;
    }

    @Override
    public ExecutionReport execute(TestScenario testScenario) {
        ReplayManager replayManager = executor.getReplayManager();
        automationResult = AutomationResult.NOT_STARTED;
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        List<Long> waitingTimes = new ArrayList<>();
        List<Date> actionTimestamps = new ArrayList<>();
        long elapsedTime = System.nanoTime();
        actionTimestamps.add(new Date());

        try {
            automationResult = AutomationResult.EXECUTING;

            for (WebDriverAction webDriverAction : testScenario.steps()) {

                System.out.println("Executing " + webDriverAction.getName());
                try {
                    SynchronizationEvent synchronizationEvent = executor.noHttpRequestsInQueue();
                    executor.getProxyFacade().getResponseFilter().setSynchronizationEvent(synchronizationEvent);
                    executor.getEventSynchronizer().awaitUntil(synchronizationEvent);
                } catch (InterruptedException | URISyntaxException | java.util.concurrent.TimeoutException e) {
                    throw executor.webDriverActionExecutionException("Exception during execution", e);
                }

                proxyFacade.getRequestFilter().setHttpLock(webDriverAction.expectsHttpRequest());

                Future<?> future = executorService.submit(() -> executeIgnoringExceptions(replayManager.getWebDriver(), webDriverAction));
                try {
                    future.get(executor.getTimeout(), TimeUnit.SECONDS);
                }  catch (java.util.concurrent.TimeoutException | InterruptedException e) {
                    throw executor.webDriverActionExecutionException("Exception during execution", e);
                } catch (ExecutionException e) {
                    throw executor.webDriverActionExecutionException("Exception during execution", e.getCause());
                }

                waitingTimes.add(System.nanoTime() - elapsedTime);
                actionTimestamps.add(new Date());
                elapsedTime = System.nanoTime();
            }

            this.automationResult = AutomationResult.SUCCESS;
        } catch (WebDriverActionExecutionException executionException) {
            executionException.printStackTrace();
            this.automationResult = executionException.getAutomationResult();
        }

        replayManager.cleanUpReplay();
        executorService.shutdownNow();
        LoadingTimes loadingTimes = new LoadingTimes(testScenario.getActions(), waitingTimes, actionTimestamps);
        return new ExecutionReport(loadingTimes, replayManager.getHar(), automationResult);
    }

    private ReplayFiltersFacade proxyFacade;
    private ExecutorBuilder executor;

    private AutomationResult automationResult;

    private void executeIgnoringExceptions(WebDriver webDriver, WebDriverAction webDriverAction) {
        int i = 0;

        while (i < executor.getMaxRetries()) {
            try {
                webDriverAction.execute(webDriver, proxyFacade);
                return;
            } catch (WebDriverException ex) {
                System.out.println(ex.toString());
                System.out.println("Could not make it from first try");
                i++;
                try {
                    Thread.sleep(executor.getMeasurementsPrecisionMilli());
                } catch (InterruptedException e) {
                    throw executor.webDriverActionExecutionException("Interrupted while waiting to retry", e);
                }
            }
        }

        throw new TimeoutException("Could not execute the action! " + webDriverAction.getName());
    }

}