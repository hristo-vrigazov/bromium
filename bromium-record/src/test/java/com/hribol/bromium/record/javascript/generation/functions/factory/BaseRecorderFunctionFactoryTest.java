package com.hribol.bromium.record.javascript.generation.functions.factory;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.functions.RecorderFunction;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class BaseRecorderFunctionFactoryTest {

    @Test
    public void createsRecorderFunctionIsTypeIsRegistered() {
        String webDriverActionType = "ACTION_TYPE";
        RecorderFunction recorderFunction = mock(RecorderFunction.class);

        RecorderFunctionFactory recorderFunctionFactory = new BaseRecorderFunctionFactory() {
            @Override
            protected void addCustom() {
                add(webDriverActionType, recorderFunction);
            }
        };

        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(webDriverActionConfiguration.getWebDriverActionType()).thenReturn(webDriverActionType);
        recorderFunctionFactory.create(webDriverActionConfiguration);
    }
}
