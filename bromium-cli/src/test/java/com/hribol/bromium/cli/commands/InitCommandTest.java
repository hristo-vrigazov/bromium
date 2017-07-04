package com.hribol.bromium.cli.commands;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.suppliers.ApplicationConfigurationSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
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
public class InitCommandTest {

    @Test
    public void dumpsConfigurationFile() throws IOException {
        Mocks mocks = new Mocks();

        InitCommand initCommand = new InitCommand(
                mocks.promptUtils,
                mocks.applicationConfigurationDumper,
                mocks.applicationConfigurationSupplier);
        initCommand.run();

        verify(mocks.applicationConfigurationDumper)
                .dumpApplicationConfiguration(mocks.applicationConfiguration, mocks.outputfileName);
    }

    @Test
    public void ifExceptionIsThrownThenItIsLogged() throws IOException {
        String exceptionMessage = "Something terrible happened!";

        Mocks mocks = new Mocks();

        doThrow(new IOException(exceptionMessage))
                .when(mocks.applicationConfigurationDumper)
                .dumpApplicationConfiguration(mocks.applicationConfiguration, mocks.outputfileName);

        InitCommand initCommand = new InitCommand(
                mocks.promptUtils,
                mocks.applicationConfigurationDumper,
                mocks.applicationConfigurationSupplier);
        initCommand.run();

        verify(mocks.textTerminal).print(exceptionMessage);
    }

    private static class Mocks {
        String applicationName;
        String outputfileName;
        TextTerminal textTerminal;
        StringInputReader stringInputReader;
        TextIO textIO;
        PromptUtils promptUtils;
        ApplicationConfigurationDumper applicationConfigurationDumper;
        ApplicationConfiguration applicationConfiguration;
        ApplicationConfigurationSupplier applicationConfigurationSupplier;

        public Mocks() {
            applicationName = "tenniskafe";
            outputfileName = "/urlConstructor/tmp.json";
            textTerminal = mock(TextTerminal.class);
            stringInputReader = mock(StringInputReader.class);
            when(stringInputReader.read(anyString())).thenReturn(applicationName, outputfileName);

            textIO = mock(TextIO.class);
            when(textIO.getTextTerminal()).thenReturn(textTerminal);
            when(textIO.newStringInputReader()).thenReturn(stringInputReader);

            promptUtils = mock(PromptUtils.class);
            when(promptUtils.getTextIO()).thenReturn(textIO);
            when(promptUtils.promptForVersion()).thenReturn("0.0.1");


            applicationConfiguration = mock(ApplicationConfiguration.class);
            applicationConfigurationDumper = mock(ApplicationConfigurationDumper.class);
            applicationConfigurationSupplier = mock(ApplicationConfigurationSupplier.class);

            when(applicationConfigurationSupplier.get()).thenReturn(applicationConfiguration);
        }
    }
}
