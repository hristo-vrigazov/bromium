package com.hribol.bromium.common.replay;

import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.execution.AutomationResultBuilder;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class ExecutorDependenciesTest {

    @Test
    public void correctlyBuildsConfiguration() throws IOException, URISyntaxException {
        String pathToDriverExecutable = "file:///somepath";
        String baseURI = "http://tennikafe.com";
        String javascriptJsInjectionCode = "function() {}";
        String screenToUse = ":1";
        int screenNumber = 1;
        int precision = 600;
        int timeout = 20;
        int maxRetries = 11;
        AutomationResultBuilder automationResultBuilder = mock(AutomationResultBuilder.class);
        ReplayingState replayingState = mock(ReplayingState.class);
        DriverOperations driverOperations = mock(DriverOperations.class);

        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);

        ExecutorDependencies executorDependencies = new ExecutorDependencies()
                .pathToDriverExecutable(pathToDriverExecutable)
                .baseURL(baseURI)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout)
                .javascriptInjectionCode(javascriptJsInjectionCode)
                .maxRetries(maxRetries)
                .automationResultBuilder(automationResultBuilder)
                .eventSynchronizer(eventSynchronizer)
                .screenToUse(screenToUse)
                .screenNumber(screenNumber)
                .replayingState(replayingState)
                .driverOperations(driverOperations);

        assertEquals(pathToDriverExecutable, executorDependencies.getPathToDriverExecutable());
        assertEquals(baseURI, executorDependencies.getBaseURL());
        assertEquals(precision, executorDependencies.getMeasurementsPrecisionMilli());
        assertEquals(precision, executorDependencies.getMeasurementsPrecisionMilli());
        assertEquals(timeout, executorDependencies.getTimeout());
        assertEquals(timeout, executorDependencies.getTimeout());
        assertEquals(maxRetries, executorDependencies.getMaxRetries());
        assertEquals(maxRetries, executorDependencies.getMaxRetries());
        assertEquals(automationResultBuilder, executorDependencies.getAutomationResultBuilder());
        assertEquals(javascriptJsInjectionCode, executorDependencies.getJavascriptInjectionCode());
        assertEquals(eventSynchronizer, executorDependencies.getEventSynchronizer());
        assertNotNull(executorDependencies.noHttpRequestsInQueue());
        assertEquals(screenToUse, executorDependencies.getScreenToUse());
        assertEquals(screenNumber, executorDependencies.getScreenNumber());
        assertEquals(replayingState, executorDependencies.getReplayingState());
        assertEquals(driverOperations, executorDependencies.getDriverOperations());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwsExceptionIfBaseURIIsNotSet() throws IOException {
        String pathToDriverExecutable = "file:///somepath";
        int precision = 500;
        int timeout = 10;

        ExecutorDependencies executorDependencies = new ExecutorDependencies()
                .pathToDriverExecutable(pathToDriverExecutable)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout);

        expectedException.expect(IllegalStateException.class);
        executorDependencies.getBaseURL();
    }

    @Test
    public void throwsExceptionIfDriverIsNotSet() throws IOException {
        ExecutorDependencies executorDependencies = new ExecutorDependencies();
        expectedException.expect(IOException.class);
        executorDependencies.getPathToDriverExecutable();
    }

    @Test
    public void canGetDefaults() {
        ExecutorDependencies executorDependencies = new ExecutorDependencies();
        assertEquals(10, executorDependencies.getTimeout());
        assertEquals(500, executorDependencies.getMeasurementsPrecisionMilli());
        assertEquals(50, executorDependencies.getMaxRetries());
        assertNotNull(executorDependencies.getAutomationResultBuilder());
        assertNotNull(executorDependencies.getEventSynchronizer());
        assertNotNull(executorDependencies.webDriverActionExecutionException("Something happened", mock(Throwable.class)));
    }
}
