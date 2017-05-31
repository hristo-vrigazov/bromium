package com.hribol.spiderman.cli.handlers;

import com.hribol.spiderman.cli.commands.Command;
import com.hribol.spiderman.cli.commands.PromptUtils;
import com.hribol.spiderman.cli.commands.VersionCommand;

import java.util.Map;

import static com.hribol.spiderman.cli.handlers.OptUtils.getPathToApplicationConfiguration;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class VersionCommandHandler implements CommandHandler {
    @Override
    public void handle(Map<String, Object> opts) {
        String pathToApplicationConfiguration = getPathToApplicationConfiguration(opts);
        PromptUtils promptUtils = new PromptUtils();
        Command updateCommand = new VersionCommand(pathToApplicationConfiguration, promptUtils);
        updateCommand.run();
    }
}
