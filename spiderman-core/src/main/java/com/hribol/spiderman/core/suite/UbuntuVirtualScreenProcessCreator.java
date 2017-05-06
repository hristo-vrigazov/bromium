package com.hribol.spiderman.core.suite;

import java.io.IOException;

/**
 * A {@link VirtualScreenProcessCreator} which creates virtual screen process
 * on Ubuntu
 */
public class UbuntuVirtualScreenProcessCreator extends VirtualScreenProcessCreatorBase {

    @Override
    public Process createXvfbProcess(int i) throws IOException {
        // 0 is the main screen
        String screen = getScreen(i);

        String[] command = {
                "Xvfb", screen, "-screen", "0", "1360x1024x24 &"
        };

        return new ProcessBuilder(command).start();
    }

}
