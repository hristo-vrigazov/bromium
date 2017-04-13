package edu.hvrigazov.automation.actions;

import edu.hvrigazov.automation.execution.webdriver.WebdriverAction;
import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class PageLoading implements WebdriverAction {

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
