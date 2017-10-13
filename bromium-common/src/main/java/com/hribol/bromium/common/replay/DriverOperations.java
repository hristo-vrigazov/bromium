package com.hribol.bromium.common.replay;

import com.hribol.bromium.common.ProxyDriverIntegrator;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * By a given integration of a driver and a proxy, i.e an instance of {@link ProxyDriverIntegrator}
 * this class provides operations like prepare, cleanup, and opening an initial url.
 */
public class DriverOperations {
    public WebDriver getDriver() {
        return driver;
    }

    private WebDriver driver;
    private BrowserMobProxy proxy;
    private DriverService driverService;

    /**
     * Creates a new capsulation of prepare and cleanup operations
     * @param proxyDriverIntegrator the integration of a driver and a proxy
     */
    public DriverOperations(ProxyDriverIntegrator proxyDriverIntegrator) {
        this.driver = proxyDriverIntegrator.getWebDriver();
        this.proxy = proxyDriverIntegrator.getProxy();
        this.driverService = proxyDriverIntegrator.getDriverService();
    }

    /**
     * Prepares the driver for execution
     */
    public void prepare() {
        this.driver.manage().window().maximize();
    }

    /**
     * Cleans up
     */
    public void cleanUp() {
        driver.quit();
        proxy.stop();
        driverService.stop();
    }

    /**
     * Opens a url using the driver
     * @param baseUrl the url to be opened
     */
    public void open(String baseUrl) {
        driver.get(baseUrl);
    }

    public Har getHar() {
        return proxy.getHar();
    }
}
