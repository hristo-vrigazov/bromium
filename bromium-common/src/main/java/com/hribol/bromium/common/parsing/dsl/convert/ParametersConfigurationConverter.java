package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.dsl.bromium.ParameterValue;
import org.eclipse.emf.common.util.EList;

import java.util.Map;

/**
 * Converts two lists of parameter names and values to a map of {@link com.hribol.bromium.core.config.ParameterConfiguration}
 */
public class ParametersConfigurationConverter {
    public Map<String, ParameterConfiguration> convert(EList<String> parameterNames, EList<ParameterValue> parameterValues) {
        return null;
    }
}
