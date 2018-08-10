package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.replay.ReplayingState;
import org.junit.Test;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;
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
        WebDriver driver = mock(WebDriver.class);
        SearchContextFunction contextProvider = webDriver -> driver;
        ElementByCssToBePresent action = new ElementByCssToBePresent(cssSelector, contextProvider);
        action.executeAfterJSPreconditionHasBeenSatisfied(mock(WebDriver.class), mock(ReplayingState.class), contextProvider);

        assertEquals(ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT + " " + cssSelector, action.getJSEventToWaitFor());
    }
}
