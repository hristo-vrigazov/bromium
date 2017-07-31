package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

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

    private final String RANDOM_URL = "http://something.com";

    private final String EXAMPLE_CONDITION = "9890013";

    private final String EXAMPLE_CONDITION_SATISFIED_URL = CONDITION_SATISFIED_URL + "?" + EXAMPLE_CONDITION;

    private final String EXAMPLE_CONDITION_NOT_SATISFIED_URL = CONDITION_NOT_SATISFIED_URL + "?" + EXAMPLE_CONDITION;

    @Test
    public void invokesHttpUnlockAndAddsRequestToQueue() {
        baseTest(RANDOM_URL);
        verify(replayingState).addHttpRequestToQueue(httpMessageInfo.getOriginalRequest());
    }

    @Test
    public void invokesEventSatisfied() {
        baseTest(EXAMPLE_CONDITION_SATISFIED_URL);
        verify(replayingState).setConditionSatisfied(EXAMPLE_CONDITION);
    }

    @Test
    public void invokesEventNotSatisfied() {
        baseTest(EXAMPLE_CONDITION_NOT_SATISFIED_URL);
        verify(replayingState).setConditionNotSatisfied(EXAMPLE_CONDITION);
    }

    private void baseTest(String url) {
        when(httpRequest.getUri()).thenReturn(url);
        ReplayRequestFilter replayRequestFilter = new ReplayRequestFilter(replayingState);
        replayRequestFilter.filterRequest(httpRequest, httpMessageContents, httpMessageInfo);
    }

}
