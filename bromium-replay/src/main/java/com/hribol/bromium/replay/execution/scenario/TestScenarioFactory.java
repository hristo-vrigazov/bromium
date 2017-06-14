package com.hribol.bromium.replay.execution.scenario;

import com.hribol.bromium.replay.execution.application.ApplicationAction;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;
import com.hribol.bromium.core.utils.ConfigurationUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class TestScenarioFactory {

    private ApplicationActionFactory applicationActionFactory;

    public TestScenarioFactory(ApplicationActionFactory applicationActionFactory) {
        this.applicationActionFactory = applicationActionFactory;
    }

    public TestScenario createFromFile(String pathToSerializedTest) throws IOException {
        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(pathToSerializedTest);
        return createFromTestCaseSteps(testCaseSteps);
    }

    public TestScenario createFromTestCaseSteps(List<Map<String, String>> testCaseSteps) {
        TestScenario testScenario = new TestScenario();

        for (Map<String, String> testCaseStep: testCaseSteps) {
            ApplicationAction domainSpecificAction =
                    applicationActionFactory.create(testCaseStep);
            testScenario.addWebDriverAction(domainSpecificAction.getPrecondition());
            testScenario.addWebDriverAction(domainSpecificAction.getWebdriverAction());
            testScenario.addWebDriverAction(domainSpecificAction.getPostcondition());
        }

        return testScenario;
    }

    public TestScenario createFromInputStream(InputStream inputStream) throws IOException {
        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(inputStream);
        return createFromTestCaseSteps(testCaseSteps);
    }
}
