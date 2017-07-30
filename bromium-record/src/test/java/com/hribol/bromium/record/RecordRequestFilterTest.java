package com.hribol.bromium.record;

import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.SUBMIT_EVENT_URL;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordRequestFilterTest {

    @Test
    public void addsRequestIfItHasTo() {
        HttpRequest httpRequest = mock(HttpRequest.class);
        Map<String, String> event = getEvent();
        when(httpRequest.getUri()).thenReturn(SUBMIT_EVENT_URL + "?event=mockEvent&text=mockText");
        RecordingState recordingState = mock(RecordingState.class);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState);
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));

        verify(recordingState).storeTestCaseStep(event);
    }

    @Test
    public void doesNotAddRequestIfNotRequired() {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://something/" + "?event=mockEvent&text=mockText");
        RecordingState recordingState = mock(RecordingState.class);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState);
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));
        verify(recordingState, never()).storeTestCaseStep(anyMap());
    }

    @Test
    public void doesNotAddToQueueIfURLIsMalformed() {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("blabla" + SUBMIT_EVENT_URL);
        RecordingState recordingState = mock(RecordingState.class);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState);
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));
        verify(recordingState, never()).storeTestCaseStep(anyMap());
    }

    private Map<String, String> getEvent() {
        Map<String, String> event = new HashMap<>();
        event.put("event", "mockEvent");
        event.put("text", "mockText");
        return event;
    }
}
