package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.cli.factory.RecordBrowserFactory;
import com.hribol.spiderman.record.RecordBrowserBase;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordCommand implements Command {
    private final String pathToDriver;
    private final String pathToJSInjectionFile;
    private final String baseUrl;
    private final String ouputFile;
    private RecordBrowserFactory recordBrowserFactory;
    private PromptUtils promptUtils;

    public RecordCommand(String pathToDriver,
                         String pathToJSInjectionFile,
                         String baseUrl,
                         String ouputFile,
                         PromptUtils promptUtils) {
        this(pathToDriver, pathToJSInjectionFile, baseUrl, ouputFile, new RecordBrowserFactory(), promptUtils);
    }

    public RecordCommand(String pathToDriver,
                         String pathToJSInjectionFile,
                         String baseUrl,
                         String ouputFile,
                         RecordBrowserFactory recordBrowserFactory,
                         PromptUtils promptUtils) {
        this.pathToDriver = pathToDriver;
        this.pathToJSInjectionFile = pathToJSInjectionFile;
        this.baseUrl = baseUrl;
        this.ouputFile = ouputFile;
        this.recordBrowserFactory = recordBrowserFactory;
        this.promptUtils = promptUtils;
    }

    @Override
    public void run() {
        try {
            RecordBrowserBase recordBrowserBase = recordBrowserFactory.create(CHROME, pathToDriver, pathToJSInjectionFile);
            recordBrowserBase.record(baseUrl, 10);
            promptUtils.promptForRecording();
            recordBrowserBase.dumpActions(this.ouputFile);
            recordBrowserBase.cleanUp();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
