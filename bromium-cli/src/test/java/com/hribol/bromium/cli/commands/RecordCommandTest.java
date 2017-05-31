package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.spiderman.record.RecordBrowserBase;
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
    private RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);
    private PromptUtils promptUtils = mock(PromptUtils.class);


    @Test
    public void recordDumpsFile() throws IOException {
        RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);
        when(recordBrowserFactory.create(CHROME, pathToDriver, pathToJSInjectionFile)).thenReturn(recordBrowserBase);
        RecordCommand recordCommand = new RecordCommand(pathToDriver, pathToJSInjectionFile, baseUrl, ouputFile, timeout,
                browserType, recordBrowserFactory, promptUtils);
        recordCommand.run();

        verify(recordBrowserBase).dumpActions(ouputFile);
    }

    @Test
    public void canBeInstantiatedViaDefaultFactoryConstructor() {
        RecordCommand recordCommand = new RecordCommand(pathToDriver, pathToJSInjectionFile, baseUrl, ouputFile,
                browserType, promptUtils, timeout);
        assertNotNull(recordCommand);
    }

    @Test
    public void ifExceptionIsThrownDoesNotDumpActions() throws IOException {
        RecordBrowserFactory recordBrowserFactory = mock(RecordBrowserFactory.class);
        when(recordBrowserFactory.create(CHROME, pathToDriver, pathToJSInjectionFile)).thenThrow(new IOException());

        RecordCommand recordCommand = new RecordCommand(pathToDriver, pathToJSInjectionFile, baseUrl, ouputFile,
                timeout, browserType, recordBrowserFactory, promptUtils);
        recordCommand.run();

        verify(recordBrowserBase, never()).dumpActions(ouputFile);
    }
}
