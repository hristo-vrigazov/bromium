package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.NameWebDriverActionConfigurationSupplier;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class RecordingWebDriverActionsOnlyTest {

    @Test
    public void generatesBasedOnNameAndWebDriverAction() {
        String expected = "expected";
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        String eventName = "something";
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getName()).thenReturn(eventName);
        when(applicationActionConfiguration.getWebDriverAction()).thenReturn(webDriverActionConfiguration);
        NameWebDriverActionConfiguration nameWebDriverActionConfiguration = mock(NameWebDriverActionConfiguration.class);
        JavascriptGenerator<NameWebDriverActionConfiguration> webDriverActionGenerator = mock(JavascriptGenerator.class);
        when(webDriverActionGenerator.generate(nameWebDriverActionConfiguration)).thenReturn(expected);
        NameWebDriverActionConfigurationSupplier nameWebDriverActionConfigurationSupplier = mock(NameWebDriverActionConfigurationSupplier.class);
        when(nameWebDriverActionConfigurationSupplier.get(eventName, webDriverActionConfiguration)).thenReturn(nameWebDriverActionConfiguration);

        RecordingWebDriverActionsOnly recordingWebDriverActionsOnly =
                new RecordingWebDriverActionsOnly(webDriverActionGenerator, nameWebDriverActionConfigurationSupplier);


        String actual = recordingWebDriverActionsOnly.generate(applicationActionConfiguration);

        assertEquals(expected, actual);
    }

}
