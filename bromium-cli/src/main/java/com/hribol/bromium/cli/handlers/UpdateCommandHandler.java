package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.UpdateCommand;
import com.hribol.bromium.cli.suppliers.UpdateCommandSupplier;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class UpdateCommandHandler implements CommandHandler {
    private PromptUtils promptUtils;
    private UpdateCommandSupplier updateCommandSupplier;

    @Inject
    public UpdateCommandHandler(PromptUtils promptUtils, UpdateCommandSupplier updateCommandSupplier) {
        this.promptUtils = promptUtils;
        this.updateCommandSupplier = updateCommandSupplier;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        String pathToApplicationConfiguration = OptUtils.getPathToApplicationConfiguration(opts);
        UpdateCommand updateCommand = updateCommandSupplier.get(pathToApplicationConfiguration, promptUtils);
        updateCommand.run();
    }
}
