package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.TestUtils;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.DATA_ID_VALUE;
import static com.hribol.bromium.integration.tests.TestUtils.ENTITY_ID_VARIABLE;
import static com.hribol.bromium.integration.tests.TestUtils.SUBPAGE;
import static org.junit.Assert.assertEquals;

public class SetVariableToTextOfElementWithCssSelectorIT extends BaseRecordIntegrationTest {

    private final String SOME_ID_HERE = "someIdHere";
    private final String ANOTHER_ID_HERE = "anotherIdHere";

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps expected = new TestScenarioSteps();

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.PAGE_LOAD,
                SUBPAGE, TestUtils.Pages.SET_VARIABLE_TO_TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_DEMO_PAGE
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.SET_ENTITY_ID_VARIABLE
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.CLICK_SOME_ID_HERE,
                DATA_ID_VALUE, ENTITY_ID_VARIABLE ("1")
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.CLICK_SOME_ID_HERE,
                DATA_ID_VALUE, ANOTHER_ID_HERE
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.CLICK_REMOVE_INITIAL
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.SET_ENTITY_ID_VARIABLE
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.CLICK_REGENERATE_BUTTON
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.CLICK_SOME_ID_HERE,
                DATA_ID_VALUE, ENTITY_ID_VARIABLE ("5")
        ));

        expected.add(ImmutableMap.of(
                EVENT, TestUtils.Events.CLICK_SOME_ID_HERE,
                DATA_ID_VALUE, ANOTHER_ID_HERE + "1"
        ));

        TestScenarioSteps actual = getActualSteps();

        assertEquals(expected, actual);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) throws InterruptedException {
        String baseUrl = (String) opts.get(URL);
        WebDriver webDriver = recordingSimulatorModule.getWebDriver();

        // first stage
        webDriver.get(baseUrl + "set-variable-to-text-of-element-with-css-selector.html");
        webDriver.findElement(By.cssSelector("[data-id='someIdHere']")).click();
        webDriver.findElement(By.cssSelector("[data-id='anotherIdHere']")).click();

        //clear first stage
        webDriver.findElement(By.id("remove-initial")).click();

        // regenerate to checck other steps
        webDriver.findElement(By.cssSelector("#regenerate-button")).click();
        webDriver.findElement(By.cssSelector("[data-id='someIdHere1']")).click();
        webDriver.findElement(By.cssSelector("[data-id='anotherIdHere1']")).click();
    }

}
