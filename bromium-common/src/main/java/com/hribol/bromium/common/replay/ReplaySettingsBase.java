package com.hribol.bromium.common.replay;

import com.hribol.bromium.core.suppliers.*;
import com.hribol.bromium.replay.settings.ReplaySettings;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

/**
 * Created by hvrigazov on 21.03.17.
 */
public abstract class ReplaySettingsBase<T extends DriverService> implements ReplaySettings<T> {
    private BrowserMobProxy proxy;
    private Proxy seleniumProxy;
    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;
    private InvisibleWebDriverSupplier<T> invisibleWebDriverSupplier;
    private VisibleWebDriverSupplier visibleWebDriverSupplier;
    private int timeout;

    private WebDriver driver;
    private T driverService;
    private DesiredCapabilities capabilities;

    public ReplaySettingsBase(RequestFilter requestFilter,
                              ResponseFilter responseFilter,
                              InvisibleWebDriverSupplier<T> invisibleWebDriverSupplier,
                              VisibleWebDriverSupplier visibleWebDriverSupplier,
                              int timeout) {
        this.requestFilter = requestFilter;
        this.responseFilter = responseFilter;
        this.invisibleWebDriverSupplier = invisibleWebDriverSupplier;
        this.visibleWebDriverSupplier = visibleWebDriverSupplier;
        this.timeout = timeout;
    }

    @Override
    public void cleanUpReplay() {
        driver.quit();
        proxy.stop();
        driverService.stop();
    }

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }

    @Override
    public Har getHar() {
        return proxy.getHar();
    }

    @Override
    public void prepareReplay(String pathToDriver, String screenToUse)
            throws IOException {
        boolean useVirtualScreen = !screenToUse.equals(":0");
        this.proxy = new BrowserMobProxySupplier(timeout, requestFilter, responseFilter).get();
        this.proxy.start(0);
        this.seleniumProxy = new SeleniumProxySupplier(proxy).get();
        this.capabilities = new DesiredCapabilitiesSupplier(seleniumProxy).get();
        this.driverService = getDriverService(pathToDriver, screenToUse);
        this.driver = useVirtualScreen ?
                invisibleWebDriverSupplier.get(driverService, capabilities) :
                visibleWebDriverSupplier.get(capabilities);
        this.driver.manage().window().maximize();
    }

}
