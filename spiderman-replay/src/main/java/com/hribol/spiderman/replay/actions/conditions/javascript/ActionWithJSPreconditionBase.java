package com.hribol.spiderman.replay.actions.conditions.javascript;

import com.hribol.spiderman.replay.actions.WebDriverAction;
import com.hribol.spiderman.replay.execution.InstanceBasedAutomationResultBuilder;
import com.hribol.spiderman.replay.execution.WebDriverActionExecutionException;
import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import org.openqa.selenium.WebDriver;

/**
 * Created by hvrigazov on 21.05.17.
 */
public abstract class ActionWithJSPreconditionBase implements ActionWithJSPrecondition, WebDriverAction {

    protected final Object lock;

    protected ActionWithJSPreconditionBase() {
        this(new Object());
    }

    protected ActionWithJSPreconditionBase(Object lock) {
        this.lock = lock;
    }

    @Override
    public void execute(WebDriver driver, ReplayFiltersFacade facade) {
        synchronized (lock) {
            try {
                String hashCodeToWaitFor = String.valueOf(getJSEventToWaitFor().hashCode());
                if (!facade.getRequestFilter().setJSWaitingEvent(hashCodeToWaitFor, lock)) {
                    lock.wait();
                }
            } catch (InterruptedException e) {
                throw new WebDriverActionExecutionException("Interrupted while waiting for js", e);
            }
        }

        executeAfterJSPreconditionHasBeenSatisfied(driver, facade);
        facade.getRequestFilter().signalizeEventIsDone();
    }

    public abstract void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade);

}
