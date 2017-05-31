package com.hribol.spiderman.browsers.chrome.base;

import com.hribol.spiderman.replay.config.suppliers.VisibleWebDriverSupplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.whenNew;


/**
 * Created by hvrigazov on 26.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ChromeDriver.class,
        DesiredCapabilities.class,
        VisibleWebDriverSupplier.class,
        VisibleChromeDriverSupplier.class})
public class VisibleChromeDriverSupplierTest {

    @Test
    public void returnsNotNullDriver() throws Exception {
        DesiredCapabilities desiredCapabilities = mock(DesiredCapabilities.class);
        ChromeDriver chromeDriver = mock(ChromeDriver.class);
        whenNew(ChromeDriver.class).withArguments(desiredCapabilities).thenReturn(chromeDriver);
        VisibleWebDriverSupplier visibleWebDriverSupplier = new VisibleChromeDriverSupplier();
        assertNotNull(visibleWebDriverSupplier.get(desiredCapabilities));
    }
}
