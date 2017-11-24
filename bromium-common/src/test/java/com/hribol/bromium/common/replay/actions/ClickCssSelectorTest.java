package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.replay.ReplayingState;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 07.05.17.
 */
public class ClickCssSelectorTest {

    @Test
    public void canClickIfThereAreSuitableElements() throws Exception {
        WebElement webElement = mock(WebElement.class);
        String cssSelector = ".test-element";
        String eventName = "CLICK_SOMETHING";
        boolean expectsHttpRequest = false;

        By elementLocator = By.cssSelector(cssSelector);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElement(elementLocator)).thenReturn(webElement);

        ClickCssSelector action = new ClickCssSelector(cssSelector, eventName, expectsHttpRequest);

        action.executeAfterJSPreconditionHasBeenSatisfied(webDriver, mock(ReplayingState.class));

        verify(webElement).click();
        assertEquals(eventName, action.getName());
        assertEquals(expectsHttpRequest, action.expectsHttpRequest());
        assertEquals(CLICK_CSS_SELECTOR + " " + cssSelector, action.getJSEventToWaitFor());
    }
}
