package com.hribol.bromium.replay.config.suppliers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Supplies an instance of {@link WebDriver} for run in a visible mode
 */
public interface VisibleWebDriverSupplier {
    WebDriver get(DesiredCapabilities desiredCapabilities);
}
