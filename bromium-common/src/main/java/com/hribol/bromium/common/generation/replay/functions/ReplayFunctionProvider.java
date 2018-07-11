package com.hribol.bromium.common.generation.replay.functions;

import com.github.jknack.handlebars.Handlebars;
import com.google.inject.Inject;
import com.hribol.bromium.common.generation.common.JsFunctionProvider;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;

import java.io.IOException;

public class ReplayFunctionProvider implements JsFunctionProvider<
        StepAndWebDriverActionConfiguration,
        ReplayFunctionInvocation,
        ReplayFunction
        > {

    private Handlebars handlebars;

    @Inject
    public ReplayFunctionProvider(Handlebars handlebars) {
        this.handlebars = handlebars;
    }

    @Override
    public ReplayFunction get(String jsFunctionName) throws IOException {
        return new FromResourcesReplayFunction(jsFunctionName, handlebars);
    }
}
