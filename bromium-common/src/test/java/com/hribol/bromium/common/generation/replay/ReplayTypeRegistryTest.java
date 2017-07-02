package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ReplayTypeRegistryTest {

    @Test
    public void addsFunctionDeclarationCodeIfFunctionIsNotRegistered() {
        // Arrange
        String functionDefinition = "function something(a, b){}";
        String functionInvocation = "something(2, 5)";
        ReplayFunctionInvocation replayFunctionInvocation = mock(ReplayFunctionInvocation.class);
        when(replayFunctionInvocation.getJavascriptCode()).thenReturn(functionInvocation);

        ReplayFunction replayFunction = mock(ReplayFunction.class);
        when(replayFunction.getJavascriptCode()).thenReturn(functionDefinition);

        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        StepAndWebDriverActionConfiguration generationInformation = mock(StepAndWebDriverActionConfiguration.class);
        when(generationInformation.getGenerationFunctionInformation()).thenReturn(webDriverActionConfiguration);

        BaseReplayFunctionFactory baseReplayFunctionFactory = mock(BaseReplayFunctionFactory.class);
        when(baseReplayFunctionFactory.create(webDriverActionConfiguration)).thenReturn(replayFunction);
        when(replayFunction.getInvocation(generationInformation)).thenReturn(replayFunctionInvocation);

        String expected = functionDefinition + functionInvocation;
        // Act
        ReplayTypeRegistry replayTypeRegistry = new ReplayTypeRegistry(baseReplayFunctionFactory);
        String generatedString = replayTypeRegistry.generate(generationInformation);

        // Assert
        assertEquals(expected, generatedString);
    }
}
