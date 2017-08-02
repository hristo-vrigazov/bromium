package com.hribol.bromium.record;

import com.hribol.bromium.core.utils.HttpRequestToTestCaseStepConverter;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordRequestFilter implements RequestFilter {
    private final Predicate<HttpRequest> eventIsSubmittedPredicate;
    private HttpRequestToTestCaseStepConverter httpRequestToTestCaseStepConverter;
    private RecordingState recordingState;

    public RecordRequestFilter(RecordingState recordingState,
                               Predicate<HttpRequest> eventIsSubmittedPredicate,
                               HttpRequestToTestCaseStepConverter httpRequestToTestCaseStepConverter) {
        this.recordingState = recordingState;
        this.eventIsSubmittedPredicate = eventIsSubmittedPredicate;
        this.httpRequestToTestCaseStepConverter = httpRequestToTestCaseStepConverter;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        if (eventIsSubmittedPredicate.test(httpRequest)) {
            try {
                Map<String, String> map = httpRequestToTestCaseStepConverter.convert(httpRequest);
                recordingState.storeTestCaseStep(map);
                System.out.println(map);
            } catch (UnsupportedEncodingException | MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}