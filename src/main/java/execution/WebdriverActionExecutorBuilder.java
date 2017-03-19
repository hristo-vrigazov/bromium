package execution;

import java.io.IOException;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class WebdriverActionExecutorBuilder {
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
    private int timeout;
    private int measurementsPrecisionMilli;

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
        return new ChromeDriverActionExecutor(this);
    }
}