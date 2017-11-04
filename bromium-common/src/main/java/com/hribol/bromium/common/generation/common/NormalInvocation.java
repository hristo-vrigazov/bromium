package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an invocation of JS function which by a given function name
 * and list of parameter values just invokes it
 */
public class NormalInvocation implements ReplayFunctionInvocation {

    private final String functionName;
    private final String[] parameters;

    public NormalInvocation(String functionName, String... parameters) {
        this.functionName = functionName;
        this.parameters = parameters;
    }

    @Override
    public String getJavascriptCode() {
        return "\n" + functionName + "(" + Stream.of(parameters)
                .map(parameter -> "\"" + parameter + "\"")
                .collect(Collectors.joining(",")) + ");\n";
    }
}