package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;

/**
 * Clicks on the first element found by a css selector
 */
public class ClickCssSelector extends ActionWithJSPreconditionBase {

    private final String cssSelector;
    private final boolean expectsHttpRequest;

    public ClickCssSelector(String cssSelector, boolean expectsHttpRequest, Function<WebDriver, SearchContext> contextProvider) {
        super(contextProvider);
        this.cssSelector = cssSelector;
        this.expectsHttpRequest = expectsHttpRequest;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState state, Function<WebDriver, SearchContext> contextProvider) {
        By byCss = By.cssSelector(cssSelector);
        WebElement webElement = contextProvider.apply(driver).findElement(byCss);
        webElement.click();
    }

    @Override
    public boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1}", CLICK_CSS_SELECTOR, cssSelector);
    }
}
