package com.hribol.bromium.common.browser;

import com.hribol.bromium.common.browsers.ChromeDriverSupplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 10.10.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(ChromeDriverSupplier.class)
public class ChromeDriverSupplierTest {

    @Test
    public void callsTheCorrectConstructor() throws Exception {
        ChromeDriverService chromeDriverService = mock(ChromeDriverService.class);
        DesiredCapabilities desiredCapabilities = mock(DesiredCapabilities.class);
        ChromeDriver expected = mock(ChromeDriver.class);

        whenNew(ChromeDriver.class).withArguments(chromeDriverService, desiredCapabilities).thenReturn(expected);

        ChromeDriverSupplier chromeDriverSupplier = new ChromeDriverSupplier();
        WebDriver actual = chromeDriverSupplier.get(chromeDriverService, desiredCapabilities);

        assertEquals(expected, actual);
    }

}
