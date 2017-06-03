package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.execution.synchronization.EventDispatcher;

import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class ProxyFacadeSupplier {

    public ProxyFacade get(String baseURI, String injectionCode, EventDispatcher eventDispatcher) throws URISyntaxException {
        return new ProxyFacade(baseURI, injectionCode, eventDispatcher);
    }

}
