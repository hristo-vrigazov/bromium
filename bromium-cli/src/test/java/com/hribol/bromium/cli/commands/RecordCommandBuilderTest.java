package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.common.record.RecordBrowserBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 04.07.17.
 */
public class RecordCommandBuilderTest {

    private final String pathToDriver = "chromedriver";
    private final String pathToJSInjectionFile = "some.js";
    private final String baseUrl = "tenniskafe.com";
    private final String outputFile = "tmp-record.json";
    private final String pathToConfigurationFile = "config.json";
    private final String browserType = CHROME;
    private final int timeout = 10;
    private PromptUtils promptUtils = mock(PromptUtils.class);
    RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);

    @Test
    public void setsAndGets() {
        RecordCommand.Builder builder = new RecordCommand.Builder();
        builder.pathToDriver(pathToDriver)
                .pathToApplicationConfiguration(pathToConfigurationFile)
                .baseUrl(baseUrl)
                .outputFile(outputFile)
                .browserType(browserType)
                .timeout(timeout)
                .recordBrowserFactory(recordBrowserFactory)
                .promptUtils(promptUtils);

        assertEquals(pathToDriver, builder.getPathToDriver());
        assertEquals(pathToConfigurationFile, builder.getPathToApplicationConfiguration());
        assertEquals(baseUrl, builder.getBaseUrl());
        assertEquals(outputFile, builder.getOutputFile());
        assertEquals(browserType, builder.getBrowserType());
        assertEquals(timeout, builder.getTimeout());
        assertEquals(recordBrowserFactory, builder.getRecordBrowserFactory());
        assertEquals(promptUtils, builder.getPromptUtils());
        assertNotNull(builder.build());
    }
}
