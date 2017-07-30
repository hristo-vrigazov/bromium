package com.hribol.bromium.replay.filters;

import com.hribol.bromium.replay.ReplayingState;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;

import java.net.URI;
import java.util.function.Predicate;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 30.07.17.
 */
public class ReplayResponseFilterTest {

    private URI baseURI = URI.create("http://something.com");
    private String injectionCode = "<script>function() {}</script>";
    private String htmlContent = "<html><head></head><body></body></html>";

    @Test
    public void appendsJavascriptIfisGETFromCurrentHostAndAcceptsHTML() {
        ReplayingState replayingState = mock(ReplayingState.class);
        HttpRequest httpRequest = mock(HttpRequest.class);
        HttpResponse httpResponse = mock(HttpResponse.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        when(httpMessageContents.getTextContents()).thenReturn(htmlContent);

        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);
        Predicate<HttpRequest> shouldInjectJavascriptPredicate = mock(Predicate.class);
        when(shouldInjectJavascriptPredicate.test(httpRequest)).thenReturn(true);

        ReplayResponseFilter replayResponseFilter = new ReplayResponseFilter(baseURI, injectionCode, replayingState,
                shouldInjectJavascriptPredicate);

        replayResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        String expected = injectionCode + httpMessageContents.getTextContents();
        verify(httpMessageContents).setTextContents(expected);
    }

}
