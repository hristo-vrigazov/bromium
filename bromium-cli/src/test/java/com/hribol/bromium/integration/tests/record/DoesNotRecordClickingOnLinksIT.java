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
public class DoesNotRecordClickingOnLinksIT extends BaseDemoAppIntegrationTest {
    public DoesNotRecordClickingOnLinksIT() {
        super(DEMO_CONFIGURATION, generateRandomJsonFilename());
    }

    @Override
    public void runTest() throws IOException {
        /**
         * record
         * -d ./bromium-chrome/bromium-chrome-base/src/test/resources/chromedriver
         * -a /home/hvrigazov/bromium-data/demo-app/configurations/demo.json
         * -u http://localhost:3000
         * -o bromium-core/src/test/resources/dynamic-testCase.json
         */
        File outputFile = createTempFile(pathToTestCase);
        Map<String, Object> opts = new HashMap<>();
        opts.put(DRIVER, chromedriverFile.getAbsolutePath());
        opts.put(APPLICATION, configurationFile.getAbsolutePath());
        opts.put(URL, demoApp.getBaseUrl());
        opts.put(OUTPUT, outputFile.getAbsolutePath());
        opts.put(BROWSER, CHROME);
        opts.put(TIMEOUT, String.valueOf(10));
        opts.put(SCREEN, screen);

        Module defaultModule = new DefaultModule(RECORD, opts);
        Injector originalInjector = Guice.createInjector(defaultModule);

        RecordingSimulatorModule recordingSimulatorModule = new RecordingSimulatorModule(originalInjector);
        recordingSimulatorModule.whenPromptedForRecordingRunnable(new RunnableWhenPrompted(recordingSimulatorModule::getWebDriver, demoApp.getBaseUrl()));
        Injector injector = Guice.createInjector(Modules.override(defaultModule).with(recordingSimulatorModule));

        RecordCommand recordCommand = injector.getInstance(RecordCommand.class);
        recordCommand.run();

        TestScenarioSteps expected = new TestScenarioSteps();
        expected.add(ImmutableMap.of(EVENT, PAGE_LOAD_INDEX));
        expected.add(ImmutableMap.of(EVENT, CLICK_LINK_TO_AJAX_DEMO_PAGE));

        TestScenarioSteps actual = ConfigurationUtils.readSteps(outputFile.getAbsolutePath());
        assertEquals(expected, actual);
    }

    private static class RunnableWhenPrompted implements Runnable {

        private Supplier<WebDriver> webDriverSupplier;
        private String baseUrl;

        private RunnableWhenPrompted(Supplier<WebDriver> webDriverSupplier, String baseUrl) {
            this.webDriverSupplier = webDriverSupplier;
            this.baseUrl = baseUrl;
        }

        @Override
        public void run() {
            WebDriver webDriver = webDriverSupplier.get();
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
            webDriver.get(baseUrl + "index.html");
            By byId = By.id(AJAX_DEMO_LINK);
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byId));
            webDriver.findElement(byId).click();
        }
    }
}
