package unit.utils;

import com.hribol.spiderman.core.utils.Utils;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class UtilsTest {

    @Test
    public void isChangingRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/html");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://google.com");
        when(httpRequest.headers()).thenReturn(httpHeaders);

        assertFalse(Utils.isFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }

    @Test
    public void whenRequestedTypeIsNotHTMLThenNotChangingURLRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/json");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://google.com");
        when(httpRequest.headers()).thenReturn(httpHeaders);
        assertFalse(Utils.isFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }

    @Test
    public void whenTheHostIsTheSameThenNotChangingURLRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/json");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://tenniskafe.com/atp");
        when(httpRequest.headers()).thenReturn(httpHeaders);
        assertFalse(Utils.isFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }

    @Test
    public void whenHostIsDifferentAndContentTypeIsNotHTPNotChangingURLRequest() throws URISyntaxException {
        URI uri = new URI("http://tenniskafe.com");
        HttpHeaders httpHeaders = mock(HttpHeaders.class);
        when(httpHeaders.get("Accept")).thenReturn("application/html");
        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn("http://tenniskafe.com");
        when(httpRequest.headers()).thenReturn(httpHeaders);
        assertTrue(Utils.isFromCurrentHostAndAcceptsHTML(uri, httpRequest));
    }
}
