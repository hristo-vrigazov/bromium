package com.hribol.bromium.record;

import com.hribol.bromium.core.TestScenarioSteps;

import java.util.Map;

/**
 * Represents the state of the recording - provides accessors to
 * test steps, etc.
 */
public class RecordingState {
    private TestScenarioSteps testScenarioSteps = new TestScenarioSteps();

    /**
     * Stores a given test case step
     * @param testCaseStep the step to be stored
     */
    public void storeTestCaseStep(Map<String, String> testCaseStep) {
        testScenarioSteps.add(testCaseStep);
    }

    /**
     * Gets the list of all the {@link TestScenarioSteps} that are currently stored
     * @return the list of all the {@link TestScenarioSteps} that are currently stored
     */
    public TestScenarioSteps getTestScenarioSteps() {
        return testScenarioSteps;
    }
}
