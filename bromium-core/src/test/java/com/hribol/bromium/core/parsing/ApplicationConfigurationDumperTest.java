package com.hribol.bromium.core.parsing;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class ApplicationConfigurationDumperTest {

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

        ApplicationConfigurationDumper applicationConfigurationDumper = new ApplicationConfigurationDumper();
        applicationConfigurationDumper.dumpApplicationConfiguration(applicationConfiguration, outputFileName);
        File outputFile = new File(outputFileName);

        assertTrue(outputFile.exists());
        assertTrue(outputFile.delete());
    }
}
