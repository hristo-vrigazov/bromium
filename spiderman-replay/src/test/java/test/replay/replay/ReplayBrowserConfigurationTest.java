package test.replay.replay;

import com.hribol.spiderman.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import com.hribol.spiderman.replay.ReplayBrowserConfiguration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ReplayBrowserConfigurationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void canCreateConfigurationFromBuilder() throws IOException {
        String url = "http://tenniskafe.com";

        WebDriverActionFactory webDriverActionFactory = new PredefinedWebDriverActionFactory(url);
        String filename = getClass().getResource("/tenniskafe.json").getFile();

        ReplayBrowserConfiguration replayBrowserConfiguration = new ReplayBrowserConfiguration(filename, webDriverActionFactory);
        assertNotNull(replayBrowserConfiguration.getReplayBrowser());
    }

}
