package com.hribol.bromium.common;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Represents a driver, a proxy and a driver service that are connected together
 */
public class ProxyDriverIntegrator {
    private WebDriver driver;
    private BrowserMobProxy proxy;
    private DriverService driverService;

    /**
     * Creates a new object that holds  a driver, a proxy and a driver service that are connected together
     * @param driver the driver
     * @param proxy the proxy that the driver uses
     * @param driverService the driver service that is used for connecting to the virtual screen
     */
    public ProxyDriverIntegrator(WebDriver driver, BrowserMobProxy proxy, DriverService driverService) {
        this.driver = driver;
        this.proxy = proxy;
        this.driverService = driverService;
    }

    public DriverService getDriverService() {
        return driverService;
    }

    public BrowserMobProxy getProxy() {
        return proxy;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

}
