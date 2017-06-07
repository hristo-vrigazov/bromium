package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import java.util.*;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecorderTypeRegistry {
    private Set<RecorderFunction> recorderFunctions = new HashSet<>();
    private Set<RecorderFunctionInvocation> recorderFunctionInvocations = new HashSet<>();

    private RecorderFunctionFactory recorderFunctionFactory;
    private RecorderFunctionInvocationFactory recorderFunctionInvocationFactory;

    public RecorderTypeRegistry(RecorderFunctionFactory recorderFunctionFactory, RecorderFunctionInvocationFactory recorderFunctionInvocationFactory) {
        this.recorderFunctionInvocationFactory = recorderFunctionInvocationFactory;
        this.recorderFunctionFactory = recorderFunctionFactory;
    }

    public String getRecordingCodeForType(WebDriverActionConfiguration webDriverActionConfiguration) {
        StringBuilder stringBuilder = new StringBuilder();
        RecorderFunction recorderFunction = recorderFunctionFactory.create(webDriverActionConfiguration);

        if (!recorderFunctions.contains(recorderFunction)) {
            stringBuilder.append(recorderFunction.getJavascriptCode());
        }

        RecorderFunctionInvocation recorderFunctionInvocation = recorderFunctionInvocationFactory.create(recorderFunction, webDriverActionConfiguration);
        if (!recorderFunctionInvocations.contains(recorderFunctionInvocation)) {
            stringBuilder.append(recorderFunctionInvocation.getJavascriptCode());
        }

        return stringBuilder.toString();
    }

    public void register(WebDriverActionConfiguration webDriverActionConfiguration) {
        RecorderFunction recorderFunction = recorderFunctionFactory.create(webDriverActionConfiguration);

        if (!recorderFunctions.contains(recorderFunction)) {
            recorderFunctions.add(recorderFunction);
        }

        RecorderFunctionInvocation recorderFunctionInvocation = recorderFunctionInvocationFactory.create(recorderFunction, webDriverActionConfiguration);
        if (!recorderFunctionInvocations.contains(recorderFunctionInvocation)) {
            recorderFunctionInvocations.add(recorderFunctionInvocation);
        }

    }
}
