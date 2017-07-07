package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.WebDriver;

/**
 * Action of loading a page using webdriver
 */
public class PageLoading implements WebDriverAction {

    private String url;
    private String eventName;

    public PageLoading(String url, String eventName) {
        this.url = url;
        this.eventName = eventName;
    }

    /**
     * Loads a given url through a given instance of {@link org.openqa.selenium.WebDriver}
     * @param driver the instance of driver through which the action will be executed
     */
    @Override
    public void execute(WebDriver driver, ReplayFiltersFacade facade) {
        driver.get(url);
    }

    /**
     * The name of page loding, which can be injected through the constructor
     * @return the name of the action
     */
    @Override
    public String getName() {
        return eventName;
    }

    /**
     * We DO expect an HTTP request after this action, because we are requesting
     * a URL
     * @return true
     */
    @Override
    public boolean expectsHttpRequest() {
        return true;
    }
}
