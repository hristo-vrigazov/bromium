package execution.settings;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by hvrigazov on 21.03.17.
 */
public abstract class ExecutionSettingsBase implements ExecutionSettings {
    private BrowserMobProxy proxy;
    private Proxy seleniumProxy;
    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;

    protected WebDriver driver;
    protected DriverService driverService;
    protected DesiredCapabilities capabilities;
    protected String baseURI;

    public ExecutionSettingsBase(String baseURI, RequestFilter requestFilter, ResponseFilter responseFilter) {
        this.baseURI = baseURI;
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
    public void initializeSeleniumProxy() {
        seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
    }

    @Override
    public void initializeDesiredCapabilities() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
    }

    @Override
    public void initializeWebDriver(boolean useVirtualScreen) {
        if (useVirtualScreen) {
            initializeWebDriverHeadless();
        } else {
            initializeWebDriver();
        }
    }

    private void maximizeDriver() {
        driver.manage().window().maximize();
    }

    @Override
    public void cleanUpReplay() {
        driver.quit();
        proxy.stop();
        driverService.stop();
    }

    @Override
    public void cleanUpRecord() {
        driver.quit();
        proxy.stop();
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
    public void initializeProxyFilters() {
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        proxy.newHar("measurements");
        proxy.addRequestFilter(requestFilter);
        proxy.addResponseFilter(responseFilter);
    }

    @Override
    public void initReplay(String pathToChromeDriver, String screenToUse, int timeout, boolean useVirtualScreen)
            throws IOException {
        initializeProxyServer(timeout);
        initializeSeleniumProxy();
        initializeProxyFilters();
        initializeDesiredCapabilities();
        initializeDriverService(pathToChromeDriver, screenToUse);
        initializeWebDriver(useVirtualScreen);
        maximizeDriver();
    }

    @Override
    public void initRecord(int timeout) throws IOException {
        initializeProxyServer(timeout);
        initializeSeleniumProxy();
        initializeProxyFilters();
        initializeDesiredCapabilities();
        initializeWebDriver();
        maximizeDriver();
    }


    @Override
    public void openBaseUrl() {
        driver.get(baseURI);
    }

}
