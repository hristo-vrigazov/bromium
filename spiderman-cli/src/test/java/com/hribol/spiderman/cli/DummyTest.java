package com.hribol.spiderman.cli;

import com.hribol.spiderman.cli.handlers.OptUtils;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class DummyTest {

    @Test
    public void dummy() {
        assertNotNull(new OptUtils());
        assertNotNull(new Main.Commands());
        assertNotNull(new Main());
        assertNotNull(MainMenuChoice.valueOf("ACTION"));
    }
}
