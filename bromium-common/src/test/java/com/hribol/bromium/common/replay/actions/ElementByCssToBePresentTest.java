package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.hribol.bromium.common.builder.JsFunctionNames.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class ElementByCssToBePresentTest {

    private String cssSelector = ".test";

    private String eventName = "eventName";

    @Test
    public void jsEventIsCorrectlyNamed() {
        ElementByCssToBePresent action = new ElementByCssToBePresent(cssSelector, eventName);
        action.executeAfterJSPreconditionHasBeenSatisfied(mock(WebDriver.class), mock(ReplayingState.class));

        assertEquals(ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT + " " + cssSelector, action.getJSEventToWaitFor());
    }
}
