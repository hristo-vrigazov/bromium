package com.hribol.spiderman.cli.handlers;

import com.hribol.spiderman.cli.commands.Command;
import com.hribol.spiderman.cli.commands.PromptUtils;
import com.hribol.spiderman.cli.commands.RecordCommand;

import java.util.Map;

import static com.hribol.spiderman.cli.handlers.OptUtils.*;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class RecordCommandHandler implements CommandHandler {
    @Override
    public void handle(Map<String, Object> opts) {
        String pathToDriver = getPathToDriver(opts);
        String pathToJsInjectionFile = getPathToJS(opts);
        String baseUrl = getBaseUrl(opts);
        String outputFile = getOutputFile(opts);
        String browserType = getBrowserType(opts);
        int timeout = getTimeout(opts);
        PromptUtils promptUtils = new PromptUtils();
        Command command = new RecordCommand(pathToDriver, pathToJsInjectionFile, baseUrl, outputFile, browserType, promptUtils, timeout);
        command.run();
    }
}
