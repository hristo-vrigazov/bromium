package execution.settings;

import com.google.common.collect.ImmutableMap;
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

    public ChromeDriverExecutionSettings(String baseURI, RequestFilter requestFilter, ResponseFilter responseFilter) {
        super(baseURI, requestFilter, responseFilter);
    }

    @Override
    public void initializeDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
        this.driverService = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(pathToDriverExecutable))
                .usingAnyFreePort().withEnvironment(ImmutableMap.of("DISPLAY", screenToUse)).build();
    }

    @Override
    public void initializeWebDriverHeadless() {
        this.driver = new ChromeDriver((ChromeDriverService) driverService, capabilities);
    }

    @Override
    public void initializeWebDriver() {
        this.driver = new ChromeDriver(capabilities);
    }


}
