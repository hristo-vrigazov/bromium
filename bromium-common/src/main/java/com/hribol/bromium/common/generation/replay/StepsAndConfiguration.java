package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.GenerationInformation;

import java.util.List;
import java.util.Map;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class StepsAndConfiguration implements GenerationInformation {
    private List<Map<String, String>> testCaseSteps;
    private ApplicationConfiguration applicationConfiguration;

    public StepsAndConfiguration(List<Map<String, String>> testCaseSteps, ApplicationConfiguration applicationConfiguration) {
        this.testCaseSteps = testCaseSteps;
        this.applicationConfiguration = applicationConfiguration;
    }

    public ApplicationConfiguration getApplicationConfiguration() {
        return applicationConfiguration;
    }

    public List<Map<String, String>> getTestCaseSteps() {
        return testCaseSteps;
    }
}
