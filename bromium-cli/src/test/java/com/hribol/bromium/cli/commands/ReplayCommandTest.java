package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 28.04.17.
 */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(IOUtils.class)
public class ReplayCommandTest {

    private String pathToDriver;
    private String pathToApplicationConfiguration;
    private String pathToSerializedTest;
    private int timeout;
    private int measurementsPrecisionMilli;
    private String baseURI;

//    @Test
//    public void ifDriverStartsSuccessfullyEverythingWorks() throws Exception {
//        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
//        ExecutionReport executionReport = mock(ExecutionReport.class);
//        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);
//        when(replayBrowser.replay(any(InputStream.class))).thenReturn(executionReport);
//        baseTest(replayBrowser);
//        verify(replayBrowser).replay(any(InputStream.class));
//
//    }
//
//    @Test
//    public void ifExceptionIsThrownThenItIsLogged() throws Exception {
//        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
//        ExecutionReport executionReport = mock(ExecutionReport.class);
//        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);
//        when(replayBrowser.replay(any(InputStream.class))).thenReturn(executionReport);
//        when(replayBrowser.replay(anyString(), anyString())).thenThrow(new IOException("No driver found"));
//        baseTest(replayBrowser);
//    }
//
//    @Test
//    public void ifExceptionWhenReplayingFromInputStreamIsThrownThenItIsLogged() throws Exception {
//        ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
//        when(replayBrowser.replay(any(InputStream.class))).thenThrow(new IOException("No driver found"));
//        baseTest(replayBrowser);
//    }
//
//    private void baseTest(ReplayBrowser replayBrowser) throws Exception {
//        pathToDriver = "chromedriver";
//        pathToApplicationConfiguration = getClass().getResource("/tenniskafe.json").getFile();
//        pathToSerializedTest = getClass().getResource("/testCase.json").getFile();
//        timeout = 10;
//        measurementsPrecisionMilli = 500;
//        baseURI = "http://tenniskafe.com";
//
//        ApplicationConfigurationParser applicationConfigurationParser = mock(ApplicationConfigurationParser.class);
//        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
//
//        ExecutionFactory executionFactory = mock(ExecutionFactory.class);
//        when(executionFactory.create(eq(CHROME), any(ExecutorBuilder.class))).thenReturn(webDriverActionExecution);
//
//        ReplayCommand replayCommand = ReplayCommand.builder()
//                .pathToDriver(pathToDriver)
//                .applicationConfiguration(pathToApplicationConfiguration)
//                .testCase(pathToSerializedTest)
//                .timeout(timeout)
//                .applicationConfigurationInputStream(new FileInputStream(pathToApplicationConfiguration))
//                .measurementsPrecisionMilli(measurementsPrecisionMilli)
//                .applicationConfigurationParser(applicationConfigurationParser)
//                .baseURL(baseURI)
//                .browserType(CHROME)
//                .executionFactory(executionFactory)
//                .build();
//
//        FileInputStream fileInputStream = mock(FileInputStream.class);
//
//        whenNew(ReplayBrowser.class).withAnyArguments().thenReturn(replayBrowser);
//        whenNew(FileInputStream.class).withAnyArguments().thenReturn(fileInputStream);
//
//        PowerMockito.mockStatic(IOUtils.class);
//        when(IOUtils.toString(any(InputStream.class))).thenReturn("");
//        replayCommand.run();
//    }

}
