package com.hribol.bromium.record;

import com.hribol.bromium.core.TestScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.core.utils.Constants.DATA_ID;
import static com.hribol.bromium.core.utils.Constants.SUBSTITUTION;

/**
 * Represents the state of the recording - provides accessors to
 * test steps, etc.
 */
public class RecordingState {
    private static final Logger logger = LoggerFactory.getLogger(RecordingState.class);

    private TestScenarioSteps testScenarioSteps = new TestScenarioSteps();

    private Map<String, String> substitutions = new HashMap<>();

    /**
     * Stores a given test case step
     * @param testCaseStep the step to be stored
     */
    public void storeTestCaseStep(Map<String, String> testCaseStep) {
        Optional
                .ofNullable(testCaseStep.get(SUBSTITUTION))
                .ifPresent(this::addSubstition);

        replaceSubstitions(testCaseStep);

        testScenarioSteps.add(testCaseStep);
    }

    private void replaceSubstitions(Map<String, String> testCaseStep) {
        for (Map.Entry<String, String> entry: testCaseStep.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            Optional
                    .ofNullable(substitutions.get(value))
                    .ifPresent(replacement -> testCaseStep.put(key, "{{" + replacement + "}}"));
        }
    }

    private void addSubstition(String substitionRaw) {
        String[] substitutions = substitionRaw.split("=");
        String key = substitutions[0];
        String value = substitutions[1] + "@" + testScenarioSteps.size();
        logger.info("Adding substitution: " + key + ": " + value);
        this.substitutions.put(key, value);
    }

    /**
     * Gets the list of all the {@link TestScenarioSteps} that are currently stored
     * @return the list of all the {@link TestScenarioSteps} that are currently stored
     */
    public TestScenarioSteps getTestScenarioSteps() {
        return testScenarioSteps;
    }
}
