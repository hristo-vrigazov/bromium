package com.hribol.spiderman.replay.actions;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import com.hribol.spiderman.replay.actions.ClickCssSelector;
import com.hribol.spiderman.replay.actions.WebDriverAction;
import com.hribol.spiderman.replay.filters.ReplayRequestFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 07.05.17.
 */
public class ClickCssSelectorTest {

    @Test
    public void canClickIfThereAreSuitableElements() throws InterruptedException {
        WebElement webElement = mock(WebElement.class);
        String cssSelector = ".test-element";
        String eventName = "CLICK_SOMETHING";
        boolean expectsHttpRequest = false;

        By elementLocator = By.cssSelector(cssSelector);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElement(elementLocator)).thenReturn(webElement);

        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        ReplayFiltersFacade facade = mock(ReplayFiltersFacade.class);
        when(facade.getRequestFilter()).thenReturn(replayRequestFilter);

        WebDriverAction action = new ClickCssSelector(cssSelector, eventName, expectsHttpRequest);

        Thread notifiedThread = new Thread(() -> {
            synchronized (replayRequestFilter) {
                replayRequestFilter.notify();
            }
        });

        Thread actionThread = new Thread(() -> {
            action.execute(webDriver, facade);
            verify(webElement).click();
            assertEquals(eventName, action.getName());
            assertEquals(expectsHttpRequest, action.expectsHttpRequest());
        });

        actionThread.start();
        notifiedThread.start();

//        actionThread.join();
//        notifiedThread.join();
    }
}
