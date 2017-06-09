package com.hribol.bromium.common.record.settings;

import net.lightbody.bmp.BrowserMobProxy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordManagerTest {

    @Test
    public void driverIsMaximizedAndCleansUp() {
        String baseURI = "http://tenniskafe.com";
        WebDriver.Window window = mock(WebDriver.Window.class);
        WebDriver.Options options = mock(WebDriver.Options.class);
        when(options.window()).thenReturn(window);
        WebDriver driver = spy(WebDriver.class);
        when(driver.manage()).thenReturn(options);
        BrowserMobProxy proxy = spy(BrowserMobProxy.class);

        RecordManager recordManager = new RecordManager(driver, proxy);
        recordManager.prepareRecord();
        recordManager.open(baseURI);
        recordManager.cleanUpRecord();

        verify(driver).quit();
        verify(proxy).stop();
        verify(window).maximize();
        verify(driver).get(baseURI);
    }

}
