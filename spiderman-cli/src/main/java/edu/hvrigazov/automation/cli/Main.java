package edu.hvrigazov.automation.cli;


import edu.hvrigazov.automation.cli.commands.Command;
import edu.hvrigazov.automation.cli.commands.RecordCommand;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    public static void main(String[] args) {
        String pathToChromeDriver = "/home/hvrigazov/github/selenium-record-replay/chromedriver";
        String pathToJSInjectionFile = "/home/hvrigazov/github/selenium-record-replay/spiderman-core/src/main/resources/javascriptInjection/eventsRecorder.js";
        String baseUrl = "http://tenniskafe.com";
        String testCaseFile = "testCase.json";
        Command command = new RecordCommand(pathToChromeDriver, pathToJSInjectionFile, baseUrl, testCaseFile);
        command.run();
        System.exit(0);
    }
}
