package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.core.generation.FunctionRegistry;
import com.hribol.bromium.core.generation.GenerationFunctionInformation;
import com.hribol.bromium.core.generation.RegistryInformation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class IncludeInvokeGeneratorTest {

    @Test
    public void passesRecordingCodeAndRegistersTheGenerationInformationInRegistry() {
        final String expected = "something(2, 3);";
        FunctionRegistry<RegistryInformation<GenerationFunctionInformation>> functionRegistry = mock(FunctionRegistry.class);
        RegistryInformation<GenerationFunctionInformation> registryInformation = mock(RegistryInformation.class);

        when(functionRegistry.generate(registryInformation)).thenReturn(expected);

        IncludeInvokeGenerator<RegistryInformation<GenerationFunctionInformation>> includeInvokeGenerator =
                new IncludeInvokeGenerator<>(functionRegistry);

        String actual = includeInvokeGenerator.generate(registryInformation);

        assertEquals(expected, actual);
        verify(functionRegistry).register(registryInformation);
    }
}
