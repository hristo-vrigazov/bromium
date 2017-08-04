package com.hribol.bromium.common.utils;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.utils.ActionsFilter;
import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.URL;
import static com.hribol.bromium.core.utils.WebDriverActions.PAGE_LOADING;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.08.17.
 */
public class RequestToPageLoadingEventConverterTest {

    private final String BASE_URL = "http://localhost:3000/";
    private final String EXAMPLE_CONTINUATION = "ajax.html";
    private final String EXPECTED_URL = BASE_URL + EXAMPLE_CONTINUATION;
    private final String EXAMPLE_EVENT_NAME = "Load page with supplied value";

    @Test
    public void ifEventWithSuppliedValueMatchesTheUriThenEventIsReturned() throws MalformedURLException, UnsupportedEncodingException {
        ParameterConfiguration parameterConfiguration = mock(ParameterConfiguration.class);
        when(parameterConfiguration.isExposed()).thenReturn(false);
        when(parameterConfiguration.getValue()).thenReturn(EXAMPLE_CONTINUATION);

        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(applicationActionConfiguration.getName()).thenReturn(EXAMPLE_EVENT_NAME);
        when(applicationActionConfiguration.getWebDriverAction().getParametersConfiguration().get(URL)).thenReturn(parameterConfiguration);

        List<ApplicationActionConfiguration> applicationActionConfigurations = Arrays.asList(applicationActionConfiguration);
        ActionsFilter actionsFilter = mock(ActionsFilter.class);
        when(actionsFilter.filter(PAGE_LOADING)).thenReturn(applicationActionConfigurations);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(EXPECTED_URL);

        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        Map<String, String> expected = ImmutableMap.of(EVENT, EXAMPLE_EVENT_NAME);
        Map<String, String> actual = requestToPageLoadingEventConverter.convert(httpRequest);

        assertEquals(expected, actual);
    }

}
