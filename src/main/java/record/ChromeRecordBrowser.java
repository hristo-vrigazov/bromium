package record;

import execution.executor.ChromeDriverExecutionSettings;
import execution.settings.ExecutionSettings;

/**
 * Created by hvrigazov on 22.03.17.
 */
public class ChromeRecordBrowser extends RecordBrowserBase {
    public ChromeRecordBrowser(String pathToChromeDriver, String pathToJsInjectionFile) {
        super(pathToChromeDriver, pathToJsInjectionFile);
    }

    @Override
    protected ExecutionSettings createExecutionSettings() {
        return new ChromeDriverExecutionSettings(this.baseURI.toString(), this::filterRequest, this::filterResponse);
    }

    @Override
    protected String getSystemProperty() {
        return "webdriver.chrome.driver";
    }
}
