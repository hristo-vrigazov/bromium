package actions;

import com.hribol.spiderman.replay.filters.ProxyFacade;
import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import core.actions.ClickCssSelector;
import core.actions.WebDriverAction;
import org.junit.Test;
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
    public void canClickIfThereAreSuitableElements() {
        WebElement webElement = mock(WebElement.class);
        String cssSelector = ".test-element";
        String eventName = "CLICK_SOMETHING";
        boolean expectsHttpRequest = false;

        By elementLocator = By.cssSelector(cssSelector);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.findElement(elementLocator)).thenReturn(webElement);

        WebDriverAction action = new ClickCssSelector(cssSelector, eventName, expectsHttpRequest);
        action.execute(webDriver, mock(ReplayFiltersFacade.class));

        verify(webElement).click();
        assertEquals(eventName, action.getName());
        assertEquals(expectsHttpRequest, action.expectsHttpRequest());
    }
}
