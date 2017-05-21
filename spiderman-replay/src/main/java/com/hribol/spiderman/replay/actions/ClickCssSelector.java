package com.hribol.spiderman.replay.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Clicks on the first element found by a css selector
 */
public class ClickCssSelector extends ActionWithJSPreconditionBase {

    private final String cssSelector;
    private final String eventName;
    private final boolean expectsHttpRequest;

    public ClickCssSelector(String cssSelector, String eventName, boolean expectsHttpRequest, Object lock) {
        this.cssSelector = cssSelector;
        this.eventName = eventName;
        this.expectsHttpRequest = expectsHttpRequest;
        this.lock = lock;
    }

    public ClickCssSelector(String cssSelector, String eventName, boolean expectsHttpRequest) {
        this(cssSelector, eventName, expectsHttpRequest, new Object());
    }

    @Override
    protected void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade) {
        By byCss = By.cssSelector(cssSelector);
        WebElement webElement = driver.findElement(byCss);
        webElement.click();
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
        return cssSelector.substring(1);
    }
}
