package com.hribol.bromium.common.replay.generation;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.GenerationInformation;

import java.util.Map;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class StepAndActionConfiguration implements GenerationInformation {
    private Map<String, String> testCaseStep;
    private ApplicationActionConfiguration applicationActionConfiguration;

    public StepAndActionConfiguration(Map<String, String> testCaseStep, ApplicationActionConfiguration applicationActionConfiguration) {
        this.testCaseStep = testCaseStep;
        this.applicationActionConfiguration = applicationActionConfiguration;
    }

    public ApplicationActionConfiguration getApplicationActionConfiguration() {
        return applicationActionConfiguration;
    }

    public Map<String, String> getTestCaseStep() {
        return testCaseStep;
    }
}
