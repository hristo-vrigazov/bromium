package com.hribol.spiderman.replay.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Clicks on the first element found by a css selector
 */
public class ClickCssSelector implements WebDriverAction {

    private final String cssSelector;
    private final String eventName;
    private final boolean expectsHttpRequest;
    private final Object lock;

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
    public void execute(WebDriver driver, ReplayFiltersFacade facade) {
        synchronized (lock) {
            try {
                if (!facade.setWaitingEvent(cssSelector.substring(1), lock)) {
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        By byCss = By.cssSelector(cssSelector);
        WebElement webElement = driver.findElement(byCss);
        webElement.click();

        facade.signalizeEventIsDone();
    }

    @Override
    public String getName() {
        return eventName;
    }

    @Override
    public boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }
}
