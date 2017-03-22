package execution.settings;

import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public interface ExecutionSettings {
    void initializeProxyServer(int timeout);

    void initializeDriverService(String pathToDriverExecutable, String screenToUse) throws IOException;

    void initializeSeleniumProxy();

    void initializeDesiredCapabilities();

    void initializeWebDriver(boolean useVirtualScreen);

    void initializeWebDriverHeadless();

    void initializeWebDriver();

    void cleanUpReplay();

    void cleanUpRecord();

    WebDriver getWebDriver();

    Har getHar();

    void initializeProxyFilters();

    void initReplay(String pathToChromeDriver, String screenToUse, int timeout, boolean useVirtualScreen) throws IOException;

    void initRecord(int timeout) throws IOException;

    void openBaseUrl();
}
