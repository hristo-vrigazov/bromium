package com.hribol.spiderman.replay.actions.conditions.javascript;

import com.hribol.spiderman.replay.filters.ReplayFiltersFacade;
import com.hribol.spiderman.replay.filters.ReplayRequestFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 22.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ReplayRequestFilter.class,
        Object.class,
        ReplayFiltersFacade.class,
        ActionWithJSPreconditionBase.class
})
public class ActionWithJSPreconditionBaseTest {

    @Test
    public void lockWaitsIfWaitingEventIsNotSatisfiedWhenSubmitted() throws InterruptedException {
        String jsEvent = "jsEvent";
        Object lock = PowerMockito.mock(Object.class);
        PowerMockito.doNothing().when(lock).wait();

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase(lock) {
            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade) {

            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public boolean expectsHttpRequest() {
                return false;
            }

            @Override
            public String getJSEventToWaitFor() {
                return jsEvent;
            }
        };

        WebDriver driver = mock(WebDriver.class);
        ReplayFiltersFacade facade = mock(ReplayFiltersFacade.class);
        when(facade.setWaitingEvent(jsEvent, lock)).thenReturn(false);
        actionWithJSPreconditionBase.execute(driver, facade);

        verify(lock).wait();
    }

    @Test
    public void lockDoesWaitIfWaitingEventIsNotSatisfiedWhenSubmitted() throws InterruptedException {
        String jsEvent = "jsEvent";
        Object lock = PowerMockito.mock(Object.class);
        PowerMockito.doNothing().when(lock).wait();

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase(lock) {
            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade) {

            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public boolean expectsHttpRequest() {
                return false;
            }

            @Override
            public String getJSEventToWaitFor() {
                return jsEvent;
            }
        };

        WebDriver driver = mock(WebDriver.class);
        ReplayFiltersFacade facade = mock(ReplayFiltersFacade.class);
        when(facade.setWaitingEvent(jsEvent, lock)).thenReturn(true);
        actionWithJSPreconditionBase.execute(driver, facade);

        verify(lock, never()).wait();
    }

    @Test
    public void doesNotCallExecuteIfInterruptedWhileWaiting() throws InterruptedException {
        String jsEvent = "jsEvent";
        Object lock = PowerMockito.mock(Object.class);
        PowerMockito.doThrow(new InterruptedException("interrupted!")).when(lock).wait();

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase(lock) {
            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade) {

            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public boolean expectsHttpRequest() {
                return false;
            }

            @Override
            public String getJSEventToWaitFor() {
                return jsEvent;
            }
        };

        WebDriver driver = mock(WebDriver.class);
        ReplayFiltersFacade facade = mock(ReplayFiltersFacade.class);
        when(facade.setWaitingEvent(jsEvent, lock)).thenReturn(false);
        actionWithJSPreconditionBase.execute(driver, facade);

        actionWithJSPreconditionBase = spy(actionWithJSPreconditionBase);
        verify(actionWithJSPreconditionBase, never()).executeAfterJSPreconditionHasBeenSatisfied(driver, facade);
    }

}