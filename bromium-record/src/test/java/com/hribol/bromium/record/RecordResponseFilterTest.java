package com.hribol.bromium.record;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.net.URISyntaxException;
import java.util.function.Predicate;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordResponseFilterTest {

    private final String injectionCode = "<script>function() {}</script>";
    private final String htmlContent = "<html><head></head><body></body></html>";
    private final String expected = injectionCode + htmlContent;

    private HttpMessageContents httpMessageContents;

    @Test
    public void ifPredicateIsOKThenJsIsInjected() throws URISyntaxException {
        baseTest(true);
        verify(httpMessageContents).setTextContents(expected);
    }

    @Test
    public void ifPredicateIsNotOKThenItIsNotInjected() throws URISyntaxException {
        baseTest(false);
        verify(httpMessageContents, never()).setTextContents(expected);
    }

    private void baseTest(boolean predicateReturnValue) {
        HttpRequest httpRequest = mock(HttpRequest.class);
        HttpResponse httpResponse = mock(HttpResponse.class);
        httpMessageContents = mock(HttpMessageContents.class);
        when(httpMessageContents.getTextContents()).thenReturn(htmlContent);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        Predicate<HttpRequest> predicate = mock(Predicate.class);
        when(predicate.test(httpRequest)).thenReturn(predicateReturnValue);

        RecordResponseFilter recordResponseFilter = new RecordResponseFilter(injectionCode, predicate);
        recordResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);
    }

}
