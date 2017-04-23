package replay;

import com.hribol.automation.core.execution.application.ApplicationActionFactory;
import com.hribol.automation.core.execution.scenario.TestScenario;
import com.hribol.automation.core.execution.scenario.TestScenarioFactory;
import com.hribol.automation.replay.ReplayBrowser;
import com.hribol.automation.replay.WebDriverActionExecution;
import org.mockito.Mockito;
import com.hribol.automation.core.utils.LoadingTimes;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayBrowserTest {

    @Test
    public void replayInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        Mockito.when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory);
        replayBrowser.replay(testScenario, webDriverActionExecution);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayInvokesExecutionExecuteMethodOnScreen() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        Mockito.when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);

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
        Mockito.when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        Mockito.when(testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, testScenarioFactory);
        replayBrowser.replay(pathToSerializedTest, webDriverActionExecution);

        Mockito.verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayFromFileOnScreenInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = Mockito.mock(ApplicationActionFactory.class);
        TestScenario testScenario = Mockito.mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = Mockito.mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = Mockito.mock(LoadingTimes.class);
        Mockito.when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = Mockito.mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";
        String screen = ":1";

        Mockito.when(testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, testScenarioFactory);
        replayBrowser.replayOnScreen(pathToSerializedTest, webDriverActionExecution, screen);

        Mockito.verify(webDriverActionExecution).executeOnScreen(testScenario, screen);
    }
}
