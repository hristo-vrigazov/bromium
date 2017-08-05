package com.hribol.bromium.common.utils;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URL;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.URL;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.utils.ActionsFilter;
import com.hribol.bromium.core.utils.HttpRequestToTestCaseStepConverter;
import io.netty.handler.codec.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

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
    public Map<String, String> convert(HttpRequest httpRequest) throws MalformedURLException, UnsupportedEncodingException {
        String requestUri = httpRequest.getUri();

        if (!requestUri.startsWith(baseUrl)) {
            throw new IllegalArgumentException("I am not responsible for this request URL: " + requestUri);
        }

        for (ApplicationActionConfiguration applicationActionConfiguration: applicationActionConfigurations) {
            ParameterConfiguration urlParameterConfiguration = applicationActionConfiguration
                    .getWebDriverAction()
                    .getParametersConfiguration()
                    .get(URL);

            // first the easy case; if the value is hardcoded in the configuration
            // and the current url matches, then we have found the action
            if (!urlParameterConfiguration.isExposed()) {
                String expectedUrl = baseUrl + urlParameterConfiguration.getValue();
                if (expectedUrl.equals(requestUri)) {
                    return ImmutableMap.of(EVENT, applicationActionConfiguration.getName());
                }
            }
        }

        return null;
    }
}
