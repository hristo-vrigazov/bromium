package com.hribol.spiderman.core.suppliers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by hvrigazov on 22.04.17.
 */
public interface VisibleWebDriverSupplier {
    WebDriver get(DesiredCapabilities desiredCapabilities);
}
