package com.hribol.bromium.common.replay;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class ActionNotInConfigurationException extends Throwable {
    public ActionNotInConfigurationException(String eventName) {
        super("The action " + eventName + " was not found in the application configuration");
    }
}
