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
    public BrowserMobProxy getBrowserMobProxy(int timeout) {
        BrowserMobProxyServer proxy = new BrowserMobProxyServer();
        proxy.setIdleConnectionTimeout(timeout, TimeUnit.SECONDS);
        proxy.setRequestTimeout(timeout, TimeUnit.SECONDS);
        proxy.start(0);
        return proxy;
    }

    @Override
    public DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
        return capabilities;
    }

    @Override
    public WebDriver buildWebDriver(boolean useVirtualScreen) {
        return useVirtualScreen ? buildWebDriverHeadless() : buildWebDriverVisible();
    }

    private void maximizeDriver() {
        driver.manage().window().maximize();
    }

    @Override
    public void cleanUpReplay() {
        quitDriverAndStopProxy();
        driverService.stop();
    }

    @Override
    public void cleanUpRecord() {
        quitDriverAndStopProxy();
    }

    private void quitDriverAndStopProxy() {
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
        this.proxy = getBrowserMobProxy(timeout);
        this.seleniumProxy = getSeleniumProxy();
        initializeProxyFilters();
        this.capabilities = getDesiredCapabilities();
        this.driverService = getDriverService(pathToChromeDriver, screenToUse);
        this.driver = buildWebDriver(useVirtualScreen);
        maximizeDriver();
    }

    @Override
    public Proxy getSeleniumProxy() {
        return ClientUtil.createSeleniumProxy(proxy);
    }

    @Override
    public void initRecord(int timeout) throws IOException {
        this.proxy = getBrowserMobProxy(timeout);
        this.seleniumProxy = getSeleniumProxy();
        initializeProxyFilters();
        this.capabilities = getDesiredCapabilities();
        this.driver = buildWebDriverVisible();
        maximizeDriver();
    }

    @Override
    public void openBaseUrl() {
        driver.get(baseURI);
    }

}
