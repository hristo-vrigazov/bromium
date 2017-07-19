package com.hribol.bromium.cli;

import com.hribol.bromium.core.DependencyInjectionConstants;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class DummyTest {

    @Test
    public void dummy() {
        assertNotNull(new Main.Commands());
        assertNotNull(new Main());
        assertNotNull(MainMenuChoice.valueOf("ACTION"));
        assertNotNull(new DependencyInjectionConstants());
    }
}
