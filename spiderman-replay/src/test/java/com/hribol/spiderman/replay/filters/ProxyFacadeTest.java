package com.hribol.spiderman.replay.filters;

import org.junit.Test;

import java.net.URISyntaxException;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anySet;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class ProxyFacadeTest {

    @Test
    public void canGetFilters() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI);

        assertNotNull(proxyFacade.getRequestFilter());
        assertNotNull(proxyFacade.getResponseFilter());
    }

    @Test
    public void requestQueueIsEmptyInBeginning() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ProxyFacade proxyFacade = new ProxyFacade(baseURI);
        assertTrue(proxyFacade.canAct());
    }

}
