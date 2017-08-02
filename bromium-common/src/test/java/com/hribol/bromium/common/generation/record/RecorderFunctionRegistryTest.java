package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.functions.RecorderFunction;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class RecorderFunctionRegistryTest {

    @Test
    public void addsFunctionDeclarationCodeIfFunctionIsNotRegistered() {
        // Arrange
        String functionDefinition = "function something(a, b){}";
        String functionInvocation = "something(2, 5)";
        RecorderFunctionInvocation recorderFunctionInvocation = mock(RecorderFunctionInvocation.class);
        when(recorderFunctionInvocation.getJavascriptCode()).thenReturn(functionInvocation);

        RecorderFunction recorderFunction = mock(RecorderFunction.class);
        when(recorderFunction.getJavascriptCode()).thenReturn(functionDefinition);

        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        NameWebDriverActionConfiguration generationInformation = mock(NameWebDriverActionConfiguration.class);
        when(generationInformation.getGenerationFunctionInformation()).thenReturn(webDriverActionConfiguration);

        BaseRecorderFunctionFactory baseReplayFunctionFactory = mock(BaseRecorderFunctionFactory.class);
        when(baseReplayFunctionFactory.create(webDriverActionConfiguration)).thenReturn(recorderFunction);
        when(recorderFunction.getInvocation(generationInformation)).thenReturn(recorderFunctionInvocation);

        String expected = functionDefinition + functionInvocation;
        // Act
        RecorderFunctionRegistry replayTypeRegistry = new RecorderFunctionRegistry(baseReplayFunctionFactory);
        String generatedString = replayTypeRegistry.generate(generationInformation);

        // Assert
        assertEquals(expected, generatedString);
    }
}
