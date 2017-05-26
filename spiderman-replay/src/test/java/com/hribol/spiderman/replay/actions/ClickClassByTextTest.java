package com.hribol.spiderman.replay.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.hribol.spiderman.replay.config.utils.Constants.INNER_HTML;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ClickClassByTextTest {

    @Test
    public void canClickIfThereIsSuitableElement() {
        String initialCollectorClass = "mega-menu-click";
        String text = "ATP";
        String eventName = "clickMegaMenu";
        boolean expectsHttp = true;

        WebElement correctWebElement = mock(WebElement.class);
        when(correctWebElement.getAttribute(INNER_HTML)).thenReturn("  ATP ");
        when(correctWebElement.isDisplayed()).thenReturn(true);

        WebElement incorrectWebElement1 = mock(WebElement.class);
        when(incorrectWebElement1.getAttribute(INNER_HTML)).thenReturn("sometATPhing");
        when(incorrectWebElement1.isDisplayed()).thenReturn(true);

        WebElement incorrectWebElement2 = mock(WebElement.class);
        when(incorrectWebElement2.getAttribute(INNER_HTML)).thenReturn(" ATP ");
        when(incorrectWebElement2.isDisplayed()).thenReturn(false);

        WebElement incorrectWebElement3 = mock(WebElement.class);
        when(incorrectWebElement3.getAttribute(INNER_HTML)).thenReturn("sometATPhing");
        when(incorrectWebElement3.isDisplayed()).thenReturn(false);

        List<WebElement> webElements = new ArrayList<>();
        webElements.add(incorrectWebElement1);
        webElements.add(incorrectWebElement2);
        webElements.add(incorrectWebElement3);
        webElements.add(correctWebElement);

        By elementsLocator = By.className(initialCollectorClass);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElements(elementsLocator)).thenReturn(webElements);

        ClickClassByText clickClassByText = new ClickClassByText(initialCollectorClass, text, eventName, expectsHttp);
        clickClassByText.executeAfterJSPreconditionHasBeenSatisfied(webDriver, mock(ReplayFiltersFacade.class));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsExceptionIfNoElementsAreFound() {
        String initialCollectorClass = "mega-menu-click";
        String text = "ATP";
        String eventName = "clickMegaMenu";
        boolean expectsHttp = true;

        List<WebElement> webElements = new ArrayList<>();

        By elementsLocator = By.className(initialCollectorClass);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElements(elementsLocator)).thenReturn(webElements);

        ClickClassByText clickClassByText = new ClickClassByText(initialCollectorClass, text, eventName, expectsHttp);
        thrown.expect(ElementNotSelectableException.class);
        clickClassByText.executeAfterJSPreconditionHasBeenSatisfied(webDriver, mock(ReplayFiltersFacade.class));
    }

    @Test
    public void throwsExceptionIfNoSuitableElementsAreFound() {
        String initialCollectorClass = "mega-menu-click";
        String text = "ATP";
        String eventName = "clickMegaMenu";
        boolean expectsHttp = true;

        WebElement incorrectWebElement = mock(WebElement.class);
        when(incorrectWebElement.getAttribute(INNER_HTML)).thenReturn("sometATPhing");
        when(incorrectWebElement.isDisplayed()).thenReturn(true);

        List<WebElement> webElements = new ArrayList<>();
        webElements.add(incorrectWebElement);

        By elementsLocator = By.className(initialCollectorClass);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElements(elementsLocator)).thenReturn(webElements);

        ClickClassByText clickClassByText = new ClickClassByText(initialCollectorClass, text, eventName, expectsHttp);
        thrown.expect(ElementNotSelectableException.class);
        clickClassByText.executeAfterJSPreconditionHasBeenSatisfied(webDriver, mock(ReplayFiltersFacade.class));
    }
}
