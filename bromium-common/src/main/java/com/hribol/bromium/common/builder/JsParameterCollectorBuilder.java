package com.hribol.bromium.common.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsParameterCollectorBuilder {
    private String parameters;
    private JsEventListenerBodyBuilder parent;
    private StringBuilder stringBuilder;

    public JsParameterCollectorBuilder(String parameters, JsEventListenerBodyBuilder parent) {
        this.parameters = parameters;
        this.parent = parent;
        this.stringBuilder = new StringBuilder();
        String toBeAdded = MessageFormat.format("\t\t\tvar {0} = '{}';\n\t\t\t\t", parameters);
        stringBuilder.append(toBeAdded);
    }

    public JsParameterCollectorBuilder parameter(String parameter, String value) {
        String rowToBeAdded = MessageFormat.format("{0}[{1}] = {2};\n\t\t\t\t", parameters, parameter, value);
        stringBuilder.append(rowToBeAdded);
        return this;
    }


    public JsParameterCollectorBuilder parameterWithConstantKey(String parameter, String value) {
        String rowToBeAdded = MessageFormat.format("{0}[\"{1}\"] = {2};\n\t\t\t\t", parameters, parameter, value);
        stringBuilder.append(rowToBeAdded);
        return this;
    }

    public JsEventListenerBodyBuilder buildParameters() {
        parent.write(stringBuilder.toString());
        return parent;
    }
}
