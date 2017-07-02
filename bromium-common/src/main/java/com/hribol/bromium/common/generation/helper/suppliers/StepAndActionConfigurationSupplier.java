package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;

import java.util.Map;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class StepAndActionConfigurationSupplier {
    public StepAndActionConfiguration get(Map<String, String> testCaseStep,
                                          ApplicationActionConfiguration applicationActionConfiguration) {
        return new StepAndActionConfiguration(testCaseStep, applicationActionConfiguration);
    }
}
