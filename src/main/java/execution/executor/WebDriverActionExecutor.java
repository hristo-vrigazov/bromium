package execution.executor;

import execution.webdriver.WebdriverAction;
import utils.LoadingTimes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebDriverActionExecutor {
    void addWebdriverAction(WebdriverAction webdriverAction);
    void execute() throws InterruptedException, IOException, URISyntaxException;
    void executeOnScreen(String screenToUse) throws InterruptedException, IOException, URISyntaxException;
    void quit();
    void dumpHarMetrics(String fileNameToDump) throws IOException;
    void dumpLoadingTimes(String fileNameToDump) throws UnsupportedEncodingException, FileNotFoundException;
    LoadingTimes getLoadingTimes();
    AutomationResult getAutomationResult();
}
