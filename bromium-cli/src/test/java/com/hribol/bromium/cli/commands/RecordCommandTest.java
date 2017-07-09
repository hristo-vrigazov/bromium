package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.core.utils.JavascriptInjector;
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
    private JavascriptInjector javascriptInjector = mock(JavascriptInjector.class);
    RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);

    @Test
    public void recordDumpsFile() throws IOException {
        when(recordBrowserFactory.create(CHROME, pathToDriver, javascriptInjector)).thenReturn(recordBrowserBase);

        RecordCommand recordCommand = new RecordCommand(
                browserType,
                pathToDriver,
                () -> javascriptInjector,
                baseUrl,
                timeout,
                ouputFile,
                recordBrowserFactory,
                promptUtils
        );
        recordCommand.run();

        verify(recordBrowserBase).dumpActions(ouputFile);
        verify(promptUtils).dispose();
    }


    @Test
    public void ifExceptionIsThrownDoesNotDumpActions() throws IOException {
        when(recordBrowserFactory.create(CHROME, pathToDriver, javascriptInjector)).thenThrow(new IOException());

        RecordCommand recordCommand = new RecordCommand(
                browserType,
                pathToDriver,
                () -> javascriptInjector,
                baseUrl,
                timeout,
                ouputFile,
                recordBrowserFactory,
                promptUtils
        );
        recordCommand.run();

        verify(recordBrowserBase, never()).dumpActions(ouputFile);
        verify(promptUtils).dispose();
    }
}
