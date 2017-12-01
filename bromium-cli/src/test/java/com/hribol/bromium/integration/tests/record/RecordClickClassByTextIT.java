package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.TestUtils;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Optional;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.ITEM_NAME;
import static com.hribol.bromium.integration.tests.TestUtils.Pages;
import static com.hribol.bromium.integration.tests.TestUtils.SUBPAGE;
import static com.hribol.bromium.integration.tests.TestUtils.TARGET;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class RecordClickClassByTextIT extends BaseRecordIntegrationTest {

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get(baseUrl + Pages.CLICK_CLASS_BY_TEXT_DEMO_PAGE);

        Optional<WebElement> webElementOptional = driver.findElements(By.className("item"))
                .stream()
                .filter(webElement -> webElement.getText().equals(TARGET))
                .findAny();

        assertTrue(webElementOptional.isPresent());

        webElementOptional.get().click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("success-indicator")));
    }

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps testScenarioSteps = new TestScenarioSteps();
        testScenarioSteps.add(ImmutableMap.of(
                EVENT, TestUtils.Events.PAGE_LOAD,
                SUBPAGE, TestUtils.Pages.CLICK_CLASS_BY_TEXT_DEMO_PAGE));

        testScenarioSteps.add(ImmutableMap.of(
                EVENT, TestUtils.Events.CLICK_ON_LISTED_ITEM,
                ITEM_NAME, TARGET));

        TestScenarioSteps actualSteps = getActualSteps();
        assertEquals(testScenarioSteps, actualSteps);
    }
}
