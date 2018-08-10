package com.hribol.bromium.replay.execution.factory;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.function.Function;

public class ActionCreationContext {

    private final Map<String, String> parameters;
    private final int step;
    private final boolean expectsHttpRequest;
    private final Function<WebDriver, SearchContext> contextProvider;

    public ActionCreationContext(Map<String, String> parameters,
                                 int step,
                                 boolean expectsHttpRequest,
                                 Function<WebDriver, SearchContext> contextProvider) {
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

    public Function<WebDriver, SearchContext> getContextProvider() {
        return contextProvider;
    }
}
