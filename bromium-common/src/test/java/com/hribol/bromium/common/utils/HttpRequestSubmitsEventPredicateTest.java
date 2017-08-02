package com.hribol.bromium.common.utils;

import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import static com.hribol.bromium.core.utils.Constants.SUBMIT_EVENT_URL;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 02.08.17.
 */
public class HttpRequestSubmitsEventPredicateTest {

    @Test
    public void ifContainsSubmitUrlThenEventIsSubmitted() {
        String url = SUBMIT_EVENT_URL + "ico";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(url);
        HttpRequestSubmitsEventPredicate httpRequestSubmitsEventPredicate = new HttpRequestSubmitsEventPredicate();
        assertTrue(httpRequestSubmitsEventPredicate.test(httpRequest));
    }

    @Test
    public void ifDoesNotContainSubmitUrlThenEventIsNotSubmitted() {
        String url = "http://something.com";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(url);
        HttpRequestSubmitsEventPredicate httpRequestSubmitsEventPredicate = new HttpRequestSubmitsEventPredicate();
        assertFalse(httpRequestSubmitsEventPredicate.test(httpRequest));
    }


}
