package com.hribol.bromium.replay.settings;

import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

/**
 * Provides a {@link T} - driver service
 */
public interface DriverServiceSupplier<T extends DriverService> {
    T getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException;
}
