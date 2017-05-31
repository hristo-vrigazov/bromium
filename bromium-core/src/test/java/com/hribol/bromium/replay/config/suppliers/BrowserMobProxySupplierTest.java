package com.hribol.bromium.replay.config.suppliers;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class BrowserMobProxySupplierTest {

    @Test
    public void browserMobProxyServerIsRunningWhenSupplied() {
        int timeout = 500;
        RequestFilter requestFilter = mock(RequestFilter.class);
        ResponseFilter responseFilter = mock(ResponseFilter.class);
        BrowserMobProxySupplier supplier = new BrowserMobProxySupplier(timeout, requestFilter, responseFilter);
        BrowserMobProxy browserMobProxy = supplier.get();
        assertFalse(browserMobProxy.isStarted());
        browserMobProxy.start();
        assertTrue(browserMobProxy.isStarted());
        browserMobProxy.stop();
    }
}
