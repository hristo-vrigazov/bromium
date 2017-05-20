package com.hribol.spiderman.replay.execution;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class ExecutorBuilder {
    private static final String DRIVER_EXECUTABLE = "DRIVER_EXECUTABLE";
    private Integer maxRetries;
    private String pathToDriverExecutable;
    private Integer timeout;
    private Integer measurementsPrecisionMilli;
    private String baseURL;
    private AutomationResultBuilder automationResultBuilder;

    public ExecutorBuilder pathToDriverExecutable(String pathToDriverExecutable) {
        this.pathToDriverExecutable = pathToDriverExecutable;
        return this;
    }

    public ExecutorBuilder timeoutInSeconds(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public ExecutorBuilder measurementsPrecisionInMilliseconds(int measurementsPrecisionMilli) {
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        return this;
    }

    public ExecutorBuilder maxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    public ExecutorBuilder baseURL(String baseURL) {
        this.baseURL = baseURL;
        return this;
    }

    public String getBaseURL() {
        if (baseURL == null) {
            throw new IllegalStateException("Base URI is not set. Please use the baseURL method");
        }

        return baseURL;
    }

    public String getPathToDriverExecutable() throws IOException {
        pathToDriverExecutable = Optional.ofNullable(pathToDriverExecutable).orElse(System.getenv(DRIVER_EXECUTABLE));
        if (pathToDriverExecutable == null) {
            throw new IOException("Path to driver executable not set. Please either set it using" +
                    " pathToDriverExecutable method or by setting the environment variable" +
                    " DRIVER_EXECUTABLE");
        }

        return pathToDriverExecutable;
    }

    public int getTimeout() {
        return Optional.ofNullable(timeout).orElse(20);
    }

    public int getMeasurementsPrecisionMilli() {
        return Optional.ofNullable(measurementsPrecisionMilli).orElse(500);
    }

    public int getMaxRetries() {
        return Optional.ofNullable(maxRetries).orElse(100);
    }

    public AutomationResultBuilder getAutomationResultBuilder() {
        return Optional.ofNullable(automationResultBuilder).orElse(new InstanceBasedAutomationResultBuilder());
    }
}