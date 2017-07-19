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

    private String baseUrl;
    private int timeout;
    private PromptUtils promptUtils;
    private String outputFile;
    private IOProvider<RecordBrowserBase> recordBrowserBaseIOProvider;

    @Inject
    public RecordCommand(@Named(BASE_URL) String baseUrl,
                         @Named(TIMEOUT) int timeout,
                         @Named(OUTPUT_FILE) String outputFile,
                         PromptUtils promptUtils,
                         IOProvider<RecordBrowserBase> recordBrowserBaseIOProvider) {
        this.baseUrl = baseUrl;
        this.timeout = timeout;
        this.promptUtils = promptUtils;
        this.outputFile = outputFile;
        this.recordBrowserBaseIOProvider = recordBrowserBaseIOProvider;
    }

    @Override
    public void run() {
        try {
            RecordBrowserBase recordBrowserBase = recordBrowserBaseIOProvider.get();
            recordBrowserBase.record(baseUrl, timeout);
            promptUtils.promptForRecording();
            recordBrowserBase.dumpActions(this.outputFile);
            recordBrowserBase.cleanUp();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        } finally {
            promptUtils.dispose();
        }

    }

}
