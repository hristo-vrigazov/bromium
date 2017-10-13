package com.hribol.bromium.cli;

/**
 * Throw this exception when the user selects a command that does not exist
 */
public class NoSuchCommandException extends IllegalArgumentException {

    public NoSuchCommandException() {
        super("The selected command does not exist");
    }

}
