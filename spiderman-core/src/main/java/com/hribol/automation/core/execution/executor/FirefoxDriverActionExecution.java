package com.hribol.automation.core.execution.executor;

import com.hribol.automation.core.execution.settings.FirefoxDriverExecutionSettings;
import com.hribol.automation.core.execution.settings.ExecutionSettings;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class FirefoxDriverActionExecution extends WebDriverActionExecutionBase {
    public FirefoxDriverActionExecution(WebDriverActionExecutor webDriverActionExecutor) throws IOException, URISyntaxException {
        super(webDriverActionExecutor);
    }

    @Override
    protected ExecutionSettings createExecutionSettings() {
        return new FirefoxDriverExecutionSettings(this.baseURI, this::filterRequest, this::filterResponse);
    }

    @Override
    protected String getSystemProperty() {
        return "webdriver.gecko.driver";
    }
}
