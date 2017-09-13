package com.hribol.bromium.integration.tests.record;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import com.hribol.bromium.cli.DefaultModule;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.core.utils.parsing.StepsReader;
import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
import com.hribol.bromium.integration.tests.simulation.RecordingSimulatorModule;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.ParsedOptions.*;
import static com.hribol.bromium.integration.tests.TestUtils.Resources.DEMO_CONFIGURATION;
import static com.hribol.bromium.integration.tests.TestUtils.generateRandomJsonFilename;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 08.08.17.
 */
public abstract class BaseRecordIntegrationTest extends BaseDemoAppIntegrationTest implements SimulatorRunnable {
    public BaseRecordIntegrationTest() {
        super(DEMO_CONFIGURATION,
                generateRandomJsonFilename());
    }

    protected Map<String, Object> opts = new HashMap<>();

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
        recordingSimulatorModule.whenPromptedForRecordingRunnable(this);
        Injector injector = Guice.createInjector(Modules.override(defaultModule).with(recordingSimulatorModule));
        RecordCommand recordCommand = injector.getInstance(RecordCommand.class);
        recordCommand.run();
        verifyAssertions();
    }

    protected abstract void verifyAssertions() throws IOException;

    protected TestScenarioSteps getActualSteps() throws IOException {
        String filename = (String) opts.get(OUTPUT);
        try (InputStream inputStream = new FileInputStream(filename)) {
            return new StepsReader().readSteps(inputStream);
        }
    }
}
