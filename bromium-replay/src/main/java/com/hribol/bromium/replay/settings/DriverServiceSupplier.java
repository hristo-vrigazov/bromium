package com.hribol.bromium.replay.settings;

import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 29.07.17.
 */
public interface DriverServiceSupplier<T extends DriverService> {
    T getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException;
}
