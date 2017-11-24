package com.hribol.bromium.record;

import com.hribol.bromium.core.utils.EventDetector;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.util.HttpMessageContents;
import net.lightbody.bmp.util.HttpMessageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A request filter which by given a list of {@link EventDetector}s, stores those events which are detected on a given
 * {@link HttpRequest} into {@link RecordingState}
 */
public class RecordRequestFilter implements RequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(RecordRequestFilter.class);

    private RecordingState recordingState;
    private List<EventDetector> eventDetectors;

    /**
     * Constructs a new record request filter
     * @param recordingState the state which will be used to store the events.
     * @param eventDetectors a list of detectors which can fire for a given {@link HttpRequest}
     */
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
                    Optional<Map<String, String>> optionalEvent = eventDetector.getConverter().convert(httpRequest);

                    if (optionalEvent.isPresent()) {
                        Map<String, String> event = optionalEvent.get();
                        recordingState.storeTestCaseStep(event);
                        System.out.println(event);
                        return null;
                    }

                } catch (UnsupportedEncodingException | MalformedURLException e) {
                    logger.error("Error while trying to convert test case step", e);
                }
            }
        }

        return null;
    }

}