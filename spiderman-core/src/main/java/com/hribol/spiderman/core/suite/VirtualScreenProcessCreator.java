package com.hribol.spiderman.core.suite;

import java.io.IOException;

/**
 * Created by hvrigazov on 22.04.17.
 */
public interface VirtualScreenProcessCreator {
    Process createXvfbProcess(int i) throws IOException;
    String getScreen(int i);
}
