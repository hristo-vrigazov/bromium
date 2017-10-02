package com.hribol.bromium.replay.replay;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.execution.WebDriverActionExecutor;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import com.hribol.bromium.replay.report.ExecutionReport;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayBrowserTest {

    @Test
    public void replayFromFileInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecutor);
        replayBrowser.replay(pathToSerializedTest);

        Mockito.verify(webDriverActionExecutor).execute(testScenario);
    }


    @Test
    public void delegatesExecuteFromInputStream() throws IOException, URISyntaxException, InterruptedException {
        ExecutionReport expectedReport = mock(ExecutionReport.class);
        InputStream inputStream = mock(InputStream.class);
        TestScenario testScenario = mock(TestScenario.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromInputStream(inputStream)).thenReturn(testScenario);
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        when(webDriverActionExecutor.execute(testScenario))
                .thenReturn(expectedReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecutor);

        ExecutionReport actualReport = replayBrowser.replay(inputStream);
        assertEquals(expectedReport, actualReport);
    }

    @Test
    public void delegatesExecuteFromTestCaseSteps() throws IOException, URISyntaxException, InterruptedException {
        ExecutionReport expectedReport = mock(ExecutionReport.class);
        TestScenarioSteps testCaseSteps = mock(TestScenarioSteps.class);
        TestScenario testScenario = mock(TestScenario.class);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        when(testScenarioFactory.createFromTestCaseSteps(testCaseSteps)).thenReturn(testScenario);
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        when(webDriverActionExecutor.execute(testScenario))
                .thenReturn(expectedReport);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecutor);

        ExecutionReport actualReport = replayBrowser.replay(testCaseSteps);
        assertEquals(expectedReport, actualReport);
    }

    @Test
    public void canForceCleanUp() {
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecutor);

        replayBrowser.forceCleanUp();

        verify(webDriverActionExecutor).forceCleanUp();
    }

}
