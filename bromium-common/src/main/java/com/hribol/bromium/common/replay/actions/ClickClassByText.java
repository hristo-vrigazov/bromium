package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

import static com.hribol.bromium.core.utils.Constants.INNER_HTML;
import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CLASS_BY_TEXT;

/**
 * Finds all elements with a given class, and then clicks on
 * the element that contains a given text and is displayed
 */
public class ClickClassByText extends ActionWithJSPreconditionBase {

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
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade) {
        By elementsLocator = By.className(initialCollectorClass);
        List<WebElement> webElements = driver.findElements(elementsLocator);

        Optional<WebElement> webElementOptional = webElements.stream()
                .filter(this::elementTextIsEqualToAndIsDisplayed)
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

    private boolean elementTextIsEqualToAndIsDisplayed(WebElement webElement) {
        boolean textIsCorrect = webElement.getAttribute(INNER_HTML).trim().equals(text);
        boolean elementIsDisplayed = webElement.isDisplayed();
        return textIsCorrect && elementIsDisplayed;
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} .{1} {2}", CLICK_CLASS_BY_TEXT, initialCollectorClass, text);
    }
}
