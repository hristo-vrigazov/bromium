package com.hribol.spiderman.replay.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import com.hribol.spiderman.replay.filters.ReplayRequestFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static com.hribol.spiderman.replay.execution.factory.WebDriverActionFactoryBase.CLICK_CSS_SELECTOR;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 07.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ReplayRequestFilter.class,
        Object.class,
        ReplayFiltersFacade.class,
        ClickCssSelector.class
})
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

        action.executeAfterJSPreconditionHasBeenSatisfied(webDriver, mock(ReplayFiltersFacade.class));

        verify(webElement).click();
        assertEquals(eventName, action.getName());
        assertEquals(expectsHttpRequest, action.expectsHttpRequest());
        assertEquals(CLICK_CSS_SELECTOR + " " + cssSelector, action.getJSEventToWaitFor());
    }
}
