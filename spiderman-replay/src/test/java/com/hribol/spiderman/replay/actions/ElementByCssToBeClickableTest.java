package com.hribol.spiderman.replay.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class ElementByCssToBeClickableTest {
    String cssSelector = ".test";
    String eventName = "eventName";
    Integer timeout = 1;

    WebDriver driver;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void timesOutIfNoSuitableElements() {
        WebDriverAction webDriverAction = getActionBase(true, false);
        thrown.expect(TimeoutException.class);
        webDriverAction.execute(driver, mock(ReplayFiltersFacade.class));
    }

    @Test
    public void doesNotTimeoutIfSuitableElementIsFound() {
        WebDriverAction webDriverAction = getActionBase(true, true);
        webDriverAction.execute(driver, mock(ReplayFiltersFacade.class));
    }

    private WebDriverAction getActionBase(boolean enabled, boolean displayed) {
        WebDriverAction webDriverAction = new ElementByCssToBeClickable(cssSelector, eventName, timeout);

        WebElement webElement = mock(WebElement.class);
        when(webElement.isEnabled()).thenReturn(enabled);
        when(webElement.isDisplayed()).thenReturn(displayed);

        List<WebElement> webElements = new ArrayList<>();
        webElements.add(webElement);
        By by = By.cssSelector(cssSelector);
        driver = mock(WebDriver.class);
        when(driver.findElements(by)).thenReturn(webElements);

        return webDriverAction;
    }
}
