package com.hribol.bromium.cli.commands;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import org.beryx.textio.StringInputReader;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextTerminal;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class VersionCommandTest {

    @Test
    public void dumpsVersionedApplication() throws IOException {
        String outputFilename = "updated-tmp.json";
        baseTest(outputFilename);
        File outputFile = new File(outputFilename);
        assertTrue(outputFile.exists());
        assertTrue(outputFile.delete());
    }

    @Test
    public void ifExceptionIsThrownDoesNotWriteToFile() throws IOException {
        String outputFilename = "/alibaba/asd";
        baseTest(outputFilename);
        File outputFile = new File(outputFilename);
        assertFalse(outputFile.exists());
    }

    private void baseTest(String outputFilename) throws IOException {
        String pathToApplicationConfiguration = "/tenniskafe.json";
        String version = "8.1.14";
        String inputFilename = getClass().getResource(pathToApplicationConfiguration).getFile();
        StringInputReader stringInputReader = mock(StringInputReader.class);
        when(stringInputReader.read(anyString())).thenReturn(outputFilename);

        TextTerminal textTerminal = mock(TextTerminal.class);
        TextIO textIO = mock(TextIO.class);
        when(textIO.getTextTerminal()).thenReturn(textTerminal);
        when(textIO.newStringInputReader()).thenReturn(stringInputReader);
        PromptUtils promptUtils = mock(PromptUtils.class);
        when(promptUtils.getTextIO()).thenReturn(textIO);
        when(promptUtils.promptForVersion()).thenReturn(version);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);

        ApplicationConfigurationParser applicationConfigurationParser = mock(ApplicationConfigurationParser.class);
        when(applicationConfigurationParser.parseApplicationConfiguration(inputFilename))
                .thenReturn(applicationConfiguration);
        ApplicationConfigurationDumper applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);

        VersionCommand versionCommand = new VersionCommand(inputFilename, promptUtils, applicationConfigurationParser, applicationConfigurationDumper);
        versionCommand.run();
    }
}
