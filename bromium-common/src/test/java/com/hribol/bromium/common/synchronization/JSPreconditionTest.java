package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.core.synchronization.EventSignalizer;
import com.hribol.bromium.replay.ReplayingState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 05.06.17.
 */
public class JSPreconditionTest {

    String eventName = "JS_CONDITION";
    EventSignalizer eventSignalizer = mock(EventSignalizer.class);
    ReplayingState replayingState = mock(ReplayingState.class);

    @Test
    public void correctlyReturnsName() {
        JSPrecondition jsPrecondition = new JSPrecondition(eventName, eventSignalizer, replayingState);
        assertEquals(eventName, jsPrecondition.getName());
    }

    @Test
    public void delegatesToReplayRequestFilter() {
        when(replayingState.isSatisfied(eventName)).thenReturn(true);
        JSPrecondition jsPrecondition = new JSPrecondition(eventName, eventSignalizer, replayingState);

        assertTrue(jsPrecondition.isSatisfied());
    }

    @Test
    public void delegatesToSignalizer() {
        JSPrecondition jsPrecondition = new JSPrecondition(eventName, eventSignalizer, replayingState);

        jsPrecondition.signalizeIsDone();

        verify(eventSignalizer).signalizeEvent(jsPrecondition);
    }
}
