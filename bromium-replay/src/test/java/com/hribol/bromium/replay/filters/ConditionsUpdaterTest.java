package com.hribol.bromium.replay.filters;

import io.netty.handler.codec.http.HttpRequest;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 10.10.17.
 */
public class ConditionsUpdaterTest {

    private Predicate<HttpRequest> shouldUpdatePredicate = mock(Predicate.class);
    private StateConditionsUpdater stateConditionsUpdater = mock(StateConditionsUpdater.class);

    @Test
    public void exposesTheSamePredicateAndUpdaterReceivedFromConstructor() {
        ConditionsUpdater conditionsUpdater = new ConditionsUpdater(shouldUpdatePredicate, stateConditionsUpdater);

        assertEquals(shouldUpdatePredicate, conditionsUpdater.shouldUpdate());
        assertEquals(stateConditionsUpdater, conditionsUpdater.updater());
    }

}
