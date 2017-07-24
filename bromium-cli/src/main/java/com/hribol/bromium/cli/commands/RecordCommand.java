package com.hribol.bromium.cli.commands;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.common.record.RecordBrowser;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.parsing.StepsDumper;

import java.io.IOException;

import static com.hribol.bromium.core.DependencyInjectionConstants.*;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordCommand implements Command {

    private PromptUtils promptUtils;
    private String outputFile;
    private IOProvider<RecordBrowser> recordBrowserBaseIOProvider;
    private StepsDumper stepsDumper;

    @Inject
    public RecordCommand(@Named(OUTPUT_FILE) String outputFile,
                         PromptUtils promptUtils,
                         IOProvider<RecordBrowser> recordBrowserBaseIOProvider,
                         StepsDumper stepsDumper) {
        this.promptUtils = promptUtils;
        this.outputFile = outputFile;
        this.recordBrowserBaseIOProvider = recordBrowserBaseIOProvider;
        this.stepsDumper = stepsDumper;
    }

    @Override
    public void run() {
        try {
            RecordBrowser recordBrowser = recordBrowserBaseIOProvider.get();
            recordBrowser.record();
            promptUtils.promptForRecording();
            TestScenarioSteps testScenarioSteps = recordBrowser.getTestCaseSteps();
            stepsDumper.dump(testScenarioSteps, outputFile);
            recordBrowser.cleanUp();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            promptUtils.dispose();
        }

    }



}
