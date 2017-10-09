package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;

import java.util.Map;

/**
 * Supplies an instance of {@link StepAndActionConfiguration}
 */
public class StepAndActionConfigurationSupplier {
    public StepAndActionConfiguration get(Map<String, String> testCaseStep,
                                          ApplicationActionConfiguration applicationActionConfiguration) {
        return new StepAndActionConfiguration(testCaseStep, applicationActionConfiguration);
    }
}
