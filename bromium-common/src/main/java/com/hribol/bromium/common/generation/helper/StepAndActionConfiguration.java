package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.GenerationInformation;

import java.util.Map;

/**
 * Represents a package of a test case step and a {@link ApplicationActionConfiguration}
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
