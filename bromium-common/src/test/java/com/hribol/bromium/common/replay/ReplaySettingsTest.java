package com.hribol.bromium.common.replay;

import com.hribol.bromium.core.suppliers.InvisibleWebDriverSupplier;
import com.hribol.bromium.core.suppliers.VisibleWebDriverSupplier;
import com.hribol.bromium.replay.settings.ReplaySettings;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class ReplaySettingsTest {

    @Test
    public void createsInvisibleWebDriver() throws IOException {
        baseReplaySettingsTest(":1");
    }

    @Test
    public void createsVisibleWebDriver() throws IOException {
        baseReplaySettingsTest(":0");
    }

    private void baseReplaySettingsTest(String screen) throws IOException {
        WebDriver.Window window = mock(WebDriver.Window.class);
        WebDriver.Options options = mock(WebDriver.Options.class);
        when(options.window()).thenReturn(window);
        WebDriver webDriver = mock(WebDriver.class);
        when(webDriver.manage()).thenReturn(options);
        DriverService driverService = mock(DriverService.class);
        RequestFilter requestFilter = mock(RequestFilter.class);
        ResponseFilter responseFilter = mock(ResponseFilter.class);
        InvisibleWebDriverSupplier<DriverService> invisibleWebDriverSupplier = mock(InvisibleWebDriverSupplier.class);
        when(invisibleWebDriverSupplier.get(any(), any())).thenReturn(webDriver);

        VisibleWebDriverSupplier visibleWebDriverSupplier = mock(VisibleWebDriverSupplier.class);
        when(visibleWebDriverSupplier.get(any())).thenReturn(webDriver);

        ReplaySettings<DriverService> driverServiceReplaySettings = new ReplaySettingsBase<DriverService>(
                requestFilter,
                responseFilter,
                invisibleWebDriverSupplier,
                visibleWebDriverSupplier) {
            @Override
            public DriverService getDriverService(String pathToDriverExecutable, String screenToUse) throws IOException {
                return driverService;
            }
        };

        String pathToChromeDriver = "file:///somepath";
        int timeout = 500;

        driverServiceReplaySettings.prepareReplay(pathToChromeDriver, screen, timeout);

        assertEquals(webDriver, driverServiceReplaySettings.getWebDriver());

        Har har = driverServiceReplaySettings.getHar();

        driverServiceReplaySettings.cleanUpReplay();
    }
}
