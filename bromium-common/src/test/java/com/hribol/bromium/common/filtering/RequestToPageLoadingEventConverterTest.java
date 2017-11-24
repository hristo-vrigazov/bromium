package com.hribol.bromium.common.filtering;

import com.google.common.collect.ImmutableMap;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.utils.ActionsFilter;
import io.netty.handler.codec.http.HttpRequest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.core.ConventionConstants.LINK_INTERCEPTOR_MARKER;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.PAGE;
import static com.hribol.bromium.core.utils.WebDriverActions.PAGE_LOADING;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
    private final String WRONG_URL = "http://something/" + EXAMPLE_CONTINUATION;
    private final String EXAMPLE_EVENT_NAME = "Load page with supplied value";
    private final String ALIAS_PARAMETER = "ALIAS_PARAMETER";
    private final String URL_THAT_IS_NOT_EQUAL_TO_EXPECTED = BASE_URL + EXAMPLE_CONTINUATION + "?p=2";

    @Test
    public void ifEventWithSuppliedValueMatchesTheUriThenEventIsReturned() throws MalformedURLException, UnsupportedEncodingException {
        ActionsFilter actionsFilter = createMocks(false);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(EXPECTED_URL);

        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        Map<String, String> expected = ImmutableMap.of(EVENT, EXAMPLE_EVENT_NAME);
        Optional<Map<String, String>> actual = requestToPageLoadingEventConverter.convert(httpRequest);

        assertTrue(actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void exceptionIsThrownIfBaseUrlDoesNotMatch() throws MalformedURLException, UnsupportedEncodingException {
        ActionsFilter actionsFilter = createMocks(false);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(WRONG_URL);

        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        expectedException.expect(IllegalArgumentException.class);
        requestToPageLoadingEventConverter.convert(httpRequest);
    }

    @Test
    public void ifNoPageLoadingActions_OptionalEmptyIsReturned() throws MalformedURLException, UnsupportedEncodingException {
        ActionsFilter actionsFilter = createMocks(false);
        when(actionsFilter.filter(PAGE_LOADING)).thenReturn(new ArrayList<>());

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(EXPECTED_URL);
        
        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        Optional<Map<String, String>> expected = Optional.empty();
        Optional<Map<String, String>> actual = requestToPageLoadingEventConverter.convert(httpRequest);

        assertEquals(expected, actual);
    }

    @Test
    public void ifActionIsNotExposedButTheUrlIsDifferentThenEmptyOptionalIsReturned() throws MalformedURLException, UnsupportedEncodingException {
        ActionsFilter actionsFilter = createMocks(false);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(URL_THAT_IS_NOT_EQUAL_TO_EXPECTED);

        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        Optional<Map<String, String>> expected = Optional.empty();
        Optional<Map<String, String>> actual = requestToPageLoadingEventConverter.convert(httpRequest);

        assertEquals(expected, actual);
    }

    @Test
    public void ifUrlEndsInInterceptorMarkerUriIsRewrittenAndEmptyEventIsReturned() throws MalformedURLException, UnsupportedEncodingException {
        ActionsFilter actionsFilter = createMocks(false);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(EXPECTED_URL + LINK_INTERCEPTOR_MARKER);

        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        Optional<Map<String, String>> expected = Optional.empty();
        Optional<Map<String, String>> actual = requestToPageLoadingEventConverter.convert(httpRequest);

        assertEquals(expected, actual);
    }

    @Test
    public void ifUrlMatchesBaseUrlExactlyOptionalEmptyIsReturned() throws MalformedURLException, UnsupportedEncodingException {
        ActionsFilter actionsFilter = createMocks(true);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(BASE_URL);

        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        Optional<Map<String, String>> expected = Optional.empty();
        Optional<Map<String, String>> actual = requestToPageLoadingEventConverter.convert(httpRequest);

        assertEquals(expected, actual);
    }

    @Test
    public void ifActionIsExposedThenEmptyOptionalIsReturned() throws MalformedURLException, UnsupportedEncodingException {
        ActionsFilter actionsFilter = createMocks(true);

        HttpRequest httpRequest = mock(HttpRequest.class);
        when(httpRequest.getUri()).thenReturn(EXPECTED_URL);

        RequestToPageLoadingEventConverter requestToPageLoadingEventConverter =
                new RequestToPageLoadingEventConverter(BASE_URL, actionsFilter);

        Optional<Map<String, String>> expected = Optional.of(ImmutableMap.of(
                EVENT, EXAMPLE_EVENT_NAME,
                ALIAS_PARAMETER, EXAMPLE_CONTINUATION
        ));
        Optional<Map<String, String>> actual = requestToPageLoadingEventConverter.convert(httpRequest);

        assertEquals(expected, actual);
    }

    private ActionsFilter createMocks(boolean actionExposed) {
        ParameterConfiguration parameterConfiguration = mock(ParameterConfiguration.class);
        when(parameterConfiguration.isExposed()).thenReturn(actionExposed);
        when(parameterConfiguration.getValue()).thenReturn(EXAMPLE_CONTINUATION);
        when(parameterConfiguration.getAlias()).thenReturn(ALIAS_PARAMETER);

        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(applicationActionConfiguration.getName()).thenReturn(EXAMPLE_EVENT_NAME);
        when(applicationActionConfiguration.getWebDriverAction().getParametersConfiguration().get(PAGE)).thenReturn(parameterConfiguration);

        List<ApplicationActionConfiguration> applicationActionConfigurations = Arrays.asList(applicationActionConfiguration);
        ActionsFilter actionsFilter = mock(ActionsFilter.class);
        when(actionsFilter.filter(PAGE_LOADING)).thenReturn(applicationActionConfigurations);
        return actionsFilter;
    }

}
