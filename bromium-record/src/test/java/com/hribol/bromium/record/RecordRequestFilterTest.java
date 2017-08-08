package com.hribol.bromium.record;

import com.hribol.bromium.core.utils.EventDetector;
import com.hribol.bromium.core.utils.HttpRequestToTestCaseStepConverter;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.*;
import java.util.function.Predicate;

import static com.hribol.bromium.core.ConventionConstants.SUBMIT_EVENT_URL;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordRequestFilterTest {

    @Test
    public void addsRequestIfItHasTo() throws MalformedURLException, UnsupportedEncodingException {
        HttpRequest httpRequest = mock(HttpRequest.class);
        Map<String, String> event = getEvent();
        when(httpRequest.getUri()).thenReturn(SUBMIT_EVENT_URL + "?event=mockEvent&text=mockText");
        Predicate<HttpRequest> httpRequestPredicate = mock(Predicate.class);
        when(httpRequestPredicate.test(httpRequest)).thenReturn(true);
        RecordingState recordingState = mock(RecordingState.class);
        HttpRequestToTestCaseStepConverter httpRequestToTestCaseStepConverter = mock(HttpRequestToTestCaseStepConverter.class);
        when(httpRequestToTestCaseStepConverter.convert(httpRequest)).thenReturn(Optional.ofNullable(event));
        EventDetector eventDetector = mock(EventDetector.class);
        when(eventDetector.canDetectPredicate()).thenReturn(httpRequestPredicate);
        when(eventDetector.getConverter()).thenReturn(httpRequestToTestCaseStepConverter);
        List<EventDetector> eventDetectors = Arrays.asList(eventDetector);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState, eventDetectors);
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));

        verify(recordingState).storeTestCaseStep(event);
    }

    @Test
    public void doesNotAddRequestIfNotRequired() {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://something/" + "?event=mockEvent&text=mockText");
        RecordingState recordingState = mock(RecordingState.class);
        Predicate<HttpRequest> httpRequestPredicate = mock(Predicate.class);
        when(httpRequestPredicate.test(httpRequest)).thenReturn(false);
        HttpRequestToTestCaseStepConverter httpRequestToTestCaseStepConverter = mock(HttpRequestToTestCaseStepConverter.class);
        EventDetector eventDetector = mock(EventDetector.class);
        when(eventDetector.canDetectPredicate()).thenReturn(httpRequestPredicate);
        when(eventDetector.getConverter()).thenReturn(httpRequestToTestCaseStepConverter);
        List<EventDetector> eventDetectors = Arrays.asList(eventDetector);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState, eventDetectors);
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));
        verify(recordingState, never()).storeTestCaseStep(anyMap());
    }

    @Test
    public void doesNotAddToQueueIfURLIsMalformed() throws MalformedURLException, UnsupportedEncodingException {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("blabla" + SUBMIT_EVENT_URL);
        RecordingState recordingState = mock(RecordingState.class);
        Predicate<HttpRequest> httpRequestPredicate = mock(Predicate.class);
        when(httpRequestPredicate.test(httpRequest)).thenReturn(true);
        HttpRequestToTestCaseStepConverter httpRequestToTestCaseStepConverter = mock(HttpRequestToTestCaseStepConverter.class);
        when(httpRequestToTestCaseStepConverter.convert(httpRequest)).thenThrow(new MalformedURLException());
        EventDetector eventDetector = mock(EventDetector.class);
        when(eventDetector.canDetectPredicate()).thenReturn(httpRequestPredicate);
        when(eventDetector.getConverter()).thenReturn(httpRequestToTestCaseStepConverter);
        List<EventDetector> eventDetectors = Arrays.asList(eventDetector);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState, eventDetectors);
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));
        verify(recordingState, never()).storeTestCaseStep(anyMap());
    }

    @Test
    public void doesNotAddToStateIfConverterReturnsEmpty() throws MalformedURLException, UnsupportedEncodingException {
        HttpRequest httpRequest = mock(HttpRequest.class);
        Map<String, String> event = getEvent();
        when(httpRequest.getUri()).thenReturn(SUBMIT_EVENT_URL + "?event=mockEvent&text=mockText");
        Predicate<HttpRequest> httpRequestPredicate = mock(Predicate.class);
        when(httpRequestPredicate.test(httpRequest)).thenReturn(true);
        RecordingState recordingState = mock(RecordingState.class);
        HttpRequestToTestCaseStepConverter httpRequestToTestCaseStepConverter = mock(HttpRequestToTestCaseStepConverter.class);
        when(httpRequestToTestCaseStepConverter.convert(httpRequest)).thenReturn(Optional.empty());
        EventDetector eventDetector = mock(EventDetector.class);
        when(eventDetector.canDetectPredicate()).thenReturn(httpRequestPredicate);
        when(eventDetector.getConverter()).thenReturn(httpRequestToTestCaseStepConverter);
        List<EventDetector> eventDetectors = Arrays.asList(eventDetector);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState, eventDetectors);
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));

        verify(recordingState, never()).storeTestCaseStep(event);
    }

    @Test
    public void doesNotAddToQueueIfEncodingIsUnsupporte() throws MalformedURLException, UnsupportedEncodingException {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("blabla" + SUBMIT_EVENT_URL);
        RecordingState recordingState = mock(RecordingState.class);
        Predicate<HttpRequest> httpRequestPredicate = mock(Predicate.class);
        when(httpRequestPredicate.test(httpRequest)).thenReturn(true);
        HttpRequestToTestCaseStepConverter httpRequestToTestCaseStepConverter = mock(HttpRequestToTestCaseStepConverter.class);
        when(httpRequestToTestCaseStepConverter.convert(httpRequest)).thenThrow(new UnsupportedEncodingException());
        EventDetector eventDetector = mock(EventDetector.class);
        when(eventDetector.canDetectPredicate()).thenReturn(httpRequestPredicate);
        when(eventDetector.getConverter()).thenReturn(httpRequestToTestCaseStepConverter);
        List<EventDetector> eventDetectors = Arrays.asList(eventDetector);
        RecordRequestFilter requestFilter = new RecordRequestFilter(recordingState, eventDetectors);
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
