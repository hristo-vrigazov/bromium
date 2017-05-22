package com.hribol.spiderman.record.settings;

import com.hribol.spiderman.replay.config.suppliers.BrowserMobProxySupplier;
import com.hribol.spiderman.replay.config.suppliers.DesiredCapabilitiesSupplier;
import com.hribol.spiderman.replay.config.suppliers.SeleniumProxySupplier;
import com.hribol.spiderman.replay.config.suppliers.VisibleWebDriverSupplier;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class ProxyDriverIntegrator {
    public BrowserMobProxy getProxy() {
        return proxy;
    }

    public WebDriver getDriver() {
        return driver;
    }

    private BrowserMobProxy proxy;
    private WebDriver driver;

    public ProxyDriverIntegrator(RequestFilter requestFilter,
                                 ResponseFilter responseFilter,
                                 VisibleWebDriverSupplier webDriverSupplier,
                                 int timeout) {
        this.proxy = new BrowserMobProxySupplier(timeout, requestFilter, responseFilter).get();
        proxy.start(0);
        Proxy seleniumProxy = new SeleniumProxySupplier(proxy).get();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilitiesSupplier(seleniumProxy).get();
        this.driver = webDriverSupplier.get(desiredCapabilities);
    }
}
