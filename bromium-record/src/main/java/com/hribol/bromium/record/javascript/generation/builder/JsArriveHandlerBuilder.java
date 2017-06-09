package com.hribol.bromium.record.javascript.generation.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsArriveHandlerBuilder {

    private StringBuilder stringBuilder;
    private String trailingString;
    private JsFunctionBodyBuilder parent;

    public JsArriveHandlerBuilder(String trailingString, JsFunctionBodyBuilder parent) {
        this.stringBuilder = new StringBuilder();
        this.trailingString = trailingString;
        this.parent = parent;
    }

    public JsEventListenerBodyBuilder attachListenerForEvent(String event) {
        String message = MessageFormat.format("\t\tthis.addEventListener({0}, function(e) '{'\n", event);
        stringBuilder.append(message);
        return new JsEventListenerBodyBuilder("\n\t\t});", this);
    }

    public JsFunctionBodyBuilder endArriveHandler() {
        stringBuilder.append(trailingString);
        parent.write(stringBuilder.toString());
        return parent;
    }

    public JsArriveHandlerBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }
}
