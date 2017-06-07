package com.hribol.bromium.core.suppliers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Supplies an instance of {@link WebDriver} for headless run by given
 * {@link DriverService} and {@link DesiredCapabilities}
 */
public interface InvisibleWebDriverSupplier<T extends DriverService> {
    WebDriver get(T driverService, DesiredCapabilities desiredCapabilities);
}
