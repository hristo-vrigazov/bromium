package com.hribol.spiderman.replay.execution;
import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.core.utils.ConfigurationUtils;
import com.hribol.spiderman.core.utils.LoadingTimes;
import com.hribol.spiderman.replay.AutomationResult;
import com.hribol.spiderman.replay.filters.ReplayRequestFilter;
import com.hribol.spiderman.replay.filters.ReplayResponseFilter;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;
import java.util.function.Supplier;


/**
 * Created by hvrigazov on 16.03.17.
 */
public abstract class WebDriverActionExecutionBase implements WebDriverActionExecution {

    public WebDriverActionExecutionBase(WebDriverActionExecutor webDriverActionExecutor) throws IOException, URISyntaxException {
        this(webDriverActionExecutor.getBaseURI(),
                webDriverActionExecutor.getPathToDriverExecutable(),
                webDriverActionExecutor.getTimeout(),
                webDriverActionExecutor.getMeasurementsPrecisionMilli());
    }

    public WebDriverActionExecutionBase(WebDriverActionExecutor webDriverActionExecutor,
                                        RequestFilter requestFilter,
                                        ResponseFilter responseFilter) throws IOException, URISyntaxException {
        this(webDriverActionExecutor.getBaseURI(),
                webDriverActionExecutor.getPathToDriverExecutable(),
                webDriverActionExecutor.getTimeout(),
                webDriverActionExecutor.getMeasurementsPrecisionMilli(),
                requestFilter,
                responseFilter);
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
                if (ConfigurationUtils.toSeconds(System.nanoTime() - elapsedTime) > timeout) {
                    this.automationResult = AutomationResult.TIMEOUT;
                    throw new TimeoutException("Could not execute the action! Waited "
                            + String.valueOf(System.nanoTime() - elapsedTime)
                            + " to do " + testScenario.nextActionName()
                            + " http queries in queue: " + httpRequestQueue.size());
                }
                if (httpRequestQueue.isEmpty() && !lock) {
                    setLock(testScenario.nextActionExpectsHttpRequest());
                    WebDriverAction webDriverAction = testScenario.pollWebdriverAction();
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
        } finally {
            replaySettings.cleanUpReplay();
        }

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

    protected RequestFilter replayRequestFilter;
    protected ResponseFilter replayResponseFilter;
    protected String baseURI;
    protected abstract ReplaySettings createExecutionSettings();
    protected abstract String getSystemProperty();

    private ReplaySettings replaySettings;
    private AutomationResult automationResult;

    private List<Long> waitingTimes;
    private String pathToWebDriver;
    private Boolean lock;
    private int timeout;
    private int maxRetries;
    private int measurementsPrecisionMilli;
    private String screenToUse;
    private LoadingTimes loadingTimes;
    private Set<HttpRequest> httpRequestQueue;

    private WebDriverActionExecutionBase(String baseURI,
                                        String pathToDriverExecutable,
                                        int timeout,
                                        int measurementsPrecisionMilli,
                                        RequestFilter requestFilter,
                                        ResponseFilter responseFilter) {
        initialize(baseURI, pathToDriverExecutable, timeout, measurementsPrecisionMilli, requestFilter, responseFilter);
    }

    private WebDriverActionExecutionBase(String baseURI,
                                         String pathToDriverExecutable,
                                         int timeout,
                                         int measurementsPrecisionMilli) throws IOException, URISyntaxException {
        initialize(baseURI, pathToDriverExecutable, timeout, measurementsPrecisionMilli,
                new ReplayRequestFilter(this::setLock, baseURI, httpRequestQueue),
                new ReplayResponseFilter(baseURI, httpRequestQueue));
    }

    private void initialize(String baseURI,
                            String pathToDriverExecutable,
                            int timeout,
                            int measurementsPrecisionMilli,
                            RequestFilter replayRequestFilter,
                            ResponseFilter replayResponseFilter) {
        this.pathToWebDriver = pathToDriverExecutable;
        this.timeout = timeout;
        this.baseURI = baseURI;
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.waitingTimes = new ArrayList<>();
        this.replaySettings = createExecutionSettings();
        this.replayRequestFilter = replayRequestFilter;
        this.replayResponseFilter = replayResponseFilter;
    }

    private void setLock(Boolean value) {
        this.lock = value;
    }

    private void prepare() throws IOException {
        System.setProperty(getSystemProperty(), pathToWebDriver);

        this.maxRetries = 100;
        setLock(false);
        this.automationResult = AutomationResult.NOT_STARTED;

        screenToUse = Optional.ofNullable(screenToUse).orElse(":0");
        replaySettings.prepareReplay(pathToWebDriver, screenToUse, timeout);
    }

    private void executeIgnoringExceptions(WebDriverAction webDriverAction) throws InterruptedException {
        int i = 0;

        long startTime = System.nanoTime();
        while (i < maxRetries && (ConfigurationUtils.toSeconds(System.nanoTime() - startTime) < timeout)) {
            try {
                Thread.sleep(measurementsPrecisionMilli);
                webDriverAction.execute(replaySettings.getWebDriver());
                return;
            } catch (WebDriverException ex) {
                System.out.println(ex.toString());
                Thread.sleep(measurementsPrecisionMilli);
                System.out.println("Could not make it from first try");
                i++;
            }
        }

        throw new TimeoutException("Could not execute the action! " + webDriverAction.getName());
    }

}