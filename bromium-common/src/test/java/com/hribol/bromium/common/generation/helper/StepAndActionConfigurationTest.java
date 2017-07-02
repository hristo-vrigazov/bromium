package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class StepAndActionConfigurationTest {

    @Test
    public void canPackage() {
        Map<String, String> step = new HashMap<>();
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);

        StepAndActionConfiguration stepAndActionConfiguration = new StepAndActionConfiguration(step, applicationActionConfiguration);

        assertEquals(step, stepAndActionConfiguration.getTestCaseStep());
        assertEquals(applicationActionConfiguration, stepAndActionConfiguration.getApplicationActionConfiguration());
    }
}
