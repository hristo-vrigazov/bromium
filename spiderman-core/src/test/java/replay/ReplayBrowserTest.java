package replay;

import com.hribol.automation.core.execution.application.ApplicationActionFactory;
import com.hribol.automation.core.execution.executor.TestScenario;
import com.hribol.automation.core.execution.executor.TestScenarioFactory;
import com.hribol.automation.core.execution.executor.TestScenarioFactoryImpl;
import com.hribol.automation.core.execution.executor.WebDriverActionExecution;
import com.hribol.automation.core.replay.ReplayBrowser;
import com.hribol.automation.core.utils.LoadingTimes;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayBrowserTest {

    @Test
    public void replayInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = mock(ApplicationActionFactory.class);
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory);
        replayBrowser.replay(testScenario, webDriverActionExecution);

        verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayInvokesExecutionExecuteMethodOnScreen() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = mock(ApplicationActionFactory.class);
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);

        String screen = ":1";

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory);
        replayBrowser.replayOnScreen(testScenario, webDriverActionExecution, screen);

        verify(webDriverActionExecution).executeOnScreen(testScenario, screen);
    }

    @Test
    public void replayFromFileInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = mock(ApplicationActionFactory.class);
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";

        when(testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, testScenarioFactory);
        replayBrowser.replay(pathToSerializedTest, webDriverActionExecution);

        verify(webDriverActionExecution).execute(testScenario);
    }

    @Test
    public void replayFromFileOnScreenInvokesExecutionExecuteMethod() throws InterruptedException, IOException, URISyntaxException {
        ApplicationActionFactory applicationActionFactory = mock(ApplicationActionFactory.class);
        TestScenario testScenario = mock(TestScenario.class);
        WebDriverActionExecution webDriverActionExecution = mock(WebDriverActionExecution.class);
        LoadingTimes loadingTimes = mock(LoadingTimes.class);
        when(webDriverActionExecution.getLoadingTimes()).thenReturn(loadingTimes);
        TestScenarioFactory testScenarioFactory = mock(TestScenarioFactory.class);
        String pathToSerializedTest = "testcase.json";
        String screen = ":1";

        when(testScenarioFactory.createFromFile(applicationActionFactory, pathToSerializedTest)).thenReturn(testScenario);

        ReplayBrowser replayBrowser = new ReplayBrowser(applicationActionFactory, testScenarioFactory);
        replayBrowser.replayOnScreen(pathToSerializedTest, webDriverActionExecution, screen);

        verify(webDriverActionExecution).executeOnScreen(testScenario, screen);
    }
}
