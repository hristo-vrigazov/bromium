package com.hribol.bromium.replay.actions.conditions.javascript;

import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.replay.execution.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.execution.synchronization.JSPrecondition;
import com.hribol.bromium.replay.execution.synchronization.SignalizerEvent;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeoutException;

/**
 * Created by hvrigazov on 21.05.17.
 */
public abstract class ActionWithJSPreconditionBase implements ActionWithJSPrecondition, WebDriverAction {

    @Override
    public void execute(WebDriver driver, ReplayFiltersFacade facade) {
        String hashCodeToWaitFor = String.valueOf(getJSEventToWaitFor().hashCode());
        EventSynchronizer eventSynchronizer = facade.getEventSynchronizer();
        SynchronizationEvent synchronizationEvent = new JSPrecondition(hashCodeToWaitFor, facade.getRequestFilter(), eventSynchronizer);
        try {
            facade.getRequestFilter().setSynchronizationEvent(synchronizationEvent);
            eventSynchronizer.awaitUntil(synchronizationEvent);
        } catch (InterruptedException | TimeoutException e) {
            throw new WebDriverActionExecutionException("Exception while awaiting JS precondition", e);
        }

        executeAfterJSPreconditionHasBeenSatisfied(driver, facade);
    }

    public abstract void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade);

}
