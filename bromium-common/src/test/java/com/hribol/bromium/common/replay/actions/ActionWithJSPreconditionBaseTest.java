package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.config.SearchContextFunction;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.synchronization.SynchronizationEvent;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.execution.WebDriverActionExecutionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeoutException;
import java.util.function.Function;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.05.17.
 */
public class ActionWithJSPreconditionBaseTest {

    @Test
    public void lockCallsAWaitIfWaitingEventIsNotSatisfiedWhenSubmitted() throws InterruptedException, TimeoutException {
        String jsEvent = "jsEvent";
        WebDriver driver = mock(WebDriver.class);
        SearchContextFunction contextProvider = webDriver1 -> driver;

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase(contextProvider) {

            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<SearchContext, SearchContext> contextProvider) {

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

        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        ReplayingState replayingState = mock(ReplayingState.class);
        actionWithJSPreconditionBase.execute(driver, replayingState, eventSynchronizer);

        verify(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));
    }

    @Test
    public void lockDoesWaitIfWaitingEventIsNotSatisfiedWhenSubmitted() throws InterruptedException, TimeoutException {
        String jsEvent = "jsEvent";
        WebDriver driver = mock(WebDriver.class);

        SearchContextFunction contextProvider = webDriver1 -> driver;

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase(contextProvider) {

            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<SearchContext, SearchContext> contextProvider) {

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

        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        ReplayingState replayingState = mock(ReplayingState.class);
        when(replayingState.isSatisfied(jsEvent)).thenReturn(true);
        actionWithJSPreconditionBase.execute(driver, replayingState, eventSynchronizer);

        verify(eventSynchronizer).awaitUntil(any());

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doesNotCallExecuteIfInterruptedWhileWaiting() throws InterruptedException, TimeoutException {
        String jsEvent = "jsEvent";
        WebDriver driver = mock(WebDriver.class);
        SearchContextFunction contextProvider = webDriver1 -> driver;

        ActionWithJSPreconditionBase actionWithJSPreconditionBase = new ActionWithJSPreconditionBase(contextProvider) {

            @Override
            public void executeAfterJSPreconditionHasBeenSatisfied(WebDriver driver, ReplayingState replayingState, Function<SearchContext, SearchContext> contextProvider) {

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

        EventSynchronizer eventSynchronizer = mock(EventSynchronizer.class);
        doThrow(new InterruptedException()).when(eventSynchronizer).awaitUntil(any(SynchronizationEvent.class));
        ReplayingState replayingState = mock(ReplayingState.class);
        when(replayingState.isSatisfied(jsEvent)).thenReturn(false);
        thrown.expect(WebDriverActionExecutionException.class);
        actionWithJSPreconditionBase.execute(driver, replayingState, eventSynchronizer);

        actionWithJSPreconditionBase = Mockito.spy(actionWithJSPreconditionBase);
        verify(actionWithJSPreconditionBase, never()).executeAfterJSPreconditionHasBeenSatisfied(driver, replayingState, contextProvider);
    }

}
