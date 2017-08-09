package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static com.hribol.bromium.cli.ParsedOptions.*;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 08.08.17.
 */
public class RecordExposedPageLoadingIT extends BaseRecordIntegrationTest {

    @Override
    public void verifyAssertions() throws IOException {
        TestScenarioSteps expected = new TestScenarioSteps();
        expected.add(ImmutableMap.of(
                EVENT, Events.PAGE_LOAD,
                ALIAS_URL, DYNAMIC_DEMO_PAGE));

        TestScenarioSteps actual = getActualSteps();
        assertEquals(expected, actual);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        driver.get(baseUrl + "dynamic.html");
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(CREATE_DYNAMIC_ID)));
    }

}
