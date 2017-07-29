package com.hribol.bromium.core.utils;

import com.hribol.bromium.core.DependencyInjectionConstants;
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
        assertNotNull(new WebDriverActions());
        assertNotNull(new DependencyInjectionConstants());
    }
}
