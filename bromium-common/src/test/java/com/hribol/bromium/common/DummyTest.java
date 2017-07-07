package com.hribol.bromium.common;

import com.hribol.bromium.common.builder.JsFunctionNames;
import com.hribol.bromium.common.generation.replay.functions.Constants;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 15.06.17.
 */
public class DummyTest {

    @Test
    public void dummy() {
        assertNotNull(new JsFunctionNames());
        assertNotNull(new Constants());
    }
}
