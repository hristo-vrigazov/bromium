package com.hribol.bromium.replay.settings;

import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

/**
 * Provides a driver service
 */
public interface DriverServiceSupplier {
    DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException;
}
