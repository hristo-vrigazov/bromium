package com.hribol.bromium.common.browsers;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.replay.settings.DriverServiceSupplier;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 29.07.17.
 */
public class ChromeDriverServiceSupplier implements DriverServiceSupplier {
    @Override
    public DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
        return new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(pathToDriverExecutable))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY", screenToUse))
                .build();
    }
}
