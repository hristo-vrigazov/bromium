package com.hribol.bromium.common.filtering;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.utils.Constants;
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

    private URI baseURI;

    private final static Logger logger = LoggerFactory.getLogger(GetHtmlFromCurrentHostPredicate.class);

    @Inject
    public GetHtmlFromCurrentHostPredicate(@Named(BASE_URI) URI baseURI) {
        this.baseURI = baseURI;
    }

    @Override
    public boolean test(HttpRequest httpRequest) {
        try {
            boolean methodIsGet = httpRequest.getMethod().equals(HttpMethod.GET);
            String acceptHeader = httpRequest.headers().get(ACCEPT);
            if (acceptHeader == null) {
                logger.warn("No accept header for http request " + httpRequest.getUri());
                return false;
            }
            boolean expectsHtmlContent = acceptHeader.contains(Constants.HTML);
            boolean isFromCurrentBaseUrl = httpRequest.getUri().startsWith("/") || httpRequest.getUri().contains(baseURI.getHost());
            return expectsHtmlContent && isFromCurrentBaseUrl && methodIsGet;
        } catch (Exception e) {
            logger.error("Exception while checking predicate", e);
            return false;
        }
    }
}
