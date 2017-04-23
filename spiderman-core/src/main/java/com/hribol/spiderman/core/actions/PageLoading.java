package com.hribol.spiderman.core.actions;

import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class PageLoading implements WebDriverAction {

    private String url;
    private String eventName;

    public PageLoading(String url, String eventName) {
        this.url = url;
        this.eventName = eventName;
    }

    @Override
    public void execute(WebDriver driver) {
        driver.get(url);
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
