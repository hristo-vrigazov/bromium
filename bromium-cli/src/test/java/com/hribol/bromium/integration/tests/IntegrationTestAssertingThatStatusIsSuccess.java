package com.hribol.bromium.integration.tests;

import static com.hribol.bromium.replay.report.AutomationResult.SUCCESS;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 15.07.17.
 */
public class IntegrationTestAssertingThatStatusIsSuccess extends BaseReplayIntegrationTest {
    public IntegrationTestAssertingThatStatusIsSuccess(String resourceConfigurationPath,
                                                       String resouceCasePath) {
        super(resourceConfigurationPath, resouceCasePath, System.getProperty("screen", "1"));
    }

    @Override
    protected void assertOutput(String output) {
        assertEquals(SUCCESS.toString(), getLastLine(output));
    }

    private String getLastLine(String output) {
        String[] lines = output.split(System.lineSeparator());
        return lines[lines.length - 1];
    }
}
