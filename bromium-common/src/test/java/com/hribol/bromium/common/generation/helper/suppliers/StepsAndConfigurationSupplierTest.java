package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 03.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StepsAndConfigurationSupplier.class)
public class StepsAndConfigurationSupplierTest {

    @Test
    public void createsCorrectInstance() throws Exception {
        List<Map<String, String>> testCaseSteps = new ArrayList<>();
        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);

        StepsAndConfiguration expected = mock(StepsAndConfiguration.class);

        PowerMockito.whenNew(StepsAndConfiguration.class)
                .withArguments(testCaseSteps, applicationConfiguration)
                .thenReturn(expected);

        StepsAndConfigurationSupplier stepsAndConfigurationSupplier =
                new StepsAndConfigurationSupplier();

        StepsAndConfiguration actual = stepsAndConfigurationSupplier.get(testCaseSteps, applicationConfiguration);

        assertEquals(expected, actual);
    }
}
