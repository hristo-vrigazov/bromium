package execution.executor;

import com.google.common.collect.ImmutableMap;
import execution.settings.ExecutionSettingsBase;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public class ChromeDriverExecutionSettings extends ExecutionSettingsBase {
    public ChromeDriverExecutionSettings(RequestFilter requestFilter, ResponseFilter responseFilter) {
        super(requestFilter, responseFilter);
    }

    @Override
    public void initializeDriverService(String pathToChromeDriver, String screenToUse) throws IOException {
        this.driverService = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(pathToChromeDriver))
                .usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY", screenToUse)).build();
        this.driverService.start();
    }

    @Override
    public void initializeWebDriver(boolean useVirtualScreen) {
        if (useVirtualScreen) {
            this.driver = new ChromeDriver((ChromeDriverService) driverService, capabilities);
        } else {
            this.driver = new ChromeDriver(capabilities);
        }
    }
}
