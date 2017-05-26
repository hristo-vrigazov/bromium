package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.replay.filters.ProxyFacadeSupplier;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class ExecutorBuilderTest {

    @Test
    public void correctlyBuildsConfiguration() throws IOException {
        String pathToDriverExecutable = "file:///somepath";
        String baseURI = "http://tennikafe.com";
        int precision = 600;
        int timeout = 20;
        int maxRetries = 11;
        AutomationResultBuilder automationResultBuilder = mock(AutomationResultBuilder.class);
        ProxyFacadeSupplier proxyFacadeSupplier = mock(ProxyFacadeSupplier.class);

        ExecutorBuilder executorBuilder = new ExecutorBuilder()
                .pathToDriverExecutable(pathToDriverExecutable)
                .baseURL(baseURI)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout)
                .maxRetries(maxRetries)
                .automationResultBuilder(automationResultBuilder)
                .proxyFacadeSupplier(proxyFacadeSupplier);

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
}
