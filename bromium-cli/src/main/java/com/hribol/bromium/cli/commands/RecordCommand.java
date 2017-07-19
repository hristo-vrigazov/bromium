package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.parsing.StepsDumper;
import com.hribol.bromium.record.RecordRequestFilter;
import com.hribol.bromium.record.RecordResponseFilter;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.hribol.bromium.core.DependencyInjectionConstants.*;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordCommand implements Command {

    private PromptUtils promptUtils;
    private String outputFile;
    private IOProvider<RecordBrowserBase> recordBrowserBaseIOProvider;
    private StepsDumper stepsDumper;
    private RecordRequestFilter recordRequestFilter;

    @Inject
    public RecordCommand(@Named(OUTPUT_FILE) String outputFile,
                         PromptUtils promptUtils,
                         IOProvider<RecordBrowserBase> recordBrowserBaseIOProvider,
                         StepsDumper stepsDumper,
                         RecordRequestFilter recordRequestFilter) {
        this.promptUtils = promptUtils;
        this.outputFile = outputFile;
        this.recordBrowserBaseIOProvider = recordBrowserBaseIOProvider;
        this.stepsDumper = stepsDumper;
        this.recordRequestFilter = recordRequestFilter;
    }

    @Override
    public void run() {
        try {
            RecordBrowserBase recordBrowserBase = recordBrowserBaseIOProvider.get();
            recordBrowserBase.record();
            promptUtils.promptForRecording();
            TestScenarioSteps testScenarioSteps = recordBrowserBase.getTestCaseSteps();
            stepsDumper.dump(testScenarioSteps, outputFile);
            recordBrowserBase.cleanUp();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            promptUtils.dispose();
        }

    }

}
