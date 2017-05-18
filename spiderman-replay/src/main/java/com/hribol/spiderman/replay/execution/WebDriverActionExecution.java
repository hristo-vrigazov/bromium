package com.hribol.spiderman.replay.execution;

import core.execution.scenario.TestScenario;
import com.hribol.spiderman.replay.config.suite.VirtualScreenProcessCreator;
import com.hribol.spiderman.replay.report.ExecutionReport;

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
