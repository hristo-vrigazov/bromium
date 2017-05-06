package com.hribol.spiderman.replay.execution;
import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.core.utils.ConfigurationUtils;
import com.hribol.spiderman.core.utils.LoadingTimes;
import com.hribol.spiderman.replay.AutomationResult;
import com.hribol.spiderman.replay.filters.ProxyFacade;
import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * Created by hvrigazov on 16.03.17.
 */
public abstract class WebDriverActionExecutionBase implements WebDriverActionExecution {

    public WebDriverActionExecutionBase(WebDriverActionExecutor executor) throws IOException, URISyntaxException {
        this.executor = executor;
        this.proxyFacade = new ProxyFacade(executor.getBaseURI());
        this.replaySettings = createReplaySettings();
        this.waitingTimes = new ArrayList<>();
    }

    WebDriverActionExecutionBase(WebDriverActionExecutor executor, ReplayFiltersFacade proxyFacade) throws IOException, URISyntaxException {
        this.executor = executor;
        this.proxyFacade = proxyFacade;
        this.replaySettings = createReplaySettings();
        this.waitingTimes = new ArrayList<>();
    }

    @Override
    public void execute(TestScenario testScenario) {
        try {
            prepare();
        } catch (IOException e) {
            this.automationResult = AutomationResult.COULD_NOT_CREATE_DRIVER;
            return;
        }

        long elapsedTime = System.nanoTime();

        try {
            this.automationResult = AutomationResult.EXECUTING;
            while (testScenario.hasMoreSteps()) {
                if (ConfigurationUtils.toSeconds(System.nanoTime() - elapsedTime) > executor.getTimeout()) {
                    this.automationResult = AutomationResult.TIMEOUT;
                    throw new TimeoutException("Could not execute the action! Waited "
                            + String.valueOf(System.nanoTime() - elapsedTime)
                            + " to do " + testScenario.nextActionName()
                            + " http queries in queue: " + proxyFacade.getNumberOfRequestsInQueue());
                }
                if (proxyFacade.httpQueueIsEmpty() && !proxyFacade.isLocked()) {
                    proxyFacade.setLock(testScenario.nextActionExpectsHttpRequest());
                    WebDriverAction webDriverAction = testScenario.pollWebDriverAction();
                    executeIgnoringExceptions(webDriverAction);
                    waitingTimes.add(System.nanoTime() - elapsedTime);
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
        this.loadingTimes = new LoadingTimes(waitingTimes, testScenario.getActions());
    }


    @Override
    public void dumpHarMetrics(String fileNameToDump) throws IOException {
        Har har = replaySettings.getHar();
        File harFile = new File(fileNameToDump);
        har.writeTo(harFile);
    }

    @Override
    public LoadingTimes getLoadingTimes() {
        return loadingTimes;
    }

    @Override
    public AutomationResult getAutomationResult() {
        return automationResult;
    }

    @Override
    public void executeOnScreen(TestScenario testScenario, String screenToUse) {
        this.screenToUse = screenToUse;
        execute(testScenario);
    }

    @Override
    public void executeOnScreen(TestScenario testScenario,
                                            int i,
                                            VirtualScreenProcessCreator virtualScreenProcessCreator) {
        Process process;
        String screen = virtualScreenProcessCreator.getScreen(i);
        try {
            process = virtualScreenProcessCreator.createXvfbProcess(i);
        } catch (IOException e) {
            this.automationResult = AutomationResult.NO_VIRTUAL_SCREEN;
            return;
        }

        this.screenToUse = screen;
        this.execute(testScenario);
        process.destroy();
    }

    protected ReplayFiltersFacade proxyFacade;
    protected String baseURI;
    protected abstract ReplaySettings createReplaySettings();
    protected abstract String getSystemProperty();

    private ReplaySettings replaySettings;
    private AutomationResult automationResult;

    private List<Long> waitingTimes;
    private String screenToUse;
    private LoadingTimes loadingTimes;
    private final WebDriverActionExecutor executor;

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
                (ConfigurationUtils.toSeconds(System.nanoTime() - startTime) < executor.getTimeout())) {
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