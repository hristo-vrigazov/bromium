package com.hribol.bromium.record;

import com.hribol.bromium.replay.config.utils.Utils;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.URI;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        Utils.class,
        RecordResponseFilter.class
})
public class RecordResponseFilterTest {

    @Test
    public void ifQueryisFromCurrentHostAndAcceptsHTMLThenJSIsInjectedInIt() throws URISyntaxException {
        String jsInjectionCode = "<script>var something = 5;</script>";
        HttpResponse httpResponse = mock(HttpResponse.class);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.headers()).thenReturn(httpHeaders);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);
        URI baseURI = new URI("http://tenniskafe.com");
        RecordResponseFilter recordResponseFilter = new RecordResponseFilter(baseURI, jsInjectionCode);

        PowerMockito.mockStatic(Utils.class);
        when(Utils.isGETFromCurrentHostAndAcceptsHTML(baseURI, httpRequest)).thenReturn(true);

        recordResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        verify(httpMessageContents).setTextContents(jsInjectionCode + httpMessageContents.getTextContents());
    }

    @Test
    public void ifQueryisFromDifferentHostAndAcceptsHTMLThenJSIsNotInjectedInIt() throws URISyntaxException {
        String jsInjectionCode = "<script>var something = 5;</script>";
        HttpResponse httpResponse = mock(HttpResponse.class);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpRequest httpRequest = mock(HttpRequest.class);
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);

        URI baseURI = new URI("http://tenniskafe.com");

        PowerMockito.mockStatic(Utils.class);
        when(Utils.isGETFromCurrentHostAndAcceptsHTML(baseURI, httpRequest)).thenReturn(false);

        RecordResponseFilter recordResponseFilter = new RecordResponseFilter(baseURI, jsInjectionCode);
        recordResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        verify(httpMessageContents, never()).setTextContents(jsInjectionCode + httpMessageContents.getTextContents());
    }
}
