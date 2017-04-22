package com.hribol.automation.core.suppliers;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.Proxy;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 22.04.17.
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
