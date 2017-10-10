package com.hribol.bromium.cli;

/**
 * Throw this when the user selects a browser that is not yet supported
 */
public class BrowserTypeNotSupportedException extends IllegalArgumentException {

    public BrowserTypeNotSupportedException() {
        super("Browser type is not supported");
    }

}
