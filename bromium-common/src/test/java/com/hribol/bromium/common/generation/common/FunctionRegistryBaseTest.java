package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.core.generation.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class FunctionRegistryBaseTest {

    private final String generatedFunctionDeclarationCode = "function something(a, b) { return a + b;}";
    private final String generatedInvocationCode = "something(6, 9);";
    private final String anotherGeneratedInvocationCode = "something(6, 2);";

    @Test
    public void ifFunctionIsNotInRegistryThenDeclarationAndInvocationAreAdded() {
        // Arrange
        RegistryInformation<GenerationFunctionInformation> registryInformation = mock(RegistryInformation.class);

        GeneratedInvocation generatedInvocation = mock(GeneratedInvocation.class);
        when(generatedInvocation.getJavascriptCode()).thenReturn(generatedInvocationCode);

        GeneratedFunction generatedFunction = mock(GeneratedFunction.class);
        when(generatedFunction.getJavascriptCode()).thenReturn(generatedFunctionDeclarationCode);
        when(generatedFunction.getInvocation(registryInformation)).thenReturn(generatedInvocation);

        GenerationFunctionInformation generationFunctionInformation = mock(GenerationFunctionInformation.class);
        when(registryInformation.getGenerationFunctionInformation()).thenReturn(generationFunctionInformation);

        GeneratedFunctionFactory<GeneratedFunction<RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation>,
                GenerationFunctionInformation> generatedFunctionFactory
                = mock(GeneratedFunctionFactory.class);

        when(generatedFunctionFactory.create(generationFunctionInformation)).thenReturn(generatedFunction);

        String expected = generatedFunctionDeclarationCode + generatedInvocationCode;

        // Act
        FunctionRegistryBase<
                RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation,
                GenerationFunctionInformation> functionRegistry = new FunctionRegistryBase<>(
                        generatedFunctionFactory
        );

        String actual = functionRegistry.generate(registryInformation);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void ifFunctionIsInRegistryAndInvocationIsInRegistryThenNothingIsGenerated() {
        // Arrange
        RegistryInformation<GenerationFunctionInformation> registryInformation = mock(RegistryInformation.class);

        GeneratedInvocation generatedInvocation = mock(GeneratedInvocation.class);
        when(generatedInvocation.getJavascriptCode()).thenReturn(generatedInvocationCode);

        GeneratedFunction generatedFunction = mock(GeneratedFunction.class);
        when(generatedFunction.getJavascriptCode()).thenReturn(generatedFunctionDeclarationCode);
        when(generatedFunction.getInvocation(registryInformation)).thenReturn(generatedInvocation);

        GenerationFunctionInformation generationFunctionInformation = mock(GenerationFunctionInformation.class);
        when(registryInformation.getGenerationFunctionInformation()).thenReturn(generationFunctionInformation);

        GeneratedFunctionFactory<GeneratedFunction<RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation>,
                GenerationFunctionInformation> generatedFunctionFactory
                = mock(GeneratedFunctionFactory.class);

        when(generatedFunctionFactory.create(generationFunctionInformation)).thenReturn(generatedFunction);

        String expected = "";

        // Act
        FunctionRegistryBase<
                RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation,
                GenerationFunctionInformation> functionRegistry = new FunctionRegistryBase<>(
                generatedFunctionFactory
        );

        functionRegistry.register(registryInformation);

        String actual = functionRegistry.generate(registryInformation);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void ifFunctionIsInRegistryAndInvocationIsNotThenInvocationIsGenerated() {
        // Arrange
        RegistryInformation<GenerationFunctionInformation> registryInformation = mock(RegistryInformation.class);

        GeneratedInvocation generatedInvocationNotInRegistry = mock(GeneratedInvocation.class);
        when(generatedInvocationNotInRegistry.getJavascriptCode()).thenReturn(anotherGeneratedInvocationCode);

        GeneratedInvocation generatedInvocationInRegistry = mock(GeneratedInvocation.class);
        when(generatedInvocationInRegistry.getJavascriptCode()).thenReturn(generatedInvocationCode);

        GeneratedFunction generatedFunction = mock(GeneratedFunction.class);
        when(generatedFunction.getJavascriptCode()).thenReturn(generatedFunctionDeclarationCode);
        when(generatedFunction.getInvocation(registryInformation))
                .thenReturn(generatedInvocationInRegistry, generatedInvocationNotInRegistry);

        GenerationFunctionInformation generationFunctionInformation = mock(GenerationFunctionInformation.class);
        when(registryInformation.getGenerationFunctionInformation()).thenReturn(generationFunctionInformation);

        GeneratedFunctionFactory<GeneratedFunction<RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation>,
                GenerationFunctionInformation> generatedFunctionFactory
                = mock(GeneratedFunctionFactory.class);

        when(generatedFunctionFactory.create(generationFunctionInformation)).thenReturn(generatedFunction);

        String expected = anotherGeneratedInvocationCode;

        // Act
        FunctionRegistryBase<
                RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation,
                GenerationFunctionInformation> functionRegistry = new FunctionRegistryBase<>(
                generatedFunctionFactory
        );

        functionRegistry.register(registryInformation);

        String actual = functionRegistry.generate(registryInformation);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void ifFunctionIsRegisteredTwiceThenNothingIsGeneratd() {
        // Arrange
        RegistryInformation<GenerationFunctionInformation> registryInformation = mock(RegistryInformation.class);

        GeneratedInvocation generatedInvocation = mock(GeneratedInvocation.class);
        when(generatedInvocation.getJavascriptCode()).thenReturn(generatedInvocationCode);

        GeneratedFunction generatedFunction = mock(GeneratedFunction.class);
        when(generatedFunction.getJavascriptCode()).thenReturn(generatedFunctionDeclarationCode);
        when(generatedFunction.getInvocation(registryInformation)).thenReturn(generatedInvocation);

        GenerationFunctionInformation generationFunctionInformation = mock(GenerationFunctionInformation.class);
        when(registryInformation.getGenerationFunctionInformation()).thenReturn(generationFunctionInformation);

        GeneratedFunctionFactory<GeneratedFunction<RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation>,
                GenerationFunctionInformation> generatedFunctionFactory
                = mock(GeneratedFunctionFactory.class);

        when(generatedFunctionFactory.create(generationFunctionInformation)).thenReturn(generatedFunction);

        String expected = "";

        // Act
        FunctionRegistryBase<
                RegistryInformation<GenerationFunctionInformation>,
                GeneratedInvocation,
                GenerationFunctionInformation> functionRegistry = new FunctionRegistryBase<>(
                generatedFunctionFactory
        );

        functionRegistry.register(registryInformation);
        functionRegistry.register(registryInformation);

        String actual = functionRegistry.generate(registryInformation);

        // Assert
        assertEquals(expected, actual);
    }
}
