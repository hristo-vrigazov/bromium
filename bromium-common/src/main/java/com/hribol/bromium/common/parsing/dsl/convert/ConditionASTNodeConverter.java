package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.WebDriverActionCondition;

import java.util.Map;

/**
 * Converts a {@link WebDriverActionCondition} to {@link WebDriverActionConfiguration}
 */
public class ConditionASTNodeConverter implements ASTNodeConverter<WebDriverActionCondition, WebDriverActionConfiguration> {

    private ParametersConfigurationConverter parametersConfigurationConverter;

    public ConditionASTNodeConverter(ParametersConfigurationConverter parametersConfigurationConverter) {
        this.parametersConfigurationConverter = parametersConfigurationConverter;
    }

    @Override
    public WebDriverActionConfiguration convert(WebDriverActionCondition webDriverActionCondition) {
        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        webDriverActionConfiguration.setWebDriverActionType(webDriverActionCondition.eClass().getName());
        Map<String, ParameterConfiguration> configurationMap = parametersConfigurationConverter.convert(
                webDriverActionCondition.getParameterNames(),
                webDriverActionCondition.getParameterValues());
        webDriverActionConfiguration.setParametersConfiguration(configurationMap);
        return webDriverActionConfiguration;
    }
}
