package com.hribol.bromium.record;

import com.hribol.bromium.record.javascript.generation.builder.JsFunctionNames;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class DummyTest {

    @Test
    public void codeCoverage() {
        assertNotNull(new JsFunctionNames());
    }
}
