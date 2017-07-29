package com.hribol.bromium.common.replay;

import com.hribol.bromium.common.synchronization.NoHttpRequestsInQueue;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.AutomationResultBuilder;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.replay.execution.scenario.TestScenarioActions;
import com.hribol.bromium.replay.execution.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ProxyFacade;
import com.hribol.bromium.replay.filters.ProxyFacadeSupplier;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;
import com.hribol.bromium.replay.filters.ReplayResponseFilter;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import com.hribol.bromium.replay.settings.ReplayManager;
import net.lightbody.bmp.core.har.Har;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
        WebDriverActionExecutionBase.class,
        Object.class,
        Lock.class,
        ReentrantLock.class
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
        Iterator<WebDriverAction> webDriverActionIterator = Mockito.mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport executionReport = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.SUCCESS, executionReport.getAutomationResult());
    }

    @Test
    public void actionWhichThrowsAssertionError() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new AssertionError()).when(firstAction).execute(any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.ASSERTION_ERROR, report.getAutomationResult());
    }

    @Test
    public void timesoOutIfActionTakesTooLong() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(1);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);

        WebDriverAction firstAction = mock(WebDriverAction.class);
        doAnswer(invocationOnMock -> {
            Thread.sleep(1500);
            return null;
        }).when(firstAction).execute(any(), any());

        when(firstAction.expectsHttpRequest()).thenReturn(true);
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, report.getAutomationResult());
    }

    @Test
    public void properlyHandlesInterruptedException() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(5);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        when(firstAction.expectsHttpRequest()).thenReturn(true);
        doThrow(InterruptedException.class).when(firstAction).execute(any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.INTERRUPTED, report.getAutomationResult());
    }

    @Test
    public void properlyHandlesInterruptedExceptionBetweenRetries() throws IOException, URISyntaxException, InterruptedException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(5);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Something happened!")).when(firstAction).execute(any(), any());
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        when(firstAction.expectsHttpRequest()).thenReturn(true);
        PowerMockito.mockStatic(Thread.class);
        PowerMockito.doThrow(new InterruptedException()).when(Thread.class);
        Thread.sleep(anyLong());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.INTERRUPTED, report.getAutomationResult());
    }

    @Test
    public void retriesIfCannotMakeItFromFirstTime() throws IOException, URISyntaxException {
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).doNothing().when(firstAction).execute(any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.SUCCESS, report.getAutomationResult());
    }

    @Test
    public void ifTooManyAttemtpsActionTimesOut() throws IOException, URISyntaxException {
        int maxRetries = 3;
        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(10, maxRetries, mock(ReplayManager.class));
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).when(firstAction).execute(any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, report.getAutomationResult());
        verify(firstAction, times(maxRetries)).execute(any(), any());
    }

    @Test
    public void ifInterruptedWhileExecutionThreadIsWaitingThenAutomationResultIsSetCorrectly() throws Exception {
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        doThrow(new InterruptedException("Interrupted while waiting"))
                .when(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));

        ProxyFacade proxyFacade = mock(ProxyFacade.class);
        when(proxyFacade.getRequestFilter()).thenReturn(mock(ReplayRequestFilter.class));
        when(proxyFacade.getResponseFilter()).thenReturn(mock(ReplayResponseFilter.class));

        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        when(executorBuilder.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);
        when(executorBuilder.getProxyFacade()).thenReturn(proxyFacade);
        when(executorBuilder.getEventSynchronizer()).thenReturn(eventSynchronizer);
        doAnswer(invocationOnMock -> {
            Object[] arguments = invocationOnMock.getArguments();
            String message = (String) arguments[0];
            Throwable throwable = (Throwable) arguments[1];
            return new WebDriverActionExecutionException(message, throwable, getAutomationResultBuilder());
        }).when(executorBuilder).webDriverActionExecutionException(anyString(), any(Throwable.class));

        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(executorBuilder);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).when(firstAction).execute(any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);

        Object object = PowerMockito.mock(Object.class);
        doThrow(new InterruptedException("Interrupted while waiting")).when(object).wait(anyLong());
        whenNew(Object.class).withNoArguments().thenReturn(object);

        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.INTERRUPTED, report.getAutomationResult());
    }

    @Test
    public void throwsExceptionAfterMaxRetriesIsExceeded() throws IOException, URISyntaxException {
        WebDriverAction webDriverAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Action cannot be executed")).when(webDriverAction).execute(any(), any());
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(webDriverActionIterator.hasNext()).thenReturn(true);
        when(webDriverActionIterator.next()).thenReturn(webDriverAction);
        when(testScenario.steps()).thenReturn(testScenarioSteps);

        WebDriverActionExecutionBase webDriverActionExecutionBase = getWebDriverActionExecutionBase(10,
                2, getDefaultReplaySettings());

        ExecutionReport executionReport = webDriverActionExecutionBase.execute(testScenario);

        assertEquals(AutomationResult.TIMEOUT, executionReport.getAutomationResult());
    }


    @Test
    public void whenSetExecutionThreadLockIsTrueExecutionThreadDoesNotWait() throws IOException, URISyntaxException {
        String baseURL = "http://tenniskafe.com";
        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        ReplayResponseFilter replayResponseFilter = mock(ReplayResponseFilter.class);
        when(replayResponseFilter.httpRequestQueueIsEmpty()).thenReturn(true);
        ProxyFacade proxyFacade = mock(ProxyFacade.class);
        when(proxyFacade.getRequestFilter()).thenReturn(replayRequestFilter);
        when(proxyFacade.getResponseFilter()).thenReturn(replayResponseFilter);
        ProxyFacadeSupplier proxyFacadeSupplier = mock(ProxyFacadeSupplier.class);
        when(proxyFacadeSupplier.get(eq(baseURL), anyString(), any(EventSynchronizer.class))).thenReturn(proxyFacade);
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);

        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        when(executorBuilder.getBaseURL()).thenReturn(baseURL);
        when(executorBuilder.getPathToDriverExecutable()).thenReturn("driver");
        when(executorBuilder.getAutomationResultBuilder()).thenReturn(getAutomationResultBuilder());
        when(executorBuilder.getProxyFacade()).thenReturn(proxyFacade);
        when(executorBuilder.getEventSynchronizer()).thenReturn(eventSynchronizer);
        when(executorBuilder.webDriverActionExecutionException(anyString(), any())).thenReturn(mock(WebDriverActionExecutionException.class));

        ReplayManager replaySettings = mock(ReplayManager.class);
        when(executorBuilder.getReplayManager()).thenReturn(replaySettings);

        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        WebDriverAction webDriverAction = mock(WebDriverAction.class);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        when(webDriverActionIterator.next()).thenReturn(webDriverAction);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        WebDriverActionExecutionBase webDriverActionExecutionBase = new WebDriverActionExecutionBase(executorBuilder);
        webDriverActionExecutionBase.execute(testScenario);
    }

    private ExecutorBuilder getWebDriverActionExecutor() throws IOException, URISyntaxException {
        return getWebDriverActionExecutor(10);
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(ExecutorBuilder executorBuilder) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(executorBuilder, getDefaultReplaySettings());
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase() throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(10,  getDefaultReplaySettings());
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(int timeout) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(timeout,  getDefaultReplaySettings());
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(ReplayManager replaySettings) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(10,  replaySettings);
    }

    private ReplayManager getDefaultReplaySettings() {
        ReplayManager replaySettings =  mock(ReplayManager.class);
        WebDriver webDriver = mock(WebDriver.class);
        when(replaySettings.getHar()).thenReturn(har);
        when(replaySettings.getWebDriver()).thenReturn(webDriver);
        return replaySettings;
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(int timeout, ReplayManager replaySettings) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(timeout, 10, replaySettings);
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(ExecutorBuilder executorBuilder, ReplayManager replaySettings) throws IOException, URISyntaxException {
        when(executorBuilder.getReplayManager()).thenReturn(replaySettings);
        return new WebDriverActionExecutionBase(executorBuilder);
    }

    private WebDriverActionExecutionBase getWebDriverActionExecutionBase(int timeout, int maxRetries, ReplayManager replaySettings) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(getWebDriverActionExecutor(timeout, maxRetries), replaySettings);
    }

    private ExecutorBuilder getWebDriverActionExecutor(int timeout) throws IOException, URISyntaxException {
        return getWebDriverActionExecutor(timeout, 10);
    }

    private ExecutorBuilder getWebDriverActionExecutor(int timeout, int maxRetries) throws IOException, URISyntaxException {
        AutomationResultBuilder automationResultBuilder = getAutomationResultBuilder();

        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        ReplayResponseFilter replayResponseFilter = mock(ReplayResponseFilter.class);
        ProxyFacade proxyFacade = mock(ProxyFacade.class);
        NoHttpRequestsInQueue noHttpRequestsInQueue = mock(NoHttpRequestsInQueue.class);
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        when(proxyFacade.getRequestFilter()).thenReturn(replayRequestFilter);
        when(proxyFacade.getResponseFilter()).thenReturn(replayResponseFilter);
        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        when(executorBuilder.getBaseURL()).thenReturn(baseURI);
        when(executorBuilder.getMeasurementsPrecisionMilli()).thenReturn(precision);
        when(executorBuilder.getTimeout()).thenReturn(timeout);
        when(executorBuilder.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);
        when(executorBuilder.getMaxRetries()).thenReturn(maxRetries);
        when(executorBuilder.getAutomationResultBuilder()).thenReturn(automationResultBuilder);
        when(executorBuilder.getProxyFacade()).thenReturn(proxyFacade);
        when(executorBuilder.noHttpRequestsInQueue()).thenReturn(noHttpRequestsInQueue);
        when(executorBuilder.getEventSynchronizer()).thenReturn(eventSynchronizer);
        doAnswer(invocationOnMock -> {
            Object[] arguments = invocationOnMock.getArguments();
            String message = (String) arguments[0];
            Throwable throwable = (Throwable) arguments[1];
            return new WebDriverActionExecutionException(message, throwable, automationResultBuilder);
        }).when(executorBuilder).webDriverActionExecutionException(anyString(), any(Throwable.class));
        return executorBuilder;
    }

    private AutomationResultBuilder getAutomationResultBuilder() {
        return throwable -> {
            if (throwable instanceof AssertionError) {
                return AutomationResult.ASSERTION_ERROR;
            } else if (throwable instanceof java.util.concurrent.TimeoutException || throwable instanceof TimeoutException) {
                return AutomationResult.TIMEOUT;
            } else if (throwable instanceof InterruptedException) {
                return AutomationResult.INTERRUPTED;
            } else if (throwable instanceof WebDriverActionExecutionException) {
                return AutomationResult.INTERRUPTED;
            }

            return AutomationResult.UNRECOGNIZED_EXCEPTION;
        };
    }

//    private ReplayManagerBase<DriverService> getReplaySettingsBase() {
//        return new ReplayManagerBase<DriverService>(
//                mock(RequestFilter.class),
//                mock(ResponseFilter.class),
//                mock(InvisibleWebDriverSupplier.class),
//                mock(VisibleWebDriverSupplier.class)) {
//            @Override
//            public DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
//                return null;
//            }
//
//            @Override
//            public void prepareReplay(String pathToDriver, String screenToUse, int timeout) throws IOException {
//                throw new IOException("No webdriver");
//            }
//
//            @Override
//            public Har getHar() {
//                return mock(Har.class);
//            }
//
//        };
//    }
}
