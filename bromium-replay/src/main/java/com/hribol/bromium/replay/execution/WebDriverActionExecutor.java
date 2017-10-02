package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.report.ExecutionReport;

/**
 * Represents an executor of a {@link TestScenario}
 */
public interface WebDriverActionExecutor {
    /**
     *
     * @param testScenario
     * @return
     */
    ExecutionReport execute(TestScenario testScenario);

    void forceCleanUp();
}
