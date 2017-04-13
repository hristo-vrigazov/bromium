package edu.hvrigazov.automation.actions;

import edu.hvrigazov.automation.execution.webdriver.WebdriverAction;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class ClickClassByText implements WebdriverAction {

    private final String initialCollectorClass;
    private final String text;
    private final String eventName;
    private final boolean expectsHttpRequest;

    public ClickClassByText(String initialCollectorClass, String text, String eventName, boolean expectsHttpRequest) {
        this.initialCollectorClass = initialCollectorClass;
        this.text = text;
        this.eventName = eventName;
        this.expectsHttpRequest = expectsHttpRequest;
    }

    @Override
    public void execute(WebDriver driver) {
        By elementsLocator = By.className(initialCollectorClass);
        List<WebElement> webElements = driver.findElements(elementsLocator);

        if (webElements.isEmpty()) {
            throw new ElementNotSelectableException("Element with class "
                    + initialCollectorClass
                    + " and text " + text + " was not found" );
        }

        Optional<WebElement> webElementOptional = webElements.stream()
                .filter(webElement ->
                        webElement.getAttribute("innerHTML").trim().equals(text) &&
                        webElement.isDisplayed())
                .findFirst();

        if (!webElementOptional.isPresent()) {
            throw new ElementNotSelectableException("Element with class "
                    + initialCollectorClass
                    + " and text " + text + " was not found" );
        }

        webElementOptional.get().click();
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
