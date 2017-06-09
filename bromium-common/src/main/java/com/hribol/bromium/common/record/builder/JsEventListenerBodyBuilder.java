package com.hribol.bromium.common.record.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsEventListenerBodyBuilder {
    private JsArriveHandlerBuilder parent;
    private StringBuilder stringBuilder;

    public JsEventListenerBodyBuilder(String event, JsArriveHandlerBuilder parent) {
        this.parent = parent;
        this.stringBuilder = new StringBuilder();
        String message = MessageFormat.format("\t\tthis.addEventListener(\"{0}\", function(e) '{'\n", event);
        stringBuilder.append(message);
    }

    public JsParameterCollectorBuilder startCollectingParameters(String parameters) {
        return new JsParameterCollectorBuilder(parameters, this);
    }

    public JsEventListenerBodyBuilder notifyBromium(String parameters) {
        String toBeAdded = MessageFormat.format("\t\t\tbromium.notifyEvent({0});", parameters);
        stringBuilder.append(toBeAdded);
        return this;
    }

    public JsArriveHandlerBuilder endListener() {
        stringBuilder.append("\n\t\t});");
        parent.write(stringBuilder.toString());
        parent.write("\n\t");
        return parent;
    }

    public JsEventListenerBodyBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }
}
