package com.hribol.bromium.record;

import com.hribol.bromium.core.TestScenarioSteps;

import java.util.Map;

/**
 * Represents the state of the recording - provides accessors to
 * test steps, etc.
 */
public class RecordingState {
    private TestScenarioSteps testScenarioSteps = new TestScenarioSteps();

    public void storeTestCaseStep(Map<String, String> testCaseStep) {
        testScenarioSteps.add(testCaseStep);
    }

    public TestScenarioSteps getTestScenarioSteps() {
        return testScenarioSteps;
    }
}
