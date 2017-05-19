package core.actions;

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

    public ClickCssSelector(String cssSelector, String eventName, boolean expectsHttpRequest) {
        this.cssSelector = cssSelector;
        this.eventName = eventName;
        this.expectsHttpRequest = expectsHttpRequest;
    }

    @Override
    public void execute(WebDriver driver, ReplayFiltersFacade facade) {
//        if (eventName.equals("clickCreatedButton")) {
//            facade.setWaitingEvent("yaba-daba-du");
//
//            while (facade.waitsForPrecondition()) {
//            }
//        }
        try {
            Thread.sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By byCss = By.cssSelector(cssSelector);
        WebElement webElement = driver.findElement(byCss);
        webElement.click();

//        if (eventName.equals("clickCreatedButton")) {
//            facade.signalizeEventIsDone();
//        }
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
