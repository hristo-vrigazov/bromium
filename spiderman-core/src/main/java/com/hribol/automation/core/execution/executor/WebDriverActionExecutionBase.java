package com.hribol.automation.core.execution.executor;

import com.hribol.automation.core.execution.settings.ExecutionSettings;
import com.hribol.automation.core.execution.webdriver.WebDriverAction;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import com.hribol.automation.core.suite.VirtualScreenProcessCreator;
import com.hribol.automation.core.utils.LoadingTimes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

import static com.hribol.automation.core.utils.ConfigurationUtils.toSeconds;

/**
 * Created by hvrigazov on 16.03.17.
 */
public abstract class WebDriverActionExecutionBase implements WebDriverActionExecution {

    private ExecutionSettings executionSettings;
    private AutomationResult automationResult;

    private List<Long> waitingTimes;
    private Set<HttpRequest> httpRequestQueue;
    private String pathToChromeDriver;
    private boolean useVirtualScreen;
    private boolean lock;
    private int timeout;
    private int maxRetries;
    private int measurementsPrecisionMilli;
    private List<String> whiteListHttp;
    private String screenToUse;
    protected String baseURI;
    private LoadingTimes loadingTimes;

    public WebDriverActionExecutionBase(WebDriverActionExecutor webDriverActionExecutor) throws IOException, URISyntaxException {
        this(webDriverActionExecutor.getBaseURI(),
                webDriverActionExecutor.getPathToDriverExecutable(),
                webDriverActionExecutor.getTimeout(),
                webDriverActionExecutor.getMeasurementsPrecisionMilli());
    }

    public static WebDriverActionExecutor builder() {
        return new WebDriverActionExecutor();
    }

    private WebDriverActionExecutionBase(String baseURI, String pathToDriverExecutable, int timeout, int measurementsPrecisionMilli) throws IOException, URISyntaxException {
        this.pathToChromeDriver = pathToDriverExecutable;
        this.useVirtualScreen = false;
        this.timeout = timeout;
        this.baseURI = baseURI;
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        this.initializeQueues();
        this.executionSettings = createExecutionSettings();
    }

    protected abstract ExecutionSettings createExecutionSettings();
    protected abstract String getSystemProperty();

    protected HttpResponse filterRequest(HttpRequest request, HttpMessageContents contents, HttpMessageInfo messageInfo) {
        addHttpRequestToQueue(messageInfo.getOriginalRequest());
        lock = false;
        return null;
    }

    protected void filterResponse(HttpResponse response, HttpMessageContents contents, HttpMessageInfo messageInfo) {
        removeHttpRequestToQueue(messageInfo.getOriginalRequest());
    }

    private void initializeQueues() {
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.waitingTimes = new ArrayList<>();
    }

    private void initializeWhitelist() throws URISyntaxException {
        whiteListHttp = new ArrayList<>();
        whiteListHttp.add("localhost");
        URI uri = new URI(baseURI);
        whiteListHttp.add(uri.getHost());
    }

    @Override
    public void execute(TestScenario testScenario) throws InterruptedException, IOException, URISyntaxException {
        init();

        long elapsedTime = System.nanoTime();

        try {
            this.automationResult = AutomationResult.EXECUTING;
            while (testScenario.hasMoreSteps()) {
                if (toSeconds(System.nanoTime() - elapsedTime) > timeout) {
                    this.automationResult = AutomationResult.TIMEOUT;
                    throw new TimeoutException("Could not execute the action! Waited "
                            + String.valueOf(System.nanoTime() - elapsedTime)
                            + " to do " + testScenario.nextActionName()
                            + " http queries in queue: " + httpRequestQueue.size());
                }
                if (httpRequestQueue.isEmpty() && !lock) {
                    waitingTimes.add(System.nanoTime() - elapsedTime);
                    elapsedTime = System.nanoTime();
                    lock = testScenario.nextActionExpectsHttpRequest();
                    WebDriverAction webDriverAction = testScenario.pollWebdriverAction();
                    executeIgnoringExceptions(webDriverAction);
                }
            }

            waitingTimes.add(System.nanoTime() - elapsedTime);
            this.automationResult = AutomationResult.SUCCESS;
        } catch (AssertionError e) {
            e.printStackTrace();
            this.automationResult = AutomationResult.ASSERTION_ERROR;
        } finally {
            executionSettings.cleanUpReplay();
        }

        this.loadingTimes = new LoadingTimes(waitingTimes, testScenario.getActions());
    }

    @Override
    public void executeOnScreen(TestScenario testScenario, String screenToUse) throws InterruptedException, IOException, URISyntaxException {
        this.screenToUse = screenToUse;
        this.useVirtualScreen = true;
        execute(testScenario);
    }

    private void init() throws IOException, URISyntaxException {
        System.setProperty(getSystemProperty(), pathToChromeDriver);

        this.maxRetries = 100;
        this.lock = false;
        this.automationResult = AutomationResult.NOT_STARTED;

        screenToUse = Optional.ofNullable(screenToUse).orElse(":1");
        executionSettings.initReplay(pathToChromeDriver, screenToUse, timeout, useVirtualScreen);
        this.initializeWhitelist();
    }

    private void addHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        System.out.println("Add request " + httpRequest.getUri());
        this.httpRequestQueue.add(httpRequest);
    }

    private void removeHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        System.out.println("Remove request " + httpRequest.getUri());
        this.httpRequestQueue.remove(httpRequest);
    }

    private boolean inWhiteList(String url) {
        for (String whiteListedString: whiteListHttp) {
            if (url.contains(whiteListedString)) {
                return true;
            }
        }

        return false;
    }

    private void executeIgnoringExceptions(WebDriverAction webDriverAction) throws InterruptedException {
        int i = 0;

        long startTime = System.nanoTime();
        while (i < maxRetries && (toSeconds(System.nanoTime() - startTime) < timeout)) {
            try {
                Thread.sleep(measurementsPrecisionMilli);
                webDriverAction.execute(executionSettings.getWebDriver());
                return;
            } catch (WebDriverException ex) {
                System.out.println(ex.toString());
                Thread.sleep(measurementsPrecisionMilli);
                System.out.println("Could not make it from first try");
                i++;
            } catch (AssertionError assertionError) {
                this.automationResult = AutomationResult.ASSERTION_ERROR;
                throw new AssertionError(assertionError);
            }
        }

        throw new TimeoutException("Could not execute the action! " + webDriverAction.getName());
    }

    @Override
    public void dumpHarMetrics(String fileNameToDump) throws IOException {
        Har har = executionSettings.getHar();
        File harFile = new File(fileNameToDump);
        har.writeTo(harFile);
    }

    @Override
    public void dumpLoadingTimes(String fileNameToDump) throws UnsupportedEncodingException, FileNotFoundException {
        getLoadingTimes().dump(fileNameToDump);
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
    public AutomationResult executeOnScreen(TestScenario testScenario,
                                            int i,
                                            VirtualScreenProcessCreator virtualScreenProcessCreator,
                                            String loadingTimesFileName,
                                            String harTimesFileName) {
        Process process;
        String screen = virtualScreenProcessCreator.getScreen(i);
        try {
            process = virtualScreenProcessCreator.createXvfbProcess(i);
        } catch (IOException e) {
            return AutomationResult.NO_VIRTUAL_SCREEN;
        }

        try {
            this.executeOnScreen(testScenario, screen);
            this.getLoadingTimes().dump(loadingTimesFileName);
            this.dumpHarMetrics(harTimesFileName);
            process.destroy();
            return this.getAutomationResult();
        } catch (InterruptedException | IOException | URISyntaxException e) {
            e.printStackTrace();
            return AutomationResult.FAILED;
        } finally {
            process.destroy();
        }
    }


}