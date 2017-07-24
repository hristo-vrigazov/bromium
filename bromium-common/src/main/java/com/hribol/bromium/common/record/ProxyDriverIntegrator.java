package com.hribol.bromium.common.record;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.record.RecordRequestFilter;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;

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

    public ProxyDriverIntegrator(Supplier<TestScenarioSteps> stepsSupplier, BrowserMobProxy proxy, WebDriver driver) {
        this.stepsSupplier = stepsSupplier;
        this.proxy = proxy;
        this.driver = driver;
    }

    private Supplier<TestScenarioSteps> stepsSupplier;
    private BrowserMobProxy proxy;
    private WebDriver driver;
}
