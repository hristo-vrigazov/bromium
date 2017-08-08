package com.hribol.bromium.core.utils;

import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 06.08.17.
 */
public class EventDetectorImplTest {

    @Test
    public void packagesPredicateAndConverter() {
        Predicate<HttpRequest> expectedPredicate = mock(Predicate.class);
        HttpRequestToTestCaseStepConverter expectedConverter = mock(HttpRequestToTestCaseStepConverter.class);

        EventDetector eventDetector = new EventDetectorImpl(expectedPredicate, expectedConverter);

        assertEquals(expectedPredicate, eventDetector.canDetectPredicate());
        assertEquals(expectedConverter, eventDetector.getConverter());
    }

}
