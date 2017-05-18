package com.hribol.spiderman.replay.config.suppliers;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.proxy.CaptureType;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * A class which is responsible to supply a {@link BrowserMobProxy} by given
 * {@link RequestFilter}, {@link ResponseFilter} and {@link #timeout}
 */
public class BrowserMobProxySupplier implements Supplier<BrowserMobProxy> {
    private int timeout;
    private RequestFilter requestFilter;
    private ResponseFilter responseFilter;

    public BrowserMobProxySupplier(int timeout, RequestFilter requestFilter, ResponseFilter responseFilter) {
        this.timeout = timeout;
        this.requestFilter = requestFilter;
        this.responseFilter = responseFilter;
    }

    @Override
    public BrowserMobProxy get() {
        BrowserMobProxyServer proxy = new BrowserMobProxyServer();
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        proxy.newHar("measurements");
        proxy.addRequestFilter(requestFilter);
        proxy.addResponseFilter(responseFilter);
        proxy.setIdleConnectionTimeout(timeout, TimeUnit.SECONDS);
        proxy.setRequestTimeout(timeout, TimeUnit.SECONDS);
        return proxy;
    }
}
