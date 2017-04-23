package com.hribol.spiderman.core.config;

import java.util.Map;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class WebDriverActionConfiguration {
    private String webDriverActionType;
    private Map<String, ParameterConfiguration> parametersConfiguration;

    public String getWebDriverActionType() {
        return webDriverActionType;
    }

    public void setWebDriverActionType(String webDriverActionType) {
        this.webDriverActionType = webDriverActionType;
    }

    public Map<String, ParameterConfiguration> getParametersConfiguration() {
        return parametersConfiguration;
    }

    public void setParametersConfiguration(Map<String, ParameterConfiguration> parametersConfiguration) {
        this.parametersConfiguration = parametersConfiguration;
    }

}
