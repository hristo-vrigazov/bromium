package com.hribol.bromium.common.parsing.dsl.convert;


import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.WebDriverAction;

import java.util.Map;

/**
 * Converts an AST node {@link WebDriverAction} into {@link WebDriverActionConfiguration}
 */
public class ActionASTNodeConverter implements ASTNodeConverter<WebDriverAction, WebDriverActionConfiguration> {
    private ParametersConfigurationConverter parametersConfigurationConverter;

    public ActionASTNodeConverter(ParametersConfigurationConverter parametersConfigurationConverter) {
        this.parametersConfigurationConverter = parametersConfigurationConverter;
    }

    @Override
    public WebDriverActionConfiguration convert(WebDriverAction webDriverAction) {
        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        webDriverActionConfiguration.setWebDriverActionType(webDriverAction.eClass().getName());
        Map<String, ParameterConfiguration> configurationMap = parametersConfigurationConverter.convert(
                webDriverAction.getParameterNames(),
                webDriverAction.getParameterValues());
        webDriverActionConfiguration.setParametersConfiguration(configurationMap);
        return webDriverActionConfiguration;
    }
}
