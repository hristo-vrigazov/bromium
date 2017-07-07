package com.hribol.bromium.common.builder;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class JsLeaveHandlerBuilder {

    private StringBuilder stringBuilder;
    private JsFunctionBodyBuilder parent;

    public JsLeaveHandlerBuilder(String cssSelector, JsFunctionBodyBuilder parent) {
        this.stringBuilder = new StringBuilder();
        this.parent = parent;
        String formattedMessage = MessageFormat.format("\tdocument.leave({0}, function () '{'\n", cssSelector);
        stringBuilder.append(formattedMessage);
    }

    public JsFunctionBodyBuilder endLeaveHandler() {
        stringBuilder.append("});\n");
        parent.write(stringBuilder.toString());
        return parent;
    }

    public JsLeaveHandlerBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }

    public JsLeaveHandlerBuilder notifySatisfiedCondition(String hashcode) {
        String toBeAdded = MessageFormat.format("\t\tbromium.notifySatisfiedCondition({0});\n\t", hashcode);
        stringBuilder.append(toBeAdded);
        return this;
    }

    public JsLeaveHandlerBuilder notifyNotSatisfiedCondition(String hashcode) {
        String toBeAdded = MessageFormat.format("\t\tbromium.notifyNotSatisfiedCondition({0});\n\t", hashcode);
        stringBuilder.append(toBeAdded);
        return this;
    }
}
