package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.cli.suppliers.RecordCommandSupplier;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class RecordCommandHandler implements CommandHandler {

    private PromptUtils promptUtils;
    private RecordBrowserFactory recordBrowserFactory;
    private RecordCommandSupplier recordCommandSupplier;

    @Inject
    public RecordCommandHandler(PromptUtils promptUtils,
                                RecordBrowserFactory recordBrowserFactory,
                                RecordCommandSupplier recordCommandSupplier) {
        this.promptUtils = promptUtils;
        this.recordBrowserFactory = recordBrowserFactory;
        this.recordCommandSupplier = recordCommandSupplier;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        String pathToDriver = OptUtils.getPathToDriver(opts);
        String pathToConfigurationFile = OptUtils.getPathToApplicationConfiguration(opts);
        String baseUrl = OptUtils.getBaseUrl(opts);
        String outputFile = OptUtils.getOutputFile(opts);
        String browserType = OptUtils.getBrowserType(opts);
        int timeout = OptUtils.getTimeout(opts);
        Command command = recordCommandSupplier.get(pathToDriver, pathToConfigurationFile, baseUrl, outputFile, timeout,
                browserType,
                recordBrowserFactory,
                promptUtils);
        command.run();
    }
}
