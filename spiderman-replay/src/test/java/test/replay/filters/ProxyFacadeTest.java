package test.replay.filters;

import com.hribol.spiderman.replay.filters.ProxyFacade;
import org.junit.Test;

import java.net.URISyntaxException;

import static org.junit.Assert.assertNotNull;

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
}
