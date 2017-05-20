package com.hribol.spiderman.replay.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 18.05.17.
 */
public class ElementByCssToBeClickable implements WebDriverAction {

    private final String cssSelector;
    private final String eventName;

    public ElementByCssToBeClickable(String cssSelector, String eventName) {
        this.cssSelector = cssSelector;
        this.eventName = eventName;
    }

    @Override
    public void execute(WebDriver driver, ReplayFiltersFacade facade) {

//        By by = By.cssSelector(cssSelector);
//        WebDriverWait wait = new WebDriverWait(driver, 4);
//        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    @Override
    public String getName() {
        return eventName;
    }

    @Override
    public boolean expectsHttpRequest() {
        return false;
    }
}
