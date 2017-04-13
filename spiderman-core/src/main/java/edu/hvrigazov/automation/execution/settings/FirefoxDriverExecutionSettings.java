package edu.hvrigazov.automation.execution.settings;

import com.google.common.collect.ImmutableMap;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class FirefoxDriverExecutionSettings extends ExecutionSettingsBase {

    public FirefoxDriverExecutionSettings(String baseURI, RequestFilter requestFilter, ResponseFilter responseFilter) {
        super(baseURI, requestFilter, responseFilter);
    }

    @Override
    public DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
        return new GeckoDriverService.Builder()
                .usingDriverExecutable(new File(pathToDriverExecutable))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY", screenToUse))
                .build();
    }

    @Override
    public WebDriver buildWebDriverHeadless() {
        return new FirefoxDriver((GeckoDriverService) driverService, capabilities);
    }

    @Override
    public WebDriver buildWebDriverVisible() {
        return new FirefoxDriver(capabilities);
    }

}
