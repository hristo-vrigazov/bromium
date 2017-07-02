package com.hribol.bromium.common.generation.helper;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class NameWebDriverActionConfigurationTest {

    @Test
    public void packagesNameAndActionConfiguration() {
        String name = "name";
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);

        NameWebDriverActionConfiguration nameWebDriverActionConfiguration = new NameWebDriverActionConfiguration(name,
                webDriverActionConfiguration);

        assertEquals(name, nameWebDriverActionConfiguration.getEventName());
        assertEquals(webDriverActionConfiguration, nameWebDriverActionConfiguration.getWebDriverActionConfiguration());
        assertEquals(webDriverActionConfiguration, nameWebDriverActionConfiguration.getGenerationFunctionInformation());

    }

}
