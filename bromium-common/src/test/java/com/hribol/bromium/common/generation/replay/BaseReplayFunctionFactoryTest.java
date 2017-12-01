package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;
import org.junit.Test;

import java.util.function.Supplier;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class BaseReplayFunctionFactoryTest {

    @Test
    public void canCreateClickByCssSelector() {
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(webDriverActionConfiguration.getKey()).thenReturn(CLICK_CSS_SELECTOR);

        JsCollector jsCollector = mock(JsCollector.class, RETURNS_MOCKS);

        BaseReplayFunctionFactory baseReplayFunctionFactory = new BaseReplayFunctionFactory(
                mock(Supplier.class),
                jsCollector) {
            @Override
            protected void addCustom() {

            }
        };

        assertNotNull(baseReplayFunctionFactory.create(webDriverActionConfiguration));
    }

    @Test
    public void canAddCustom() {
        final String MOCK_ACTION = "MOCK_ACTION";

        GeneratedFunction expected = mock(GeneratedFunction.class);
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(webDriverActionConfiguration.getKey()).thenReturn(MOCK_ACTION);

        JsCollector jsCollector = mock(JsCollector.class, RETURNS_MOCKS);
        BaseReplayFunctionFactory baseReplayFunctionFactory = new BaseReplayFunctionFactory(mock(Supplier.class),
                jsCollector) {
            @Override
            protected void addCustom() {
                add(MOCK_ACTION, expected);
            }
        };

        GeneratedFunction actual = baseReplayFunctionFactory.create(webDriverActionConfiguration);

        assertEquals(expected, actual);
    }
}
