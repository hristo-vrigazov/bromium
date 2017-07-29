package com.hribol.bromium.integration.tests.record;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.inject.*;
import com.google.inject.util.Modules;
import com.hribol.bromium.browsers.chrome.base.VisibleChromeDriverSupplier;
import com.hribol.bromium.cli.DefaultModule;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
import com.hribol.bromium.record.RecordRequestFilter;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

        Module defaultModule = new DefaultModule(opts);
        TestScenarioSteps expected = exampleTestScenarioSteps();

        Module mockedPromptUtilsModule = new ModuleWithMockedPromptUtils(expected);

        Injector injector = Guice.createInjector(Modules.override(defaultModule).with(mockedPromptUtilsModule));

        RecordCommand recordCommand = injector.getInstance(RecordCommand.class);
        recordCommand.run();

        TestScenarioSteps actual = ConfigurationUtils.readSteps(outputFile.getAbsolutePath());
        assertEquals(expected, actual);
    }

    private static class ModuleWithMockedPromptUtils extends AbstractModule {

        private PromptUtils promptUtils;
        private RecordRequestFilter recordRequestFilter;

        private ModuleWithMockedPromptUtils(TestScenarioSteps expected) {
            this.promptUtils = spy(new PromptUtils());
            this.recordRequestFilter = spy(new RecordRequestFilter());

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
            bind(PromptUtils.class).toInstance(promptUtils);
            bind(RecordRequestFilter.class).toInstance(recordRequestFilter);
        }
    }
}
