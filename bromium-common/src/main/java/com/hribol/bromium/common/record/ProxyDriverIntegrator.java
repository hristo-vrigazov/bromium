package com.hribol.bromium.common.record;

import com.hribol.bromium.core.TestScenarioSteps;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class ProxyDriverIntegrator {

    public BrowserMobProxy getProxy() {
        return proxy;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Supplier<TestScenarioSteps> getStepsSupplier() {
        return stepsSupplier;
    }

    public ProxyDriverIntegrator(Supplier<TestScenarioSteps> stepsSupplier,
                                 BrowserMobProxy proxy,
                                 WebDriver driver,
                                 DriverService driverService) {
        this.stepsSupplier = stepsSupplier;
        this.proxy = proxy;
        this.driver = driver;
        this.driverService = driverService;
    }

    private Supplier<TestScenarioSteps> stepsSupplier;
    private BrowserMobProxy proxy;
    private WebDriver driver;
    private DriverService driverService;

    public DriverService getDriverService() {
        return driverService;
    }
}
