package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.VersionCommand;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class VersionCommandHandler implements CommandHandler {
    @Override
    public void handle(Map<String, Object> opts) {
        String pathToApplicationConfiguration = OptUtils.getPathToApplicationConfiguration(opts);
        PromptUtils promptUtils = new PromptUtils();
        Command updateCommand = new VersionCommand(pathToApplicationConfiguration, promptUtils);
        updateCommand.run();
    }
}
