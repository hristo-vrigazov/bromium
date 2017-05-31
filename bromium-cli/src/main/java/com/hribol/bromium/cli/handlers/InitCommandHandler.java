package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.PromptUtils;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class InitCommandHandler implements CommandHandler {
    @Override
    public void handle(Map<String, Object> opts) {
        PromptUtils promptUtils = new PromptUtils();
        Command command = new InitCommand(promptUtils);
        command.run();
    }
}
