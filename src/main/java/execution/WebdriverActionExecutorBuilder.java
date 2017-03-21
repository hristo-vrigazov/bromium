package execution;

import java.io.IOException;
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

    public ChromeDriverActionExecutor buildChromedriver() throws IOException {
        pathToDriverExecutable = Optional.ofNullable(pathToDriverExecutable).orElse(System.getenv(DRIVER_EXECUTABLE));
        if (pathToDriverExecutable == null) {
            throw new IOException("Path to driver executable not set. Please either set it using" +
                    " pathToDriverExecutable method or by setting the environment variable" +
                    " DRIVER_EXECUTABLE");
        }

        timeout = Optional.ofNullable(timeout).orElse(20);
        measurementsPrecisionMilli = Optional.ofNullable(measurementsPrecisionMilli).orElse(50);
        return new ChromeDriverActionExecutor(this);
    }
}