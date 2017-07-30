package com.hribol.bromium.common.record.settings;

import com.hribol.bromium.common.record.ProxyDriverIntegrator;
import com.hribol.bromium.core.TestScenarioSteps;
import net.lightbody.bmp.BrowserMobProxy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class ProxyDriverIntegratorTest {

    @Test
    public void canGetDriverAndProxyConfigured() {
        WebDriver expectedDriver = mock(WebDriver.class);
        BrowserMobProxy expectedProxy = mock(BrowserMobProxy.class);
        Supplier<TestScenarioSteps> expectedSupplier = mock(Supplier.class);
        DriverService driverService = mock(DriverService.class);
        ProxyDriverIntegrator proxyDriverIntegrator = new ProxyDriverIntegrator(expectedSupplier, expectedProxy, expectedDriver, driverService);

        assertEquals(expectedDriver, proxyDriverIntegrator.getDriver());
        assertEquals(expectedProxy, proxyDriverIntegrator.getProxy());
        assertEquals(expectedSupplier, proxyDriverIntegrator.getStepsSupplier());
    }
}
