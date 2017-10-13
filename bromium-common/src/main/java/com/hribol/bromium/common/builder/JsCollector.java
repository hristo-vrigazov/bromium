package com.hribol.bromium.common.builder;

/**
 * A collector used to build a generated javascript string
 */
public class JsCollector {

    private StringBuilder stringBuilder = new StringBuilder();

    /**
     * Starts declaration of a function
     * @param functionName the name of the function
     * @return the builder object on which the body will be build
     */
    public JsFunctionDeclarerBuilder declareFunction(String functionName) {
        return new JsFunctionDeclarerBuilder(functionName, this);
    }

    /**
     * Appends a given string to the current generated string
     * @param string the string to be appended
     * @return the same instance for fluent API
     */
    public JsCollector write(String string) {
        stringBuilder.append(string);
        return this;
    }

    /**
     * Builds the string and returns it
     * @return the whole generated string
     */
    public String build() {
        return stringBuilder.toString();
    }
}
