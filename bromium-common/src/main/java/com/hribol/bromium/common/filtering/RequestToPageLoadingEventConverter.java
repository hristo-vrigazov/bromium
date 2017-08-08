package com.hribol.bromium.common.filtering;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.utils.ActionsFilter;
import com.hribol.bromium.core.utils.Constants;
import com.hribol.bromium.core.utils.HttpRequestToTestCaseStepConverter;
import io.netty.handler.codec.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.core.ConventionConstants.LINK_INTERCEPTOR_MARKER;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.WebDriverActions.PAGE_LOADING;

/**
 * Created by hvrigazov on 03.08.17.
 */
public class RequestToPageLoadingEventConverter implements HttpRequestToTestCaseStepConverter {

    private final String baseUrl;
    private List<ApplicationActionConfiguration> applicationActionConfigurations;

    public RequestToPageLoadingEventConverter(String baseUrl,
                                              ActionsFilter actionsFilter) {
        this.baseUrl = baseUrl;
        this.applicationActionConfigurations = actionsFilter.filter(PAGE_LOADING);
    }

    @Override
    public Optional<Map<String, String>> convert(HttpRequest httpRequest) throws MalformedURLException, UnsupportedEncodingException {
        String requestUri = httpRequest.getUri();

        if (!requestUri.startsWith(baseUrl)) {
            throw new IllegalArgumentException("I am not responsible for this request URL: " + requestUri);
        }

        if (requestUri.endsWith(LINK_INTERCEPTOR_MARKER)) {
            httpRequest.setUri(requestUri.split(LINK_INTERCEPTOR_MARKER)[0]);
            return Optional.empty();
        }

        for (ApplicationActionConfiguration applicationActionConfiguration: applicationActionConfigurations) {
            ParameterConfiguration urlParameterConfiguration = applicationActionConfiguration
                    .getWebDriverAction()
                    .getParametersConfiguration()
                    .get(Constants.URL);

            // first the easy case; if the value is hardcoded in the configuration
            // and the current url matches, then we have found the action
            if (!urlParameterConfiguration.isExposed()) {
                String expectedUrl = baseUrl + urlParameterConfiguration.getValue();
                if (expectedUrl.equals(requestUri)) {
                    return Optional.of(ImmutableMap.of(EVENT, applicationActionConfiguration.getName()));
                }
            } else {
                String urlContinuation = requestUri.split(baseUrl)[1];
                return Optional.of(ImmutableMap.of(
                        EVENT, applicationActionConfiguration.getName(),
                        urlParameterConfiguration.getAlias(), urlContinuation
                ));
            }
        }

        return Optional.empty();
    }
}
