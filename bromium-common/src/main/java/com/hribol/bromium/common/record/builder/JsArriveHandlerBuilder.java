package com.hribol.bromium.common.record.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsArriveHandlerBuilder {

    private StringBuilder stringBuilder;
    private JsFunctionBodyBuilder parent;

    public JsArriveHandlerBuilder(String cssSelector, JsFunctionBodyBuilder parent) {
        this.stringBuilder = new StringBuilder();
        this.parent = parent;
        String formattedMessage = MessageFormat.format("\tdocument.arrive({0}, options, function () '{'\n", cssSelector);
        stringBuilder.append(formattedMessage);
    }

    public JsEventListenerBodyBuilder attachListenerForEvent(String event) {
        return new JsEventListenerBodyBuilder(event, this);
    }

    public JsFunctionBodyBuilder endArriveHandler() {
        stringBuilder.append("});\n");
        parent.write(stringBuilder.toString());
        return parent;
    }

    public JsArriveHandlerBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }
}
