package com.hribol.bromium.cli.commands;

import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import org.beryx.textio.StringInputReader;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextTerminal;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class InitCommandTest {

    @Test
    public void dumpsConfigurationFile() {
        String applicationName = "tenniskafe";
        String outputfileName = "tmp.json";
        TextTerminal textTerminal = mock(TextTerminal.class);
        StringInputReader stringInputReader = mock(StringInputReader.class);
        when(stringInputReader.read(anyString())).thenReturn(applicationName, outputfileName);

        TextIO textIO = mock(TextIO.class);
        when(textIO.getTextTerminal()).thenReturn(textTerminal);
        when(textIO.newStringInputReader()).thenReturn(stringInputReader);

        PromptUtils promptUtils = mock(PromptUtils.class);
        when(promptUtils.getTextIO()).thenReturn(textIO);
        when(promptUtils.promptForVersion()).thenReturn("0.0.1");

        ApplicationConfigurationDumper applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);

        InitCommand initCommand = new InitCommand(promptUtils, applicationConfigurationDumper);
        initCommand.run();

        File outputFile = new File(outputfileName);

        assertTrue(outputFile.delete());
    }

    @Test
    public void ifExceptionIsThrownDoesNotWriteFile() {
        String applicationName = "tenniskafe";
        String outputfileName = "/urlConstructor/tmp.json";
        TextTerminal textTerminal = mock(TextTerminal.class);
        StringInputReader stringInputReader = mock(StringInputReader.class);
        when(stringInputReader.read(anyString())).thenReturn(applicationName, outputfileName);

        TextIO textIO = mock(TextIO.class);
        when(textIO.getTextTerminal()).thenReturn(textTerminal);
        when(textIO.newStringInputReader()).thenReturn(stringInputReader);

        PromptUtils promptUtils = mock(PromptUtils.class);
        when(promptUtils.getTextIO()).thenReturn(textIO);
        when(promptUtils.promptForVersion()).thenReturn("0.0.1");

        ApplicationConfigurationDumper applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);

        InitCommand initCommand = new InitCommand(promptUtils, applicationConfigurationDumper);
        initCommand.run();

        File outputFile = new File(outputfileName);

        assertFalse(outputFile.delete());
    }
}
