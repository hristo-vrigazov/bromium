package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.replay.report.LoadingTimes;
import com.hribol.spiderman.replay.report.AutomationResult;

import java.io.IOException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebDriverActionExecution {
    void execute(TestScenario testScenario);
    void executeOnScreen(TestScenario testScenario, String screenToUse);
    void dumpHarMetrics(String fileNameToDump) throws IOException;

    LoadingTimes getLoadingTimes();
    AutomationResult getAutomationResult();
    void executeOnScreen(TestScenario testScenario,
                                     int i,
                                     VirtualScreenProcessCreator virtualScreenProcessCreator);
}
