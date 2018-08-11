package com.hribol.bromium.core.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JsFunctionCallback {
    private List<String> arguments;
    private JsFunctionInvocation body;
    private String bodyRaw;

    public JsFunctionCallback() {
        this.arguments = new ArrayList<>();
    }

    public JsFunctionCallback body(JsFunctionInvocation body) {
        this.body = body;
        return this;
    }

    public JsFunctionCallback bodyRaw(String bodyRaw) {
        this.bodyRaw = bodyRaw;
        return this;
    }

    public JsFunctionCallback argument(String argument) {
        arguments.add(argument);
        return this;
    }

    public String getDefinition() {
        return "function(" + arguments.stream().collect(Collectors.joining(", ")) + ") { "
                + Optional.ofNullable(bodyRaw).orElse(body.getInvocation())
                + " }";
    }
}