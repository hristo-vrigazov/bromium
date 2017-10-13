package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.common.replay.InstanceBasedAutomationResultBuilder;
import com.hribol.bromium.common.synchronization.JSPrecondition;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.actions.ActionWithJSPrecondition;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeoutException;

/**
 * A base class for all actions that need a js condition to be satisfied before they can be executed.
 * An example would be a click on an element with an id, the js condition would be that the element is present
 * in the DOM.
 */
public abstract class ActionWithJSPreconditionBase implements ActionWithJSPrecondition, WebDriverAction {

    @Override
    public void execute(WebDriver driver, ReplayingState replayingState, EventSynchronizer eventSynchronizer) {
        String hashCodeToWaitFor = String.valueOf(getJSEventToWaitFor().hashCode());
        SynchronizationEvent synchronizationEvent = new JSPrecondition(hashCodeToWaitFor, eventSynchronizer, replayingState);
        try {
            eventSynchronizer.awaitUntil(synchronizationEvent);
        } catch (InterruptedException | TimeoutException e) {
            throw new WebDriverActionExecutionException("Exception while awaiting JS precondition", e, new InstanceBasedAutomationResultBuilder());
        }

        executeAfterJSPreconditionHasBeenSatisfied(driver, replayingState);
    }

    /**
     * The code to be executed after the condition was satisfied. The meat of the action
     * @param driver the driver instance
     * @param replayingState the current state of the replaying
     */
    public abstract void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState);

}
