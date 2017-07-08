package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.cli.suppliers.RecordCommandBuilderSupplier;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class RecordCommandHandler implements CommandHandler {

    private PromptUtils promptUtils;
    private RecordBrowserFactory recordBrowserFactory;
    private RecordCommandBuilderSupplier recordCommandBuilderSupplier;
    private ParsedOptions parsedOptions;

    @Inject
    public RecordCommandHandler(PromptUtils promptUtils,
                                RecordBrowserFactory recordBrowserFactory,
                                RecordCommandBuilderSupplier recordCommandBuilderSupplier,
                                ParsedOptions parsedOptions) {
        this.promptUtils = promptUtils;
        this.recordBrowserFactory = recordBrowserFactory;
        this.recordCommandBuilderSupplier = recordCommandBuilderSupplier;
        this.parsedOptions = parsedOptions;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        String pathToDriver = parsedOptions.getPathToDriver();
        String pathToConfigurationFile = parsedOptions.getPathToApplicationConfiguration();
        String baseUrl = parsedOptions.getBaseUrl();
        String outputFile = parsedOptions.getOutputFile();
        String browserType = parsedOptions.getBrowserType();
        int timeout = parsedOptions.getTimeout();

        Command command = recordCommandBuilderSupplier
                .get()
                .pathToDriver(pathToDriver)
                .pathToApplicationConfiguration(pathToConfigurationFile)
                .baseUrl(baseUrl)
                .outputFile(outputFile)
                .browserType(browserType)
                .timeout(timeout)
                .recordBrowserFactory(recordBrowserFactory)
                .promptUtils(promptUtils)
                .build();


        command.run();
    }
}
