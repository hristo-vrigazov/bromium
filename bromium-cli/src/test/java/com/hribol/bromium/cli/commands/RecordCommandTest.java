package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.common.record.RecordBrowserBase;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class RecordCommandTest {

    private final String pathToDriver = "chromedriver";
    private final String pathToJSInjectionFile = "some.js";
    private final String baseUrl = "tenniskafe.com";
    private final String ouputFile = "tmp-record.json";
    private final String browserType = CHROME;
    private final int timeout = 10;
    private RecordBrowserBase recordBrowserBase = mock(RecordBrowserBase.class);
    private PromptUtils promptUtils = mock(PromptUtils.class);
    RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);

    @Test
    public void recordDumpsFile() throws IOException {
        when(recordBrowserFactory.create(CHROME, pathToDriver, pathToJSInjectionFile)).thenReturn(recordBrowserBase);

        RecordCommand.Builder builder = createBuilder();
        RecordCommand recordCommand = new RecordCommand(builder);
        recordCommand.run();

        verify(recordBrowserBase).dumpActions(ouputFile);
    }

    private RecordCommand.Builder createBuilder() {
        RecordCommand.Builder builder = mock(RecordCommand.Builder.class);
        when(builder.getPathToDriver()).thenReturn(pathToDriver);
        when(builder.getPathToApplicationConfiguration()).thenReturn(pathToJSInjectionFile);
        when(builder.getBaseUrl()).thenReturn(baseUrl);
        when(builder.getOutputFile()).thenReturn(ouputFile);
        when(builder.getTimeout()).thenReturn(timeout);
        when(builder.getBrowserType()).thenReturn(browserType);
        when(builder.getRecordBrowserFactory()).thenReturn(recordBrowserFactory);
        when(builder.getPromptUtils()).thenReturn(promptUtils);
        return builder;
    }

    @Test
    public void ifExceptionIsThrownDoesNotDumpActions() throws IOException {
        when(recordBrowserFactory.create(CHROME, pathToDriver, pathToJSInjectionFile)).thenThrow(new IOException());

        RecordCommand.Builder builder = createBuilder();
        RecordCommand recordCommand = new RecordCommand(builder);
        recordCommand.run();

        verify(recordBrowserBase, never()).dumpActions(ouputFile);
    }
}
