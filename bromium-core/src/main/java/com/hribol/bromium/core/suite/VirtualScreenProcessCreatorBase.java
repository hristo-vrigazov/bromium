package com.hribol.bromium.core.suite;

/**
 * Base class for virtual screen process creators that use :1, :2 etc. as representing screens.
 */
public abstract class VirtualScreenProcessCreatorBase implements VirtualScreenProcessCreator {

    @Override
    public String getScreen(int i) {
        return ":" + i;
    }
}
