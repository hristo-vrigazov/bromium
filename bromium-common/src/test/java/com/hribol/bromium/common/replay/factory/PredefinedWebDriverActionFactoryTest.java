package com.hribol.bromium.common.replay.factory;

import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;
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
