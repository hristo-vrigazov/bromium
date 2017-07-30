package com.hribol.bromium.browsers.chrome.base;

import com.hribol.bromium.core.suppliers.WebDriverSupplier;
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
        WebDriverSupplier.class,
        ChromeDriverSupplier.class})
public class InvisibleChromeDriverSupplierTest {

    @Test
    public void createsNonNullInstance() throws Exception {
        ChromeDriver chromeDriver = mock(ChromeDriver.class);
        ChromeDriverService chromeDriverService = mock(ChromeDriverService.class);
        DesiredCapabilities desiredCapabilities = mock(DesiredCapabilities.class);
        whenNew(ChromeDriver.class).withArguments(chromeDriverService, desiredCapabilities).thenReturn(chromeDriver);
        WebDriverSupplier<ChromeDriverService> webDriverSupplier = new ChromeDriverSupplier();
        WebDriver driver = webDriverSupplier.get(chromeDriverService, desiredCapabilities);
        assertNotNull(driver);
    }
}
