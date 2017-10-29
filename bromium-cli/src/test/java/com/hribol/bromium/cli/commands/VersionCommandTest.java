package com.hribol.bromium.cli.commands;

import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.parsing.JsonParser;
import org.beryx.textio.StringInputReader;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextTerminal;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class VersionCommandTest {

    @Test
    public void dumpsVersionedApplication() throws IOException {
        String outputFilename = "updated-tmp.json";
        Mocks mocks = new Mocks(outputFilename);
        VersionCommand versionCommand = new VersionCommand(
                mocks.promptUtils,
                mocks.applicationConfigurationIOProvider,
                mocks.applicationConfigurationDumper);
        versionCommand.run();

        verify(mocks.applicationConfigurationDumper)
                .dumpApplicationConfiguration(mocks.applicationConfiguration, outputFilename);
    }

    @Test
    public void ifExceptionIsThrownDoesNotWriteToFile() throws IOException {
        String outputFilename = "/alibaba/asd";
        String exceptionMessage = "Exception while dumping!";
        Mocks mocks = new Mocks(outputFilename);

        doThrow(new IOException(exceptionMessage))
                .when(mocks.applicationConfigurationDumper)
                .dumpApplicationConfiguration(mocks.applicationConfiguration, outputFilename);

        VersionCommand versionCommand = new VersionCommand(
                mocks.promptUtils,
                mocks.applicationConfigurationIOProvider,
                mocks.applicationConfigurationDumper);
        versionCommand.run();

        verify(mocks.textTerminal).print(exceptionMessage);
    }

    private static class Mocks {
        String pathToApplicationConfiguration;
        String version;
        String inputFilename;
        StringInputReader stringInputReader;
        TextTerminal textTerminal;
        TextIO textIO;
        PromptUtils promptUtils;
        ApplicationConfiguration applicationConfiguration;
        JsonParser applicationConfigurationParser;
        ApplicationConfigurationDumper applicationConfigurationDumper;
        IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider;


        public Mocks(String outputFilename) throws IOException {
            applicationConfigurationIOProvider = mock(IOProvider.class);
            pathToApplicationConfiguration = "/integration-tests/demo.json";
            version = "8.1.14";
            inputFilename = getClass().getResource(pathToApplicationConfiguration).getFile();
            stringInputReader = mock(StringInputReader.class);
            when(stringInputReader.read(anyString())).thenReturn(outputFilename);

            textTerminal = mock(TextTerminal.class);
            textIO = mock(TextIO.class);
            when(textIO.getTextTerminal()).thenReturn(textTerminal);
            when(textIO.newStringInputReader()).thenReturn(stringInputReader);
            promptUtils = mock(PromptUtils.class);
            when(promptUtils.getTextIO()).thenReturn(textIO);
            when(promptUtils.promptForVersion()).thenReturn(version);

            applicationConfiguration = mock(ApplicationConfiguration.class);

            when(applicationConfigurationIOProvider.get()).thenReturn(applicationConfiguration);

            applicationConfigurationParser = mock(JsonParser.class);
            when(applicationConfigurationParser.parseApplicationConfiguration(inputFilename))
                    .thenReturn(applicationConfiguration);
            applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);

        }
    }
}
