package com.hribol.bromium.common.browsers;

import com.hribol.bromium.core.suppliers.WebDriverSupplier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ChromeDriverSupplier implements WebDriverSupplier<ChromeDriverService> {
    @Override
    public WebDriver get(ChromeDriverService driverService, DesiredCapabilities desiredCapabilities) {
        return new ChromeDriver(driverService, desiredCapabilities);
    }
}
