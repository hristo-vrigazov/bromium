package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class StepAndWebDriverActionConfigurationTest {

    @Test
    public void packagesStepAndActionConfiguration() {
        Map<String, String> step = new HashMap<>();
        int index = 0;
        WebDriverActionConfiguration applicationActionConfiguration = mock(WebDriverActionConfiguration.class);

        StepAndWebDriverActionConfiguration stepAndActionConfiguration = new StepAndWebDriverActionConfiguration(step, index, applicationActionConfiguration);

        assertEquals(step, stepAndActionConfiguration.getTestCaseStep());
        assertEquals(applicationActionConfiguration, stepAndActionConfiguration.getWebDriverActionConfiguration());
        assertEquals(applicationActionConfiguration, stepAndActionConfiguration.getGenerationFunctionInformation());
    }
}
