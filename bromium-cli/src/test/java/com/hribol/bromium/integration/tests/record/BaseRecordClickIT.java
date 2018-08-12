package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static com.hribol.bromium.cli.ParsedOptions.URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.Events.PAGE_LOAD;
import static com.hribol.bromium.integration.tests.TestUtils.SUBPAGE;
import static org.junit.Assert.assertEquals;

public abstract class BaseRecordClickIT extends BaseRecordIntegrationTest {

    private String demoPage;
    private Map<String, String> event;
    private Function<WebDriver, WebElement> elementFunction;

    public BaseRecordClickIT(String demoPage, String action, By locator) {
        this(demoPage, ImmutableMap.of(EVENT, action), webDriver -> webDriver.findElement(locator));
    }

    public BaseRecordClickIT(String demoPage, String action, Function<WebDriver, WebElement> elementFunction) {
        this(demoPage, ImmutableMap.of(EVENT, action), elementFunction);
    }

    public BaseRecordClickIT(String demoPage, Map<String, String> event, Function<WebDriver, WebElement> elementFunction) {
        this.demoPage = demoPage;
        this.event = event;
        this.elementFunction = elementFunction;
    }

    @Override
    protected void verifyAssertions() throws IOException {
        TestScenarioSteps expectedSteps = new TestScenarioSteps();
        expectedSteps.add(ImmutableMap.of(
                EVENT, PAGE_LOAD,
                SUBPAGE, demoPage
        ));

        expectedSteps.add(event);

        TestScenarioSteps actualSteps = getActualSteps();

        assertEquals(expectedSteps, actualSteps);
    }

    @Override
    public void run(RecordingSimulatorModule recordingSimulatorModule) throws InterruptedException {
        String baseUrl = (String) opts.get(URL);
        WebDriver driver = recordingSimulatorModule.getWebDriver();
        driver.get(baseUrl + demoPage);
        WebElement webElement = elementFunction.apply(driver);
        webElement.click();
        Thread.sleep(1000);
    }

}
