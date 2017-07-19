package com.hribol.bromium.common.record;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.record.RecordRequestFilter;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordManager {

    private WebDriver driver;
    private BrowserMobProxy proxy;
    private RecordRequestFilter recordRequestFilter;

    public RecordManager(ProxyDriverIntegrator proxyDriverIntegrator) {
        this.driver = proxyDriverIntegrator.getDriver();
        this.proxy = proxyDriverIntegrator.getProxy();
        this.recordRequestFilter = proxyDriverIntegrator.getRequestFilter();
    }

    public void cleanUpRecord() {
        driver.quit();
        proxy.stop();
    }

    public void prepareRecord() {
        this.driver.manage().window().maximize();
    }

    public void open(String baseURI) {
        driver.get(baseURI);
    }

    public TestScenarioSteps getTestCaseSteps() {
        return recordRequestFilter.getApplicationSpecificActionList();
    }
}
