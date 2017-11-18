package com.hribol.bromium.core.suite;

import org.junit.Test;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class VirtualScreenProcessCreatorTest {


    @Test
    public void xvfbIsInstalledAndProcessIsCreated() throws IOException {
        UbuntuVirtualScreenProcessCreator virtualScreenProcessCreator = new UbuntuVirtualScreenProcessCreator();
        Optional<Process> processOptional = Optional.empty();
        try {
            Process process = virtualScreenProcessCreator.createXvfbProcess(2);
            processOptional = Optional.of(process);
            assertTrue(process.isAlive());
        } finally {
            processOptional.ifPresent(Process::destroy);
        }
    }

}
