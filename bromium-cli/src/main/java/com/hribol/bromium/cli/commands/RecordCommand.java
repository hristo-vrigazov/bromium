package com.hribol.bromium.cli.commands;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.common.record.RecordBrowser;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.providers.IOURIProvider;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.core.utils.parsing.StepsDumper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

import static com.hribol.bromium.core.DependencyInjectionConstants.*;

/**
 * A command for recording
 */
public class RecordCommand implements Command {

    private final int screen;
    private PromptUtils promptUtils;
    private String outputFile;
    private IOURIProvider<RecordBrowser> recordBrowserBaseIOProvider;
    private final VirtualScreenProcessCreator virtualScreenProcessCreator;
    private StepsDumper stepsDumper;

    @Inject
    public RecordCommand(@Named(OUTPUT_FILE) String outputFile,
                         @Named(SCREEN_NUMBER) int screen,
                         PromptUtils promptUtils,
                         IOURIProvider<RecordBrowser> recordBrowserBaseIOProvider,
                         VirtualScreenProcessCreator virtualScreenProcessCreator,
                         StepsDumper stepsDumper) {
        this.screen = screen;
        this.promptUtils = promptUtils;
        this.outputFile = outputFile;
        this.recordBrowserBaseIOProvider = recordBrowserBaseIOProvider;
        this.virtualScreenProcessCreator = virtualScreenProcessCreator;
        this.stepsDumper = stepsDumper;
    }

    @Override
    public void run() {
        Optional<Process> virtualScreenProcessOptional = Optional.empty();
        try {
            if (screen != 0) {
                virtualScreenProcessOptional = Optional.of(virtualScreenProcessCreator.createXvfbProcess(screen));
            }

            RecordBrowser recordBrowser = recordBrowserBaseIOProvider.get();
            recordBrowser.record();
            promptUtils.promptForRecording();
            TestScenarioSteps testScenarioSteps = recordBrowser.getTestCaseSteps();
            stepsDumper.dump(testScenarioSteps, outputFile);
            recordBrowser.cleanUp();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        } finally {
            promptUtils.dispose();
            virtualScreenProcessOptional.ifPresent(Process::destroy);
        }

    }



}
