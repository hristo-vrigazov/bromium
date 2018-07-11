package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.GenerationInformation;

import java.util.Map;

/**
 * Represents a package of a test case step and a {@link ApplicationActionConfiguration}
 */
public class StepAndActionConfiguration implements GenerationInformation {
    private Map<String, String> testCaseStep;
    private int index;
    private ApplicationActionConfiguration applicationActionConfiguration;

    public StepAndActionConfiguration(Map<String, String> testCaseStep,
                                      int i,
                                      ApplicationActionConfiguration applicationActionConfiguration) {
        this.testCaseStep = testCaseStep;
        this.index = i;
        this.applicationActionConfiguration = applicationActionConfiguration;
    }

    public ApplicationActionConfiguration getApplicationActionConfiguration() {
        return applicationActionConfiguration;
    }

    public Map<String, String> getTestCaseStep() {
        return testCaseStep;
    }

    public int getIndex() {
        return index;
    }
}
