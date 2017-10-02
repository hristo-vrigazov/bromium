package com.hribol.bromium.replay;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.replay.execution.WebDriverActionExecutor;
import com.hribol.bromium.replay.execution.scenario.TestScenario;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import com.hribol.bromium.replay.report.ExecutionReport;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 15.03.17.
 */
public class ReplayBrowser {

    private final WebDriverActionExecutor webDriverActionExecutor;
    private final TestScenarioFactory testScenarioFactory;

    public ReplayBrowser(TestScenarioFactory testScenarioFactory, WebDriverActionExecutor execution) {
        this.testScenarioFactory = testScenarioFactory;
        this.webDriverActionExecutor = execution;
    }

    public ExecutionReport replay(TestScenarioSteps steps) {
        TestScenario testScenario = testScenarioFactory.createFromTestCaseSteps(steps);
        return webDriverActionExecutor.execute(testScenario);
    }

    public ExecutionReport replay(String pathToSerializedTest)
            throws InterruptedException, IOException, URISyntaxException {
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToSerializedTest);
        return webDriverActionExecutor.execute(testScenario);
    }

    public ExecutionReport replay(InputStream inputStream) throws IOException, URISyntaxException, InterruptedException {
        TestScenario testScenario = testScenarioFactory.createFromInputStream(inputStream);
        return webDriverActionExecutor.execute(testScenario);
    }

    public void forceCleanUp() {
        webDriverActionExecutor.forceCleanUp();
    }

}
