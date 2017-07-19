package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.cli.providers.IOProvider;
import com.hribol.bromium.common.record.RecordBrowserBase;

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

    @Inject
    public RecordCommand(@Named(OUTPUT_FILE) String outputFile,
                         PromptUtils promptUtils,
                         IOProvider<RecordBrowserBase> recordBrowserBaseIOProvider) {
        this.promptUtils = promptUtils;
        this.outputFile = outputFile;
        this.recordBrowserBaseIOProvider = recordBrowserBaseIOProvider;
    }

    @Override
    public void run() {
        try {
            RecordBrowserBase recordBrowserBase = recordBrowserBaseIOProvider.get();
            recordBrowserBase.record();
            promptUtils.promptForRecording();
            recordBrowserBase.dumpActions();
            recordBrowserBase.cleanUp();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        } finally {
            promptUtils.dispose();
        }

    }

}
