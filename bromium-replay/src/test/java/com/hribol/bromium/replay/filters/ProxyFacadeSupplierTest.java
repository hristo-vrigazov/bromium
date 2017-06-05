package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.execution.synchronization.EventSynchronizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
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
        whenNew(ProxyFacade.class).withArguments(anyString(), anyString(), any(EventSynchronizer.class)).thenReturn(expected);
        ProxyFacadeSupplier proxyFacadeSupplier = new ProxyFacadeSupplier();
        ProxyFacade actual = proxyFacadeSupplier.get(url, "", mock(EventSynchronizer.class));

        assertEquals(expected, actual);
    }

}
