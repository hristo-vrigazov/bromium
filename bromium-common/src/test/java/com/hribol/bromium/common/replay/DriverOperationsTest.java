package com.hribol.bromium.common.replay;

import com.hribol.bromium.common.ProxyDriverIntegrator;
import net.lightbody.bmp.BrowserMobProxy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 30.07.17.
 */
public class DriverOperationsTest {

    private String baseUrl = "http://something.com";
    private WebDriver driver = mock(WebDriver.class, RETURNS_DEEP_STUBS);
    private BrowserMobProxy proxy = mock(BrowserMobProxy.class);
    private DriverService driverService = mock(DriverService.class);

    @Test
    public void prepareMaximizesTheWindow() {
        DriverOperations driverOperations = new DriverOperations(getMockedProxyDriverIntegrator());
        driverOperations.prepare();

        verify(driver.manage().window()).maximize();
    }

    @Test
    public void cleanUpQuitsEverything() {
        DriverOperations driverOperations = new DriverOperations(getMockedProxyDriverIntegrator());
        driverOperations.cleanUp();

        verify(driver).quit();
        verify(driverService).stop();
        verify(proxy).stop();
    }

    @Test
    public void openBaseUrlDelegatesToDriver() {
        DriverOperations driverOperations = new DriverOperations(getMockedProxyDriverIntegrator());
        driverOperations.open(baseUrl);

        verify(driver).get(baseUrl);
    }

    private ProxyDriverIntegrator getMockedProxyDriverIntegrator() {
        ProxyDriverIntegrator proxyDriverIntegrator = mock(ProxyDriverIntegrator.class);
        when(proxyDriverIntegrator.getWebDriver()).thenReturn(driver);
        when(proxyDriverIntegrator.getProxy()).thenReturn(proxy);
        when(proxyDriverIntegrator.getDriverService()).thenReturn(driverService);
        return proxyDriverIntegrator;
    }
}
