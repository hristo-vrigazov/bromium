package com.hribol.bromium.common.replay;

import com.hribol.bromium.common.ProxyDriverIntegrator;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Created by hvrigazov on 27.07.17.
 */
public class DriverOperations {
    public WebDriver getDriver() {
        return driver;
    }

    private WebDriver driver;
    private BrowserMobProxy proxy;
    private DriverService driverService;

    public DriverOperations(ProxyDriverIntegrator proxyDriverIntegrator) {
        this.driver = proxyDriverIntegrator.getWebDriver();
        this.proxy = proxyDriverIntegrator.getProxy();
        this.driverService = proxyDriverIntegrator.getDriverService();
    }

    public void prepare() {
        this.driver.manage().window().maximize();
    }

    public void cleanUp() {
        driver.quit();
        proxy.stop();
        driverService.stop();
    }

    public void open(String baseUrl) {
        driver.get(baseUrl);
    }

    public Har getHar() {
        return proxy.getHar();
    }
}
