package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.suppliers.VersionCommandSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class VersionCommandHandler implements CommandHandler {
    private PromptUtils promptUtils;
    private VersionCommandSupplier versionCommandSupplier;
    private ApplicationConfigurationParser applicationConfigurationParser;
    private ApplicationConfigurationDumper applicationConfigurationDumper;

    @Inject
    public VersionCommandHandler(PromptUtils promptUtils,
                                 VersionCommandSupplier versionCommandSupplier,
                                 ApplicationConfigurationParser applicationConfigurationParser, ApplicationConfigurationDumper applicationConfigurationDumper) {
        this.promptUtils = promptUtils;
        this.versionCommandSupplier = versionCommandSupplier;
        this.applicationConfigurationParser = applicationConfigurationParser;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        String pathToApplicationConfiguration = OptUtils.getPathToApplicationConfiguration(opts);
        Command updateCommand = versionCommandSupplier.get(pathToApplicationConfiguration,
                promptUtils,
                applicationConfigurationParser,
                applicationConfigurationDumper);
        updateCommand.run();
    }
}
