package com.hribol.bromium.common.replay;

import com.hribol.bromium.core.suppliers.*;
import com.hribol.bromium.replay.settings.ReplayManager;
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
public abstract class ReplayManagerBase<T extends DriverService> implements ReplayManager<T> {
    private BrowserMobProxy proxy;
    private Proxy seleniumProxy;
    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;
    private InvisibleWebDriverSupplier<T> invisibleWebDriverSupplier;
    private int timeout;
    private String screenToUse;

    private WebDriver driver;
    private T driverService;
    private DesiredCapabilities capabilities;

    public ReplayManagerBase(RequestFilter requestFilter,
                             ResponseFilter responseFilter,
                             InvisibleWebDriverSupplier<T> invisibleWebDriverSupplier,
                             int timeout,
                             String screenToUse) {
        this.requestFilter = requestFilter;
        this.responseFilter = responseFilter;
        this.invisibleWebDriverSupplier = invisibleWebDriverSupplier;
        this.timeout = timeout;
        this.screenToUse = screenToUse;
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
    public void prepareReplay(String pathToDriver)
            throws IOException {
        this.proxy = new BrowserMobProxySupplier(timeout, requestFilter, responseFilter).get();
        this.proxy.start(0);
        this.seleniumProxy = new SeleniumProxySupplier(proxy).get();
        this.capabilities = new DesiredCapabilitiesSupplier(seleniumProxy).get();
        this.driverService = getDriverService(pathToDriver, screenToUse);
        this.driver = invisibleWebDriverSupplier.get(driverService, capabilities);
        this.driver.manage().window().maximize();
    }

}
