package com.hribol.bromium.common;

import net.lightbody.bmp.BrowserMobProxy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 30.07.17.
 */
public class ProxyDriverIntegratorTest {

    @Test
    public void providesAccessToConnectedDriverProxyAndDriverService() {
        WebDriver driver = mock(WebDriver.class);
        BrowserMobProxy proxy = mock(BrowserMobProxy.class);
        DriverService driverService = mock(DriverService.class);

        ProxyDriverIntegrator proxyDriverIntegrator = new ProxyDriverIntegrator(driver, proxy, driverService);

        assertEquals(driver, proxyDriverIntegrator.getWebDriver());
        assertEquals(proxy, proxyDriverIntegrator.getProxy());
        assertEquals(driverService, proxyDriverIntegrator.getDriverService());
    }

}
