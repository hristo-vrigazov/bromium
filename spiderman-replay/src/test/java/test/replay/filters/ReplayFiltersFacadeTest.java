package test.replay.filters;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.junit.Test;

import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class ReplayFiltersFacadeTest {

    @Test
    public void canGetFilters() throws URISyntaxException {
        String baseURI = "http://tenniskafe.com";
        ReplayFiltersFacade replayFiltersFacade = new ReplayFiltersFacade(baseURI);

    }
}
