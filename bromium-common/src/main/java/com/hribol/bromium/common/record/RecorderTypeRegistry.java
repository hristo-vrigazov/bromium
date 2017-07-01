package com.hribol.bromium.common.record;

import com.google.inject.Inject;
import com.hribol.bromium.common.record.generation.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.TypeRegistry;
import com.hribol.bromium.core.generation.RecorderFunctionFactory;
import com.hribol.bromium.core.generation.RecorderFunction;
import com.hribol.bromium.core.generation.RecorderFunctionInvocation;

import java.util.*;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecorderTypeRegistry implements TypeRegistry<NameWebDriverActionConfiguration> {
    private Set<RecorderFunction> recorderFunctions = new HashSet<>();
    private Set<RecorderFunctionInvocation> recorderFunctionInvocations = new HashSet<>();

    private RecorderFunctionFactory recorderFunctionFactory;

    @Inject
    public RecorderTypeRegistry(RecorderFunctionFactory recorderFunctionFactory) {
        this.recorderFunctionFactory = recorderFunctionFactory;
    }

    @Override
    public String generate(NameWebDriverActionConfiguration nameWebDriverActionConfiguration) {
        WebDriverActionConfiguration webDriverActionConfiguration = nameWebDriverActionConfiguration.getWebDriverActionConfiguration();
        String eventName = nameWebDriverActionConfiguration.getEventName();
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
    public void register(NameWebDriverActionConfiguration registerEntry) {
        WebDriverActionConfiguration webDriverActionConfiguration = registerEntry.getWebDriverActionConfiguration();
        String eventName = registerEntry.getEventName();

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
