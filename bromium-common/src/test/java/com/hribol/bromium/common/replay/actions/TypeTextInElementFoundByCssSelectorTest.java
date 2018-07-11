package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
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
        String eventName = "TypeTextInElementFoundByCssSelector .something text";
        boolean expectsHttp = true;

        WebElement textBox = mock(WebElement.class);
        WebDriver driver = mock(WebDriver.class);
        when(driver.findElement(By.cssSelector(cssSelector))).thenReturn(textBox);

        WebDriverAction action = new TypeTextInElementFoundByCssSelector(cssSelector, text, expectsHttp);
        action.execute(driver, mock(ReplayingState.class), mock(EventSynchronizer.class));

        verify(textBox).sendKeys(text);
        assertEquals(eventName, action.getName());
        assertEquals(expectsHttp, action.expectsHttpRequest());
    }
}
