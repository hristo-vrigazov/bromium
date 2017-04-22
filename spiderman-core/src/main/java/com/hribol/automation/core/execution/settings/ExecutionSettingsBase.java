package com.hribol.automation.core.execution.settings;

import com.hribol.automation.core.suppliers.BrowserMobProxySupplier;
import com.hribol.automation.core.suppliers.DesiredCapabilitiesSupplier;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public abstract class ExecutionSettingsBase implements ExecutionSettings {
    private BrowserMobProxy proxy;
    private Proxy seleniumProxy;
    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;

    private WebDriver driver;
    protected DriverService driverService;
    protected DesiredCapabilities capabilities;
    protected String baseURI;

    public ExecutionSettingsBase(String baseURI, RequestFilter requestFilter, ResponseFilter responseFilter) {
        this.baseURI = baseURI;
        this.requestFilter = requestFilter;
        this.responseFilter = responseFilter;
    }

    @Override
    public DesiredCapabilities getDesiredCapabilities() {
        return new DesiredCapabilitiesSupplier(seleniumProxy).get();
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
    public void prepareReplay(String pathToChromeDriver, String screenToUse, int timeout)
            throws IOException {
        boolean useVirtualScreen = screenToUse.equals(":0");
        this.proxy = new BrowserMobProxySupplier(timeout, requestFilter, responseFilter).get();
        this.seleniumProxy = getSeleniumProxy();
        this.capabilities = getDesiredCapabilities();
        this.driverService = getDriverService(pathToChromeDriver, screenToUse);
        this.driver = buildWebDriver(useVirtualScreen);
        maximizeDriver();
    }

    @Override
    public Proxy getSeleniumProxy() {
        return ClientUtil.createSeleniumProxy(proxy);
    }

}
