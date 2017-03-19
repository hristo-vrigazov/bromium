package execution;

import utils.LoadingTimes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebdriverActionExecutor {
    void addWebdriverAction(WebdriverAction webdriverAction);
    void execute() throws InterruptedException, IOException;
    void executeOnScreen(String screenToUse) throws InterruptedException, IOException;
    void quit();
    void dumpHarMetrics(String fileNameToDump) throws IOException;
    void dumpLoadingTimes(String fileNameToDump) throws UnsupportedEncodingException, FileNotFoundException;
    LoadingTimes getLoadingTimes();
    AutomationResult getAutomationResult();
}
