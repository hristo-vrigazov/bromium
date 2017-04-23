package com.hribol.automation.core.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;

import static com.hribol.automation.core.utils.Constants.INNER_HTML;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class ClickClassByText implements WebDriverAction {

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

        Optional<WebElement> webElementOptional = webElements.stream()
                .filter(this::elementContainsTextAndIsDisplayed)
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

    private boolean elementContainsTextAndIsDisplayed(WebElement webElement) {
        boolean textIsCorrect = webElement.getAttribute(INNER_HTML).trim().equals(text);
        boolean elementIsDisplayed = webElement.isDisplayed();
        return textIsCorrect && elementIsDisplayed;
    }
}
