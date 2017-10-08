package com.hribol.bromium.common.replay;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.WebDriverActionExecutor;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import com.hribol.bromium.replay.report.LoadingTimes;
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
 * A default implementation of {@link WebDriverActionExecutor}
 */
public class ActionExecutor implements WebDriverActionExecutor {

    public ActionExecutor(ExecutorBuilder dependencies) throws IOException, URISyntaxException {
        this.dependencies = dependencies;
        this.automationResult = AutomationResult.NOT_STARTED;
    }

    @Override
    public ExecutionReport execute(TestScenario testScenario) {
        DriverOperations driverOperations = dependencies.getDriverOperations();
        driverOperations.prepare();
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
                    SynchronizationEvent synchronizationEvent = dependencies.noHttpRequestsInQueue();
                    dependencies.getEventSynchronizer().awaitUntil(synchronizationEvent);
                } catch (InterruptedException | java.util.concurrent.TimeoutException e) {
                    throw dependencies.webDriverActionExecutionException("Exception during execution", e);
                }

                dependencies.getReplayingState().setHttpLock(webDriverAction.expectsHttpRequest());

                Future<?> future = executorService.submit(() -> executeIgnoringExceptions(driverOperations.getDriver(),
                        webDriverAction));
                try {
                    future.get(dependencies.getTimeout(), TimeUnit.SECONDS);
                }  catch (java.util.concurrent.TimeoutException | InterruptedException e) {
                    throw dependencies.webDriverActionExecutionException("Exception during execution", e);
                } catch (ExecutionException e) {
                    throw dependencies.webDriverActionExecutionException("Exception during execution", e.getCause());
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

        driverOperations.cleanUp();
        executorService.shutdownNow();
        LoadingTimes loadingTimes = new LoadingTimes(testScenario.getActions(), waitingTimes, actionTimestamps);
        return new ExecutionReport(loadingTimes, driverOperations.getHar(), automationResult);
    }

    @Override
    public void forceCleanUp() {
        dependencies.getDriverOperations().cleanUp();
    }

    private ExecutorBuilder dependencies;

    private AutomationResult automationResult;

    private void executeIgnoringExceptions(WebDriver webDriver, WebDriverAction webDriverAction) {
        int i = 0;

        while (i < dependencies.getMaxRetries()) {
            try {
                webDriverAction.execute(webDriver, dependencies.getReplayingState(), dependencies.getEventSynchronizer());
                return;
            } catch (WebDriverException ex) {
                System.out.println(ex.toString());
                System.out.println("Could not make it from first try");
                i++;
                try {
                    Thread.sleep(dependencies.getMeasurementsPrecisionMilli());
                } catch (InterruptedException e) {
                    throw dependencies.webDriverActionExecutionException("Interrupted while waiting to retry", e);
                }
            }
        }

        throw new TimeoutException("Could not execute the action! " + webDriverAction.getName());
    }

}