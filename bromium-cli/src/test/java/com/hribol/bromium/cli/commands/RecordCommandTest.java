package com.hribol.bromium.cli.commands;

import com.hribol.bromium.common.record.RecordBrowserBase;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class RecordCommandTest {

    private final String baseUrl = "tenniskafe.com";
    private final String outputFile = "tmp-record.json";
    private final int timeout = 10;
    private RecordBrowserBase recordBrowserBase = mock(RecordBrowserBase.class);
    private PromptUtils promptUtils = mock(PromptUtils.class);

    @Test
    public void recordDumpsFile() throws IOException {
        RecordCommand recordCommand = new RecordCommand(
                outputFile,
                promptUtils,
                () -> recordBrowserBase
        );
        recordCommand.run();

        verify(recordBrowserBase).dumpActions();
        verify(promptUtils).dispose();
    }


    @Test
    public void ifExceptionIsThrownDoesNotDumpActions() throws IOException {
        RecordCommand recordCommand = new RecordCommand(
                outputFile,
                promptUtils,
                () -> {
                    throw new IOException("Terrible exception happened!");
                }
        );
        recordCommand.run();

        verify(recordBrowserBase, never()).dumpActions();
        verify(promptUtils).dispose();
    }
}
