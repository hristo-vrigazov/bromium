package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.core.suppliers.InvisibleWebDriverSupplier;
import com.hribol.spiderman.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.spiderman.replay.AutomationResult;
import com.hribol.spiderman.replay.filters.ProxyFacade;
import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import com.hribol.spiderman.replay.settings.ReplaySettings;
import com.hribol.spiderman.replay.settings.ReplaySettingsBase;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
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
    public void executingOnVirtualScreenKillsProcess() throws IOException, URISyntaxException {
        int screen = 1;
        Process process = mock(Process.class);
        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);
        when(virtualScreenProcessCreator.getScreen(screen)).thenReturn(":1");
        when(virtualScreenProcessCreator.createXvfbProcess(screen)).thenReturn(process);
        TestScenario testScenario = mock(TestScenario.class);

        WebDriverActionExecutionBase webDriverActionExecutionBase = spy(getWebDriverActionExecutionBase());
        doNothing().when(webDriverActionExecutionBase).execute(testScenario);
        webDriverActionExecutionBase.executeOnScreen(testScenario, screen, virtualScreenProcessCreator);

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
        webDriverActionExecutionBase.executeOnScreen(testScenario, screen, virtualScreenProcessCreator);

        assertEquals(AutomationResult.NO_VIRTUAL_SCREEN, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void correctAutomationResultIfNoDriverIsFound() throws IOException, URISyntaxException {
        ReplaySettings<DriverService> replaySettingsMock = getReplaySettingsBase();
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(replaySettingsMock);
        webDriverActionExecutionBase.execute(mock(TestScenario.class));
        assertEquals(AutomationResult.COULD_NOT_CREATE_DRIVER, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void throwsExceptionAfterMaxRetriesIsExceeded() throws IOException, URISyntaxException {
        WebDriverAction webDriverAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Action cannot be executed")).when(webDriverAction).execute(any());

        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true);
        when(testScenario.pollWebdriverAction()).thenReturn(webDriverAction);

        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(10,
                2, getDefaultReplaySettings());

        webDriverActionExecutionBase.execute(testScenario);

        assertEquals(AutomationResult.TIMEOUT, webDriverActionExecutionBase.getAutomationResult());
    }

    @Test
    public void whenHttpRequestsAreInQueueDoesNotAct() throws IOException, URISyntaxException {
        ReplaySettings replaySettings = getDefaultReplaySettings();
        WebDriverActionExecutor executor = getWebDriverActionExecutor(1);
        ReplayFiltersFacade proxyFacade = mock(ReplayFiltersFacade.class);
        when(proxyFacade.httpQueueIsEmpty()).thenReturn(true, false);
        when(proxyFacade.isLocked()).thenReturn(false);
        WebDriverActionExecutionBase webDriverActionExecutionBase = new WebDriverActionExecutionBase(executor, proxyFacade) {
            @Override
            protected ReplaySettings createReplaySettings() {
                return replaySettings;
            }

            @Override
            protected String getSystemProperty() {
                return systemProperty;
            }
        };

        WebDriverAction webDriverAction = mock(WebDriverAction.class);
        when(webDriverAction.getName()).thenReturn("actionName");
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.hasMoreSteps()).thenReturn(true);
        when(testScenario.pollWebdriverAction()).thenReturn(webDriverAction);

        webDriverActionExecutionBase.execute(testScenario);
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
            protected ReplaySettings createReplaySettings() {
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
        WebDriverActionExecutor webDriverActionExecutor = getWebDriverActionExecutor(timeout, maxRetries);

        return new WebDriverActionExecutionBase(webDriverActionExecutor) {
            @Override
            protected ReplaySettings createReplaySettings() {
                return replaySettings;
            }

            @Override
            protected String getSystemProperty() {
                return systemProperty;
            }
        };
    }

    private WebDriverActionExecutor getWebDriverActionExecutor(int timeout) throws IOException {
        return getWebDriverActionExecutor(timeout, 10);
    }

    private WebDriverActionExecutor getWebDriverActionExecutor(int timeout, int maxRetries) throws IOException {
        WebDriverActionExecutor webDriverActionExecutor = mock(WebDriverActionExecutor.class);
        when(webDriverActionExecutor.getBaseURI()).thenReturn(baseURI);
        when(webDriverActionExecutor.getMeasurementsPrecisionMilli()).thenReturn(precision);
        when(webDriverActionExecutor.getTimeout()).thenReturn(timeout);
        when(webDriverActionExecutor.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);
        when(webDriverActionExecutor.getMaxRetries()).thenReturn(maxRetries);
        return webDriverActionExecutor;
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
