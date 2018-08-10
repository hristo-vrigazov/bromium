package com.hribol.bromium.common.replay.factory;

import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests whether a {@link com.hribol.bromium.replay.execution.factory.WebDriverActionFactoryBase} can
 * be created, extending predefined actions
 */
public class WebDriverActionFactoryBaseTest {

    @Test
    public void canBeExtended() {
        WebDriverAction expectedAction = mock(WebDriverAction.class);

        boolean expectsHttp = true;
        int step = 0;

        Map<String, String> parameters = new HashMap<>();
        parameters.put("event", "something");
        parameters.put("parameter", "parametervalue");

        WebDriverActionParameterParser parser = mock(WebDriverActionParameterParser.class);
        when(parser.create(eq(parameters), eq(step), eq(expectsHttp), any())).thenReturn(expectedAction);

        String webDriverActionType = "SOME_ACTION_TYPE";

        String baseURL = "http://something.com";
        WebDriverActionFactoryBase webDriverActionFactoryBase = new WebDriverActionFactoryBase(baseURL) {
            @Override
            protected void addCustom() {
                add(webDriverActionType, parser);
            }
        };

        webDriverActionFactoryBase.addActions();

        WebDriverAction actualAction = webDriverActionFactoryBase.create(webDriverActionType, parameters, step, expectsHttp);
        assertEquals(expectedAction, actualAction);
    }
}
