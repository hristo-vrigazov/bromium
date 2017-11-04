package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static com.hribol.bromium.common.builder.JsFunctionNames.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        TextOfElementFoundByCssSelectorToBe action = new TextOfElementFoundByCssSelectorToBe(cssSelector, text, eventName);

        String expected = TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE + " " + cssSelector + " " +text;
        String actual = action.getJSEventToWaitFor();

        assertEquals(expected, actual);
    }
}
