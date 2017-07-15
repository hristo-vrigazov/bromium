package com.hribol.bromium.replay.replay;

import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import com.hribol.bromium.replay.report.ExecutionReport;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayBrowserTest {

    @Test
    public void replayFromFileInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replay(pathToSerializedTest);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayFromFileOnScreenInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";
        String screen = ":1";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replay(pathToSerializedTest, screen);

        Mockito.verify(webDriverActionExecution).execute(testScenario, screen);
    }

    @Test
    public void delegatesCreateVirtualScreenProcessAndExecute() throws IOException {
        ExecutionReport expectedReport = mock(ExecutionReport.class);
        InputStream inputStream = mock(InputStream.class);
        int screen = 2;
        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);
        TestScenario testScenario = mock(TestScenario.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromInputStream(inputStream)).thenReturn(testScenario);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        when(webDriverActionExecution.createVirtualScreenProcessAndExecute(testScenario, screen, virtualScreenProcessCreator))
                .thenReturn(expectedReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);

        ExecutionReport actualReport = replayBrowser.createVirtualScreenProcessAndExecute(inputStream, screen, virtualScreenProcessCreator);

        assertEquals(expectedReport, actualReport);
    }

    @Test
    public void delegatesExecuteFromInputStream() throws IOException, URISyntaxException, InterruptedException {
        ExecutionReport expectedReport = mock(ExecutionReport.class);
        InputStream inputStream = mock(InputStream.class);
        TestScenario testScenario = mock(TestScenario.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromInputStream(inputStream)).thenReturn(testScenario);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        when(webDriverActionExecution.execute(testScenario))
                .thenReturn(expectedReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);

        ExecutionReport actualReport = replayBrowser.replay(inputStream);
        assertEquals(expectedReport, actualReport);
    }

    @Test
    public void delegatesExecuteFromTestCaseSteps() throws IOException, URISyntaxException, InterruptedException {
        ExecutionReport expectedReport = mock(ExecutionReport.class);
        List<Map<String, String>> testCaseSteps = mock(List.class);
        TestScenario testScenario = mock(TestScenario.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromTestCaseSteps(testCaseSteps)).thenReturn(testScenario);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        when(webDriverActionExecution.execute(testScenario))
                .thenReturn(expectedReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);

        ExecutionReport actualReport = replayBrowser.replay(testCaseSteps);
        assertEquals(expectedReport, actualReport);
    }

    @Test
    public void delegatesExecuteFromInputStreamOnScreen() throws IOException, URISyntaxException, InterruptedException {
        ExecutionReport expectedReport = mock(ExecutionReport.class);
        String screenToUse = ":2";
        InputStream inputStream = mock(InputStream.class);
        TestScenario testScenario = mock(TestScenario.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromInputStream(inputStream)).thenReturn(testScenario);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        when(webDriverActionExecution.execute(testScenario, screenToUse))
                .thenReturn(expectedReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);

        ExecutionReport actualReport = replayBrowser.replay(inputStream, screenToUse);
        assertEquals(expectedReport, actualReport);
    }

    @Test
    public void delegatesExecuteFromTestCaseStepsOnScreen() throws IOException, URISyntaxException, InterruptedException {
        ExecutionReport expectedReport = mock(ExecutionReport.class);
        Integer screenToUse = 2;
        List<Map<String, String>> testCaseSteps = new ArrayList<>();
        TestScenario testScenario = mock(TestScenario.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromTestCaseSteps(testCaseSteps)).thenReturn(testScenario);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);

        when(webDriverActionExecution.createVirtualScreenProcessAndExecute(testScenario, screenToUse, virtualScreenProcessCreator))
                .thenReturn(expectedReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);

        ExecutionReport actualReport = replayBrowser.createVirtualScreenProcessAndExecute(testCaseSteps, screenToUse, virtualScreenProcessCreator);
        assertEquals(expectedReport, actualReport);
    }
}
