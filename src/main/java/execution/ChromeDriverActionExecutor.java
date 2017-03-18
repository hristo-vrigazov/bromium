package execution;

import com.google.common.collect.ImmutableMap;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.LoadingTimes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static utils.Utils.toSeconds;

/**
 * Created by hvrigazov on 16.03.17.
 */
public class ChromeDriverActionExecutor implements WebdriverActionExecutor {

    private WebDriver driver;
    private BrowserMobProxy proxy;
    private ChromeDriverService chromeDriverService;
    private DesiredCapabilities capabilities;
    private Proxy seleniumProxy;
    private File harFile;

    private AutomationResult automationResult;

    private Queue<WebdriverAction> webdriverActionQueue;

    private List<Long> waitingTimes;
    private List<String> actions;

    private Set<HttpRequest> httpRequestQueue;
    /**
     * Download from Chromedriver's official site and then
     * set this to the local path to the executable
     */
    private String pathToChromeDriver;

    private boolean useVirtualScreen;

    private boolean lock;

    private int timeout;

    private int maxRetries;

    private int measurementsPrecisionMilli;

    private List<String> whiteListHttp;

    private String screenToUse;

    public ChromeDriverActionExecutor(String pathToChromeDriver, boolean useVirtualScreen, int timeout, int measurementsPrecisionMilli) throws IOException {
        this.pathToChromeDriver = pathToChromeDriver;
        this.useVirtualScreen = useVirtualScreen;
        this.timeout = timeout;
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        this.initializeQueues();
        this.initializeWhitelist();
    }

    private void initializeProxyServer() {
        this.proxy = new BrowserMobProxyServer();
        this.proxy.setIdleConnectionTimeout(timeout, TimeUnit.SECONDS);
        this.proxy.setRequestTimeout(timeout, TimeUnit.SECONDS);
        this.proxy.start(0);
    }

    private void initializeChromeDriverService() throws IOException {
        this.chromeDriverService = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(pathToChromeDriver))
                .usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY", screenToUse)).build();
        this.chromeDriverService.start();
    }

    private void initializeSeleniumProxy() {
        seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
    }

    private void initializeDesiredCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
    }

    private void initializeWebDriver() {
        if (useVirtualScreen) {
            this.driver = new ChromeDriver(chromeDriverService, capabilities);
        } else {
            this.driver = new ChromeDriver(capabilities);
        }
    }

    private void initializeQueues() {
        this.webdriverActionQueue = new LinkedList<>();
        this.httpRequestQueue = Collections.synchronizedSet(new HashSet<>());
        this.waitingTimes = new ArrayList<>();
        this.actions = new ArrayList<>();
    }

    private void initializeWhitelist() {
        whiteListHttp = new ArrayList<>();
        whiteListHttp.add("localhost");
    }

    @Override
    public void addWebdriverAction(WebdriverAction webdriverAction) {
        webdriverActionQueue.add(webdriverAction);
        actions.add(webdriverAction.getName());
    }

    @Override
    public void execute() throws InterruptedException, IOException {
        init();
        initializeChromeDriverService();
        initializeWebDriver();
        driver.manage().window().maximize();

        long elapsedTime = System.nanoTime();

        try {
            this.automationResult = AutomationResult.EXECUTING;
            while (!webdriverActionQueue.isEmpty()) {
                if (toSeconds(System.nanoTime() - elapsedTime) > timeout) {
                    this.automationResult = AutomationResult.TIMEOUT;
                    throw new TimeoutException("Could not execute the action! Waited "
                            + String.valueOf(System.nanoTime() - elapsedTime)
                            + " to do " + webdriverActionQueue.peek().getName());
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
        }
    }

    @Override
    public void executeOnScreen(String screenToUse) throws InterruptedException, IOException {
        this.screenToUse = screenToUse;
        this.useVirtualScreen = true;
        execute();
    }

    private void init() {
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);

        this.maxRetries = 100;
        this.lock = false;
        this.screenToUse = ":1";
        this.automationResult = AutomationResult.NOT_STARTED;


        initializeProxyServer();
        initializeSeleniumProxy();
        initializeHar();
        initializeDesiredCapabilities();
    }

    private void initializeHar() {
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);

        proxy.newHar("measurements");

        proxy.addRequestFilter((httpRequest, httpMessageContents, httpMessageInfo) -> {
            addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
            lock = false;
            return null;
        });

        proxy.addResponseFilter((httpResponse, httpMessageContents, httpMessageInfo) -> {
            removeHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
        });

    }

    private void addHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
        this.httpRequestQueue.add(httpRequest);
    }

    private void removeHttpRequestToQueue(HttpRequest httpRequest) {
        if (!inWhiteList(httpRequest.getUri())) {
            return;
        }
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
                webdriverAction.execute(driver);
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
    public void quit() {
        driver.quit();
        chromeDriverService.stop();

        for (int i = 1; i < waitingTimes.size(); i++) {
            double seconds = toSeconds(waitingTimes.get(i));
            System.out.println("After I did " + actions.get(i - 1) + ", I had to wait for " + seconds + "s until the next action");
        }
    }

    @Override
    public void dumpHarMetrics(String fileNameToDump) throws IOException {
        Har har = proxy.getHar();
        harFile = new File(fileNameToDump);
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
}