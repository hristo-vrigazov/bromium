package com.hribol.bromium.record.javascript.generation.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsParameterCollectorBuilder {
    private final String trailingString;
    private final JsEventListenerBodyBuilder parent;
    private StringBuilder stringBuilder;

    public JsParameterCollectorBuilder(String trailingString, JsEventListenerBodyBuilder parent) {
        this.trailingString = trailingString;
        this.parent = parent;
        this.stringBuilder = new StringBuilder();
    }

    public JsParameterCollectorBuilder parameter(String parameter, String value) {
        String rowToBeAdded = MessageFormat.format("{0}: {1},", parameter, value);
        stringBuilder.append(rowToBeAdded);
        return this;
    }

    public JsEventListenerBodyBuilder buildParameters() {
        stringBuilder.append(trailingString);
        parent.write(stringBuilder.toString());
        return parent;
    }
}
