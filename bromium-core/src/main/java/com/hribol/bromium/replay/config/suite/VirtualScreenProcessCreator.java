package com.hribol.bromium.replay.config.suite;

import java.io.IOException;

/**
 * Creates a virtual screen process. Different implementations for different
 * Linux distributions, since Xvfb is started in a different way for example
 * on Ubuntu and on CentOS.
 */
public interface VirtualScreenProcessCreator {
    /**
     * Creates a Xvfb process on a given screen number
     * @param i the number of the screen
     * @return the created process
     * @throws IOException if there is a problem with the creation of the process
     */
    Process createXvfbProcess(int i) throws IOException;

    /**
     * Returns a screen in a string format required by Xvfb
     * @param i the number of the screen
     * @return the screen in the format required by Xvfb
     */
    String getScreen(int i);
}
