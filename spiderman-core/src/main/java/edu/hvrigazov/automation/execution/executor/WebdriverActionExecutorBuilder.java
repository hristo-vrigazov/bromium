package edu.hvrigazov.automation.execution.executor;

import edu.hvrigazov.automation.execution.webdriver.WebDriverActionSupplier;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class WebdriverActionExecutorBuilder {
    private static final String DRIVER_EXECUTABLE = "DRIVER_EXECUTABLE";

    public String getPathToDriverExecutable() {
        return pathToDriverExecutable;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getMeasurementsPrecisionMilli() {
        return measurementsPrecisionMilli;
    }

    private String pathToDriverExecutable;
    private Integer timeout;
    private Integer measurementsPrecisionMilli;
    private String baseURI;

    public WebdriverActionExecutorBuilder pathToDriverExecutable(String pathToDriverExecutable) {
        this.pathToDriverExecutable = pathToDriverExecutable;
        return this;
    }

    public WebdriverActionExecutorBuilder timeoutInSeconds(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public WebdriverActionExecutorBuilder measurementsPrecisionInMilliseconds(int measurementsPrecisionMilli) {
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        return this;
    }

    public WebdriverActionExecutorBuilder baseURI(String baseURI) {
        this.baseURI = baseURI;
        return this;
    }

    public WebDriverActionExecutor buildChromedriver() throws IOException, URISyntaxException {
        return buildDriver(this::createChromeDriverActionExecutor);
    }

    public WebDriverActionExecutor buildFirefoxdriver() throws IOException, URISyntaxException {
        return buildDriver(this::createFirefoxDriverActionExecutor);
    }

    private WebDriverActionExecutor createFirefoxDriverActionExecutor() throws IOException, URISyntaxException {
        return new FirefoxDriverActionExecutor(this);
    }

    private WebDriverActionExecutor createChromeDriverActionExecutor() throws IOException, URISyntaxException {
        return new ChromeDriverActionExecutor(this);
    }

    private WebDriverActionExecutor buildDriver(WebDriverActionSupplier creatingFunction) throws IOException, URISyntaxException {
        setDefaultValues();
        return creatingFunction.get();
    }

    private void setDefaultValues() throws IOException {
        pathToDriverExecutable = Optional.ofNullable(pathToDriverExecutable).orElse(System.getenv(DRIVER_EXECUTABLE));
        if (pathToDriverExecutable == null) {
            throw new IOException("Path to driver executable not set. Please either set it using" +
                    " pathToDriverExecutable method or by setting the environment variable" +
                    " DRIVER_EXECUTABLE");
        }

        if (baseURI == null) {
            throw new IOException("Base URI is not set. Please use the baseURI method");
        }

        timeout = Optional.ofNullable(timeout).orElse(20);
        measurementsPrecisionMilli = Optional.ofNullable(measurementsPrecisionMilli).orElse(50);
    }

    public String getBaseURI() {
        return baseURI;
    }
}