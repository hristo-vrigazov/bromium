package com.hribol.bromium.record;

import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.SUBMIT_EVENT_URL;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordRequestFilterTest {

    @Test
    public void addsRequestIfItHasTo() {
        HttpRequest httpRequest = mock(HttpRequest.class);
        Map<String, String> event = getEvent();
        when(httpRequest.getUri()).thenReturn(SUBMIT_EVENT_URL + "?event=mockEvent&text=mockText");
        RecordRequestFilter requestFilter = new RecordRequestFilter();
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));
        List<Map<String, String>> applicationSpecificActionList = requestFilter.getApplicationSpecificActionList();

        assertTrue(applicationSpecificActionList.size() == 1);
        assertEquals(applicationSpecificActionList.get(0), event);
    }

    @Test
    public void doesNotAddRequestIfNotRequired() {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://something/" + "?event=mockEvent&text=mockText");
        RecordRequestFilter requestFilter = new RecordRequestFilter();
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));
        List<Map<String, String>> applicationSpecificActionList = requestFilter.getApplicationSpecificActionList();

        assertTrue(applicationSpecificActionList.isEmpty());
    }

    @Test
    public void doesNotAddToQueueIfURLIsMalformed() {
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("blabla" + SUBMIT_EVENT_URL);
        RecordRequestFilter requestFilter = new RecordRequestFilter();
        requestFilter.filterRequest(httpRequest, mock(HttpMessageContents.class), mock(HttpMessageInfo.class));
        List<Map<String, String>> applicationSpecificActionList = requestFilter.getApplicationSpecificActionList();
        assertTrue(applicationSpecificActionList.isEmpty());
    }

    private Map<String, String> getEvent() {
        Map<String, String> event = new HashMap<>();
        event.put("event", "mockEvent");
        event.put("text", "mockText");
        return event;
    }
}
