package com.hribol.bromium.integration.tests.replay;

import static com.hribol.bromium.integration.tests.TestUtils.SCREEN_SYSTEM_PROPERTY;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by hvrigazov on 15.07.17.
 */
public abstract class IntegrationTestAssertingThatStatusIsSuccess extends BaseReplayIntegrationTest {
    public IntegrationTestAssertingThatStatusIsSuccess(String resourceConfigurationPath,
                                                       String resouceCasePath) {
        super(resourceConfigurationPath, resouceCasePath, System.getProperty(SCREEN_SYSTEM_PROPERTY, "1"));
    }

    @Override
    protected void assertOutput(String output) {
        String lastLine = getLastLine(output);
        assertThat(lastLine, containsString("Test run result SUCCESS"));
    }

    private String getLastLine(String output) {
        String[] lines = output.split(System.lineSeparator());
        if (lines[lines.length - 1].isEmpty()) {
            return lines[lines.length - 2];
        }

        return lines[lines.length - 1];
    }
}
