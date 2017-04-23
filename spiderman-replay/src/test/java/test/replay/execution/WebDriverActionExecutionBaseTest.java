package test.replay.execution;

import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.replay.AutomationResult;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutionBase;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import net.lightbody.bmp.core.har.Har;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class WebDriverActionExecutionBaseTest {

    String systemProperty = "property";
    String baseURI = "http://tenniskafe.com";
    int precision = 500;
    int timeout = 10;
    String pathToDriverExecutable = "file:///somepath";

    @Test
    public void oneActionWithNoProblems() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        when(testScenario.pollWebdriverAction()).thenReturn(firstAction);
        webDriverActionExecutionBase.execute(testScenario);
        assertNotNull(webDriverActionExecutionBase.getLoadingTimes());
        assertEquals(AutomationResult.SUCCESS, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void actionWhichThrowsAssertionError() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(AssertionError.class).when(firstAction).execute(any());
        when(testScenario.pollWebdriverAction()).thenReturn(firstAction);
        webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.ASSERTION_ERROR, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void canDumpHar() throws IOException, URISyntaxException {
        Har har = mock(Har.class);
        ReplaySettings replaySettings = mock(ReplaySettings.class);
        when(replaySettings.getHar()).thenReturn(har);

        String filename = "filename";
        String systemProperty = "property";
        String baseURI = "http://tenniskafe.com";
        int precision = 500;
        int timeout = 10;
        String pathToDriverExecutable = "file:///somepath";

        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        when(webDriverActionExecutor.getBaseURI()).thenReturn(baseURI);
        when(webDriverActionExecutor.getMeasurementsPrecisionMilli()).thenReturn(precision);
        when(webDriverActionExecutor.getTimeout()).thenReturn(timeout);
        when(webDriverActionExecutor.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);

        WebDriverActionExecutionBase webDriverActionExecutionBase =
                new WebDriverActionExecutionBase(webDriverActionExecutor) {
                    @Override
                    protected ReplaySettings createExecutionSettings() {
                        return replaySettings;
                    }

                    @Override
                    protected String getSystemProperty() {
                        return systemProperty;
                    }
                };

        webDriverActionExecutionBase.dumpHarMetrics(filename);

        verify(har).writeTo((File) any());
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase() throws IOException, URISyntaxException {
        ReplaySettings replaySettings = mock(ReplaySettings.class);
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        when(webDriverActionExecutor.getBaseURI()).thenReturn(baseURI);
        when(webDriverActionExecutor.getMeasurementsPrecisionMilli()).thenReturn(precision);
        when(webDriverActionExecutor.getTimeout()).thenReturn(timeout);
        when(webDriverActionExecutor.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);

        return new WebDriverActionExecutionBase(webDriverActionExecutor) {
            @Override
            protected ReplaySettings createExecutionSettings() {
                return replaySettings;
            }

            @Override
            protected String getSystemProperty() {
                return systemProperty;
            }
        };
    }
}
