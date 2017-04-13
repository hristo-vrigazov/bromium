package browser;


import browser.commands.Command;
import browser.commands.RecordCommand;

/**
 * Created by hvrigazov on 14.03.17.
 */
public class Main {

    public static void main(String[] args) {
        String pathToChromeDriver = "/home/hvrigazov/github/selenium-record-replay/chromedriver";
        String pathToJSInjectionFile = "/home/hvrigazov/github/selenium-record-replay/terminator-core/src/main/resources/javascriptInjection/eventsRecorder.js";
        String baseUrl = "http://tenniskafe.com";
        String testCaseFile = "testCase.json";
        Command command = new RecordCommand(pathToChromeDriver, pathToJSInjectionFile, baseUrl, testCaseFile);
        command.run();
        System.exit(0);
    }
}
