package com.hribol.bromium.replay.actions;

/**
 * An action which has a precondition which has to happen in the browser (javascript code)
 */
public interface ActionWithJSPrecondition {
    /**
     * Gets the name of the event which has to happen
     * @return the name of the event which has to happen
     */
    String getJSEventToWaitFor();
}
