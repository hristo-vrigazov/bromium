package record;

import com.hribol.spiderman.record.RecordResponseFilter;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 27.04.17.
 */
public class RecordResponseFilterTest {

    @Test
    public void ifQueryisFromCurrentHostAndAcceptsHTMLThenJSIsInjectedInIt() throws URISyntaxException {
        String jsInjectionCode = "<script>var something = 5;</script>";
        HttpResponse httpResponse = mock(HttpResponse.class);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("html");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.headers()).thenReturn(httpHeaders);
        when(httpRequest.getUri()).thenReturn("http://tenniskafe.com/a?p=a");
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);
        URI baseURI = new URI("http://tenniskafe.com");
        RecordResponseFilter recordResponseFilter = new RecordResponseFilter(baseURI, jsInjectionCode);
        recordResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        verify(httpMessageContents).setTextContents(jsInjectionCode + httpMessageContents.getTextContents());
    }

    @Test
    public void ifQueryisFromDifferentHostAndAcceptsHTMLThenJSIsNotInjectedInIt() throws URISyntaxException {
        String jsInjectionCode = "<script>var something = 5;</script>";
        HttpResponse httpResponse = mock(HttpResponse.class);
        HttpMessageContents httpMessageContents = mock(HttpMessageContents.class);
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("html");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.headers()).thenReturn(httpHeaders);
        when(httpRequest.getUri()).thenReturn("http://google.com/a?p=a");
        HttpMessageInfo httpMessageInfo = mock(HttpMessageInfo.class);
        when(httpMessageInfo.getOriginalRequest()).thenReturn(httpRequest);
        URI baseURI = new URI("http://tenniskafe.com");
        RecordResponseFilter recordResponseFilter = new RecordResponseFilter(baseURI, jsInjectionCode);
        recordResponseFilter.filterResponse(httpResponse, httpMessageContents, httpMessageInfo);

        verify(httpMessageContents, never()).setTextContents(jsInjectionCode + httpMessageContents.getTextContents());
    }
}
