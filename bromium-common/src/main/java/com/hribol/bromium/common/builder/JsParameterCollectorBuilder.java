package com.hribol.bromium.common.builder;

import java.text.MessageFormat;

/**
 * A builder for a map of parameters
 */
public class JsParameterCollectorBuilder {
    private String parameters;
    private JsEventListenerBodyBuilder parent;
    private StringBuilder stringBuilder;

    public JsParameterCollectorBuilder(String parameters, JsEventListenerBodyBuilder parent) {
        this.parameters = parameters;
        this.parent = parent;
        this.stringBuilder = new StringBuilder();
        String toBeAdded = MessageFormat.format("\t\t\tvar {0} = '{}';\n\t\t\t", parameters);
        stringBuilder.append(toBeAdded);
    }

    /**
     * Adds a parameter to the map
     * @param parameter the variable used as a key
     * @param value the variable used as a value
     * @return this object, used for fluent API
     */
    public JsParameterCollectorBuilder parameter(String parameter, String value) {
        String rowToBeAdded = MessageFormat.format("\t\t{0}[{1}] = {2};\n\t", parameters, parameter, value);
        stringBuilder.append(rowToBeAdded);
        return this;
    }

    /**
     * Adds a parameter to the map, the key is a string
     * @param parameter the string to be used as a key
     * @param value the variable used as a value
     * @return this object, used for fluent API
     */
    public JsParameterCollectorBuilder parameterWithConstantKey(String parameter, String value) {
        String rowToBeAdded = MessageFormat.format("\t{0}[\"{1}\"] = {2};\n\t\t", parameters, parameter, value);
        stringBuilder.append(rowToBeAdded);
        return this;
    }

    /**
     * Builds parameters and writes buffer to parent
     * @return the parent object
     */
    public JsEventListenerBodyBuilder buildParameters() {
        parent.write(stringBuilder.toString());
        return parent;
    }
}
