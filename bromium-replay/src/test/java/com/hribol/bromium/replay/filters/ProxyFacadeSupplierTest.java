package com.hribol.bromium.replay.filters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 24.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ProxyFacadeSupplier.class,
        ProxyFacade.class
})
public class ProxyFacadeSupplierTest {

    @Test
    public void createsProxyFacade() throws Exception {
        String url = "http://tinkiwinki.com";
        ProxyFacade expected = mock(ProxyFacade.class);
        whenNew(ProxyFacade.class).withArguments(anyString(), anyString()).thenReturn(expected);
        ProxyFacadeSupplier proxyFacadeSupplier = new ProxyFacadeSupplier();
        ProxyFacade actual = proxyFacadeSupplier.get(url, "");

        assertEquals(expected, actual);
    }

}
