package utils;

import com.hribol.automation.core.config.ApplicationConfiguration;
import com.hribol.automation.core.utils.ConfigurationUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class ConfigurationUtilsTest {

    @Test
    public void canReadApplicationConfiguration() throws IOException {
        String filename = getClass().getResource("/tenniskafe.json").getFile();
        File file = new File(filename);

        ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(file);

        assertEquals("tenniskafe", applicationConfiguration.getApplicationName());

        applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(filename);

        assertEquals("tenniskafe", applicationConfiguration.getApplicationName());
    }

}
