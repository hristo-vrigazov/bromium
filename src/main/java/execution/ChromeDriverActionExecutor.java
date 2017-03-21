package execution;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class ChromeDriverActionExecutor extends WebDriverActionExecutorBase {
    public ChromeDriverActionExecutor(WebdriverActionExecutorBuilder webdriverActionExecutorBuilder) throws IOException {
        super(webdriverActionExecutorBuilder);
    }

    @Override
    protected ChromeExecutionSettings createExecutionSettings() {
        return new ChromeExecutionSettings(this::filterRequest, this::filterResponse);
    }
}
