package com.hribol.bromium.record;

import com.hribol.bromium.core.utils.EventDetector;
import com.hribol.bromium.core.utils.HttpRequestToTestCaseStepConverter;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class RecordRequestFilter implements RequestFilter {
    private RecordingState recordingState;
    private List<EventDetector> eventDetectors;

    public RecordRequestFilter(RecordingState recordingState,
                               List<EventDetector> eventDetectors) {
        this.recordingState = recordingState;
        this.eventDetectors = eventDetectors;
    }

    @Override
    public HttpResponse filterRequest(HttpRequest httpRequest, HttpMessageContents httpMessageContents, HttpMessageInfo httpMessageInfo) {
        for (EventDetector eventDetector: eventDetectors) {
            if (eventDetector.canDetectPredicate().test(httpRequest)) {
                try {
                    Map<String, String> map = eventDetector.getConverter().convert(httpRequest);
                    recordingState.storeTestCaseStep(map);
                    System.out.println(map);
                    return null;
                } catch (UnsupportedEncodingException | MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

}