package com.hribol.bromium.common.generation.record.functions;

import com.github.jknack.handlebars.Handlebars;
import com.google.inject.Inject;
import com.hribol.bromium.common.generation.common.JsFunctionProvider;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;

import java.io.IOException;

public class RecorderFunctionProvider implements JsFunctionProvider<NameWebDriverActionConfiguration, RecorderFunctionInvocation, RecorderFunction> {
    private Handlebars handlebars;

    @Inject
    public RecorderFunctionProvider(Handlebars handlebars) {
        this.handlebars = handlebars;
    }

    @Override
    public RecorderFunction get(String jsFunctionName) throws IOException {
        return new FromResourcesRecorderFunction(jsFunctionName, handlebars);
    }

}
