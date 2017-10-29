package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;


/**
 * Types text in an element found by a css selector. Clears the field first.
 */
public class TypeTextInElementFoundByCssSelector extends ActionWithJSPreconditionBase {

    private String cssSelector;
    private String text;
    private String eventName;
    private boolean expectsHttpRequest;

    public TypeTextInElementFoundByCssSelector(String cssSelector, String text, String eventName, boolean expectsHttpRequest) {
        this.cssSelector = cssSelector;
        this.text = text;
        this.eventName = eventName;
        this.expectsHttpRequest = expectsHttpRequest;
    }

    @Override
    public String getName() {
        return eventName;
    }

    @Override
    public boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR, cssSelector);
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {
        WebElement element = driver.findElement(By.cssSelector(cssSelector));
        element.clear();
        element.sendKeys(text);
    }
}
