package com.hribol.bromium.replay.execution.factory;

import com.hribol.bromium.core.config.ParameterValues;
import com.hribol.bromium.core.config.SearchContextFunction;

import java.util.Map;
import java.util.function.Function;

public class ActionCreationContext {

    private final ParameterValues parameters;
    private final int step;
    private final boolean expectsHttpRequest;
    private final Function<ParameterValues, SearchContextFunction> contextProvider;

    public ActionCreationContext(ParameterValues parameters,
                                 int step,
                                 boolean expectsHttpRequest,
                                 Function<ParameterValues, SearchContextFunction> contextProvider) {
        this.parameters = parameters;
        this.step = step;
        this.expectsHttpRequest = expectsHttpRequest;
        this.contextProvider = contextProvider;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public int getStep() {
        return step;
    }

    public boolean expectsHttpRequest() {
        return expectsHttpRequest;
    }

    public SearchContextFunction getContextProvider() {
        return getContextProvider(parameters);
    }

    private SearchContextFunction getContextProvider(ParameterValues parameters) {
        return contextProvider.apply(parameters);
    }
}
