package com.hribol.spiderman.replay.execution;
import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.replay.report.ExecutionReport;
import com.hribol.spiderman.replay.report.LoadingTimes;
import com.hribol.spiderman.core.utils.Utils;
import com.hribol.spiderman.replay.report.AutomationResult;
import com.hribol.spiderman.replay.filters.ProxyFacade;
import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


/**
 * Created by hvrigazov on 16.03.17.
 */
public abstract class WebDriverActionExecutionBase implements WebDriverActionExecution {

    public WebDriverActionExecutionBase(ExecutorBuilder executor) throws IOException, URISyntaxException {
        this.executor = executor;
        this.proxyFacade = new ProxyFacade(executor.getBaseURL());
        this.replaySettings = createReplaySettings();
        this.automationResult = AutomationResult.NOT_STARTED;
    }

    @Override
    public ExecutionReport execute(TestScenario testScenario) {
        List<Long> waitingTimes = new ArrayList<>();
        List<Date> actionTimestamps = new ArrayList<>();

        try {
            prepare();
        } catch (IOException e) {
            this.automationResult = AutomationResult.COULD_NOT_CREATE_DRIVER;
            Har har = replaySettings.getHar();
            return new ExecutionReport(loadingTimes, har, automationResult);
        }

        long elapsedTime = System.nanoTime();
        actionTimestamps.add(new Date());

        try {
            this.automationResult = AutomationResult.EXECUTING;
            while (testScenario.hasMoreSteps()) {
                if (Utils.toSeconds(System.nanoTime() - elapsedTime) > executor.getTimeout()) {
                    this.automationResult = AutomationResult.TIMEOUT;
                    throw new TimeoutException("Could not execute the action! Waited "
                            + String.valueOf(System.nanoTime() - elapsedTime)
                            + " to do " + testScenario.nextActionName()
                            + " http queries in queue: " + proxyFacade.getNumberOfRequestsInQueue());
                }
                if (proxyFacade.httpQueueIsEmpty() && !proxyFacade.isLocked() && !proxyFacade.waitsForPrecondition()) {
                    proxyFacade.setLock(testScenario.nextActionExpectsHttpRequest());
                    WebDriverAction webDriverAction = testScenario.pollWebDriverAction();
                    executeIgnoringExceptions(webDriverAction);
                    waitingTimes.add(System.nanoTime() - elapsedTime);
                    actionTimestamps.add(new Date());
                    elapsedTime = System.nanoTime();
                }
            }

            this.automationResult = AutomationResult.SUCCESS;
        } catch (AssertionError assertionError) {
            assertionError.printStackTrace();
            this.automationResult = AutomationResult.ASSERTION_ERROR;
        } catch (TimeoutException timeoutException) {
            timeoutException.printStackTrace();
            this.automationResult = AutomationResult.TIMEOUT;
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            this.automationResult = AutomationResult.INTERRUPTED;
        }
        
        this.replaySettings.cleanUpReplay();
        this.loadingTimes = new LoadingTimes(testScenario.getActions(), waitingTimes, actionTimestamps);
        Har har = replaySettings.getHar();
        return new ExecutionReport(loadingTimes, har, automationResult);
    }

    @Override
    public ExecutionReport execute(TestScenario testScenario, String screenToUse) {
        this.screenToUse = screenToUse;
        return execute(testScenario);
    }

    @Override
    public ExecutionReport createVirtualScreenProcessAndExecute(TestScenario testScenario,
                                                                int screenNumber,
                                                                VirtualScreenProcessCreator virtualScreenProcessCreator) {
        Process process;
        String screen = virtualScreenProcessCreator.getScreen(screenNumber);
        try {
            process = virtualScreenProcessCreator.createXvfbProcess(screenNumber);
        } catch (IOException e) {
            this.automationResult = AutomationResult.NO_VIRTUAL_SCREEN;
            Har har = replaySettings.getHar();
            return new ExecutionReport(loadingTimes, har, automationResult);
        }

        this.screenToUse = screen;
        try {
            return this.execute(testScenario);
        } finally {
            process.destroy();
        }
    }

    @Override
    public String getBaseURL() {
        return executor.getBaseURL();
    }

    protected ReplayFiltersFacade proxyFacade;
    protected String baseURI;
    protected abstract ReplaySettings createReplaySettings();
    public abstract String getSystemProperty();

    private ReplaySettings replaySettings;
    private AutomationResult automationResult;

    private String screenToUse;
    private LoadingTimes loadingTimes;
    private final ExecutorBuilder executor;

    private void prepare() throws IOException {
        System.setProperty(getSystemProperty(), executor.getPathToDriverExecutable());
        proxyFacade.setLock(false);
        this.automationResult = AutomationResult.NOT_STARTED;
        screenToUse = Optional.ofNullable(screenToUse).orElse(":0");
        replaySettings.prepareReplay(executor.getPathToDriverExecutable(), screenToUse, executor.getTimeout());
    }

    private void executeIgnoringExceptions(WebDriverAction webDriverAction) throws InterruptedException {
        int i = 0;

        long startTime = System.nanoTime();
        while (i < executor.getMaxRetries() &&
                (Utils.toSeconds(System.nanoTime() - startTime) < executor.getTimeout())) {
            try {
                Thread.sleep(executor.getMeasurementsPrecisionMilli());
                webDriverAction.execute(replaySettings.getWebDriver());
                return;
            } catch (WebDriverException ex) {
                System.out.println(ex.toString());
                System.out.println("Could not make it from first try");
                i++;
            }
        }

        throw new TimeoutException("Could not execute the action! " + webDriverAction.getName());
    }

}