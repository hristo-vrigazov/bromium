package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.TestUtils;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static com.hribol.bromium.integration.tests.TestUtils.ALIAS_URL;
import static com.hribol.bromium.integration.tests.TestUtils.DONE_ID;
import static com.hribol.bromium.integration.tests.TestUtils.Pages.TYPE_TEXT_DEMO_PAGE;
import static com.hribol.bromium.integration.tests.TestUtils.TEXT_FIELD_ID;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 09.08.17.
 */
public class RecordTypeTextFieldIT extends BaseRecordIntegrationTest {

    private String EXAMPLE_TEXT = "EXAMPLE_TEXT";

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps testScenarioSteps = new TestScenarioSteps();
        testScenarioSteps.add(ImmutableMap.of(
                EVENT, TestUtils.Events.PAGE_LOAD,
                ALIAS_URL, TestUtils.Pages.TYPE_TEXT_DEMO_PAGE));
        testScenarioSteps.add(ImmutableMap.of(
                EVENT, TestUtils.Events.TYPE_TEXT_IN_NAME_INPUT,
                TEXT, EXAMPLE_TEXT));

        TestScenarioSteps actualSteps = getActualSteps();
        assertEquals(testScenarioSteps, actualSteps);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) {
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        driver.get(demoApp.getBaseUrl() + TYPE_TEXT_DEMO_PAGE);
        driver.findElement(By.id(TEXT_FIELD_ID)).sendKeys(EXAMPLE_TEXT);
        driver.findElement(By.id(DONE_ID)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
