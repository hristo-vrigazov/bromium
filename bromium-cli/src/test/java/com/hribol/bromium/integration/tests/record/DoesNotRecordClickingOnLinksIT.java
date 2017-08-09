package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import com.hribol.bromium.cli.DefaultModule;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.ParsedOptions.*;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.spy;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 06.08.17.
 */
public class DoesNotRecordClickingOnLinksIT extends BaseRecordIntegrationTest {

    @Override
    public void verifyAssertions() throws IOException {
        TestScenarioSteps expected = new TestScenarioSteps();
        expected.add(ImmutableMap.of(EVENT, PAGE_LOAD_INDEX));
        expected.add(ImmutableMap.of(EVENT, CLICK_LINK_TO_AJAX_DEMO_PAGE));

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
    }

}
