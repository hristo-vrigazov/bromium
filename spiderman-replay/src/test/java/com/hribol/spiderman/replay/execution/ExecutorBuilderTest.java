package com.hribol.spiderman.replay.execution;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class ExecutorBuilderTest {

    @Test
    public void correctlyBuildsConfiguration() throws IOException {
        String pathToDriverExecutable = "file:///somepath";
        String baseURI = "http://tennikafe.com";
        int precision = 500;
        int timeout = 10;
        int maxRetries = 10;

        ExecutorBuilder executorBuilder = new ExecutorBuilder()
                .pathToDriverExecutable(pathToDriverExecutable)
                .baseURL(baseURI)
                .measurementsPrecisionInMilliseconds(precision)
                .timeoutInSeconds(timeout)
                .maxRetries(10);

        assertEquals(pathToDriverExecutable, executorBuilder.getPathToDriverExecutable());
        assertEquals(baseURI, executorBuilder.getBaseURL());
        assertEquals(precision, executorBuilder.getMeasurementsPrecisionMilli());
        assertEquals(timeout, executorBuilder.getTimeout());
        assertEquals(maxRetries, executorBuilder.getMaxRetries());
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
