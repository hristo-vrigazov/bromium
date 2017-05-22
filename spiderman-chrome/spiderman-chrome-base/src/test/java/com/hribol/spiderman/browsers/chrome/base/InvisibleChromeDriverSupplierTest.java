package com.hribol.spiderman.browsers.chrome.base;

import com.hribol.spiderman.replay.config.suppliers.InvisibleWebDriverSupplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 08.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ChromeDriver.class,
        DriverService.class,
        ChromeDriverService.class,
        DesiredCapabilities.class,
        InvisibleWebDriverSupplier.class,
        InvisibleChromeDriverSupplier.class})
public class InvisibleChromeDriverSupplierTest {

    @Test
    public void createsNonNullInstance() throws Exception {
        ChromeDriver chromeDriver = mock(ChromeDriver.class);
        ChromeDriverService chromeDriverService = mock(ChromeDriverService.class);
        DesiredCapabilities desiredCapabilities = mock(DesiredCapabilities.class);
        whenNew(ChromeDriver.class).withArguments(chromeDriverService, desiredCapabilities).thenReturn(chromeDriver);
        InvisibleWebDriverSupplier<ChromeDriverService> invisibleWebDriverSupplier = new InvisibleChromeDriverSupplier();
        WebDriver driver = invisibleWebDriverSupplier.get(chromeDriverService, desiredCapabilities);
        assertNotNull(driver);
    }
}
