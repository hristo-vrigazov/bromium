package com.hribol.spiderman.replay.execution;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class WebDriverActionExecutor {
    private static final String DRIVER_EXECUTABLE = "DRIVER_EXECUTABLE";

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
        return Optional.ofNullable(measurementsPrecisionMilli).orElse(50);
    }

    private String pathToDriverExecutable;
    private Integer timeout;
    private Integer measurementsPrecisionMilli;
    private String baseURI;

    public WebDriverActionExecutor pathToDriverExecutable(String pathToDriverExecutable) {
        this.pathToDriverExecutable = pathToDriverExecutable;
        return this;
    }

    public WebDriverActionExecutor timeoutInSeconds(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public WebDriverActionExecutor measurementsPrecisionInMilliseconds(int measurementsPrecisionMilli) {
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        return this;
    }

    public WebDriverActionExecutor baseURI(String baseURI) {
        this.baseURI = baseURI;
        return this;
    }

    public String getBaseURI() throws IOException {
        if (baseURI == null) {
            throw new IOException("Base URI is not set. Please use the baseURI method");
        }

        return baseURI;
    }
}