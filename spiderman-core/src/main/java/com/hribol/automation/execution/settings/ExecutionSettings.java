package com.hribol.automation.execution.settings;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public interface ExecutionSettings {
    BrowserMobProxy getBrowserMobProxy(int timeout);

    DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException;

    Proxy getSeleniumProxy();

    DesiredCapabilities getDesiredCapabilities();

    WebDriver buildWebDriver(boolean useVirtualScreen);

    WebDriver buildWebDriverHeadless();

    WebDriver buildWebDriverVisible();

    void cleanUpReplay();

    void cleanUpRecord();

    WebDriver getWebDriver();

    Har getHar();

    void initializeProxyFilters();

    void initReplay(String pathToChromeDriver, String screenToUse, int timeout, boolean useVirtualScreen) throws IOException;

    void initRecord(int timeout) throws IOException;

    void openBaseUrl();
}
