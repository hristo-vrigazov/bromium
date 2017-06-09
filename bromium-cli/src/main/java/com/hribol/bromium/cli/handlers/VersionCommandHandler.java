package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.VersionCommand;
import com.hribol.bromium.cli.suppliers.VersionCommandSupplier;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class VersionCommandHandler implements CommandHandler {
    private PromptUtils promptUtils;
    private VersionCommandSupplier versionCommandSupplier;

    @Inject
    public VersionCommandHandler(PromptUtils promptUtils, VersionCommandSupplier versionCommandSupplier) {
        this.promptUtils = promptUtils;
        this.versionCommandSupplier = versionCommandSupplier;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        String pathToApplicationConfiguration = OptUtils.getPathToApplicationConfiguration(opts);
        Command updateCommand = versionCommandSupplier.get(pathToApplicationConfiguration, promptUtils);
        updateCommand.run();
    }
}
