package com.hribol.bromium.common.record.settings;

import com.hribol.bromium.common.record.ProxyDriverIntegrator;
import com.hribol.bromium.common.record.RecordManager;
import com.hribol.bromium.core.TestScenarioSteps;
import net.lightbody.bmp.BrowserMobProxy;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.function.Supplier;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordManagerTest {

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

        ProxyDriverIntegrator proxyDriverIntegrator = mock(ProxyDriverIntegrator.class);
        when(proxyDriverIntegrator.getProxy()).thenReturn(proxy);
        when(proxyDriverIntegrator.getDriver()).thenReturn(driver);
        when(proxyDriverIntegrator.getStepsSupplier()).thenReturn(stepsSupplier);

        RecordManager recordManager = new RecordManager(proxyDriverIntegrator);
        recordManager.prepareRecord();
        recordManager.open(baseURI);
        recordManager.cleanUpRecord();
        TestScenarioSteps testCaseSteps = recordManager.getTestCaseSteps();

        verify(driver).quit();
        verify(proxy).stop();
        verify(window).maximize();
        verify(driver).get(baseURI);
        verify(stepsSupplier).get();
    }

}
