package com.hribol.bromium.common.record;

import com.hribol.bromium.core.suppliers.BrowserMobProxySupplier;
import com.hribol.bromium.core.suppliers.DesiredCapabilitiesSupplier;
import com.hribol.bromium.core.suppliers.SeleniumProxySupplier;
import com.hribol.bromium.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.bromium.record.RecordRequestFilter;
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
    private final RecordRequestFilter requestFilter;

    public BrowserMobProxy getProxy() {
        return proxy;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public RecordRequestFilter getRequestFilter() {
        return requestFilter;
    }

    private BrowserMobProxy proxy;
    private WebDriver driver;

    public ProxyDriverIntegrator(RecordRequestFilter requestFilter,
                                 ResponseFilter responseFilter,
                                 VisibleWebDriverSupplier webDriverSupplier,
                                 String systemProperty,
                                 String pathToDriverExecutable,
                                 int timeout) {
        this.requestFilter = requestFilter;
        System.setProperty(systemProperty, pathToDriverExecutable);
        this.proxy = new BrowserMobProxySupplier(timeout, requestFilter, responseFilter).get();
        proxy.start(0);
        Proxy seleniumProxy = new SeleniumProxySupplier(proxy).get();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilitiesSupplier(seleniumProxy).get();
        this.driver = webDriverSupplier.get(desiredCapabilities);
    }
}
