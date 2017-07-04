package com.hribol.bromium.core.suppliers;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 04.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ApplicationConfigurationSupplier.class)
public class ApplicationConfigurationSupplierTest {

    @Test
    public void createsExpectedInstance() throws Exception {
        ApplicationConfiguration expected = mock(ApplicationConfiguration.class);
        PowerMockito.whenNew(ApplicationConfiguration.class).withNoArguments()
                .thenReturn(expected);
        ApplicationConfigurationSupplier applicationConfigurationSupplier = new ApplicationConfigurationSupplier();
        ApplicationConfiguration actual = applicationConfigurationSupplier.get();

        assertEquals(expected, actual);
    }

}
