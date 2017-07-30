package com.hribol.bromium.common.record;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.record.RecordRequestFilter;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordOperations {

    private WebDriver driver;
    private BrowserMobProxy proxy;
    private DriverService driverService;
    private Supplier<TestScenarioSteps> stepsSupplier;

    public RecordOperations(ProxyDriverIntegrator proxyDriverIntegrator) {
        this.driver = proxyDriverIntegrator.getDriver();
        this.proxy = proxyDriverIntegrator.getProxy();
        this.driverService = proxyDriverIntegrator.getDriverService();
        this.stepsSupplier = proxyDriverIntegrator.getStepsSupplier();
    }

    public void cleanUpRecord() {
        driver.quit();
        proxy.stop();
        driverService.stop();
    }

    public void prepareRecord() {
        this.driver.manage().window().maximize();
    }

    public void open(String baseURI) {
        driver.get(baseURI);
    }

    public TestScenarioSteps getTestCaseSteps() {
        return stepsSupplier.get();
    }
}
