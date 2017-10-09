package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GenerationInformation;
import com.hribol.bromium.core.generation.RegistryInformation;

import java.util.Map;

/**
 * Represents a package of a test case step and {@link WebDriverActionConfiguration}
 */
public class StepAndWebDriverActionConfiguration implements GenerationInformation, RegistryInformation<WebDriverActionConfiguration> {
    private Map<String, String> testCaseStep;
    private WebDriverActionConfiguration webDriverActionConfiguration;

    public StepAndWebDriverActionConfiguration(Map<String, String> testCaseStep, WebDriverActionConfiguration webDriverActionConfiguration) {
        this.testCaseStep = testCaseStep;
        this.webDriverActionConfiguration = webDriverActionConfiguration;
    }

    public WebDriverActionConfiguration getWebDriverActionConfiguration() {
        return webDriverActionConfiguration;
    }

    public Map<String, String> getTestCaseStep() {
        return testCaseStep;
    }

    @Override
    public WebDriverActionConfiguration getGenerationFunctionInformation() {
        return getWebDriverActionConfiguration();
    }
}
