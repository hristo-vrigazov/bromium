package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeoutException;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 22.05.17.
 */
public class ActionWithJSPreconditionBaseTest {

    @Test
    public void lockCallsAWaitIfWaitingEventIsNotSatisfiedWhenSubmitted() throws InterruptedException, TimeoutException {
        String jsEvent = "jsEvent";

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase() {

            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {

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
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        ReplayingState replayingState = mock(ReplayingState.class);
        when(replayingState.isSatisfied(jsEvent)).thenReturn(false);
        when(replayingState.getEventSynchronizer()).thenReturn(eventSynchronizer);
        actionWithJSPreconditionBase.execute(driver, replayingState);

        verify(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));
    }

    @Test
    public void lockDoesWaitIfWaitingEventIsNotSatisfiedWhenSubmitted() throws InterruptedException, TimeoutException {
        String jsEvent = "jsEvent";

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase() {

            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {

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
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        ReplayingState replayingState = mock(ReplayingState.class);
        when(replayingState.getEventSynchronizer()).thenReturn(eventSynchronizer);
        when(replayingState.isSatisfied(jsEvent)).thenReturn(true);
        actionWithJSPreconditionBase.execute(driver, replayingState);

        verify(eventSynchronizer).awaitUntil(any());

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doesNotCallExecuteIfInterruptedWhileWaiting() throws InterruptedException, TimeoutException {
        String jsEvent = "jsEvent";

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase() {

            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState) {

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
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        doThrow(new InterruptedException()).when(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));
        ReplayingState replayingState = mock(ReplayingState.class);
        when(replayingState.isSatisfied(jsEvent)).thenReturn(false);
        when(replayingState.getEventSynchronizer()).thenReturn(eventSynchronizer);
        thrown.expect(WebDriverActionExecutionException.class);
        actionWithJSPreconditionBase.execute(driver, replayingState);

        actionWithJSPreconditionBase = Mockito.spy(actionWithJSPreconditionBase);
        verify(actionWithJSPreconditionBase, never()).executeAfterJSPreconditionHasBeenSatisfied(driver, replayingState);
    }

}
