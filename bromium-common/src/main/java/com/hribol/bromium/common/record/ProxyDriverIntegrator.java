package com.hribol.bromium.common.record;

import com.hribol.bromium.record.RecordRequestFilter;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;

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

    public ProxyDriverIntegrator(RecordRequestFilter requestFilter, BrowserMobProxy proxy, WebDriver driver) {
        this.requestFilter = requestFilter;
        this.proxy = proxy;
        this.driver = driver;
    }
}
