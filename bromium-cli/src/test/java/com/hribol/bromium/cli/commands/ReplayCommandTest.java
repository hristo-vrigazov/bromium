package com.hribol.bromium.cli.commands;

import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.providers.IOURIProvider;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.report.AutomationResult;
import com.hribol.bromium.replay.report.ExecutionReport;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class ReplayCommandTest {

    private PromptUtils promptUtils = mock(PromptUtils.class, RETURNS_DEEP_STUBS);
    private ReplayBrowser replayBrowser = mock(ReplayBrowser.class);
    private ExecutionReport executionReport = mock(ExecutionReport.class, RETURNS_DEEP_STUBS);
    private IOURIProvider<ReplayBrowser> replayBrowserProvider = mock(IOURIProvider.class);
    private IOProvider<TestScenarioSteps> stepsProvider = mock(IOProvider.class);
    private File measurementsFile = mock(File.class);
    private File harFile = mock(File.class);

    @Test
    public void executesStepsWithTheSuppliedBrowser() throws IOException, URISyntaxException {
        when(replayBrowserProvider.get()).thenReturn(replayBrowser);
        TestScenarioSteps steps = new TestScenarioSteps();
        when(stepsProvider.get()).thenReturn(steps);
        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);

        Process process = mock(Process.class);

        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);
        Integer screenNumber = 1;
        when(virtualScreenProcessCreator.createXvfbProcess(screenNumber)).thenReturn(process);

        when(replayBrowser.replay(steps)).thenReturn(executionReport);

        ReplayCommand replayCommand = new ReplayCommand(promptUtils, replayBrowserProvider, stepsProvider,
                virtualScreenProcessCreator, screenNumber, measurementsFile, harFile);

        replayCommand.run();
        verify(replayBrowser).replay(steps);
        verify(promptUtils).dispose();
    }

    @Test
    public void executesOnDefaultScreenIfSetToZero() throws IOException, URISyntaxException {
        when(replayBrowserProvider.get()).thenReturn(replayBrowser);
        TestScenarioSteps steps = new TestScenarioSteps();
        when(stepsProvider.get()).thenReturn(steps);
        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.SUCCESS);

        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);
        Integer screenNumber = 0;

        when(replayBrowser.replay(steps)).thenReturn(executionReport);

        ReplayCommand replayCommand = new ReplayCommand(promptUtils, replayBrowserProvider, stepsProvider,
                virtualScreenProcessCreator, screenNumber, measurementsFile, harFile);

        replayCommand.run();
        verify(replayBrowser).replay(steps);
        verify(promptUtils).dispose();
    }

    @Test
    public void cleansUpEvenIfExceptionIsThrown() throws IOException, URISyntaxException {
        String exceptionMessage = "Browser could not be created";
        when(replayBrowserProvider.get()).thenThrow(new IOException(exceptionMessage));
        TestScenarioSteps steps = new TestScenarioSteps();
        when(stepsProvider.get()).thenReturn(steps);
        when(executionReport.getAutomationResult()).thenReturn(AutomationResult.COULD_NOT_CREATE_DRIVER);

        VirtualScreenProcessCreator virtualScreenProcessCreator = mock(VirtualScreenProcessCreator.class);
        Integer screenNumber = 1;
        Process process = mock(Process.class);
        when(virtualScreenProcessCreator.createXvfbProcess(screenNumber)).thenReturn(process);


        ReplayCommand replayCommand = new ReplayCommand(promptUtils, replayBrowserProvider, stepsProvider,
                virtualScreenProcessCreator, screenNumber, measurementsFile, harFile);

        replayCommand.run();

        verify(promptUtils.getTextIO().getTextTerminal()).println(exceptionMessage);
        verify(promptUtils).dispose();
    }
}
