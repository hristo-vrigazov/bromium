package com.hribol.bromium.cli.commands;

import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.record.RecordBrowserBase;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordCommand implements Command {
    private final String pathToDriver;
    private final String pathToJSInjectionFile;
    private final String baseUrl;
    private final String outputFile;
    private final String browserType;
    private final int timeout;
    private RecordBrowserFactory recordBrowserFactory;
    private PromptUtils promptUtils;

    public RecordCommand(String pathToDriver,
                         String pathToJSInjectionFile,
                         String baseUrl,
                         String outputFile,
                         String browserType,
                         PromptUtils promptUtils,
                         int timeout) {
        this(pathToDriver, pathToJSInjectionFile, baseUrl, outputFile, timeout, browserType, new RecordBrowserFactory(), promptUtils);
    }

    public RecordCommand(String pathToDriver,
                         String pathToJSInjectionFile,
                         String baseUrl,
                         String outputFile,
                         int timeout,
                         String browserType,
                         RecordBrowserFactory recordBrowserFactory,
                         PromptUtils promptUtils) {
        this.pathToDriver = pathToDriver;
        this.pathToJSInjectionFile = pathToJSInjectionFile;
        this.baseUrl = baseUrl;
        this.outputFile = outputFile;
        this.timeout = timeout;
        this.browserType = browserType;
        this.recordBrowserFactory = recordBrowserFactory;
        this.promptUtils = promptUtils;
    }

    @Override
    public void run() {
        try {
            RecordBrowserBase recordBrowserBase = recordBrowserFactory.create(browserType, pathToDriver, pathToJSInjectionFile);
            recordBrowserBase.record(baseUrl, timeout);
            promptUtils.promptForRecording();
            recordBrowserBase.dumpActions(this.outputFile);
            recordBrowserBase.cleanUp();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
