package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import java.util.Map;

/**
 * Supplies an instance of {@link StepAndWebDriverActionConfiguration}
 */
public class StepAndWebDriverActionConfigurationSupplier {
    public StepAndWebDriverActionConfiguration get(Map<String, String> testCaseStep, int index, WebDriverActionConfiguration webDriverActionConfiguration) {
        return new StepAndWebDriverActionConfiguration(testCaseStep, index, webDriverActionConfiguration);
    }
}
