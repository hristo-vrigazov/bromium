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
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 03.08.17.
 */
public class RecordNotExposedPageLoadingIT extends BaseRecordIntegrationTest {

    @Override
    public void doRunTest(Map<String, Object> opts) throws IOException {
        Module defaultModule = new DefaultModule(RECORD, opts);
        Injector originalInjector = Guice.createInjector(defaultModule);
        RecordingSimulatorModule recordingSimulatorModule = new RecordingSimulatorModule(originalInjector);
        RunnableWhenPrompted runnableWhenPrompted = new RunnableWhenPrompted(recordingSimulatorModule::getWebDriver, demoApp.getBaseUrl());
        recordingSimulatorModule.whenPromptedForRecordingRunnable(runnableWhenPrompted);
        Injector injector = Guice.createInjector(Modules.override(defaultModule).with(recordingSimulatorModule));
        RecordCommand recordCommand = injector.getInstance(RecordCommand.class);
        recordCommand.run();

        TestScenarioSteps expected = new TestScenarioSteps();
        expected.add(ImmutableMap.of(EVENT, PAGE_LOAD_AJAX));

        TestScenarioSteps actual = ConfigurationUtils.readSteps((String) opts.get(OUTPUT));
        assertEquals(expected, actual);
    }

    private static class RunnableWhenPrompted implements Runnable {

        private Supplier<WebDriver> driverSupplier;
        private String baseUrl;

        private RunnableWhenPrompted(Supplier<WebDriver> driverSupplier, String baseUrl) {
            this.driverSupplier = driverSupplier;
            this.baseUrl = baseUrl;
        }

        @Override
        public void run() {
            WebDriver driver = driverSupplier.get();
            WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
            driver.get(baseUrl + "ajax.html");
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(AJAX_DEMO_ID)));
        }
    }

}
