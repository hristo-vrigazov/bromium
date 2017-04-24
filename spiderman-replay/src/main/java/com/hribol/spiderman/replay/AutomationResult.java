package com.hribol.spiderman.replay;

/**
 * Created by hvrigazov on 16.03.17.
 */
public enum AutomationResult {
    NO_VIRTUAL_SCREEN,
    COULD_NOT_CREATE_DRIVER,
    FAILED,
    NOT_STARTED,
    EXECUTING,
    SUCCESS,
    ASSERTION_ERROR,
    TIMEOUT,
    INTERRUPTED
}