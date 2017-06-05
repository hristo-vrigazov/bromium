package com.hribol.bromium.replay.actions.conditions.javascript;

import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import com.hribol.bromium.replay.execution.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.execution.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.filters.ReplayFiltersFacade;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

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
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        ReplayRequestFilter requestFilter = mock(ReplayRequestFilter.class);
        ReplayFiltersFacade facade = mock(ReplayFiltersFacade.class);
        when(facade.getRequestFilter()).thenReturn(requestFilter);
        when(facade.getEventSynchronizer()).thenReturn(eventSynchronizer);
        when(requestFilter.isSatisfied(jsEvent)).thenReturn(false);
        actionWithJSPreconditionBase.execute(driver, facade);

        verify(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));
    }

//    @Test
//    public void lockDoesWaitIfWaitingEventIsNotSatisfiedWhenSubmitted() throws InterruptedException {
//        String jsEvent = "jsEvent";
//
//        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase() {
//            @Override
//            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayFiltersFacade facade) {
//
//            }
//
//            @Override
//            public String getName() {
//                return null;
//            }
//
//            @Override
//            public boolean expectsHttpRequest() {
//                return false;
//            }
//
//            @Override
//            public String getJSEventToWaitFor() {
//                return jsEvent;
//            }
//        };
//
//        WebDriver driver = mock(WebDriver.class);
//        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
//        ReplayFiltersFacade facade = mock(ReplayFiltersFacade.class);
//        when(facade.getRequestFilter()).thenReturn(replayRequestFilter);
//        when(replayRequestFilter.isSatisfied(jsEvent)).thenReturn(true);
//        actionWithJSPreconditionBase.execute(driver, facade);
//
//    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doesNotCallExecuteIfInterruptedWhileWaiting() throws InterruptedException, TimeoutException {
        String jsEvent = "jsEvent";

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase() {
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
        ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        doThrow(new InterruptedException()).when(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));
        ReplayFiltersFacade facade = mock(ReplayFiltersFacade.class);
        when(facade.getRequestFilter()).thenReturn(replayRequestFilter);
        when(facade.getEventSynchronizer()).thenReturn(eventSynchronizer);
        when(replayRequestFilter.isSatisfied(jsEvent)).thenReturn(false);
        thrown.expect(WebDriverActionExecutionException.class);
        actionWithJSPreconditionBase.execute(driver, facade);

        actionWithJSPreconditionBase = spy(actionWithJSPreconditionBase);
        verify(actionWithJSPreconditionBase, never()).executeAfterJSPreconditionHasBeenSatisfied(driver, facade);
    }

}
