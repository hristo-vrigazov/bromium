package com.hribol.bromium.integration.tests.record;

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
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.ParsedOptions.*;
import static com.hribol.bromium.core.ConventionConstants.SUBMIT_EVENT_URL;
import static com.hribol.bromium.integration.tests.TestUtils.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 24.07.17.
 */
public class RecordThroughTheRecordRequestFilterIT extends BaseDemoAppIntegrationTest {
    public RecordThroughTheRecordRequestFilterIT() {
        super(DEMO_CONFIGURATION,
                generateRandomJsonFilename());
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
        TestScenarioSteps expected = exampleTestScenarioSteps();

        Injector originalInjector = Guice.createInjector(defaultModule);

        RecordingSimulatorModule recordingSimulatorModule = new RecordingSimulatorModule(originalInjector);
        RunnableWhenPrompted runnableWhenPrompted = new RunnableWhenPrompted(expected, recordingSimulatorModule::getRecordRequestFilter);
        recordingSimulatorModule.whenPromptedForRecordingRunnable(runnableWhenPrompted);
        Injector injector = Guice.createInjector(Modules.override(defaultModule).with(recordingSimulatorModule));

        RecordCommand recordCommand = injector.getInstance(RecordCommand.class);
        recordCommand.run();

        TestScenarioSteps actual = ConfigurationUtils.readSteps(outputFile.getAbsolutePath());
        assertEquals(expected, actual);
    }

    private static class RunnableWhenPrompted implements Runnable {

        private List<Map<String, String>> expected;
        private Supplier<RequestFilter> requestFilterSupplier;

        private RunnableWhenPrompted(List<Map<String, String>> expected, Supplier<RequestFilter> requestFilterSupplier) {
            this.expected = expected;
            this.requestFilterSupplier = requestFilterSupplier;
        }

        @Override
        public void run() {
            RequestFilter recordRequestFilter = requestFilterSupplier.get();
            HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
            HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

            for (Map<String, String> testCaseStep: expected) {
                String queryString = ConfigurationUtils.toQueryString(testCaseStep);
                HttpRequest httpRequest = mock(HttpRequest.class);
                when(httpRequest.getUri()).thenReturn(SUBMIT_EVENT_URL + queryString);
                recordRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);
            }

        }
    }
}
