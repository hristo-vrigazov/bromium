package execution;

import com.google.common.collect.ImmutableMap;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class ChromeExecutionSettings implements ExecutionSettings {
    private WebDriver driver;
    private BrowserMobProxy proxy;
    private ChromeDriverService chromeDriverService;
    private DesiredCapabilities capabilities;
    private Proxy seleniumProxy;
    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;

    public ChromeExecutionSettings(RequestFilter requestFilter, ResponseFilter responseFilter) {
        this.requestFilter = requestFilter;
        this.responseFilter = responseFilter;
    }

    @Override
    public void initializeProxyServer(int timeout) {
        this.proxy = new BrowserMobProxyServer();
        this.proxy.setIdleConnectionTimeout(timeout, TimeUnit.SECONDS);
        this.proxy.setRequestTimeout(timeout, TimeUnit.SECONDS);
        this.proxy.start(0);
    }

    @Override
    public void initializeChromeDriverService(String pathToChromeDriver, String screenToUse) throws IOException {
        this.chromeDriverService = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(pathToChromeDriver))
                .usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY", screenToUse)).build();
        this.chromeDriverService.start();
    }

    @Override
    public void initializeSeleniumProxy() {
        seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
    }

    @Override
    public void initializeDesiredCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
    }

    @Override
    public void initializeWebDriver(boolean useVirtualScreen) {
        if (useVirtualScreen) {
            this.driver = new ChromeDriver(chromeDriverService, capabilities);
        } else {
            this.driver = new ChromeDriver(capabilities);
        }
    }

    @Override
    public void maximizeDriver() {
        driver.manage().window().maximize();
    }

    @Override
    public void cleanUp() {
        driver.quit();
        proxy.stop();
        chromeDriverService.stop();
    }

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }

    @Override
    public Har getHar() {
        return proxy.getHar();
    }

    @Override
    public void initializeHar() {
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        proxy.newHar("measurements");
        proxy.addRequestFilter(requestFilter);
        proxy.addResponseFilter(responseFilter);
    }

    @Override
    public void init(String pathToChromeDriver, String screenToUse, int timeout, boolean useVirtualScreen)
            throws IOException {
        initializeProxyServer(timeout);
        initializeSeleniumProxy();
        initializeHar();
        initializeDesiredCapabilities();
        initializeChromeDriverService(pathToChromeDriver, screenToUse);
        initializeWebDriver(useVirtualScreen);
    }
}
