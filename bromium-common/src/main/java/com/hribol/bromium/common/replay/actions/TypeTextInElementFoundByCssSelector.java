package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by hvrigazov on 12.05.17.
 */
public class TypeTextInElementFoundByCssSelector implements WebDriverAction {

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
    public void execute(WebDriver driver, ReplayingState state) {
        By locator = By.cssSelector(cssSelector);
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
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
