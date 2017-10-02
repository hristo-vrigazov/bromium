package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hribol.bromium.core.utils.Constants.CONDITION_NOT_SATISFIED_URL;
import static com.hribol.bromium.core.utils.Constants.CONDITION_SATISFIED_URL;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 31.07.17.
 */
public class ReplayRequestFilterTest {

    ReplayingState replayingState = mock(ReplayingState.class);

    HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);

    HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class, RETURNS_DEEP_STUBS);

    HttpRequest httpRequest = mock(HttpRequest.class);

    private final String EXAMPLE_CONDITION = "9890013";

    private final String RANDOM_URL = "http://something.com/?" + EXAMPLE_CONDITION;


    StateConditionsUpdater stateConditionsUpdater = mock(StateConditionsUpdater.class);

    @Test
    public void invokesConditionsUpdatersThatShouldAndDoesNotThoseWhoShouldNot() {
        baseTest(RANDOM_URL);
        verify(stateConditionsUpdater).update(replayingState, EXAMPLE_CONDITION);
    }

    private void baseTest(String url) {
        when(httpRequest.getUri()).thenReturn(url);
        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(replayingState, getConditionUpdaters());
        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);
    }

    private List<ConditionsUpdater> getConditionUpdaters() {
        return Arrays.asList(getConditionsUpdaterThatShouldNotBe(), getConditionsUpdaterThatShouldBeTriggered());
    }

    private ConditionsUpdater getConditionsUpdaterThatShouldNotBe() {
        ConditionsUpdater conditionsUpdater = mock(ConditionsUpdater.class);
        when(conditionsUpdater.shouldUpdate()).thenReturn(request -> false);
        return conditionsUpdater;
    }

    private ConditionsUpdater getConditionsUpdaterThatShouldBeTriggered() {
        ConditionsUpdater conditionsUpdater = mock(ConditionsUpdater.class);
        when(conditionsUpdater.shouldUpdate()).thenReturn(request -> true);
        when(conditionsUpdater.updater()).thenReturn(stateConditionsUpdater);
        return conditionsUpdater;
    }
}
