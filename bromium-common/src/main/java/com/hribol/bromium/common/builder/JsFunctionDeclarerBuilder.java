package com.hribol.bromium.common.builder;

/**
 * A builder for declaring functions
 */
public class JsFunctionDeclarerBuilder {
    private JsCollector jsCollector;
    private StringBuilder stringBuilder;

    /**
     * Creates a new builder for declaring functions
     * @param functionName the name of the function
     * @param jsCollector the collector in which to write the buffer once it's ready
     */
    public JsFunctionDeclarerBuilder(String functionName, JsCollector jsCollector) {
        this.stringBuilder = new StringBuilder();
        stringBuilder
                .append("function ").append(functionName);

        this.jsCollector = jsCollector;
    }

    /**
     * Declares parameters of a function
     * @param parameters the parameters' names
     * @return this object, used for fluent API
     */
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

    /**
     * Starts writing the body
     * @return the object for building the body
     */
    public JsFunctionBodyBuilder startBody() {
        return new JsFunctionBodyBuilder(this);
    }

    /**
     * Ends the body and writes the buffer to the parent
     * @param body the body to be written
     * @return the parent object, used for fluent API
     */
    public JsCollector write(String body) {
        stringBuilder.append(body);
        stringBuilder.append("}\n");
        jsCollector.write(stringBuilder.toString());
        return jsCollector;
    }
}
