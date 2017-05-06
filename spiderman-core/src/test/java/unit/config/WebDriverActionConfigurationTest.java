package unit.config;

import com.hribol.spiderman.core.config.ParameterConfiguration;
import com.hribol.spiderman.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class WebDriverActionConfigurationTest {

    @Test
    public void webDriverActionConfigurationTest() {
        String webDriverActionType = "CLICK_CLASS_BY_TEXT";
        ParameterConfiguration parameterConfiguration = mock(ParameterConfiguration.class);
        Map<String, ParameterConfiguration> parametersConfiguration = new HashMap<>();
        parametersConfiguration.put("text", parameterConfiguration);

        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        webDriverActionConfiguration.setWebDriverActionType(webDriverActionType);
        webDriverActionConfiguration.setParametersConfiguration(parametersConfiguration);

        assertEquals(webDriverActionType, webDriverActionConfiguration.getWebDriverActionType());
        assertEquals(parametersConfiguration, webDriverActionConfiguration.getParametersConfiguration());
    }
}
