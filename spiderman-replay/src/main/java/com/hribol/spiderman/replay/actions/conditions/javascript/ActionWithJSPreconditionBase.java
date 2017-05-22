package com.hribol.spiderman.replay.actions.conditions.javascript;

import com.hribol.spiderman.replay.actions.WebDriverAction;
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
                if (!facade.setWaitingEvent(getJSEventToWaitFor(), lock)) {
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executeAfterJSPreconditionHasBeenSatisfied(driver, facade);
        facade.signalizeEventIsDone();
    }

    public abstract void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade);

}
