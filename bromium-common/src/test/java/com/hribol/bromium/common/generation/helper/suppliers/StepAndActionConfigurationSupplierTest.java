package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 03.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StepAndActionConfiguration.class)
public class StepAndActionConfigurationSupplierTest {

    @Test
    public void createsStepAndActionConfiguration() throws Exception {
        StepAndActionConfiguration expected = mock(StepAndActionConfiguration.class);
        Map<String, String> testCaseStep = new HashMap<>();
        int i = 0;
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);

        PowerMockito.whenNew(StepAndActionConfiguration.class)
                .withArguments(testCaseStep, i, applicationActionConfiguration)
                .thenReturn(expected);

        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier = new
                StepAndActionConfigurationSupplier();

        StepAndActionConfiguration actual = stepAndActionConfigurationSupplier.get(testCaseStep, i, applicationActionConfiguration);
    }
}
