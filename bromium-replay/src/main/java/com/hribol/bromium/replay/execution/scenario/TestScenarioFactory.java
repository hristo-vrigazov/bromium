package com.hribol.bromium.replay.execution.scenario;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.parsing.StepsReader;
import com.hribol.bromium.replay.execution.application.ApplicationAction;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * A factory for creating {@link TestScenario}
 */
public class TestScenarioFactory {

    private ApplicationActionFactory applicationActionFactory;
    private StepsReader stepsReader;

    /**
     * Creates a new factory for {@link TestScenario}
     * @param applicationActionFactory an instance which will be used for creating application-level actions by given
     *                                 test case steps
     * @param stepsReader an instance which will be used for reading the test case steps
     */
    public TestScenarioFactory(ApplicationActionFactory applicationActionFactory, StepsReader stepsReader) {
        this.applicationActionFactory = applicationActionFactory;
        this.stepsReader = stepsReader;
    }

    /**
     * Creates a {@link TestScenario} by a given path to file
     * @param pathToSerializedTest path to the file
     * @return the {@link TestScenario} created
     * @throws IOException if exception happens while reading / parsing the file
     */
    public TestScenario createFromFile(String pathToSerializedTest) throws IOException {
        try (InputStream fileInputStream = new FileInputStream(pathToSerializedTest)) {
            TestScenarioSteps testCaseSteps = stepsReader.readSteps(fileInputStream);
            return createFromTestCaseSteps(testCaseSteps);
        }
    }

    /**
     * Creates a {@link TestScenario} by given {@link TestScenarioSteps}
     * @param testCaseSteps the steps of the scenario
     * @return an instance of the {@link TestScenario} with the provided steps
     */
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

    /**
     * Creates a {@link TestScenario} directly from a given {@link InputStream}
     * @param inputStream the input streams from which the steps will be read
     * @return an instance of the {@link TestScenario} with the provided steps
     * @throws IOException IOException if exception happens while reading / parsing the input stream
     */
    public TestScenario createFromInputStream(InputStream inputStream) throws IOException {
        TestScenarioSteps testCaseSteps = stepsReader.readSteps(inputStream);
        return createFromTestCaseSteps(testCaseSteps);
    }
}
