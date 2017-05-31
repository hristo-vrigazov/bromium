package com.hribol.bromium.replay.actions;

import com.hribol.bromium.replay.filters.ReplayFiltersFacade;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 13.05.17.
 */
public class TypeTextInElementFoundByCssSelectorTest {

    @Test
    public void typesIfSuitableElementExists() {
        String cssSelector = ".something";
        String text = "text";
        String eventName = "event name";
        boolean expectsHttp = true;

        WebElement textBox = mock(WebElement.class);
        WebDriver driver = mock(WebDriver.class);
        when(driver.findElement(By.cssSelector(cssSelector))).thenReturn(textBox);

        WebDriverAction action = new TypeTextInElementFoundByCssSelector(cssSelector, text, eventName, expectsHttp);
        action.execute(driver, mock(ReplayFiltersFacade.class));

        verify(textBox).sendKeys(text);
        assertEquals(eventName, action.getName());
        assertEquals(expectsHttp, action.expectsHttpRequest());
    }
}
