package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.util.function.Predicate;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 30.07.17.
 */
public class ReplayResponseFilterTest {

    private String injectionCode = "<script>function() {}</script>";
    private String htmlContent = "<html><head></head><body></body></html>";
    private String expected = injectionCode + htmlContent;
    private ReplayingState replayingState = mock(ReplayingState.class);
    private HttpRequest httpRequest = mock(HttpRequest.class);
    private HttpResponse httpResponse = mock(HttpResponse.class);
    private HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
    private HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
    private Predicate<HttpRequest> shouldInjectJavascriptPredicate = mock(Predicate.class);

    @Test
    public void appendsJavascriptIfisGETFromCurrentHostAndAcceptsHTML() {
        baseTest(true);
        verify(httpMessageContents).setTextContents(expected);
    }

    @Test
    public void doesNotJavascriptIfisGETFromCurrentHostAndAcceptsHTML() {
        baseTest(false);
        verify(httpMessageContents, never()).setTextContents(expected);
    }

    private void baseTest(boolean predicateReturnValue) {
        when(httpMessageContents.getTextContents()).thenReturn(htmlContent);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        when(shouldInjectJavascriptPredicate.test(httpRequest)).thenReturn(predicateReturnValue);

        ReplayResponseFilter replayResponseFilter = new ReplayResponseFilter(injectionCode, replayingState,
                shouldInjectJavascriptPredicate);

        replayResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);
    }


}
