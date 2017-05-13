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

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory);
        replayBrowser.replay(testScenario, webDriverActionExecution, exampleMetricsFile);

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

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory);
        replayBrowser.replayOnScreen(testScenario, webDriverActionExecution, screen);

        Mockito.verify(webDriverActionExecution).executeOnScreen(testScenario, screen);
    }

    @Test
    public void replayFromFileInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        when(testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, testScenarioFactory);
        replayBrowser.replay(pathToSerializedTest, webDriverActionExecution, exampleMetricsFile);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayFromFileOnScreenInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";
        String screen = ":1";

        when(testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, testScenarioFactory);
        replayBrowser.replayOnScreen(pathToSerializedTest, webDriverActionExecution, screen);

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

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory);
        AutomationResult automationResult = replayBrowser.replay(testScenario, webDriverActionExecution, "example.csv");

        assertEquals(AutomationResult.SUCCESS, automationResult);
    }
}
