package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.replay.actions.WebDriverAction;
import com.hribol.spiderman.replay.execution.scenario.TestScenario;
import com.hribol.spiderman.replay.config.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.replay.config.suppliers.InvisibleWebDriverSupplier;
import com.hribol.spiderman.replay.config.suppliers.VisibleWebDriverSupplier;
import com.hribol.spiderman.replay.report.AutomationResult;
import com.hribol.spiderman.replay.filters.ProxyFacade;
import com.hribol.spiderman.replay.report.ExecutionReport;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import com.hribol.spiderman.replay.settings.ReplaySettingsBase;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.service.DriverService;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 23.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ProxyFacade.class,
        WebDriverActionExecutionBase.class
})
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
        when(testScenario.pollWebDriverAction()).thenReturn(firstAction);
        ExecutionReport executionReport = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.SUCCESS, executionReport.getAutomationResult());
    }

    @Test
    public void actionWhichThrowsAssertionError() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new AssertionError()).when(firstAction).execute(any(), any());
        when(testScenario.pollWebDriverAction()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.ASSERTION_ERROR, report.getAutomationResult());
    }

    @Test
    public void timesoOutIfActionTakesTooLong() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(1);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        when(testScenario.nextActionExpectsHttpRequest()).thenReturn(true);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doAnswer(invocationOnMock -> {
            Thread.sleep(1500);
            return null;
        }).when(firstAction).execute(any(), any());
        when(testScenario.pollWebDriverAction()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, report.getAutomationResult());
    }

    @Test
    public void properlyHandlesInterruptedException() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(5);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        when(testScenario.nextActionExpectsHttpRequest()).thenReturn(true);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(InterruptedException.class).when(firstAction).execute(any(), any());
        when(testScenario.pollWebDriverAction()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.INTERRUPTED, report.getAutomationResult());
    }

    @Test
    public void retriesIfCannotMakeItFromFirstTime() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).doNothing().when(firstAction).execute(any(), any());
        when(testScenario.pollWebDriverAction()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.SUCCESS, report.getAutomationResult());
    }

    @Test
    public void ifTooManyAttemtpsActionTimesOut() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(2);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).when(firstAction).execute(any(), any());
        when(testScenario.pollWebDriverAction()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, report.getAutomationResult());
    }

    @Test
    public void executingOnVirtualScreenKillsProcess() throws IOException, URISyntaxException {
        int screen = 1;
        Process process = mock(Process.class);
        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);
        when(virtualScreenProcessCreator.getScreen(screen)).thenReturn(":1");
        when(virtualScreenProcessCreator.createXvfbProcess(screen)).thenReturn(process);
        TestScenario testScenario = mock(TestScenario.class);

        WebDriverActionExecutionBase webDriverActionExecutionBase = spy(getWebDriverActionExecutionBase());
        webDriverActionExecutionBase.createVirtualScreenProcessAndExecute(testScenario, screen, virtualScreenProcessCreator);

        verify(webDriverActionExecutionBase).execute(testScenario);
        verify(process).destroy();
    }

    @Test
    public void correctAutomationResultIsSetIfVirtualScreenIsNotCreated() throws IOException, URISyntaxException {
        int screen = 1;
        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);
        when(virtualScreenProcessCreator.getScreen(screen)).thenReturn(":1");
        when(virtualScreenProcessCreator.createXvfbProcess(screen)).thenThrow(new IOException());
        TestScenario testScenario = mock(TestScenario.class);

        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        ExecutionReport executionReport = webDriverActionExecutionBase.createVirtualScreenProcessAndExecute(testScenario, screen, virtualScreenProcessCreator);

        assertEquals(AutomationResult.NO_VIRTUAL_SCREEN, executionReport.getAutomationResult());
    }

    @Test
    public void correctAutomationResultIfNoDriverIsFound() throws IOException, URISyntaxException {
        ReplaySettings<DriverService> replaySettingsMock = getReplaySettingsBase();
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(replaySettingsMock);
        ExecutionReport executionReport = webDriverActionExecutionBase.execute(mock(TestScenario.class));
        assertEquals(AutomationResult.COULD_NOT_CREATE_DRIVER, executionReport.getAutomationResult());
    }

    @Test
    public void throwsExceptionAfterMaxRetriesIsExceeded() throws IOException, URISyntaxException {
        WebDriverAction webDriverAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Action cannot be executed")).when(webDriverAction).execute(any(), any());

        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true);
        when(testScenario.pollWebDriverAction()).thenReturn(webDriverAction);

        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(10,
                2, getDefaultReplaySettings());

        ExecutionReport executionReport = webDriverActionExecutionBase.execute(testScenario);

        assertEquals(AutomationResult.TIMEOUT, executionReport.getAutomationResult());
    }

    @Test
    public void whenHttpRequestsAreInQueueDoesNotAct() throws Exception {
        ReplaySettings replaySettings = getDefaultReplaySettings();
        ExecutorBuilder executor = getWebDriverActionExecutor(1);
        ProxyFacade proxyFacade = mock(ProxyFacade.class);
        when(proxyFacade.httpQueueIsEmpty()).thenReturn(false);
        when(proxyFacade.isLocked()).thenReturn(false);

        whenNew(ProxyFacade.class).withArguments(executor.getBaseURL()).thenReturn(proxyFacade);
        WebDriverActionExecutionBase webDriverActionExecutionBase = new WebDriverActionExecutionBase(executor) {
            @Override
            protected ReplaySettings createReplaySettings() {
                return replaySettings;
            }

            @Override
            public String getSystemProperty() {
                return systemProperty;
            }
        };

        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true);

        ExecutionReport executionReport = webDriverActionExecutionBase.execute(testScenario);

        assertEquals(AutomationResult.TIMEOUT, executionReport.getAutomationResult());
    }

    @Test
    public void executeOnScreenExecutes() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = spy(getWebDriverActionExecutionBase());
        TestScenario testScenario = mock(TestScenario.class);
        String screen = ":1";
        webDriverActionExecutionBase.execute(testScenario, screen);
        verify(webDriverActionExecutionBase).execute(testScenario);
    }

    @Test
    public void canInstantiateWithDefault() throws IOException, URISyntaxException {
        ExecutorBuilder executorBuilder = getWebDriverActionExecutor();
        WebDriverActionExecutionBase webDriverActionExecutionBase =
                new WebDriverActionExecutionBase(executorBuilder) {
            @Override
            protected ReplaySettings createReplaySettings() {
                return null;
            }

            @Override
            public String getSystemProperty() {
                return null;
            }
        };

        assertNotNull(webDriverActionExecutionBase);
    }

    @Test
    public void baseURLIsPassedCorrectly() throws IOException, URISyntaxException {
        String baseURL = "http://tenniskafe.com";

        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        when(executorBuilder.getBaseURL()).thenReturn(baseURL);

        WebDriverActionExecutionBase webDriverActionExecutionBase = new WebDriverActionExecutionBase(executorBuilder) {
            @Override
            protected ReplaySettings createReplaySettings() {
                return null;
            }

            @Override
            public String getSystemProperty() {
                return null;
            }
        };

        assertEquals(baseURL, webDriverActionExecutionBase.getBaseURL());
    }

    private ExecutorBuilder getWebDriverActionExecutor() throws IOException {
        return getWebDriverActionExecutor(10);
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase() throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(10,  getDefaultReplaySettings());
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(int timeout) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(timeout,  getDefaultReplaySettings());
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(ReplaySettings replaySettings) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(10,  replaySettings);
    }

    private ReplaySettings getDefaultReplaySettings() {
        ReplaySettings replaySettings =  mock(ReplaySettings.class);
        WebDriver webDriver = mock(WebDriver.class);
        when(replaySettings.getHar()).thenReturn(har);
        when(replaySettings.getWebDriver()).thenReturn(webDriver);
        return replaySettings;
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(int timeout, ReplaySettings replaySettings) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(timeout, 10, replaySettings);
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(int timeout, int maxRetries, ReplaySettings replaySettings) throws IOException, URISyntaxException {
        ExecutorBuilder executorBuilder = getWebDriverActionExecutor(timeout, maxRetries);

        return new WebDriverActionExecutionBase(executorBuilder) {
            @Override
            protected ReplaySettings createReplaySettings() {
                return replaySettings;
            }

            @Override
            public String getSystemProperty() {
                return systemProperty;
            }
        };
    }

    private ExecutorBuilder getWebDriverActionExecutor(int timeout) throws IOException {
        return getWebDriverActionExecutor(timeout, 10);
    }

    private ExecutorBuilder getWebDriverActionExecutor(int timeout, int maxRetries) throws IOException {
        AutomationResultBuilder automationResultBuilder = throwable -> {
            if (throwable instanceof AssertionError) {
                return AutomationResult.ASSERTION_ERROR;
            } else if (throwable instanceof java.util.concurrent.TimeoutException || throwable instanceof TimeoutException) {
                return AutomationResult.TIMEOUT;
            } else if (throwable instanceof InterruptedException) {
                return AutomationResult.INTERRUPTED;
            }

            return AutomationResult.UNRECOGNIZED_EXCEPTION;
        };

        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        when(executorBuilder.getBaseURL()).thenReturn(baseURI);
        when(executorBuilder.getMeasurementsPrecisionMilli()).thenReturn(precision);
        when(executorBuilder.getTimeout()).thenReturn(timeout);
        when(executorBuilder.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);
        when(executorBuilder.getMaxRetries()).thenReturn(maxRetries);
        when(executorBuilder.getAutomationResultBuilder()).thenReturn(automationResultBuilder);
        return executorBuilder;
    }

    private ReplaySettingsBase<DriverService> getReplaySettingsBase() {
        return new ReplaySettingsBase<DriverService>(
                mock(RequestFilter.class),
                mock(ResponseFilter.class),
                mock(InvisibleWebDriverSupplier.class),
                mock(VisibleWebDriverSupplier.class)) {
            @Override
            public DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
                return null;
            }

            @Override
            public void prepareReplay(String pathToDriver, String screenToUse, int timeout) throws IOException {
                throw new IOException("No webdriver");
            }

            @Override
            public Har getHar() {
                return mock(Har.class);
            }

        };
    }
}
