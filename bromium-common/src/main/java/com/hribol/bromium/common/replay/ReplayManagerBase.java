package com.hribol.bromium.common.replay;

import com.hribol.bromium.core.suppliers.*;
import com.hribol.bromium.replay.settings.DriverServiceSupplier;
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
public class ReplayManagerBase<T extends DriverService> implements ReplayManager {
    private BrowserMobProxy proxy;
    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;
    private WebDriverSupplier<T> webDriverSupplier;
    private DriverServiceSupplier<T> driverServiceSupplier;
    private int timeout;
    private String screenToUse;

    private WebDriver driver;
    private DriverService driverService;

    public ReplayManagerBase(RequestFilter requestFilter,
                             ResponseFilter responseFilter,
                             WebDriverSupplier<T> webDriverSupplier,
                             DriverServiceSupplier<T> driverServiceSupplier,
                             int timeout,
                             String screenToUse) {
        this.requestFilter = requestFilter;
        this.responseFilter = responseFilter;
        this.webDriverSupplier = webDriverSupplier;
        this.driverServiceSupplier = driverServiceSupplier;
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
        Proxy seleniumProxy = new SeleniumProxySupplier(proxy).get();
        DesiredCapabilities capabilities = new DesiredCapabilitiesSupplier(seleniumProxy).get();
        T driverService = driverServiceSupplier.getDriverService(pathToDriver, screenToUse);
        this.driver = webDriverSupplier.get(driverService, capabilities);
        this.driverService = driverService;
        this.driver.manage().window().maximize();
    }

}
