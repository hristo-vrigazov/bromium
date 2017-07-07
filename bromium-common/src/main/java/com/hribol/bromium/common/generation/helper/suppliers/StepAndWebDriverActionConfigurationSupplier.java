package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import java.util.Map;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class StepAndWebDriverActionConfigurationSupplier {
    public StepAndWebDriverActionConfiguration get(Map<String, String> testCaseStep, WebDriverActionConfiguration webDriverActionConfiguration) {
        return new StepAndWebDriverActionConfiguration(testCaseStep, webDriverActionConfiguration);
    }
}
