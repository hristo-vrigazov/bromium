package com.hribol.bromium.record.javascript.generation.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsParameterCollectorBuilder {
    private JsEventListenerBodyBuilder parent;
    private StringBuilder stringBuilder;

    public JsParameterCollectorBuilder(String parameters, JsEventListenerBodyBuilder parent) {
        this.parent = parent;
        this.stringBuilder = new StringBuilder();
        String toBeAdded = MessageFormat.format("\t\t\tvar {0} = '{'\n\t\t\t\t", parameters);
        stringBuilder.append(toBeAdded);
    }

    public JsParameterCollectorBuilder parameter(String parameter, String value) {
        String rowToBeAdded = MessageFormat.format("{0}: {1},", parameter, value);
        stringBuilder.append(rowToBeAdded);
        return this;
    }

    public JsEventListenerBodyBuilder buildParameters() {
        stringBuilder.append("\n\t\t\t};\n");
        parent.write(stringBuilder.toString());
        return parent;
    }
}
