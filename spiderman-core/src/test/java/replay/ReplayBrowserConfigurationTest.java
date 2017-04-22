package replay;

import com.hribol.automation.core.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.automation.core.execution.factory.WebDriverActionFactory;
import com.hribol.automation.core.replay.ReplayBrowserConfiguration;
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
        WebDriverActionFactory webDriverActionFactory = new PredefinedWebDriverActionFactory();
        String url = "http://tenniskafe.com";
        String filename = getClass().getResource("/tenniskafe.json").getFile();

        ReplayBrowserConfiguration replayBrowserConfiguration = ReplayBrowserConfiguration
                .builder()
                .url(url)
                .pathToApplicationConfiguration(filename)
                .webdriverActionFactory(webDriverActionFactory)
                .build();

        assertNotNull(replayBrowserConfiguration.getReplayBrowser());
    }

    @Test
    public void throwsExceptionIfRequiredParameterIsMissing() throws IOException {
        thrown.expect(NullPointerException.class);
        ReplayBrowserConfiguration replayBrowserConfiguration = ReplayBrowserConfiguration
                .builder()
                .build();
    }
}
