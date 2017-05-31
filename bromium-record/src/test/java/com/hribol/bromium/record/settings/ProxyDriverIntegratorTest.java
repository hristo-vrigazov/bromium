package com.hribol.bromium.record.settings;

import com.hribol.bromium.replay.config.suppliers.VisibleWebDriverSupplier;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class ProxyDriverIntegratorTest {

    @Test
    public void canGetDriverAndProxyConfigured() {
        WebDriver driver = mock(WebDriver.class);
        RequestFilter requestFilter = mock(RequestFilter.class);
        ResponseFilter responseFilter = mock(ResponseFilter.class);
        VisibleWebDriverSupplier visibleWebDriverSupplier = mock(VisibleWebDriverSupplier.class);
        when(visibleWebDriverSupplier.get(any())).thenReturn(driver);
        int timeout = 10;

        ProxyDriverIntegrator proxyDriverIntegrator = new ProxyDriverIntegrator(requestFilter, responseFilter,
                visibleWebDriverSupplier, timeout);

        assertNotNull(proxyDriverIntegrator.getProxy());
        assertNotNull(proxyDriverIntegrator.getDriver());
    }
}
