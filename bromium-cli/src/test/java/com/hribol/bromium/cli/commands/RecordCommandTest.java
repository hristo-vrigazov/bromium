package com.hribol.bromium.cli.commands;

import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.parsing.StepsDumper;
import org.junit.Test;

import java.io.IOException;

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
    private StepsDumper stepsDumper = mock(StepsDumper.class);
    private TestScenarioSteps testScenarioSteps = mock(TestScenarioSteps.class);

    @Test
    public void recordDumpsFile() throws IOException {
        when(recordBrowserBase.getTestCaseSteps()).thenReturn(testScenarioSteps);

        RecordCommand recordCommand = new RecordCommand(
                outputFile,
                promptUtils,
                () -> recordBrowserBase,
                stepsDumper
        );
        recordCommand.run();

        verify(stepsDumper).dump(testScenarioSteps, outputFile);
        verify(promptUtils).dispose();
    }


    @Test
    public void ifExceptionIsThrownDoesNotDumpActions() throws IOException {
        RecordCommand recordCommand = new RecordCommand(
                outputFile,
                promptUtils,
                () -> {
                    throw new IOException("Terrible exception happened!");
                },
                stepsDumper
        );
        recordCommand.run();

        verify(stepsDumper, never()).dump(testScenarioSteps, outputFile);
        verify(promptUtils).dispose();
    }
}
