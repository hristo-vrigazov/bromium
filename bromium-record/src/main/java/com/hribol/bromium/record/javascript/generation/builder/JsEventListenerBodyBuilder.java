package com.hribol.bromium.record.javascript.generation.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsEventListenerBodyBuilder {
    private String trailingString;
    private JsArriveHandlerBuilder parent;
    private StringBuilder stringBuilder;

    public JsEventListenerBodyBuilder(String trailingString, JsArriveHandlerBuilder parent) {
        this.trailingString = trailingString;
        this.parent = parent;
        this.stringBuilder = new StringBuilder();
    }

    public JsParameterCollectorBuilder startCollectingParameters(String parameters) {
        String toBeAdded = MessageFormat.format("\t\t\tvar {0} = '{'\n\t\t\t\t", parameters);
        stringBuilder.append(toBeAdded);
        return new JsParameterCollectorBuilder("\n\t\t\t};\n", this);
    }

    public JsEventListenerBodyBuilder notifyBromium(String parameters) {
        String toBeAdded = MessageFormat.format("\t\t\tbromium.notifyEvent({0})", parameters);
        stringBuilder.append(toBeAdded);
        return this;
    }

    public JsArriveHandlerBuilder endListener() {
        stringBuilder.append(trailingString);
        parent.write(stringBuilder.toString());
        parent.write("\n\t");
        return parent;
    }

    public JsEventListenerBodyBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }
}
