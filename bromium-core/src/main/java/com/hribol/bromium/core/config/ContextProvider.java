package com.hribol.bromium.core.config;

import java.util.function.Function;

public class ContextProvider {
    private Function<ParameterValues, SearchContextFunction> function;
    private Function<JsFunctionInvocation, String> recorderContextProvider;

    public Function<ParameterValues, SearchContextFunction> getFunction() {
        return function;
    }

    public void setFunction(Function<ParameterValues, SearchContextFunction> function) {
        this.function = function;
    }

    public Function<JsFunctionInvocation, String> getRecorderContextProvider() {
        return recorderContextProvider;
    }

    public void setRecorderContextProvider(Function<JsFunctionInvocation, String> recorderContextProvider) {
        this.recorderContextProvider = recorderContextProvider;
    }
}
