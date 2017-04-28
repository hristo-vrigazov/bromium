package com.hribol.spiderman.cli.commands;

import org.junit.Test;

/**
 * Created by hvrigazov on 28.04.17.
 */
public class ReplayCommandTest {

    @Test
    public void asdasds() {
        String pathToChromeDriver = "/home/hvrigazov/github/spiderman/chromedriver";
        String pathToApplicationConfiguration = "/home/hvrigazov/github/spiderman/spiderman-core/src/test/resources/tenniskafe.json";
        String testCaseFile = "/home/hvrigazov/github/spiderman/spiderman-core/src/test/resources/testCase.json";
        Command command = new ReplayCommand(pathToChromeDriver, pathToApplicationConfiguration, testCaseFile);
        command.run();
    }
}
