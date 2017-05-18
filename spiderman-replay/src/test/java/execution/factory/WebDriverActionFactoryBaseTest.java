package execution.factory;

import core.actions.WebDriverAction;
import core.execution.factory.WebDriverActionFactoryBase;
import core.parsers.WebDriverActionParameterParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests whether a {@link core.execution.factory.WebDriverActionFactoryBase} can
 * be created, extending predefined actions
 */
public class WebDriverActionFactoryBaseTest {

    @Test
    public void canBeExtended() {
        WebDriverAction expectedAction = mock(WebDriverAction.class);

        boolean expectsHttp = true;
        Map<String, String> parameters = new HashMap<>();
        parameters.put("event", "something");
        parameters.put("parameter", "parametervalue");

        WebDriverActionParameterParser parser = mock(WebDriverActionParameterParser.class);
        when(parser.create(parameters, expectsHttp)).thenReturn(expectedAction);

        String webDriverActionType = "SOME_ACTION_TYPE";

        String baseURL = "http://something.com";
        WebDriverActionFactoryBase webDriverActionFactoryBase = new WebDriverActionFactoryBase(baseURL) {
            @Override
            protected void addCustom() {
                add(webDriverActionType, parser);
            }
        };

        WebDriverAction actualAction = webDriverActionFactoryBase.create(webDriverActionType, parameters, expectsHttp);
        assertEquals(expectedAction, actualAction);
    }
}
