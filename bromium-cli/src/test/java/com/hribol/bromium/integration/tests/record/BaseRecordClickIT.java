package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.Events.PAGE_LOAD;
import static com.hribol.bromium.integration.tests.TestUtils.SUBPAGE;
import static org.junit.Assert.assertEquals;

public abstract class BaseRecordClickIT extends BaseRecordIntegrationTest {

    private String demoPage;
    private String action;
    private By locator;

    public BaseRecordClickIT(String demoPage, String action, By locator) {
        this.demoPage = demoPage;
        this.action = action;
        this.locator = locator;
    }

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps expectedSteps = new TestScenarioSteps();
        expectedSteps.add(ImmutableMap.of(
                EVENT, PAGE_LOAD,
                SUBPAGE, demoPage
        ));

        expectedSteps.add(ImmutableMap.of(EVENT, action));

        TestScenarioSteps actualSteps = getActualSteps();

        assertEquals(expectedSteps, actualSteps);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) throws InterruptedException {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        driver.get(baseUrl + demoPage);
        driver.findElement(locator).click();
        Thread.sleep(1000);
    }

}
