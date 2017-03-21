package execution;

import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public interface ExecutionSettings {
    void initializeProxyServer(int timeout);

    void initializeChromeDriverService(String pathToChromeDriver, String screenToUse) throws IOException;

    void initializeSeleniumProxy();

    void initializeDesiredCapabilities();

    void initializeWebDriver(boolean useVirtualScreen);

    void maximizeDriver();

    void cleanUp();

    WebDriver getWebDriver();

    Har getHar();

    void initializeHar();

    void init(String pathToChromeDriver, String screenToUse, int timeout, boolean useVirtualScreen) throws IOException;
}
