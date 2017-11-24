package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.dsl.bromium.ParameterValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 17.11.17.
 */
public class ParameterConfigurationConverterTest {

    @Test
    public void convertHarcodedValue() throws Exception {
        final String parameterName = "text";
        final String value = "admin";
        ParameterValue parameterValue = mock(ParameterValue.class);
        when(parameterValue.getContent()).thenReturn(value);

        ParameterConfigurationConverter converter = new ParameterConfigurationConverter();

        ParameterConfiguration actual = converter.convert(parameterName, parameterValue);

        assertEquals(parameterName, actual.getParameterName());
        assertNull(actual.getAlias());
        assertEquals(value, actual.getValue());
        assertFalse(actual.isExposed());
    }

    @Test
    public void convertExposedValue() {
        final String parameterName = "text";
        final String aliasText = "alias-text";
        ParameterValue parameterValue = mock(ParameterValue.class, RETURNS_DEEP_STUBS);
        when(parameterValue.getExposedParameter().getName()).thenReturn(aliasText);

        ParameterConfigurationConverter converter = new ParameterConfigurationConverter();

        ParameterConfiguration actual = converter.convert(parameterName, parameterValue);

        assertEquals(parameterName, actual.getParameterName());
        assertNull(actual.getValue());
        assertEquals(aliasText, actual.getAlias());
        assertTrue(actual.isExposed());
    }

}