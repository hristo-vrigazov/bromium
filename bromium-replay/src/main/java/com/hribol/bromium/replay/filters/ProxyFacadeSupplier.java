package com.hribol.bromium.replay.filters;

import com.hribol.bromium.core.synchronization.EventSynchronizer;

import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class ProxyFacadeSupplier {

    public ProxyFacade get(String baseURI, String injectionCode, EventSynchronizer eventSynchronizer) throws URISyntaxException {
        return new ProxyFacade(baseURI, injectionCode, eventSynchronizer);
    }

}
