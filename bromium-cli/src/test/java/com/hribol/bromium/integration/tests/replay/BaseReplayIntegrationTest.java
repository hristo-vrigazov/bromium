package com.hribol.bromium.integration.tests.replay;

import com.hribol.bromium.cli.Main;
import com.hribol.bromium.integration.tests.BaseDemoAppIntegrationTest;
import org.junit.Before;

import java.io.IOException;

import static com.hribol.bromium.integration.tests.TestUtils.extractResource;
import static org.junit.Assert.assertFalse;

/**
 * Created by hvrigazov on 15.07.17.
 */
public abstract class BaseReplayIntegrationTest extends BaseDemoAppIntegrationTest {

    public BaseReplayIntegrationTest(String resourceConfigurationPath, String resouceCasePath, String screen) {
        super(resourceConfigurationPath, resouceCasePath, screen);
    }

    @Before
    public void extractTestCaseToBeReplayed() throws IOException {
        testCaseFile = extractResource(pathToTestCase, testResourcesDirectory);
    }

    @Override
    public void runTest() {
        String[] args = {
                "replay",
                "-d", chromedriverFile.getAbsolutePath(),
                "-a", configurationFile.getAbsolutePath(),
                "-u", demoApp.getBaseUrl(),
                "-c", testCaseFile.getAbsolutePath(),
                "-m", measurementsFile.getAbsolutePath(),
                "-s", screen,
        };

        Main.main(args);
        String output = getOutput();
        assertOutput(output);
        String outputError = getOutputOnStdErr();
        assertFalse(outputError.contains("SLF4J: Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."));
    }

    protected abstract void assertOutput(String output);

}
