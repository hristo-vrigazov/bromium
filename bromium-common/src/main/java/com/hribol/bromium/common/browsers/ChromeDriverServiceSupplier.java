package com.hribol.bromium.common.browsers;

import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Supplies a chrome driver service
 */
public class ChromeDriverServiceSupplier extends DriverServiceSupplierBase {
    @Override
    protected DriverService.Builder getBuilder() {
        return new ChromeDriverService.Builder();
    }
}
