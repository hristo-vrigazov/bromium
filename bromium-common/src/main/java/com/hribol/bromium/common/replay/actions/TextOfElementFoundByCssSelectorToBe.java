package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;

/**
 * Waits until the text of an element found by a css selector is equal to the given one.
 */
public class TextOfElementFoundByCssSelectorToBe extends ActionWithJSPreconditionBase {

    private final String cssSelector;
    private final String text;

    public TextOfElementFoundByCssSelectorToBe(String cssSelector, String text, Function<WebDriver, SearchContext> contextProvider) {
        super(contextProvider);
        this.cssSelector = cssSelector;
        this.text = text;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<WebDriver, SearchContext> contextProvider) {
    }

    @Override
    public boolean expectsHttpRequest() {
        return false;
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1} {2}", TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE, cssSelector, text);
    }

}
