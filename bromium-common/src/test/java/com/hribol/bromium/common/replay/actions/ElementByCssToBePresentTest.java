package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.actions.WebDriverAction;
import org.junit.Test;

import static com.hribol.bromium.common.builder.JsFunctionNames.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class ElementByCssToBePresentTest {

    private String cssSelector = ".test";

    private String eventName = "eventName";

    @Test
    public void jsEventIsCorrectlyNamed() {
        ElementByCssToBePresent action = new ElementByCssToBePresent(cssSelector, eventName);

        assertEquals(ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT + " " + cssSelector, action.getJSEventToWaitFor());
    }
}
