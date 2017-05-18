package unit.utils;

import com.hribol.spiderman.replay.config.ApplicationActionConfiguration;
import com.hribol.spiderman.replay.config.ApplicationConfiguration;
import com.hribol.spiderman.replay.config.ParameterConfiguration;
import com.hribol.spiderman.replay.config.WebDriverActionConfiguration;
import com.hribol.spiderman.replay.config.utils.ConfigurationUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void canDumpApplicationConfiguration() throws IOException {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        applicationConfiguration.setApplicationName("dummy");
        applicationConfiguration.setVersion("0.0.1");

        ParameterConfiguration parameterConfiguration = new ParameterConfiguration();
        parameterConfiguration.setAlias("text");
        parameterConfiguration.setExpose(true);
        parameterConfiguration.setParameterName("text");

        Map<String, ParameterConfiguration> parameterConfigurationMap = new HashMap<>();
        parameterConfigurationMap.put(parameterConfiguration.getParameterName(), parameterConfiguration);

        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        webDriverActionConfiguration.setWebDriverActionType("CLICK_CLASS_BY_TEXT");
        webDriverActionConfiguration.setParametersConfiguration(parameterConfigurationMap);

        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setName("applicationAction");
        applicationActionConfiguration.setExpectsHttpRequest(false);
        applicationActionConfiguration.setWebDriverAction(webDriverActionConfiguration);

        String outputFileName = "tmp.json";
        ConfigurationUtils.dumpApplicationConfiguration(applicationConfiguration, outputFileName);
        File outputFile = new File(outputFileName);

        assertTrue(outputFile.exists());
        assertTrue(outputFile.delete());
    }

    @Test
    public void canReadSteps() throws IOException {
        String filename = getClass().getResource("/testCase.json").getFile();
        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(filename);

        Map<String, String> firstStep = testCaseSteps.get(0);
        String firstEvent = firstStep.get("event");

        assertEquals("Load initial page", firstEvent);
    }

    @Test
    public void canSplitQueryUrl() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.tenniskafe.com/query?key1=value1&key2=value2");
        ConfigurationUtils configurationUtils = new ConfigurationUtils();
        Map<String, String> parameters = ConfigurationUtils.splitQuery(url);

        assertTrue(parameters.containsKey("key1"));
        assertEquals("value1", parameters.get("key1"));
        assertTrue(parameters.containsKey("key2"));
        assertEquals("value2", parameters.get("key2"));
    }
}
