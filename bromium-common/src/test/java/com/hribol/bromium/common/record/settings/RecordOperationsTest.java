package com.hribol.bromium.common.record.settings;

import com.hribol.bromium.common.record.ProxyDriverIntegrator;
import com.hribol.bromium.common.record.RecordOperations;
import com.hribol.bromium.core.TestScenarioSteps;
import net.lightbody.bmp.BrowserMobProxy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.util.function.Supplier;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordOperationsTest {

    @Test
    public void driverIsMaximizedAndCleansUp() {
        String baseURI = "http://tenniskafe.com";
        WebDriver.Window window = mock(WebDriver.Window.class);
        WebDriver.Options options = mock(WebDriver.Options.class);
        when(options.window()).thenReturn(window);
        WebDriver driver = spy(WebDriver.class);
        when(driver.manage()).thenReturn(options);
        BrowserMobProxy proxy = spy(BrowserMobProxy.class);
        Supplier<TestScenarioSteps> stepsSupplier = mock(Supplier.class);
        DriverService driverService = mock(DriverService.class);

        ProxyDriverIntegrator proxyDriverIntegrator = mock(ProxyDriverIntegrator.class);
        when(proxyDriverIntegrator.getProxy()).thenReturn(proxy);
        when(proxyDriverIntegrator.getDriver()).thenReturn(driver);
        when(proxyDriverIntegrator.getStepsSupplier()).thenReturn(stepsSupplier);
        when(proxyDriverIntegrator.getDriverService()).thenReturn(driverService);

        RecordOperations recordOperations = new RecordOperations(proxyDriverIntegrator);
        recordOperations.prepareRecord();
        recordOperations.open(baseURI);
        recordOperations.cleanUpRecord();
        TestScenarioSteps testCaseSteps = recordOperations.getTestCaseSteps();

        verify(driver).quit();
        verify(proxy).stop();
        verify(window).maximize();
        verify(driver).get(baseURI);
        verify(stepsSupplier).get();
    }

}
