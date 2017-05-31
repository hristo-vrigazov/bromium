package com.hribol.spiderman.cli.handlers;

import com.hribol.spiderman.cli.commands.Command;
import com.hribol.spiderman.cli.commands.InitCommand;
import com.hribol.spiderman.cli.commands.PromptUtils;

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
