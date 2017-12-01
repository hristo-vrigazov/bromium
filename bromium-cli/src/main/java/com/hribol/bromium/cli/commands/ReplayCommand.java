package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.providers.IOURIProvider;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.report.ExecutionReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private final static Logger logger = LoggerFactory.getLogger(ReplayCommand.class);

    private IOURIProvider<ReplayBrowser> replayBrowserProvider;
    private IOProvider<TestScenarioSteps> stepsProvider;
    private VirtualScreenProcessCreator virtualScreenProcessCreator;
    private Integer screenNumber;
    private File measurementsFile;
    private File harFile;

    @Inject
    public ReplayCommand(IOURIProvider<ReplayBrowser> replayBrowserProvider,
                         IOProvider<TestScenarioSteps> stepsProvider,
                         VirtualScreenProcessCreator virtualScreenProcessCreator,
                         @Named(SCREEN_NUMBER) Integer screenNumber,
                         @Named(MEASUREMENTS_FILE) File measurementsFile,
                         @Named(HAR_FILE) File harFile) {
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
            logger.info("Test run result {}", executionReport.getAutomationResult().toString());
        } catch (IOException | URISyntaxException e) {
            logger.error(e.getMessage(), e);
        } finally {
            virtualScreenProcessOptional.ifPresent(Process::destroy);
        }
    }
}
