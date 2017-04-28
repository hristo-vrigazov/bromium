package com.hribol.spiderman.cli;

import com.hribol.spiderman.cli.commands.Command;
import com.hribol.spiderman.cli.commands.PromptUtils;
import com.hribol.spiderman.cli.commands.RecordCommand;
import com.hribol.spiderman.cli.commands.ReplayCommand;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    public static void main(String[] args) {
        String pathToChromeDriver = "/home/hvrigazov/github/spiderman/chromedriver";
        String pathToJSInjectionFile = "/home/hvrigazov/github/spiderman/spiderman-core/src/test/resources/eventsRecorder.js";
        String pathToApplicationConfiguration = "/home/hvrigazov/github/spiderman/spiderman-core/src/test/resources/tenniskafe.json";
        String baseUrl = "http://tenniskafe.com";
        String testCaseFile = "/home/hvrigazov/github/spiderman/spiderman-core/src/test/resources/testCase.json";
//        Command command = new ReplayCommand(pathToChromeDriver, pathToApplicationConfiguration, testCaseFile);
//        command.run();
        Command command = new RecordCommand(pathToChromeDriver, pathToJSInjectionFile, baseUrl, testCaseFile, new PromptUtils());
        command.run();
        System.exit(0);
    }
}
