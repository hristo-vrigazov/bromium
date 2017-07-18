package com.hribol.bromium.integration.tests;

import com.hribol.bromium.cli.Main;
import org.junit.Test;

/**
 * Created by hvrigazov on 15.07.17.
 */
public abstract class BaseReplayIntegrationTest extends BaseIntegrationTest {

    public BaseReplayIntegrationTest(String resourceConfigurationPath, String resouceCasePath, String screen) {
        super(resourceConfigurationPath, resouceCasePath, screen);
    }

    @Test
    public void runTest() {
        String[] args = {
                "replay",
                "-d", chromedriverFile.getAbsolutePath(),
                "-a", configurationFile.getAbsolutePath(),
                "-u", "http://localhost:" + demoApp.getPort() + "/",
                "-c", testCaseFile.getAbsolutePath(),
                "-m", measurementsFile.getAbsolutePath(),
                "-s", screen
        };

        Main.main(args);
        String output = getOutput();
        assertOutput(output);
    }

    protected abstract void assertOutput(String output);

}
