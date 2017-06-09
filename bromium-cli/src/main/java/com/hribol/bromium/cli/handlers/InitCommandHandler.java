package com.hribol.bromium.cli.handlers;

import com.google.inject.Inject;
import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.suppliers.InitCommandSupplier;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class InitCommandHandler implements CommandHandler {
    private PromptUtils promptUtils;
    private InitCommandSupplier initCommandSupplier;

    @Inject
    public InitCommandHandler(PromptUtils promptUtils, InitCommandSupplier initCommandSupplier) {
        this.promptUtils = promptUtils;
        this.initCommandSupplier = initCommandSupplier;
    }

    @Override
    public void handle(Map<String, Object> opts) {
        Command command = initCommandSupplier.get(promptUtils);
        command.run();
    }
}
