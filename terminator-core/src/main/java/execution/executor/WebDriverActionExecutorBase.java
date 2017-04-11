package execution.executor;

import execution.settings.ExecutionSettings;
import execution.webdriver.WebdriverAction;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import utils.LoadingTimes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

import static utils.ConfigurationUtils.toSeconds;

/**
 * Created by hvrigazov on 16.03.17.
 */
public abstract class WebDriverActionExecutorBase implements WebDriverActionExecutor {

    private ExecutionSettings executionSettings;
    private AutomationResult automationResult;
    private Queue<WebdriverAction> webdriverActionQueue;
    private List<Long> waitingTimes;
    private List<String> actions;
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

    public WebDriverActionExecutorBase(WebdriverActionExecutorBuilder webdriverActionExecutorBuilder) throws IOException, URISyntaxException {
        this(webdriverActionExecutorBuilder.getBaseURI(),
                webdriverActionExecutorBuilder.getPathToDriverExecutable(),
                webdriverActionExecutorBuilder.getTimeout(),
                webdriverActionExecutorBuilder.getMeasurementsPrecisionMilli());
    }

    public static WebdriverActionExecutorBuilder builder() {
        return new WebdriverActionExecutorBuilder();
    }

    private WebDriverActionExecutorBase(String baseURI, String pathToChromeDriver, int timeout, int measurementsPrecisionMilli) throws IOException, URISyntaxException {
        this.pathToChromeDriver = pathToChromeDriver;
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
        this.webdriverActionQueue = new LinkedList<>();
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.waitingTimes = new ArrayList<>();
        this.actions = new ArrayList<>();
    }

    private void initializeWhitelist() throws URISyntaxException {
        whiteListHttp = new ArrayList<>();
        whiteListHttp.add("localhost");
        URI uri = new URI(baseURI);
        whiteListHttp.add(uri.getHost());
    }

    @Override
    public void addWebdriverAction(WebdriverAction webdriverAction) {
        webdriverActionQueue.add(webdriverAction);
        actions.add(webdriverAction.getName());
    }

    @Override
    public void execute() throws InterruptedException, IOException, URISyntaxException {
        init();

        long elapsedTime = System.nanoTime();

        try {
            this.automationResult = AutomationResult.EXECUTING;
            while (!webdriverActionQueue.isEmpty()) {
                if (toSeconds(System.nanoTime() - elapsedTime) > timeout) {
                    this.automationResult = AutomationResult.TIMEOUT;
                    throw new TimeoutException("Could not execute the action! Waited "
                            + String.valueOf(System.nanoTime() - elapsedTime)
                            + " to do " + webdriverActionQueue.peek().getName()
                            + " http queries in queue: " + httpRequestQueue.size());
                }
                if (httpRequestQueue.isEmpty() && !lock) {
                    waitingTimes.add(System.nanoTime() - elapsedTime);
                    elapsedTime = System.nanoTime();
                    lock = webdriverActionQueue.peek().expectsHttpRequest();
                    WebdriverAction webdriverAction = webdriverActionQueue.poll();
                    System.out.println(webdriverAction.getName());
                    System.out.println("Action queue size: " + webdriverActionQueue.size());
                    executeIgnoringExceptions(webdriverAction);
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
    }

    @Override
    public void executeOnScreen(String screenToUse) throws InterruptedException, IOException, URISyntaxException {
        this.screenToUse = screenToUse;
        this.useVirtualScreen = true;
        execute();
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

    public void addHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        System.out.println("Add request " + httpRequest.getUri());
        this.httpRequestQueue.add(httpRequest);
    }

    public void removeHttpRequestToQueue(HttpRequest httpRequest) {
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

    public void executeIgnoringExceptions(WebdriverAction webdriverAction) throws InterruptedException {
        int i = 0;

        long startTime = System.nanoTime();
        while (i < maxRetries && (toSeconds(System.nanoTime() - startTime) < timeout)) {
            try {
                Thread.sleep(measurementsPrecisionMilli);
                webdriverAction.execute(executionSettings.getWebDriver());
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

        throw new TimeoutException("Could not execute the action! " + webdriverAction.getName());
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
        return new LoadingTimes(waitingTimes, actions);
    }

    @Override
    public AutomationResult getAutomationResult() {
        return this.automationResult;
    }

}