package execution.executor;

import com.google.common.collect.ImmutableMap;
import execution.settings.ExecutionSettingsBase;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class FirefoxDriverExecutionSettings extends ExecutionSettingsBase {
    public FirefoxDriverExecutionSettings(RequestFilter requestFilter, ResponseFilter responseFilter) {
        super(requestFilter, responseFilter);
    }

    @Override
    public void initializeDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
        this.driverService = new GeckoDriverService.Builder()
                .usingDriverExecutable(new File(pathToDriverExecutable))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY", screenToUse)).build();
    }

    @Override
    public void initializeWebDriver(boolean useVirtualScreen) {
        if (useVirtualScreen) {
            this.driver = new FirefoxDriver((GeckoDriverService) driverService, capabilities);
        } else {
            this.driver = new FirefoxDriver(capabilities);
        }
    }
}
