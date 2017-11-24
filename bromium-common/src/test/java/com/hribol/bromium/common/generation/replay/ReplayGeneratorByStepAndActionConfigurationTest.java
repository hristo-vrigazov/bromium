package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ReplayGeneratorByStepAndActionConfigurationTest {

    @Test
    public void generatesCorrectly() {
        // Arrange
        JavascriptGenerator<StepAndWebDriverActionConfiguration> generator = mock(JavascriptGenerator.class);
        StepAndWebDriverActionConfigurationSupplier supplier = mock(StepAndWebDriverActionConfigurationSupplier.class);

        Map<String, String> testCaseStep = new HashMap<>();

        WebDriverActionConfiguration precondition = mock(WebDriverActionConfiguration.class);
        WebDriverActionConfiguration action = mock(WebDriverActionConfiguration.class);
        WebDriverActionConfiguration postcondition = mock(WebDriverActionConfiguration.class);

        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getConditionBeforeExecution()).thenReturn(precondition);
        when(applicationActionConfiguration.getWebDriverAction()).thenReturn(action);
        when(applicationActionConfiguration.getConditionAfterExecution()).thenReturn(postcondition);

        StepAndActionConfiguration stepAndActionConfiguration = mock(StepAndActionConfiguration.class);
        when(stepAndActionConfiguration.getTestCaseStep()).thenReturn(testCaseStep);
        when(stepAndActionConfiguration.getApplicationActionConfiguration()).thenReturn(applicationActionConfiguration);

        StepAndWebDriverActionConfiguration stepAndPrecondition = mock(StepAndWebDriverActionConfiguration.class);
        StepAndWebDriverActionConfiguration stepAndAction = mock(StepAndWebDriverActionConfiguration.class);
        StepAndWebDriverActionConfiguration stepAndPostcondition = mock(StepAndWebDriverActionConfiguration.class);

        when(supplier.get(testCaseStep, precondition)).thenReturn(stepAndPrecondition);
        when(supplier.get(testCaseStep, action)).thenReturn(stepAndAction);
        when(supplier.get(testCaseStep, postcondition)).thenReturn(stepAndPostcondition);

        String s1 = "s1", s2 = "s2", s3 = "s3", expected = s1 + s2 + s3;
        when(generator.generate(stepAndPrecondition)).thenReturn(s1);
        when(generator.generate(stepAndAction)).thenReturn(s2);
        when(generator.generate(stepAndPostcondition)).thenReturn(s3);

        ReplayGeneratorByStepAndActionConfiguration replayGeneratorByStepAndActionConfiguration =
                new ReplayGeneratorByStepAndActionConfiguration(generator, supplier);

        // Act
        String actual = replayGeneratorByStepAndActionConfiguration.generate(stepAndActionConfiguration);

        // Assert
        assertEquals(expected, actual);
    }
}
