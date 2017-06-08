package com.hribol.bromium.record.javascript.generation.functions.factory;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class PredefinedRecorderFunctionFactoryTest {
    @Test
    public void canCreateNonNullRecorderFunctionForClickCssSelector() {
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(webDriverActionConfiguration.getWebDriverActionType()).thenReturn("CLICK_CSS_SELECTOR");
        RecorderFunctionFactory recorderFunctionFactory = new PredefinedRecorderFunctionFactory();
        assertNotNull(recorderFunctionFactory.create(webDriverActionConfiguration));
    }

}
