package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.cli.providers.IOProvider;
import com.hribol.bromium.common.record.RecordBrowserBase;
import com.hribol.bromium.core.utils.JavascriptInjector;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.hribol.bromium.cli.Constants.*;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordCommand implements Command {

    private RecordBrowserFactory recordBrowserFactory;
    private String browserType;
    private String pathToDriver;
    private IOProvider<JavascriptInjector> javascriptInjectorProvider;
    private String baseUrl;
    private int timeout;
    private PromptUtils promptUtils;
    private String outputFile;

    @Inject
    public RecordCommand(@Named(BROWSER_TYPE) String browserType,
                         @Named(PATH_TO_DRIVER) String pathToDriver,
                         @Named(RECORDING_JAVASCRIPT_INJECTOR) IOProvider<JavascriptInjector> javascriptInjectorProvider,
                         @Named(BASE_URL) String baseUrl,
                         @Named(TIMEOUT) int timeout,
                         @Named(OUTPUT_FILE) String outputFile,
                         RecordBrowserFactory recordBrowserFactory,
                         PromptUtils promptUtils) {
        this.recordBrowserFactory = recordBrowserFactory;
        this.browserType = browserType;
        this.pathToDriver = pathToDriver;
        this.javascriptInjectorProvider = javascriptInjectorProvider;
        this.baseUrl = baseUrl;
        this.timeout = timeout;
        this.promptUtils = promptUtils;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        try {
            JavascriptInjector javascriptInjector = javascriptInjectorProvider.get();
            RecordBrowserBase recordBrowserBase = recordBrowserFactory.create(browserType, pathToDriver, javascriptInjector);
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
