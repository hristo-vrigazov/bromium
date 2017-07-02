package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class StepsAndConfigurationTest {

    @Test
    public void canPackage() {
        List<Map<String, String>> steps = new ArrayList<>();
        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);

        StepsAndConfiguration stepsAndConfiguration = new StepsAndConfiguration(steps, applicationConfiguration);

        assertEquals(steps, stepsAndConfiguration.getTestCaseSteps());
        assertEquals(applicationConfiguration, stepsAndConfiguration.getApplicationConfiguration());
    }
}
