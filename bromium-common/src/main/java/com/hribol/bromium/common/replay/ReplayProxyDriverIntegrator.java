package com.hribol.bromium.common.replay;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Created by hvrigazov on 27.07.17.
 */
public class ReplayProxyDriverIntegrator {
    private WebDriver driver;
    private BrowserMobProxy proxy;
    private DriverService driverService;

    public ReplayProxyDriverIntegrator(WebDriver driver, BrowserMobProxy proxy, DriverService driverService) {
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
