package com.hribol.automation.cli;


import com.hribol.automation.cli.commands.Command;
import com.hribol.automation.cli.commands.RecordCommand;
import com.hribol.automation.cli.commands.ReplayCommand;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    public static void main(String[] args) {
        String pathToChromeDriver = "/home/hvrigazov/github/spiderman/chromedriver";
        String pathToJSInjectionFile = "/home/hvrigazov/github/spiderman/spiderman-core/src/main/resources/javascriptInjection/eventsRecorder.js";
        String pathToApplicationConfiguration = "/home/hvrigazov/github/spiderman/tenniskafe.json";
        String baseUrl = "http://tenniskafe.com";
        String testCaseFile = "testCase.json";
        Command command = new ReplayCommand(pathToChromeDriver, pathToApplicationConfiguration, testCaseFile);
        command.run();
//        Command command = new RecordCommand(pathToChromeDriver, pathToJSInjectionFile, baseUrl, testCaseFile);
//        command.run();
        System.exit(0);
    }
}
