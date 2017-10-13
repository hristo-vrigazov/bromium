package com.hribol.bromium.replay.report;

/**
 * Represent the result from a test execution
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
    INTERRUPTED,
    UNRECOGNIZED_EXCEPTION
}