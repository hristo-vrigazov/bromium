package com.hribol.bromium.core.parsing;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class JsonParserTest {

    @Test
    public void canReadApplicationConfigurationFromFile() throws IOException {
        String filename = getClass().getResource("/tenniskafe.json").getFile();
        File file = new File(filename);

        JsonParser applicationConfigurationParser = new JsonParser();

        ApplicationConfiguration applicationConfiguration = applicationConfigurationParser.parseApplicationConfiguration(file);

        assertEquals("tenniskafe", applicationConfiguration.getApplicationName());

    }

    @Test
    public void canReadApplicationConfigurationFromFileName() throws IOException {
        String filename = getClass().getResource("/tenniskafe.json").getFile();

        JsonParser applicationConfigurationParser = new JsonParser();

        ApplicationConfiguration applicationConfiguration = applicationConfigurationParser
                .parseApplicationConfiguration(filename);

        assertEquals("tenniskafe", applicationConfiguration.getApplicationName());
    }

}
