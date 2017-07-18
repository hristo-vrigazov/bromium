package com.hribol.bromium.integration.tests.replay;

import com.hribol.bromium.cli.Main;
import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
import org.junit.Before;

import java.io.IOException;

/**
 * Created by hvrigazov on 15.07.17.
 */
public abstract class BaseReplayIntegrationTest extends BaseDemoAppIntegrationTest {

    public BaseReplayIntegrationTest(String resourceConfigurationPath, String resouceCasePath, String screen) {
        super(resourceConfigurationPath, resouceCasePath, screen);
    }

    @Before
    public void extractTestCaseToBeReplayed() throws IOException {
        testCaseFile = extractResource(pathToTestCase);
    }

    @Override
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
