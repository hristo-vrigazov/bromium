package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.core.utils.LoadingTimes;
import com.hribol.spiderman.replay.AutomationResult;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebDriverActionExecution {
    void execute(TestScenario testScenario);
    void executeOnScreen(TestScenario testScenario, String screenToUse);
    void dumpHarMetrics(String fileNameToDump) throws IOException;

    LoadingTimes getLoadingTimes();
    AutomationResult getAutomationResult();
    AutomationResult executeOnScreen(TestScenario testScenario,
                                     int i,
                                     VirtualScreenProcessCreator virtualScreenProcessCreator);
}
