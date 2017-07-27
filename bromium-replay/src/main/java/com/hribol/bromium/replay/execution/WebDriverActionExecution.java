package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.report.ExecutionReport;

/**
 * Created by hvrigazov on 15.03.17.
 */
public interface WebDriverActionExecution {
    ExecutionReport execute(TestScenario testScenario);
    ExecutionReport createVirtualScreenProcessAndExecute(TestScenario testScenario,
                                                         VirtualScreenProcessCreator virtualScreenProcessCreator);
    String getBaseURL();
}
