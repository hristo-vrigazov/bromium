package com.hribol.bromium.replay;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.replay.execution.WebDriverActionExecutor;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import com.hribol.bromium.replay.report.ExecutionReport;

import java.io.IOException;
import java.io.InputStream;

/**
 * Represent a replay browser - which by given factory for creating test scenarios and an executor,
 * executes the provided steps
 */
public class ReplayBrowser {

    private final WebDriverActionExecutor webDriverActionExecutor;
    private final TestScenarioFactory testScenarioFactory;

    /**
     * Creates a new instance
     * @param testScenarioFactory the factory for creating {@link TestScenarioSteps}
     * @param execution the executor needed for executing {@link TestScenario}
     */
    public ReplayBrowser(TestScenarioFactory testScenarioFactory, WebDriverActionExecutor execution) {
        this.testScenarioFactory = testScenarioFactory;
        this.webDriverActionExecutor = execution;
    }

    /**
     * Replays the given steps
     * @param steps the test steps in raw format
     * @return a report of the execution
     */
    public ExecutionReport replay(TestScenarioSteps steps) {
        TestScenario testScenario = testScenarioFactory.createFromTestCaseSteps(steps);
        return webDriverActionExecutor.execute(testScenario);
    }

    /**
     * Replays given steps from file
     * @param pathToSerializedTest the path to the test in serialized form
     * @return a report of the execution
     * @throws IOException - if exception occurs while reading from file
     */
    public ExecutionReport replay(String pathToSerializedTest) throws IOException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return webDriverActionExecutor.execute(testScenario);
    }

    /**
     * Replays given steps from an input stream
     * @param inputStream the input stream which contains the steps in serialized form
     * @return a report of the execution
     * @throws IOException if exception occurs while reading from the input stream
     */
    public ExecutionReport replay(InputStream inputStream) throws IOException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecutor.execute(testScenario);
    }

    /**
     * Tear down web driver and proxy
     */
    public void forceCleanUp() {
        webDriverActionExecutor.forceCleanUp();
    }

}
