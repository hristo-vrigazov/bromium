package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.UpdateCommand;
import com.hribol.bromium.cli.suppliers.UpdateCommandSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class UpdateCommandHandler implements CommandHandler {
    private PromptUtils promptUtils;
    private UpdateCommandSupplier updateCommandSupplier;
    private ApplicationConfigurationParser applicationConfigurationParser;
    private ApplicationConfigurationDumper applicationConfigurationDumper;

    @Inject
    public UpdateCommandHandler(PromptUtils promptUtils,
                                UpdateCommandSupplier updateCommandSupplier,
                                ApplicationConfigurationParser applicationConfigurationParser, ApplicationConfigurationDumper applicationConfigurationDumper) {
        this.promptUtils = promptUtils;
        this.updateCommandSupplier = updateCommandSupplier;
        this.applicationConfigurationParser = applicationConfigurationParser;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        String pathToApplicationConfiguration = OptUtils.getPathToApplicationConfiguration(opts);
        UpdateCommand updateCommand = updateCommandSupplier.get(pathToApplicationConfiguration,
                promptUtils,
                applicationConfigurationParser,
                applicationConfigurationDumper);
        updateCommand.run();
    }
}
