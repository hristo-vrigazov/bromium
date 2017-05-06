package unit.execution.factory;

import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactoryBase;
import com.hribol.spiderman.core.parsers.WebDriverActionParameterParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests whether a {@link com.hribol.spiderman.core.execution.factory.WebDriverActionFactoryBase} can
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

        WebDriverActionFactoryBase webDriverActionFactoryBase = new WebDriverActionFactoryBase() {
            @Override
            protected void addCustom() {
                add(webDriverActionType, parser);
            }
        };

        WebDriverAction actualAction = webDriverActionFactoryBase.create(webDriverActionType, parameters, expectsHttp);
        assertEquals(expectedAction, actualAction);
    }
}
