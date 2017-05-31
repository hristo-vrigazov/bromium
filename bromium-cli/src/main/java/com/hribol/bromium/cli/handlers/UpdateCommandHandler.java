package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.UpdateCommand;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class UpdateCommandHandler implements CommandHandler {
    @Override
    public void handle(Map<String, Object> opts) {
        String pathToApplicationConfiguration = OptUtils.getPathToApplicationConfiguration(opts);
        PromptUtils promptUtils = new PromptUtils();
        UpdateCommand updateCommand = new UpdateCommand(pathToApplicationConfiguration, promptUtils);
        updateCommand.run();
    }
}
