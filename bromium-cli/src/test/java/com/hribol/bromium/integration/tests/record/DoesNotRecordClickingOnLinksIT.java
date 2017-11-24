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
import static com.hribol.bromium.integration.tests.TestUtils.AJAX_DEMO_LINK;
import static com.hribol.bromium.integration.tests.TestUtils.Events;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 06.08.17.
 */
public class DoesNotRecordClickingOnLinksIT extends BaseRecordIntegrationTest {

    @Override
    public void verifyAssertions() throws IOException {
        TestScenarioSteps expected = new TestScenarioSteps();
        expected.add(ImmutableMap.of(EVENT, Events.PAGE_LOAD_INDEX));
        expected.add(ImmutableMap.of(EVENT, Events.CLICK_LINK_TO_AJAX_DEMO_PAGE));

        TestScenarioSteps actual = getActualSteps();
        assertEquals(expected, actual);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) {
        String baseUrl = (String) opts.get(URL);
        WebDriver webDriver = recordingSimulatorModule.getWebDriver();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
        webDriver.get(baseUrl + "index.html");
        By byId = By.id(AJAX_DEMO_LINK);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byId));
        webDriver.findElement(byId).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
