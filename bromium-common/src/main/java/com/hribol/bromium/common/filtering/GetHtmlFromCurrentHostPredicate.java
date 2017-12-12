package com.hribol.bromium.common.filtering;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.utils.Constants;
import com.hribol.bromium.record.RecordRequestFilter;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.function.Predicate;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URI;
import static io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT;

/**
 * A predicate which checks whether a given {@link HttpRequest} is from the same host as the baseURI, uses GET verb and
 * accepts html as response
 */
public class GetHtmlFromCurrentHostPredicate implements Predicate<HttpRequest> {

    private static final Logger logger = LoggerFactory.getLogger(GetHtmlFromCurrentHostPredicate.class);

    private URI baseURI;

    @Inject
    public GetHtmlFromCurrentHostPredicate(@Named(BASE_URI) URI baseURI) {
        this.baseURI = baseURI;
    }

    @Override
    public boolean test(HttpRequest httpRequest) {
        boolean methodIsGet = httpRequest.getMethod().equals(HttpMethod.GET);
        if (httpRequest.headers().get(ACCEPT) == null) {
            return false;
        }
        boolean expectsHtmlContent = httpRequest.headers().get(ACCEPT).contains(Constants.HTML);
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost()) || httpRequest.getUri().startsWith("/");
        return expectsHtmlContent && isFromCurrentBaseUrl && methodIsGet;
    }
}
