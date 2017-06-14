package com.hribol.bromium.cli.commands;

import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class ReplayCommandTest {
//
//    private String pathToDriver;
//    private String pathToApplicationConfiguration;
//    private String pathToSerializedTest;
//    private String pathToJS;
//    private int timeout;
//    private int measurementsPrecisionMilli;
//    private String baseURI;

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
//        pathToJS = getClass().getResource("/something.js").getFile();
//
//        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
//
//        ExecutionFactory executionFactory = mock(ExecutionFactory.class);
//        when(executionFactory.create(eq(CHROME), any(ExecutorBuilder.class))).thenReturn(webDriverActionExecution);
//
//        ReplayCommand replayCommand = ReplayCommand.builder()
//                .pathToDriver(pathToDriver)
//                .applicationConfiguration(pathToApplicationConfiguration)
//                .testCase(pathToSerializedTest)
//                .javascriptFile(pathToJS)
//                .timeout(timeout)
//                .applicationConfigurationInputStream(new FileInputStream(pathToApplicationConfiguration))
//                .measurementsPrecisionMilli(measurementsPrecisionMilli)
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
