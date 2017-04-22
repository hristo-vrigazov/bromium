package execution.webdriver;

import com.hribol.automation.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.automation.core.actions.WebDriverAction;
import com.hribol.automation.core.execution.factory.WebDriverActionFactory;
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
        WebDriverActionFactory factory = new PredefinedWebDriverActionFactory();

        Map<String, Object> map = new HashMap<>();

        map.put("initialCollectorClass", "mega-menu-click");
        map.put("text", "ATP");
        map.put("event", "clickMegaMenu");
        map.put("expectsHttp", true);

        WebDriverAction webDriverAction = factory.create("CLICK_CLASS_BY_TEXT", map);

        assertEquals("clickMegaMenu", webDriverAction.getName());
    }
}
