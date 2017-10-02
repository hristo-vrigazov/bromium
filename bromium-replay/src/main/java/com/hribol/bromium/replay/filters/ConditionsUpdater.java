package com.hribol.bromium.replay.filters;

import io.netty.handler.codec.http.HttpRequest;

import java.util.function.Predicate;

public class ConditionsUpdater {

    private Predicate<HttpRequest> shouldUpdatePredicate;
    private StateConditionsUpdater stateConditionsUpdater;

    public ConditionsUpdater(Predicate<HttpRequest> shouldUpdatePredicate, StateConditionsUpdater stateConditionsUpdater) {
        this.shouldUpdatePredicate = shouldUpdatePredicate;
        this.stateConditionsUpdater = stateConditionsUpdater;
    }

    public Predicate<HttpRequest> shouldUpdate() {
        return shouldUpdatePredicate;
    }

    public StateConditionsUpdater updater() {
        return stateConditionsUpdater;
    }
}
