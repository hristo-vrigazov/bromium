package com.hribol.bromium.common.browsers;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.replay.settings.DriverServiceSupplier;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;

/**
 * A base class for providing driver services for different browsers
 */
public abstract class DriverServiceSupplierBase implements DriverServiceSupplier {
    @Override
    public DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
        return getBuilder()
                .usingDriverExecutable(new File(pathToDriverExecutable))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY", screenToUse))
                .build();
    }

    protected abstract DriverService.Builder getBuilder();
}
