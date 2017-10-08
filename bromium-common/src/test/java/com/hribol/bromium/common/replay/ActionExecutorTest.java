package com.hribol.bromium.common.replay;

import com.hribol.bromium.common.synchronization.NoHttpRequestsInQueue;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.AutomationResultBuilder;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.replay.execution.scenario.TestScenarioActions;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import net.lightbody.bmp.core.har.Har;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 23.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ActionExecutor.class)
public class ActionExecutorTest {

    String baseURI = "http://tenniskafe.com";
    int precision = 500;
    String pathToDriverExecutable = "file:///somepath";

    Har har = mock(Har.class);


    @Test
    public void oneActionWithNoProblems() throws IOException, URISyntaxException, InterruptedException {
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase();
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
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new AssertionError()).when(firstAction).execute(any(), any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.ASSERTION_ERROR, report.getAutomationResult());
    }

    @Test
    public void timesoOutIfActionTakesTooLong() throws IOException, URISyntaxException, InterruptedException {
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase(1);
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
        }).when(firstAction).execute(any(), any(), any());

        when(firstAction.expectsHttpRequest()).thenReturn(true);
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, report.getAutomationResult());
    }

    @Test
    public void properlyHandlesInterruptedException() throws IOException, URISyntaxException {
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase(5);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        when(firstAction.expectsHttpRequest()).thenReturn(true);
        doThrow(InterruptedException.class).when(firstAction).execute(any(), any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.INTERRUPTED, report.getAutomationResult());
    }

    @Test
    public void properlyHandlesInterruptedExceptionBetweenRetries() throws IOException, URISyntaxException, InterruptedException {
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase(10);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Something happened!")).when(firstAction).execute(any(), any(), any());
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
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase();
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).doNothing().when(firstAction).execute(any(), any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.SUCCESS, report.getAutomationResult());
    }

    @Test
    public void ifInterruptedWhileExecutionThreadIsWaitingThenAutomationResultIsSetCorrectly() throws Exception {
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        doThrow(new InterruptedException("Interrupted while waiting"))
                .when(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));

        ReplayingState replayingState = mock(ReplayingState.class);
        DriverOperations driverOperations = mock(DriverOperations.class);
        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        when(executorBuilder.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);
        when(executorBuilder.getEventSynchronizer()).thenReturn(eventSynchronizer);
        when(executorBuilder.getReplayingState()).thenReturn(replayingState);
        when(executorBuilder.getDriverOperations()).thenReturn(driverOperations);
        doAnswer(invocationOnMock -> {
            Object[] arguments = invocationOnMock.getArguments();
            String message = (String) arguments[0];
            Throwable throwable = (Throwable) arguments[1];
            return new WebDriverActionExecutionException(message, throwable, getAutomationResultBuilder());
        }).when(executorBuilder).webDriverActionExecutionException(anyString(), any(Throwable.class));

        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase(executorBuilder);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).when(firstAction).execute(any(), any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);


        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.INTERRUPTED, report.getAutomationResult());
    }

    @Test
    public void canForceCleanUp() throws IOException, URISyntaxException {
        ExecutorBuilder executorBuilder = getWebDriverActionExecutor();
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase(executorBuilder);
        webDriverActionExecutionBase.forceCleanUp();
        verify(executorBuilder.getDriverOperations()).cleanUp();
    }

    @Test
    public void ifTooManyAttemtpsActionTimesOut() throws IOException, URISyntaxException {
        int maxRetries = 3;
        ActionExecutor webDriverActionExecutionBase = getWebDriverActionExecutionBase(10, maxRetries);
        Iterator<WebDriverAction> webDriverActionIterator = mock(Iterator.class);
        TestScenarioActions testScenarioSteps = mock(TestScenarioActions.class);
        when(testScenarioSteps.iterator()).thenReturn(webDriverActionIterator);
        TestScenario testScenario = mock(TestScenario.class);
        when(testScenario.steps()).thenReturn(testScenarioSteps);
        when(webDriverActionIterator.hasNext()).thenReturn(true, false);
        WebDriverAction firstAction = mock(WebDriverAction.class);
        doThrow(new WebDriverException("Exception occured!")).when(firstAction).execute(any(), any(), any());
        when(webDriverActionIterator.next()).thenReturn(firstAction);
        ExecutionReport report = webDriverActionExecutionBase.execute(testScenario);
        assertEquals(AutomationResult.TIMEOUT, report.getAutomationResult());
        verify(firstAction, times(maxRetries)).execute(any(), any(), any());
    }

    private ExecutorBuilder getWebDriverActionExecutor() throws IOException, URISyntaxException {
        return getWebDriverActionExecutor(10);
    }

    private ActionExecutor getWebDriverActionExecutionBase(ExecutorBuilder executorBuilder) throws IOException, URISyntaxException {
        return new ActionExecutor(executorBuilder);
    }

    private ActionExecutor getWebDriverActionExecutionBase(int timeout) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(getWebDriverActionExecutor(timeout, 10));
    }

    private ActionExecutor getWebDriverActionExecutionBase() throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(10);
    }

    private ActionExecutor getWebDriverActionExecutionBase(int timeout, int maxRetries) throws IOException, URISyntaxException {
        return getWebDriverActionExecutionBase(getWebDriverActionExecutor(timeout, maxRetries));
    }

    private ExecutorBuilder getWebDriverActionExecutor(int timeout) throws IOException, URISyntaxException {
        return getWebDriverActionExecutor(timeout, 10);
    }

    private ExecutorBuilder getWebDriverActionExecutor(int timeout, int maxRetries) throws IOException, URISyntaxException {
        AutomationResultBuilder automationResultBuilder = getAutomationResultBuilder();
        ReplayingState replayingState = mock(ReplayingState.class);
        NoHttpRequestsInQueue noHttpRequestsInQueue = mock(NoHttpRequestsInQueue.class);
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        ExecutorBuilder executorBuilder = mock(ExecutorBuilder.class);
        DriverOperations driverOperations = mock(DriverOperations.class);
        when(executorBuilder.getBaseURL()).thenReturn(baseURI);
        when(executorBuilder.getMeasurementsPrecisionMilli()).thenReturn(precision);
        when(executorBuilder.getTimeout()).thenReturn(timeout);
        when(executorBuilder.getPathToDriverExecutable()).thenReturn(pathToDriverExecutable);
        when(executorBuilder.getMaxRetries()).thenReturn(maxRetries);
        when(executorBuilder.getAutomationResultBuilder()).thenReturn(automationResultBuilder);
        when(executorBuilder.noHttpRequestsInQueue()).thenReturn(noHttpRequestsInQueue);
        when(executorBuilder.getReplayingState()).thenReturn(replayingState);
        when(executorBuilder.getEventSynchronizer()).thenReturn(eventSynchronizer);
        when(executorBuilder.getDriverOperations()).thenReturn(driverOperations);
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
}
