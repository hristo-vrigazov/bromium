package com.hribol.bromium.core.utils.parsing;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class JsonApplicationConfigurationParserTest {

    @Test
    public void canReadApplicationConfigurationFromFile() throws IOException {
        String filename = getClass().getResource("/tenniskafe.json").getFile();
        File file = new File(filename);

        JsonApplicationConfigurationParser applicationConfigurationParser = new JsonApplicationConfigurationParser();

        ApplicationConfiguration applicationConfiguration = applicationConfigurationParser.parseApplicationConfiguration(file);

        assertEquals("tenniskafe", applicationConfiguration.getApplicationName());

    }

    @Test
    public void canReadApplicationConfigurationFromFileName() throws IOException {
        String filename = getClass().getResource("/tenniskafe.json").getFile();

        JsonApplicationConfigurationParser applicationConfigurationParser = new JsonApplicationConfigurationParser();

        ApplicationConfiguration applicationConfiguration = applicationConfigurationParser
                .parseApplicationConfiguration(filename);

        assertEquals("tenniskafe", applicationConfiguration.getApplicationName());
    }

    @Test
    public void canReadApplicationConfigurationFromInputStream() throws IOException {
        String filename = getClass().getResource("/tenniskafe.json").getFile();
        File file = new File(filename);
        FileInputStream fileInputStream = new FileInputStream(file);

        JsonApplicationConfigurationParser applicationConfigurationParser = new JsonApplicationConfigurationParser();

        ApplicationConfiguration applicationConfiguration = applicationConfigurationParser
                .parseApplicationConfiguration(fileInputStream);

        assertEquals("tenniskafe", applicationConfiguration.getApplicationName());
    }
}
