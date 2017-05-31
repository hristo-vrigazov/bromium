package com.hribol.bromium.cli.commands;

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
public class UpdateCommandTest {

    @Test
    public void updatesFile() {
        String outputFilename = "tenniskafe-updated.json";
        baseTest(outputFilename);
        File outputFile = new File(outputFilename);
        assertTrue(outputFile.delete());
    }

    @Test
    public void ifExceptionIsThrownDoesNotWriteToFile() {
        String outputFilename = "/alibaba/asd";
        baseTest(outputFilename);
        File outputFile = new File(outputFilename);
        assertFalse(outputFile.exists());
    }

    private void baseTest(String outputFilename) {
        String inputFilename = getClass().getResource("/tenniskafe.json").getFile();

        StringInputReader stringInputReader = mock(StringInputReader.class);
        when(stringInputReader.read(anyString())).thenReturn(outputFilename);

        TextTerminal textTerminal = mock(TextTerminal.class);
        TextIO textIO = mock(TextIO.class);
        when(textIO.getTextTerminal()).thenReturn(textTerminal);
        when(textIO.newStringInputReader()).thenReturn(stringInputReader);
        PromptUtils promptUtils = mock(PromptUtils.class);
        when(promptUtils.getTextIO()).thenReturn(textIO);

        UpdateCommand updateCommand = new UpdateCommand(inputFilename, promptUtils);
        updateCommand.run();
    }

}
