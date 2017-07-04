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
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class UpdateCommandTest {

    @Test
    public void updatesFile() throws IOException {
        String outputFilename = "tenniskafe-updated.json";
        Mocks mocks = new Mocks(outputFilename);

        UpdateCommand updateCommand = new UpdateCommand(
                mocks.inputFilename,
                mocks.promptUtils,
                mocks.applicationConfigurationParser,
                mocks.applicationConfigurationDumper);
        updateCommand.run();

        verify(mocks.applicationConfigurationDumper)
                .dumpApplicationConfiguration(mocks.applicationConfiguration, outputFilename);

    }

    @Test
    public void ifExceptionIsThrownDoesNotWriteToFile() throws IOException {
        String outputFilename = "/alibaba/asd";
        String exceptionMessage = "Something happened!";
        Mocks mocks = new Mocks(outputFilename);
        when(mocks.applicationConfigurationParser
                .parseApplicationConfiguration(mocks.inputFilename)).thenThrow(new IOException(exceptionMessage));

        UpdateCommand updateCommand = new UpdateCommand(
                mocks.inputFilename,
                mocks.promptUtils,
                mocks.applicationConfigurationParser,
                mocks.applicationConfigurationDumper);
        updateCommand.run();

        verify(mocks.textTerminal).print(exceptionMessage);

    }

    private static class Mocks {
        String inputFilename;
        ApplicationConfigurationParser applicationConfigurationParser;
        ApplicationConfiguration applicationConfiguration;
        ApplicationConfigurationDumper applicationConfigurationDumper;
        StringInputReader stringInputReader;
        TextTerminal textTerminal;
        TextIO textIO;
        PromptUtils promptUtils;

        public Mocks(String outputFilename) throws IOException {
            inputFilename = getClass().getResource("/tenniskafe.json").getFile();
            applicationConfiguration = mock(ApplicationConfiguration.class);
            applicationConfigurationParser = mock(ApplicationConfigurationParser.class);
            when(applicationConfigurationParser.parseApplicationConfiguration(inputFilename)).thenReturn(applicationConfiguration);
            applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);

            stringInputReader = mock(StringInputReader.class);
            when(stringInputReader.read(anyString())).thenReturn(outputFilename);

            textTerminal = mock(TextTerminal.class);
            textIO = mock(TextIO.class);

            when(textIO.getTextTerminal()).thenReturn(textTerminal);
            when(textIO.newStringInputReader()).thenReturn(stringInputReader);

            promptUtils = mock(PromptUtils.class);
            when(promptUtils.getTextIO()).thenReturn(textIO);
        }

    }

}
