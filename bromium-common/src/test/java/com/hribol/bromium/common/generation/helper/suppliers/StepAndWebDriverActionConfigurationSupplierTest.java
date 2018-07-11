package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 03.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StepAndWebDriverActionConfigurationSupplier.class)
public class StepAndWebDriverActionConfigurationSupplierTest {

    @Test
    public void createsTheCorrectInstance() throws Exception {
        Map<String, String> testCaseStep = new HashMap<>();
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);

        StepAndWebDriverActionConfiguration expected = mock(StepAndWebDriverActionConfiguration.class);

        int index = 0;

        PowerMockito.whenNew(StepAndWebDriverActionConfiguration.class)
                .withArguments(testCaseStep, index, webDriverActionConfiguration)
                .thenReturn(expected);

        StepAndWebDriverActionConfigurationSupplier stepAndWebDriverActionConfigurationSupplier =
                new StepAndWebDriverActionConfigurationSupplier();

        StepAndWebDriverActionConfiguration actual = stepAndWebDriverActionConfigurationSupplier.get(testCaseStep, index, webDriverActionConfiguration);

        assertEquals(expected, actual);
    }
}
