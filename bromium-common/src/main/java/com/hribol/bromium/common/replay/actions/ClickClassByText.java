package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.replay.ReplayingState;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CLASS_BY_TEXT;

/**
 * Finds all elements with a given class, and then clicks on
 * the element that contains a given text and is displayed
 */
public class ClickClassByText extends ActionWithJSPreconditionBase {

    private final String initialCollectorClass;
    private final String text;
    private final boolean expectsHttpRequest;

    public ClickClassByText(String initialCollectorClass,
                            String text,
                            boolean expectsHttpRequest,
                            SearchContextFunction contextProvider) {
        super(contextProvider);
        this.initialCollectorClass = initialCollectorClass;
        this.text = text;
        this.expectsHttpRequest = expectsHttpRequest;
    }

    @Override
    public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver,
                                                           ReplayingState state,
                                                           Function<SearchContext, SearchContext> contextProvider) {
        By elementsLocator = By.className(initialCollectorClass);
        List<WebElement> webElements = contextProvider.apply(driver).findElements(elementsLocator);

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
    public boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    private boolean elementTextIsEqualToAndIsDisplayed(WebElement webElement) {
        boolean textIsCorrect = webElement.getText().trim().equals(text);
        boolean elementIsDisplayed = webElement.isDisplayed();
        return textIsCorrect && elementIsDisplayed;
    }

    @Override
    public String getJSEventToWaitFor() {
        return MessageFormat.format("{0} {1} {2}", CLICK_CLASS_BY_TEXT, initialCollectorClass, text);
    }
}
