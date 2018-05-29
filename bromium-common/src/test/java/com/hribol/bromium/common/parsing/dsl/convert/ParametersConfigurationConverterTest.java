package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.dsl.bromium.ParameterValue;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 17.11.17.
 */
public class ParametersConfigurationConverterTest {

    private final String TEXT = "text";
    private final String SELECTOR = "selector";

    private ParameterConfigurationConverter parameterConfigurationConverter = mock(ParameterConfigurationConverter.class);

    private final ParameterValue adminParameterValue = parameterValue("admin");
    private final ParameterValue userSelectorParameterValue = parameterValue("#user");

    private final ParameterConfiguration adminConfigurationMock = mock(ParameterConfiguration.class);
    private final ParameterConfiguration userSelectorConfigurationMock = mock(ParameterConfiguration.class);

    @Test
    public void convertNotExposedParamaters() throws Exception {
        List<String> parameterNames = Arrays.asList(TEXT, SELECTOR);
        List<ParameterValue> parameterValues = Arrays.asList(adminParameterValue, userSelectorParameterValue);

        when(parameterConfigurationConverter.convert(TEXT, adminParameterValue)).thenReturn(adminConfigurationMock);
        when(parameterConfigurationConverter.convert(SELECTOR, userSelectorParameterValue)).thenReturn(userSelectorConfigurationMock);

        ParametersConfigurationConverter parametersConfigurationConverter = new ParametersConfigurationConverter(parameterConfigurationConverter);
        Map<String, ParameterConfiguration> actual = parametersConfigurationConverter.convert(parameterNames, parameterValues);

        assertTrue(actual.containsKey(TEXT));
        assertEquals(adminConfigurationMock, actual.get(TEXT));

        assertTrue(actual.containsKey(SELECTOR));
        assertEquals(userSelectorConfigurationMock, actual.get(SELECTOR));
    }

    private ParameterValue parameterValue(String value) {
        ParameterValue parameterValue = mock(ParameterValue.class);
        when(parameterValue.getContent()).thenReturn(value);
        return parameterValue;
    }


}