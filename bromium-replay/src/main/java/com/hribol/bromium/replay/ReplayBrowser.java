package com.hribol.bromium.replay;

import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import com.hribol.bromium.replay.report.ExecutionReport;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private final WebDriverActionExecution webDriverActionExecution;
    private final TestScenarioFactory testScenarioFactory;

    public ReplayBrowser(TestScenarioFactory testScenarioFactory, WebDriverActionExecution execution) {
        this.testScenarioFactory = testScenarioFactory;
        this.webDriverActionExecution = execution;
    }

    public ExecutionReport replay(List<Map<String, String>> steps) {
        TestScenario testScenario = testScenarioFactory.createFromTestCaseSteps(steps);
        return webDriverActionExecution.execute(testScenario);
    }

    public ExecutionReport replay(String pathToSerializedTest)
            throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return webDriverActionExecution.execute(testScenario);
    }

    public ExecutionReport replay(InputStream inputStream) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecution.execute(testScenario);
    }

    public ExecutionReport replay(String pathToSerializedTest,
                                  String screen)
            throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return webDriverActionExecution.execute(testScenario, screen);
    }

    public ExecutionReport replay(InputStream inputStream,
                                  String screen) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecution.execute(testScenario, screen);
    }

    public ExecutionReport createVirtualScreenProcessAndExecute(InputStream inputStream,
                                                                int screenNumber,
                                                                VirtualScreenProcessCreator virtualScreenProcessCreator) throws IOException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecution.createVirtualScreenProcessAndExecute(testScenario, screenNumber, virtualScreenProcessCreator);
    }

    public ExecutionReport createVirtualScreenProcessAndExecute(List<Map<String, String>> steps,
                                                                int screenNumber,
                                                                VirtualScreenProcessCreator virtualScreenProcessCreator) throws IOException {
        TestScenario testScenario = testScenarioFactory.createFromTestCaseSteps(steps);
        return webDriverActionExecution.createVirtualScreenProcessAndExecute(testScenario, screenNumber, virtualScreenProcessCreator);
    }
}
