package com.hribol.spiderman.replay.config.utils;

import com.hribol.spiderman.replay.config.utils.Constants;
import com.hribol.spiderman.replay.config.utils.Utils;
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
