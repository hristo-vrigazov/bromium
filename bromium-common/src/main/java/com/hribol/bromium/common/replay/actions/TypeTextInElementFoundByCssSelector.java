package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;


/**
 * Types text in an element found by a css selector. Clears the field first.
 */
public class TypeTextInElementFoundByCssSelector extends ActionWithJSPreconditionBase {

    private String cssSelector;
    private String text;
    private boolean expectsHttpRequest;

    public TypeTextInElementFoundByCssSelector(String cssSelector, String text, boolean expectsHttpRequest, SearchContextFunction contextProvider) {
        super(contextProvider);
        this.cssSelector = cssSelector;
        this.text = text;
        this.expectsHttpRequest = expectsHttpRequest;
    }

    @Override
    public boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1} {2}", TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR, cssSelector, text);
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<SearchContext, SearchContext> contextProvider) {
        WebElement element = contextProvider.apply(driver).findElement(By.cssSelector(cssSelector));
        element.clear();
        element.sendKeys(text);
    }
}
