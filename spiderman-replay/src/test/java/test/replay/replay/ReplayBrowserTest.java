package test.replay.replay;

import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.replay.AutomationResult;
import com.hribol.spiderman.replay.ReplayBrowser;
import com.hribol.spiderman.replay.execution.WebDriverActionExecution;
import org.mockito.Mockito;
import com.hribol.spiderman.core.utils.LoadingTimes;
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

    private String exampleMetricsFile = "example.csv";

    @Test
    public void replayInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, webDriverActionExecution);
        replayBrowser.replay(testScenario, exampleMetricsFile);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayInvokesExecutionExecuteMethodOnScreen() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);

        String screen = ":1";

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, webDriverActionExecution);
        replayBrowser.replayOnScreen(testScenario, screen);

        Mockito.verify(webDriverActionExecution).executeOnScreen(testScenario, screen);
    }

    @Test
    public void replayFromFileInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replay(pathToSerializedTest, exampleMetricsFile);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayFromFileOnScreenInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";
        String screen = ":1";

        when(testScenarioFactory.createFromFile(pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(testScenarioFactory, webDriverActionExecution);
        replayBrowser.replayOnScreen(pathToSerializedTest, screen);

        Mockito.verify(webDriverActionExecution).executeOnScreen(testScenario, screen);
    }

    @Test
    public void correctAutomationResultIsReturned() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        when(webDriverActionExecution.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);

        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, webDriverActionExecution);
        AutomationResult automationResult = replayBrowser.replay(testScenario, "example.csv");

        assertEquals(AutomationResult.SUCCESS, automationResult);
    }
}
