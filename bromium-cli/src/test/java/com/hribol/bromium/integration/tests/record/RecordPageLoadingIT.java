package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import com.hribol.bromium.cli.DefaultModule;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.suppliers.WebDriverSupplier;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.demo.app.DemoApp;
import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
import com.hribol.bromium.record.RecordingState;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.ParsedOptions.*;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.integration.tests.TestUtils.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.PAGE_LOAD_WITH_SUPPLIED_VALUE;
import static com.hribol.bromium.integration.tests.TestUtils.generateRandomJsonFilename;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 03.08.17.
 */
public class RecordPageLoadingIT extends BaseDemoAppIntegrationTest {
    public RecordPageLoadingIT() {
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
        Module moduleWithDriverSpy = new ModuleWithDriverSpy(originalInjector, demoApp.getBaseUrl());
        Injector injector = Guice.createInjector(Modules.override(defaultModule).with(moduleWithDriverSpy));

        RecordCommand recordCommand = injector.getInstance(RecordCommand.class);
        recordCommand.run();

        TestScenarioSteps expected = new TestScenarioSteps();
        expected.add(ImmutableMap.of(EVENT, PAGE_LOAD_WITH_SUPPLIED_VALUE));

        TestScenarioSteps actual = ConfigurationUtils.readSteps(outputFile.getAbsolutePath());
        assertEquals(expected, actual);
    }

    private static class ModuleWithDriverSpy extends AbstractModule {

        private WebDriverSupplier webDriverSupplier;
        private PromptUtils promptUtils;
        private RecordingState recordingState;

        private WebDriver webDriver;

        @SuppressWarnings("unchecked")
        public ModuleWithDriverSpy(Injector originalInjector, String baseUrl) {
            this.webDriverSupplier = spy(originalInjector.getInstance(WebDriverSupplier.class));
            this.recordingState = spy(originalInjector.getInstance(RecordingState.class));
            this.promptUtils = spy(originalInjector.getInstance(PromptUtils.class));

            doAnswer(invocationOnMock -> {
                Object driver = invocationOnMock.callRealMethod();
                setWebDriver((WebDriver) driver);
                return driver;
            }).when(webDriverSupplier).get(any(), any());

            doAnswer(invocationOnMock -> {
                webDriver.get(baseUrl + "ajax.html");
                Thread.sleep(2000);
                return null;
            }).when(promptUtils).promptForRecording();
        }

        @Override
        protected void configure() {
            bind(WebDriverSupplier.class).toProvider(() -> webDriverSupplier);
            bind(PromptUtils.class).toProvider(() -> promptUtils);
            bind(RecordingState.class).toProvider(() -> recordingState);
        }

        public void setWebDriver(WebDriver webDriver) {
            this.webDriver = spy(webDriver);
        }
    }
}
