package com.hribol.automation.execution.executor;

import com.hribol.automation.execution.webdriver.WebdriverAction;
import com.hribol.automation.suite.VirtualScreenProcessCreator;
import com.hribol.automation.utils.LoadingTimes;

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
