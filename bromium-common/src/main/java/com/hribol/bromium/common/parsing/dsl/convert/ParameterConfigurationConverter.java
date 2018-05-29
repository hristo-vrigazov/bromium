package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.dsl.bromium.ParameterValue;

import java.util.Optional;

/**
 * Converts a parameter name and its given parameter value to {@link ParameterConfiguration}
 */
public class ParameterConfigurationConverter {
    public ParameterConfiguration convert(String parameterName, ParameterValue parameterValue) {
        ParameterConfiguration parameterConfiguration = new ParameterConfiguration();
        parameterConfiguration.setParameterName(parameterName);

        if (Optional.ofNullable(parameterValue.getExposedParameter()).isPresent()) {
            parameterConfiguration.setExpose(true);
            parameterConfiguration.setAlias(parameterValue.getExposedParameter().getName());
            return parameterConfiguration;
        }

        parameterConfiguration.setExpose(false);
        parameterConfiguration.setValue(parameterValue.getContent());
        return parameterConfiguration;
    }
}
