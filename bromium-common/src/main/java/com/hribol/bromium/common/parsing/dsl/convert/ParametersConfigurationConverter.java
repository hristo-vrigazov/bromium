package com.hribol.bromium.common.parsing.dsl.convert;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.dsl.bromium.ParameterValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Converts two lists of parameter names and values to a map of {@link com.hribol.bromium.core.config.ParameterConfiguration}
 */
public class ParametersConfigurationConverter {

    private ParameterConfigurationConverter parameterConfigurationConverter;

    @Inject
    public ParametersConfigurationConverter(ParameterConfigurationConverter parameterConfigurationConverter) {
        this.parameterConfigurationConverter = parameterConfigurationConverter;
    }

    public Map<String, ParameterConfiguration> convert(List<String> parameterNames, List<ParameterValue> parameterValues) {
        Map<String, ParameterConfiguration> configurationMap = new TreeMap<>();

        for (int i = 0; i < parameterNames.size(); i++) {
            String parameterName = parameterNames.get(i);
            ParameterValue parameterValue = parameterValues.get(i);
            ParameterConfiguration parameterConfiguration = parameterConfigurationConverter.convert(parameterName, parameterValue);
            configurationMap.put(parameterName, parameterConfiguration);
        }

        return configurationMap;
    }
}
