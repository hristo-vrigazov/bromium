package com.hribol.bromium.replay.config.utils;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class DummyTest {

    @Test
    public void constructorsOfStaticClasses() {
        // for code coverage
        assertNotNull(new Utils());
        assertNotNull(new Constants());
    }
}
