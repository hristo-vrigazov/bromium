package com.hribol.bromium.cli.suppliers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class RecordCommandSupplier {
    public RecordCommand get(String pathToDriver, String pathToConfigurationFile, String baseUrl, String outputFile, int timeout, String browserType, RecordBrowserFactory recordBrowserFactory, PromptUtils promptUtils) {
        return new RecordCommand(pathToDriver, pathToConfigurationFile, baseUrl, outputFile, timeout, browserType, recordBrowserFactory, promptUtils);
    }
}
