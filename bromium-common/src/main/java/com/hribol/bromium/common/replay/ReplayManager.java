package com.hribol.bromium.common.replay;

import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Created by hvrigazov on 27.07.17.
 */
public class ReplayManager {
    private WebDriver driver;
    private BrowserMobProxy proxy;
    private DriverService driverService;

    public ReplayManager(ReplayProxyDriverIntegrator replayProxyDriverIntegrator) {
        this.driver = replayProxyDriverIntegrator.getWebDriver();
        this.proxy = replayProxyDriverIntegrator.getProxy();
        this.driverService = replayProxyDriverIntegrator.getDriverService();
    }

    public void prepare() {
        this.driver.manage().window().maximize();
    }

    public void cleanUp() {
        driver.quit();
        proxy.stop();
        driverService.stop();
    }
}
