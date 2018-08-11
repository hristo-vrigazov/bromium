package com.hribol.bromium.core.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JsFunctionInvocation {
    private String name;
    private List<String> parameters;
    private String raw;

    public JsFunctionInvocation(String name) {
        this.name = name;
        this.parameters = new ArrayList<>();
    }

    public JsFunctionInvocation raw(String raw) {
        this.raw = raw;
        return this;
    }

    public JsFunctionInvocation string(String rawString) {
        parameters.add("'" + rawString + "'");
        return this;
    }

    public JsFunctionInvocation variable(String variable) {
        parameters.add(variable);
        return this;
    }

    public JsFunctionInvocation invocation(JsFunctionInvocation jsFunctionInvocation) {
        parameters.add(jsFunctionInvocation.getInvocation());
        return this;
    }

    public JsFunctionInvocation callback(JsFunctionCallback jsFunctionCallback) {
        parameters.add(jsFunctionCallback.getDefinition());
        return this;
    }

    public String getInvocation() {
        return Optional.ofNullable(raw).orElse(name + "(" + parameters.stream().collect(Collectors.joining(", ")) + ");\n");
    }
}