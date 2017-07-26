package com.hribol.bromium.cli;

/**
 * Created by hvrigazov on 26.07.17.
 */
public class BrowserTypeNotSupportedException extends IllegalArgumentException {

    public BrowserTypeNotSupportedException() {
        super("Browser type is not supported");
    }

}
