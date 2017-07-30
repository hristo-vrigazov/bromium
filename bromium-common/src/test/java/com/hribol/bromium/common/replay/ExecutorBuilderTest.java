package com.hribol.bromium.common.replay;

import com.hribol.bromium.replay.execution.AutomationResultBuilder;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.settings.ReplayManager;
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
public class ExecutorBuilderTest {

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
        ReplayManager replayManager = mock(ReplayManager.class);

        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);

        ExecutorBuilder executorBuilder = new ExecutorBuilder()
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
                .replayManager(replayManager);

        assertEquals(pathToDriverExecutable, executorBuilder.getPathToDriverExecutable());
        assertEquals(baseURI, executorBuilder.getBaseURL());
        assertEquals(precision, executorBuilder.getMeasurementsPrecisionMilli());
        assertEquals(precision, executorBuilder.getMeasurementsPrecisionMilli());
        assertEquals(timeout, executorBuilder.getTimeout());
        assertEquals(timeout, executorBuilder.getTimeout());
        assertEquals(maxRetries, executorBuilder.getMaxRetries());
        assertEquals(maxRetries, executorBuilder.getMaxRetries());
        assertEquals(automationResultBuilder, executorBuilder.getAutomationResultBuilder());
        assertEquals(javascriptJsInjectionCode, executorBuilder.getJavascriptInjectionCode());
        assertEquals(eventSynchronizer, executorBuilder.getEventSynchronizer());
        assertNotNull(executorBuilder.noHttpRequestsInQueue());
        assertEquals(screenToUse, executorBuilder.getScreenToUse());
        assertEquals(screenNumber, executorBuilder.getScreenNumber());
        assertEquals(replayManager, executorBuilder.getReplayManager());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwsExceptionIfBaseURIIsNotSet() throws IOException {
        String pathToDriverExecutable = "file:///somepath";
        int precision = 500;
        int timeout = 10;

        ExecutorBuilder executorBuilder = new ExecutorBuilder()
                .pathToDriverExecutable(pathToDriverExecutable)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout);

        expectedException.expect(IllegalStateException.class);
        executorBuilder.getBaseURL();
    }

    @Test
    public void throwsExceptionIfDriverIsNotSet() throws IOException {
        ExecutorBuilder executorBuilder = new ExecutorBuilder();
        expectedException.expect(IOException.class);
        executorBuilder.getPathToDriverExecutable();
    }

    @Test
    public void canGetDefaults() {
        ExecutorBuilder executorBuilder = new ExecutorBuilder();
        assertEquals(10, executorBuilder.getTimeout());
        assertEquals(500, executorBuilder.getMeasurementsPrecisionMilli());
        assertEquals(50, executorBuilder.getMaxRetries());
        assertNotNull(executorBuilder.getAutomationResultBuilder());
        assertNotNull(executorBuilder.getEventSynchronizer());
        assertNotNull(executorBuilder.webDriverActionExecutionException("Something happened", mock(Throwable.class)));
    }
}
