package com.hribol.bromium.common.builder;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class JsFunctionDeclarerBuilder {
    private JsCollector jsCollector;
    private StringBuilder stringBuilder;

    public JsFunctionDeclarerBuilder(String functionName, JsCollector jsCollector) {
        this.stringBuilder = new StringBuilder();
        stringBuilder
                .append("function ").append(functionName);

        this.jsCollector = jsCollector;
    }

    public JsFunctionDeclarerBuilder withParameters(String... parameters) {
        stringBuilder.append("(");
        if (parameters.length == 0) {
            stringBuilder.append(") {\n");
            return this;
        }

        String firstParameter = parameters[0];
        stringBuilder.append(firstParameter);

        for (int i = 1; i < parameters.length; i++) {
            stringBuilder.append(", ").append(parameters[i]);
        }

        stringBuilder.append(") {\n");
        return this;
    }

    public JsFunctionBodyBuilder startBody() {
        return new JsFunctionBodyBuilder(this);
    }

    public JsCollector write(String body) {
        stringBuilder.append(body);
        stringBuilder.append("}\n");
        jsCollector.write(stringBuilder.toString());
        return jsCollector;
    }
}
