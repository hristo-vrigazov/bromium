package execution.executor;

import execution.settings.ExecutionSettings;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class FirefoxDriverActionExecutor extends WebDriverActionExecutorBase {
    public FirefoxDriverActionExecutor(WebdriverActionExecutorBuilder webdriverActionExecutorBuilder) throws IOException {
        super(webdriverActionExecutorBuilder);
    }

    @Override
    protected ExecutionSettings createExecutionSettings() {
        return new FirefoxDriverExecutionSettings(this::filterRequest, this::filterResponse);
    }

    @Override
    protected String getSystemProperty() {
        return "webdriver.gecko.driver";
    }
}
