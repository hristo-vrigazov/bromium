package com.hribol.bromium.cli;

/**
 * Created by hvrigazov on 30.07.17.
 */
public class NoSuchCommandException extends IllegalArgumentException {

    public NoSuchCommandException() {
        super("The selected command does not exist");
    }

}
