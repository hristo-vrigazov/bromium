package com.hribol.bromium.replay;

import com.hribol.bromium.replay.report.AutomationResult;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class DummyTest {

    @Test
    public void dummy() {
        // for code coverage
        assertNotNull(AutomationResult.values());
        assertNotNull(AutomationResult.valueOf("NO_VIRTUAL_SCREEN"));
    }
}
