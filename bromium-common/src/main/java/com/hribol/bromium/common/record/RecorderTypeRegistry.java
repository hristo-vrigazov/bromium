package com.hribol.bromium.common.record;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.TypeRegistry;
import com.hribol.bromium.record.javascript.generation.RecorderFunctionFactory;
import com.hribol.bromium.record.javascript.generation.RecorderFunction;
import com.hribol.bromium.record.javascript.generation.RecorderFunctionInvocation;

import java.util.*;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecorderTypeRegistry implements TypeRegistry {
    private Set<RecorderFunction> recorderFunctions = new HashSet<>();
    private Set<RecorderFunctionInvocation> recorderFunctionInvocations = new HashSet<>();

    private RecorderFunctionFactory recorderFunctionFactory;

    public RecorderTypeRegistry(RecorderFunctionFactory recorderFunctionFactory) {
        this.recorderFunctionFactory = recorderFunctionFactory;
    }

    @Override
    public String getCodeForType(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        StringBuilder stringBuilder = new StringBuilder();
        RecorderFunction recorderFunction = recorderFunctionFactory.create(webDriverActionConfiguration);

        if (!recorderFunctions.contains(recorderFunction)) {
            stringBuilder.append(recorderFunction.getJavascriptCode());
        }

        RecorderFunctionInvocation recorderFunctionInvocation = recorderFunction.getInvocation(eventName, webDriverActionConfiguration);
        if (!recorderFunctionInvocations.contains(recorderFunctionInvocation)) {
            stringBuilder.append(recorderFunctionInvocation.getJavascriptCode());
        }

        return stringBuilder.toString();
    }

    @Override
    public void register(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        RecorderFunction recorderFunction = recorderFunctionFactory.create(webDriverActionConfiguration);

        if (!recorderFunctions.contains(recorderFunction)) {
            recorderFunctions.add(recorderFunction);
        }

        RecorderFunctionInvocation recorderFunctionInvocation = recorderFunction.getInvocation(eventName, webDriverActionConfiguration);
        if (!recorderFunctionInvocations.contains(recorderFunctionInvocation)) {
            recorderFunctionInvocations.add(recorderFunctionInvocation);
        }

    }
}
