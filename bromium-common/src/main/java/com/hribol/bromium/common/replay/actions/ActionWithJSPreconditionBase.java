package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.common.replay.InstanceBasedAutomationResultBuilder;
import com.hribol.bromium.common.synchronization.JSPrecondition;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.ActionWithJSPrecondition;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/**
 * A base class for all actions that need a js condition to be satisfied before they can be executed.
 * An example would be a click on an element with an id, the js condition would be that the element is present
 * in the DOM.
 */
public abstract class ActionWithJSPreconditionBase implements ActionWithJSPrecondition, WebDriverAction {

    private static final Logger logger = LoggerFactory.getLogger(ActionWithJSPreconditionBase.class);

    private Function<WebDriver, SearchContext> contextProvider;

    protected ActionWithJSPreconditionBase(Function<WebDriver, SearchContext> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override
    public void execute(WebDriver driver, ReplayingState replayingState, EventSynchronizer eventSynchronizer) {
        String hashCodeToWaitFor = String.valueOf(getJSEventToWaitFor().hashCode());
        logger.info("Condition {} has hashcode {}", getJSEventToWaitFor(), hashCodeToWaitFor);
        SynchronizationEvent synchronizationEvent = new JSPrecondition(hashCodeToWaitFor, eventSynchronizer, replayingState);
        try {
            eventSynchronizer.awaitUntil(synchronizationEvent);
        } catch (InterruptedException | TimeoutException e) {
            throw new WebDriverActionExecutionException("Exception while awaiting JS precondition", e, new InstanceBasedAutomationResultBuilder());
        }

        executeAfterJSPreconditionHasBeenSatisfied(driver, replayingState, contextProvider);
    }

    /**
     * The code to be executed after the condition was satisfied. The meat of the action
     * @param driver the driver instance
     * @param replayingState the current state of the replaying
     * @param contextProvider
     */
    public abstract void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<WebDriver, SearchContext> contextProvider);

    @Override
    public String getName() {
        return getJSEventToWaitFor();
    }

}
