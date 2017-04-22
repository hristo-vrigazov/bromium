package com.hribol.automation.core.suppliers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Created by hvrigazov on 22.04.17.
 */
public interface InvisibleWebDriverSupplier<T extends DriverService> {
    WebDriver get(T driverService, DesiredCapabilities desiredCapabilities);
}
