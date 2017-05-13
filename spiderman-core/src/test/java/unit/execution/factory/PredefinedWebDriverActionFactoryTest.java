package unit.execution.factory;

import com.hribol.spiderman.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class PredefinedWebDriverActionFactoryTest {

    @Test
    public void canCreateClickByText() {
        String baseURL = "http://something.com";
        WebDriverActionFactory factory = new PredefinedWebDriverActionFactory(baseURL);

        Map<String, String> map = new HashMap<>();

        map.put("initialCollectorClass", "mega-menu-click");
        map.put("text", "ATP");
        map.put("event", "clickMegaMenu");

        WebDriverAction webDriverAction = factory.create("CLICK_CLASS_BY_TEXT", map, true);

        assertEquals("clickMegaMenu", webDriverAction.getName());
    }
}
