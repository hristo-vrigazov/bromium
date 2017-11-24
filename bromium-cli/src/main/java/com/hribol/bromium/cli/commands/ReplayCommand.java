package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.providers.IOURIProvider;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.report.ExecutionReport;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

import static com.hribol.bromium.core.DependencyInjectionConstants.HAR_FILE;
import static com.hribol.bromium.core.DependencyInjectionConstants.MEASUREMENTS_FILE;
import static com.hribol.bromium.core.DependencyInjectionConstants.SCREEN_NUMBER;

/**
 * A command for replaying a test scenario
 */
public class ReplayCommand implements Command {

    private PromptUtils promptUtils;
    private IOURIProvider<ReplayBrowser> replayBrowserProvider;
    private IOProvider<TestScenarioSteps> stepsProvider;
    private VirtualScreenProcessCreator virtualScreenProcessCreator;
    private Integer screenNumber;
    private File measurementsFile;
    private File harFile;

    @Inject
    public ReplayCommand(PromptUtils promptUtils,
                         IOURIProvider<ReplayBrowser> replayBrowserProvider,
                         IOProvider<TestScenarioSteps> stepsProvider,
                         VirtualScreenProcessCreator virtualScreenProcessCreator,
                         @Named(SCREEN_NUMBER) Integer screenNumber,
                         @Named(MEASUREMENTS_FILE) File measurementsFile,
                         @Named(HAR_FILE) File harFile) {
        this.promptUtils = promptUtils;
        this.replayBrowserProvider = replayBrowserProvider;
        this.stepsProvider = stepsProvider;
        this.virtualScreenProcessCreator = virtualScreenProcessCreator;
        this.screenNumber = screenNumber;
        this.measurementsFile = measurementsFile;
        this.harFile = harFile;
    }

    @Override
    public void run() {
        Optional<Process> virtualScreenProcessOptional = Optional.empty();
        try {
            if (screenNumber != 0) {
                virtualScreenProcessOptional = Optional.of(virtualScreenProcessCreator.createXvfbProcess(screenNumber));
            }

            TestScenarioSteps testCaseSteps = stepsProvider.get();
            ReplayBrowser replayBrowser = replayBrowserProvider.get();

            ExecutionReport executionReport = replayBrowser.replay(testCaseSteps);
            executionReport.getLoadingTimes().dump(measurementsFile);
            executionReport.getHar().writeTo(harFile);
            System.out.println(executionReport.getAutomationResult());
        } catch (IOException | URISyntaxException e) {
            promptUtils.getTextIO().getTextTerminal().println(e.getMessage());
        } finally {
            promptUtils.dispose();
            virtualScreenProcessOptional.ifPresent(Process::destroy);
        }
    }
}
