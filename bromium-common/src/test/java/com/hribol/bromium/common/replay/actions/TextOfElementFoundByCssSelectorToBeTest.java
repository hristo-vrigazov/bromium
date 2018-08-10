package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.replay.ReplayingState;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class TextOfElementFoundByCssSelectorToBeTest {

    String cssSelector = ".test";
    String text = "text";
    String eventName = "eventName";
    Integer timeout = 1;

    WebDriver driver;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void jsEventIsCorrect() {
        SearchContextFunction contextProvider = webDriver1 -> driver;
        TextOfElementFoundByCssSelectorToBe action = new TextOfElementFoundByCssSelectorToBe(cssSelector, text, contextProvider);
        action.executeAfterJSPreconditionHasBeenSatisfied(mock(WebDriver.class), mock(ReplayingState.class), contextProvider);

        String expected = TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE + " " + cssSelector + " " +text;
        String actual = action.getJSEventToWaitFor();

        assertEquals(expected, actual);
    }
}
