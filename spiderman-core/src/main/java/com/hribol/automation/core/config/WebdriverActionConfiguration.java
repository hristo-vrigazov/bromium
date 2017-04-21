package com.hribol.automation.core.config;

import java.util.Map;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class WebdriverActionConfiguration {
    private String webdriverActionType;
    private Map<String, ParameterConfiguration> parametersConfiguration;

    public String getWebdriverActionType() {
        return webdriverActionType;
    }

    public void setWebdriverActionType(String webdriverActionType) {
        this.webdriverActionType = webdriverActionType;
    }

    public Map<String, ParameterConfiguration> getParametersConfiguration() {
        return parametersConfiguration;
    }

    public void setParametersConfiguration(Map<String, ParameterConfiguration> parametersConfiguration) {
        this.parametersConfiguration = parametersConfiguration;
    }

}
