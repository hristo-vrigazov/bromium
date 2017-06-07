package com.hribol.bromium.core.suite;

/**
 * Created by hvrigazov on 06.05.17.
 */
public abstract class VirtualScreenProcessCreatorBase implements VirtualScreenProcessCreator {

    @Override
    public String getScreen(int i) {
        return ":" + (i + 1);
    }
}
