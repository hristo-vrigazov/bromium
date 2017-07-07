package com.hribol.bromium.common.synchronization;

import com.hribol.bromium.replay.execution.synchronization.SignalizerEvent;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;
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
    ReplayRequestFilter replayRequestFilter = mock(ReplayRequestFilter.class);
    SignalizerEvent signalizerEvent = mock(SignalizerEvent.class);

    @Test
    public void correctlyReturnsName() {
        JSPrecondition jsPrecondition = new JSPrecondition(eventName, replayRequestFilter, signalizerEvent);
        assertEquals(eventName, jsPrecondition.getName());
    }

    @Test
    public void delegatesToReplayRequestFilter() {
        when(replayRequestFilter.isSatisfied(eventName)).thenReturn(true);
        JSPrecondition jsPrecondition = new JSPrecondition(eventName, replayRequestFilter, signalizerEvent);

        assertTrue(jsPrecondition.isSatisfied());
    }

    @Test
    public void delegatesToSignalizer() {
        JSPrecondition jsPrecondition = new JSPrecondition(eventName, replayRequestFilter, signalizerEvent);

        jsPrecondition.signalizeIsDone();

        verify(signalizerEvent).signalizeEvent(jsPrecondition);
    }
}
