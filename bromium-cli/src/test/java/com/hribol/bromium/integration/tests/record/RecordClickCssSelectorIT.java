package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 08.08.17.
 */
public class RecordClickCssSelectorIT extends BaseRecordIntegrationTest {

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps testScenarioSteps = new TestScenarioSteps();
        testScenarioSteps.add(ImmutableMap.of(EVENT, Events.PAGE_LOAD, SUBPAGE, Pages.DYNAMIC_DEMO_PAGE));
        testScenarioSteps.add(ImmutableMap.of(EVENT, Events.CLICK_DYNAMIC_BUTTON));

        TestScenarioSteps actualSteps = getActualSteps();
        assertEquals(testScenarioSteps, actualSteps);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(baseUrl + Pages.DYNAMIC_DEMO_PAGE);
        driver.findElement(By.id(CREATE_DYNAMIC_ID)).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id(LATE_CREATION_ID)));
    }

}
