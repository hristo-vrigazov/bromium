package com.hribol.spiderman.replay.execution;

import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.replay.report.ExecutionReport;
import com.hribol.spiderman.replay.report.LoadingTimes;
import com.hribol.spiderman.replay.report.AutomationResult;

import java.io.IOException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebDriverActionExecution {
    ExecutionReport execute(TestScenario testScenario);
    ExecutionReport execute(TestScenario testScenario, String screenToUse);
    ExecutionReport createVirtualScreenProcessAndExecute(TestScenario testScenario,
                                                         int screenNumber,
                                                         VirtualScreenProcessCreator virtualScreenProcessCreator);
    String getBaseURL();
}
