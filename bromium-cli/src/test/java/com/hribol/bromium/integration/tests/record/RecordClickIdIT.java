package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.CLICK_ID_TEST;
import static com.hribol.bromium.integration.tests.TestUtils.Events.CLICK_CLICK_ID_TEST;
import static com.hribol.bromium.integration.tests.TestUtils.Events.PAGE_LOAD;
import static com.hribol.bromium.integration.tests.TestUtils.Pages.CLICK_ID_DEMO_PAGE;
import static com.hribol.bromium.integration.tests.TestUtils.SUBPAGE;
import static org.junit.Assert.assertEquals;

public class RecordClickIdIT extends BaseRecordIntegrationTest {

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps expectedSteps = new TestScenarioSteps();
        expectedSteps.add(ImmutableMap.of(
                EVENT, PAGE_LOAD,
                SUBPAGE, CLICK_ID_DEMO_PAGE
        ));

        expectedSteps.add(ImmutableMap.of(EVENT, CLICK_CLICK_ID_TEST));

        TestScenarioSteps actualSteps = getActualSteps();

        assertEquals(expectedSteps, actualSteps);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) throws InterruptedException {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        driver.get(baseUrl + CLICK_ID_DEMO_PAGE);

        driver.findElement(By.id(CLICK_ID_TEST)).click();
        Thread.sleep(1000);
    }

}
