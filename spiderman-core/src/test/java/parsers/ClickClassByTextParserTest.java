package parsers;

import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.parsers.ClickClassByTextParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class ClickClassByTextParserTest {

    @Test
    public void canParseCorrectMap() {
        Map<String, String> map = new HashMap<>();

        String initialCollectorClass = "mega-menu-click";
        String text = "ATP";
        String eventName = "clickMegaMenu";
        boolean expectsHttp = true;

        map.put("initialCollectorClass", initialCollectorClass);
        map.put("text", text);
        map.put("event", eventName);
        ClickClassByTextParser clickClassByTextParser = new ClickClassByTextParser();
        WebDriverAction webDriverAction = clickClassByTextParser.create(map, expectsHttp);

        assertEquals(eventName, webDriverAction.getName());
        assertEquals(expectsHttp, webDriverAction.expectsHttpRequest());
    }
}
