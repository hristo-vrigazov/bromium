package com.hribol.bromium.common.filtering;

import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import static com.hribol.bromium.core.ConventionConstants.SUBMIT_EVENT_URL;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 02.08.17.
 */
public class UriContainsStringPredicateTest {

    @Test
    public void ifContainsSubmitUrlThenEventIsSubmitted() {
        String url = SUBMIT_EVENT_URL + "ico";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(url);
        UriContainsStringPredicate uriContainsStringPredicate = new UriContainsStringPredicate(SUBMIT_EVENT_URL);
        assertTrue(uriContainsStringPredicate.test(httpRequest));
    }

    @Test
    public void ifDoesNotContainSubmitUrlThenEventIsNotSubmitted() {
        String url = "http://something.com";
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(url);
        UriContainsStringPredicate uriContainsStringPredicate = new UriContainsStringPredicate(SUBMIT_EVENT_URL);
        assertFalse(uriContainsStringPredicate.test(httpRequest));
    }


}
