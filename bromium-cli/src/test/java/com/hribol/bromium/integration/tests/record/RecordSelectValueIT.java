package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.TestUtils;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.Events.PAGE_LOAD;
import static com.hribol.bromium.integration.tests.TestUtils.SUBPAGE;
import static org.junit.Assert.assertEquals;

public class RecordSelectValueIT extends BaseRecordIntegrationTest {

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps expectedSteps = new TestScenarioSteps();
        expectedSteps.add(ImmutableMap.of(
                EVENT, PAGE_LOAD,
                SUBPAGE, TestUtils.Pages.SELECT_VALUE_DEMO_PAGE
        ));

        expectedSteps.add(ImmutableMap.of(
                EVENT, TestUtils.Events.SELECT_VALUE_ACTION,
                "optionValue", "first"
        ));

        assertEquals(expectedSteps, getActualSteps());
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) throws InterruptedException {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        driver.get(baseUrl + TestUtils.Pages.SELECT_VALUE_DEMO_PAGE);

        Select select = new Select(driver.findElement(By.id("select-element")));
        select.selectByValue("first");
        Thread.sleep(1000);

    }
}
