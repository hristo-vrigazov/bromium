package com.hribol.bromium.integration.tests;

import static com.hribol.bromium.replay.report.AutomationResult.SUCCESS;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 09.07.17.
 */
public class ReplayAjaxIT extends BaseReplayIntegrationTest {

    public ReplayAjaxIT() {
        super("integration-tests/demo.json", "integration-tests/ajax.json");
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
