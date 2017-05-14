package test.replay.replay;

import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.replay.ReplayBrowser;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import org.mockito.Mockito;
import com.hribol.spiderman.replay.report.LoadingTimes;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayBrowserTest {


    @Test
    public void replayFromFileInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replay(pathToSerializedTest);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayFromFileOnScreenInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";
        String screen = ":1";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replay(pathToSerializedTest, screen);

        Mockito.verify(webDriverActionExecution).execute(testScenario, screen);
    }

}
