package com.hribol.bromium.replay.execution.scenario;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.parsing.StepsReader;
import com.hribol.bromium.replay.execution.application.ApplicationAction;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class TestScenarioFactory {

    private ApplicationActionFactory applicationActionFactory;
    private StepsReader stepsReader;

    public TestScenarioFactory(ApplicationActionFactory applicationActionFactory, StepsReader stepsReader) {
        this.applicationActionFactory = applicationActionFactory;
        this.stepsReader = stepsReader;
    }

    public TestScenario createFromFile(String pathToSerializedTest) throws IOException {
        try (InputStream fileInputStream = new FileInputStream(pathToSerializedTest)) {
            TestScenarioSteps testCaseSteps = stepsReader.readSteps(fileInputStream);
            return createFromTestCaseSteps(testCaseSteps);
        }
    }

    public TestScenario createFromTestCaseSteps(TestScenarioSteps testCaseSteps) {
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
        TestScenarioSteps testCaseSteps = stepsReader.readSteps(inputStream);
        return createFromTestCaseSteps(testCaseSteps);
    }
}
