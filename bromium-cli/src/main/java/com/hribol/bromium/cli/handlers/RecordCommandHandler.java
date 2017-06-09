package com.hribol.bromium.cli.handlers;

import com.hribol.bromium.cli.commands.Command;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class RecordCommandHandler implements CommandHandler {
    @Override
    public void handle(Map<String, Object> opts) {
        String pathToDriver = OptUtils.getPathToDriver(opts);
        String pathToConfigurationFile = OptUtils.getPathToApplicationConfiguration(opts);
        String baseUrl = OptUtils.getBaseUrl(opts);
        String outputFile = OptUtils.getOutputFile(opts);
        String browserType = OptUtils.getBrowserType(opts);
        int timeout = OptUtils.getTimeout(opts);
        PromptUtils promptUtils = new PromptUtils();
        Command command = new RecordCommand(pathToDriver, pathToConfigurationFile, baseUrl, outputFile, browserType, promptUtils, timeout);
        command.run();
    }
}
