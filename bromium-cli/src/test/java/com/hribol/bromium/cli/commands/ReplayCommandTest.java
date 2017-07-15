package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.providers.IOProvider;
import com.hribol.bromium.cli.providers.IOURIProvider;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class ReplayCommandTest {

    private PromptUtils promptUtils = mock(PromptUtils.class, RETURNS_DEEP_STUBS);
    private ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
    private ExecutionReport executionReport = mock(ExecutionReport.class);
    private IOURIProvider<ReplayBrowser> replayBrowserProvider = mock(IOURIProvider.class);
    private IOProvider<List<Map<String, String>>> stepsProvider = mock(IOProvider.class);

    @Test
    public void executesStepsWithTheSuppliedBrowser() throws IOException, URISyntaxException {
        when(replayBrowserProvider.get()).thenReturn(replayBrowser);
        List<Map<String, String>> steps = new ArrayList<>();
        when(stepsProvider.get()).thenReturn(steps);
        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);
        when(replayBrowser.createVirtualScreenProcessAndExecute(eq(steps),eq(1), any())).thenReturn(executionReport);

        ReplayCommand replayCommand = new ReplayCommand(promptUtils, replayBrowserProvider, stepsProvider);

        replayCommand.run();

//   TODO: Figure out the correct way to do this: Mockito.verify(replayBrowser).replay(eq(steps), eq(1), any());
        verify(promptUtils).dispose();
    }

    @Test
    public void cleansUpEvenIfExceptionIsThrown() throws IOException, URISyntaxException {
        String exceptionMessage = "Browser could not be created";
        when(replayBrowserProvider.get()).thenThrow(new IOException(exceptionMessage));
        List<Map<String, String>> steps = new ArrayList<>();
        when(stepsProvider.get()).thenReturn(steps);
        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.COULD_NOT_CREATE_DRIVER);

        ReplayCommand replayCommand = new ReplayCommand(promptUtils, replayBrowserProvider, stepsProvider);

        replayCommand.run();

        verify(promptUtils.getTextIO().getTextTerminal()).println(exceptionMessage);
        verify(promptUtils).dispose();
    }
}
