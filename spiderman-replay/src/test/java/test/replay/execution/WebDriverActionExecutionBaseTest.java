package test.replay.execution;

import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.replay.AutomationResult;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutionBase;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutor;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

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
    String pathToDriverExecutable = "file:///somepath";

    Har har = mock(Har.class);


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
    public void timesoOutIfActionTakesTooLong() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(1);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true);
        when(testScenario.nextActionExpectsHttpRequest()).thenReturn(true);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doAnswer(invocationOnMock -> {
            Thread.sleep(1500);
            return null;
        }).when(firstAction).execute(any());
        when(testScenario.pollWebdriverAction()).thenReturn(firstAction);
        webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void properlyHandlesInterruptedException() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(10);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true);
        when(testScenario.nextActionExpectsHttpRequest()).thenReturn(true);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(InterruptedException.class).when(firstAction).execute(any());
        when(testScenario.pollWebdriverAction()).thenReturn(firstAction);
        webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.INTERRUPTED, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void retriesIfCannotMakeItFromFirstTime() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).doNothing().when(firstAction).execute(any());
        when(testScenario.pollWebdriverAction()).thenReturn(firstAction);
        webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.SUCCESS, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void ifTooManyAttemtpsActionTimesOut() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(2);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).when(firstAction).execute(any());
        when(testScenario.pollWebdriverAction()).thenReturn(firstAction);
        webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void executeOnScreenExecutes() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = spy(getWebDriverActionExecutionBase());
        TestScenario testScenario = mock(TestScenario.class);
        doNothing().when(webDriverActionExecutionBase).execute(testScenario);
        String screen = ":1";
        webDriverActionExecutionBase.executeOnScreen(testScenario, screen);

        verify(webDriverActionExecutionBase).execute(testScenario);
    }

    @Test
    public void canDumpHar() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        webDriverActionExecutionBase.dumpHarMetrics("filename");
        verify(har).writeTo((File) any());
    }

    @Test
    public void canInstantiateWithDefault() throws IOException, URISyntaxException {
        WebDriverActionExecutor webDriverActionExecutor = getWebDriverActionExecutor();
        WebDriverActionExecutionBase webDriverActionExecutionBase =
                new WebDriverActionExecutionBase(webDriverActionExecutor) {
            @Override
            protected ReplaySettings createExecutionSettings() {
                return null;
            }

            @Override
            protected String getSystemProperty() {
                return null;
            }
        };

        assertNotNull(webDriverActionExecutionBase);
    }

    private WebDriverActionExecutor getWebDriverActionExecutor() throws IOException {
        return getWebDriverActionExecutor(10);
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase() throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(10);
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(int timeout) throws IOException, URISyntaxException {
        WebDriver webDriver = mock(WebDriver.class);
        ReplaySettings replaySettings = mock(ReplaySettings.class);
        when(replaySettings.getHar()).thenReturn(har);
        when(replaySettings.getWebDriver()).thenReturn(webDriver);
        WebDriverActionExecutor webDriverActionExecutor = getWebDriverActionExecutor(timeout);

        RequestFilter requestFilter = mock(RequestFilter.class);
        ResponseFilter responseFilter = mock(ResponseFilter.class);

        return new WebDriverActionExecutionBase(webDriverActionExecutor, requestFilter, responseFilter) {
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

    private WebDriverActionExecutor getWebDriverActionExecutor(int timeout) throws IOException {
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        when(webDriverActionExecutor.getBaseURI()).thenReturn(baseURI);
        when(webDriverActionExecutor.getMeasurementsPrecisionMilli()).thenReturn(precision);
        when(webDriverActionExecutor.getTimeout()).thenReturn(timeout);
        when(webDriverActionExecutor.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);
        return webDriverActionExecutor;
    }
}
