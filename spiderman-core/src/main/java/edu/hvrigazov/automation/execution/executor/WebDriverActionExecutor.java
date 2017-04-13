package edu.hvrigazov.automation.execution.executor;

import edu.hvrigazov.automation.execution.webdriver.WebdriverAction;
import edu.hvrigazov.automation.suite.VirtualScreenProcessCreator;
import edu.hvrigazov.automation.utils.LoadingTimes;

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
    void dumpHarMetrics(String fileNameToDump) throws IOException;
    void dumpLoadingTimes(String fileNameToDump) throws UnsupportedEncodingException, FileNotFoundException;
    LoadingTimes getLoadingTimes();
    AutomationResult getAutomationResult();
    AutomationResult executeOnScreen(int i,
                                     VirtualScreenProcessCreator virtualScreenProcessCreator,
                                     String loadingTimesFileName,
                                     String harTimesFileName);
}
