package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.replay.PredefinedReplayFunctionFactory;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import java.util.function.Supplier;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class PredefinedRecorderFunctionFactoryTest {

    @Test
    public void canCreateClickByCssSelector() {
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(webDriverActionConfiguration.getKey()).thenReturn(CLICK_CSS_SELECTOR);

        JsCollector jsCollector = mock(JsCollector.class, RETURNS_MOCKS);
        PredefinedRecorderFunctionFactory factory = new PredefinedRecorderFunctionFactory(mock(Supplier.class), jsCollector);

        assertNotNull(factory.create(webDriverActionConfiguration));
    }

}
