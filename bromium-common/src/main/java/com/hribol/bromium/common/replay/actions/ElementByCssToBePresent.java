package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;

import static com.hribol.bromium.core.utils.WebDriverActions.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;

/**
 * Waits until an element found by a css selector is clickable. Javascript (mutation observers) based.
 */
public class ElementByCssToBePresent extends ActionWithJSPreconditionBase {

    private final String cssSelector;

    public ElementByCssToBePresent(String cssSelector) {
        this.cssSelector = cssSelector;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {
    }

    @Override
    public boolean expectsHttpRequest() {
        return false;
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT, cssSelector);
    }

}
