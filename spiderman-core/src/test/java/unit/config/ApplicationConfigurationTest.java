package unit.config;

import com.hribol.spiderman.replay.config.ApplicationActionConfiguration;
import com.hribol.spiderman.replay.config.ApplicationConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ApplicationConfigurationTest {

    @Test
    public void applicationConfigurationGettersAndSetters() {
        String applicationName = "applicationName";
        String version = "version";
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);

        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        applicationConfiguration.setApplicationName(applicationName);
        applicationConfiguration.setVersion(version);
        applicationConfiguration.addApplicationActionConfiguration(applicationActionConfiguration);

        assertEquals(applicationName, applicationConfiguration.getApplicationName());
        assertEquals(version, applicationConfiguration.getVersion());
        assertEquals(applicationActionConfiguration, applicationConfiguration
                .getApplicationActionConfigurationList()
                .get(0));
    }
}
