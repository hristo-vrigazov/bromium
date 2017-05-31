package com.hribol.spiderman.replay.filters;

import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class ProxyFacadeSupplier {

    public ProxyFacade get(String baseURI, String injectionCode) throws URISyntaxException {
        return new ProxyFacade(baseURI, injectionCode);
    }

}
