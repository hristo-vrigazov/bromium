package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.report.ExecutionReport;

/**
 * Represents an executor of a {@link TestScenario}
 */
public interface WebDriverActionExecutor {
    /**
     * Executes a test scenario
     * @param testScenario the scenario to be executed
     * @return the report of the execution
     */
    ExecutionReport execute(TestScenario testScenario);

    /**
     * Force clean up: tear down web driver and proxy
     */
    void forceCleanUp();
}
