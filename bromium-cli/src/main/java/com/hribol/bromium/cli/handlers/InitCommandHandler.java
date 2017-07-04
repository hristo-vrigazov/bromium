package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.suppliers.InitCommandSupplier;
import com.hribol.bromium.core.suppliers.ApplicationConfigurationSupplier;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationDumper;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class InitCommandHandler implements CommandHandler {
    private PromptUtils promptUtils;
    private InitCommandSupplier initCommandSupplier;
    private ApplicationConfigurationDumper applicationConfigurationDumper;
    private ApplicationConfigurationSupplier applicationConfigurationSupplier;

    @Inject
    public InitCommandHandler(PromptUtils promptUtils,
                              InitCommandSupplier initCommandSupplier,
                              ApplicationConfigurationDumper applicationConfigurationDumper,
                              ApplicationConfigurationSupplier applicationConfigurationSupplier) {
        this.promptUtils = promptUtils;
        this.initCommandSupplier = initCommandSupplier;
        this.applicationConfigurationDumper = applicationConfigurationDumper;
        this.applicationConfigurationSupplier = applicationConfigurationSupplier;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        Command command = initCommandSupplier.get(promptUtils, applicationConfigurationDumper, applicationConfigurationSupplier);
        command.run();
    }
}
