package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 03.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(NameWebDriverActionConfigurationSupplier.class)
public class NameWebDriverActionConfigurationSupplierTest {

    @Test
    public void createsNameWebDriverActionConfigurationSupplier() throws Exception {
        String name = "name";
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);

        NameWebDriverActionConfiguration expected = mock(NameWebDriverActionConfiguration.class);
        NameWebDriverActionConfigurationSupplier nameWebDriverActionConfigurationSupplier = new
                NameWebDriverActionConfigurationSupplier();

        PowerMockito.whenNew(NameWebDriverActionConfiguration.class)
                .withArguments(name, webDriverActionConfiguration)
                .thenReturn(expected);

        NameWebDriverActionConfiguration actual = nameWebDriverActionConfigurationSupplier.get(name, webDriverActionConfiguration);

        assertEquals(expected, actual);
    }

}
