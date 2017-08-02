package com.hribol.bromium.integration.tests.record;

import com.google.inject.*;
import com.google.inject.util.Modules;
import com.hribol.bromium.cli.DefaultModule;
import com.hribol.bromium.cli.Main;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
import com.hribol.bromium.record.RecordRequestFilter;
import com.hribol.bromium.record.RecordingState;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.ParsedOptions.*;
import static com.hribol.bromium.core.utils.Constants.SUBMIT_EVENT_URL;
import static com.hribol.bromium.integration.tests.TestUtils.exampleTestScenarioSteps;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 24.07.17.
 */
public class RecordThroughTheRecordRequestFilterIT extends BaseDemoAppIntegrationTest {
    public RecordThroughTheRecordRequestFilterIT() {
        super("integration-tests/demo.json", "output.json", System.getProperty("screenNumber", "1"));
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
        opts.put(SCREEN, String.valueOf(1));


        Module defaultModule = new DefaultModule(RECORD, opts);
        TestScenarioSteps expected = exampleTestScenarioSteps();

        Injector originalInjector = Guice.createInjector(defaultModule);

        Module mockedPromptUtilsModule = new ModuleWithMockedPromptUtils(originalInjector, expected);

        Injector injector = Guice.createInjector(Modules.override(defaultModule).with(mockedPromptUtilsModule));

        RecordCommand recordCommand = injector.getInstance(RecordCommand.class);
        recordCommand.run();

        TestScenarioSteps actual = ConfigurationUtils.readSteps(outputFile.getAbsolutePath());
        assertEquals(expected, actual);
    }

    private static class ModuleWithMockedPromptUtils extends AbstractModule {

        private PromptUtils promptUtils;
        private RequestFilter recordRequestFilter;
        private RecordingState recordingState;

        private ModuleWithMockedPromptUtils(Injector originalInjector, TestScenarioSteps expected) {
            this.promptUtils = spy(originalInjector.getInstance(PromptUtils.class));
            this.recordRequestFilter = spy(originalInjector.getInstance(RequestFilter.class));
            this.recordingState = spy(originalInjector.getInstance(RecordingState.class));

            doAnswer(invocationOnMock -> {
                HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
                HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);

                for (Map<String, String> testCaseStep: expected) {
                    String queryString = ConfigurationUtils.toQueryString(testCaseStep);
                    HttpRequest httpRequest = mock(HttpRequest.class);
                    when(httpRequest.getUri()).thenReturn(SUBMIT_EVENT_URL + queryString);
                    recordRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);
                }

                return null;
            }).when(promptUtils).promptForRecording();
        }

        @Override
        protected void configure() {
            bind(PromptUtils.class).toProvider(() -> promptUtils);
            bind(RecordingState.class).toProvider(() -> recordingState);
            bind(RequestFilter.class).toProvider(() -> recordRequestFilter);
        }
    }
}
