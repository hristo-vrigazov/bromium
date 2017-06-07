package com.hribol.bromium.core.suppliers;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.Proxy;

import java.util.function.Supplier;

/**
 * Supplies as an instance of {@link Proxy} by a given {@link BrowserMobProxy}
 */
public class SeleniumProxySupplier implements Supplier<Proxy> {

    private BrowserMobProxy browserMobProxy;

    public SeleniumProxySupplier(BrowserMobProxy browserMobProxy) {
        this.browserMobProxy = browserMobProxy;
    }

    @Override
    public Proxy get() {
        return ClientUtil.createSeleniumProxy(browserMobProxy);
    }
}
