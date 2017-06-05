package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.execution.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.filters.ProxyFacade;
import com.hribol.bromium.replay.filters.ProxyFacadeSupplier;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class ExecutorBuilderTest {

    @Test
    public void correctlyBuildsConfiguration() throws IOException, URISyntaxException {
        String pathToDriverExecutable = "file:///somepath";
        String baseURI = "http://tennikafe.com";
        String javascriptJsInjectionCode = "function() {}";
        int precision = 600;
        int timeout = 20;
        int maxRetries = 11;
        AutomationResultBuilder automationResultBuilder = mock(AutomationResultBuilder.class);
        ProxyFacade proxyFacade = mock(ProxyFacade.class);
        ProxyFacadeSupplier proxyFacadeSupplier = mock(ProxyFacadeSupplier.class);
        when(proxyFacadeSupplier.get(baseURI, javascriptJsInjectionCode)).thenReturn(proxyFacade);

        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);

        ExecutorBuilder executorBuilder = new ExecutorBuilder()
                .pathToDriverExecutable(pathToDriverExecutable)
                .baseURL(baseURI)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout)
                .javascriptInjectionCode(javascriptJsInjectionCode)
                .maxRetries(maxRetries)
                .automationResultBuilder(automationResultBuilder)
                .proxyFacadeSupplier(proxyFacadeSupplier)
                .eventSynchronizer(eventSynchronizer);

        assertEquals(pathToDriverExecutable, executorBuilder.getPathToDriverExecutable());
        assertEquals(baseURI, executorBuilder.getBaseURL());
        assertEquals(precision, executorBuilder.getMeasurementsPrecisionMilli());
        assertEquals(precision, executorBuilder.getMeasurementsPrecisionMilli());
        assertEquals(timeout, executorBuilder.getTimeout());
        assertEquals(timeout, executorBuilder.getTimeout());
        assertEquals(maxRetries, executorBuilder.getMaxRetries());
        assertEquals(maxRetries, executorBuilder.getMaxRetries());
        assertEquals(automationResultBuilder, executorBuilder.getAutomationResultBuilder());
        assertEquals(proxyFacadeSupplier, executorBuilder.getProxyFacadeSupplier());
        assertEquals(javascriptJsInjectionCode, executorBuilder.getJavascriptInjectionCode());
        assertEquals(proxyFacade, executorBuilder.getProxyFacade());
        assertEquals(proxyFacade, executorBuilder.getProxyFacade());
        assertEquals(eventSynchronizer, executorBuilder.getEventSynchronizer());
        assertNotNull(executorBuilder.noHttpRequestsInQueue());
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
        assertNotNull(executorBuilder.getProxyFacadeSupplier());
        assertNotNull(executorBuilder.getEventSynchronizer());
        assertNotNull(executorBuilder.webDriverActionExecutionException("Something happened", mock(Throwable.class)));
    }
}
