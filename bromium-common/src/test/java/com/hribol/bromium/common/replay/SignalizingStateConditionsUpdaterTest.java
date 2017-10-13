package com.hribol.bromium.common.replay;

import com.hribol.bromium.replay.ReplayingState;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 10.10.17.
 */
public class SignalizingStateConditionsUpdaterTest {

    @Test
    public void setsConditionAndDelegatesSignalizationIfNeededToReplayingState() {
        String event = "event";
        ReplayingState replayingState = mock(ReplayingState.class);

        SignalizingStateConditionsUpdater signalizingStateConditionsUpdater = new SignalizingStateConditionsUpdater();

        signalizingStateConditionsUpdater.update(replayingState, event);

        verify(replayingState).setConditionSatisfied(event);
        verify(replayingState).signalizeIfSynchronizationEventIsSatisfied();
    }

}
