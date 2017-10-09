package com.hribol.bromium.common.builder;

import java.text.MessageFormat;

/**
 * Used for building the body of a handler for the case when an element with a given css selector leaves the DOM.
 */
public class JsLeaveHandlerBuilder {

    private StringBuilder stringBuilder;
    private JsFunctionBodyBuilder parent;

    /**
     * Creates a new object for building the leave handler
     * @param cssSelector the css selector that the js code should listen for
     * @param parent the pa
     */
    public JsLeaveHandlerBuilder(String cssSelector, JsFunctionBodyBuilder parent) {
        this.stringBuilder = new StringBuilder();
        this.parent = parent;
        String formattedMessage = MessageFormat.format("\tdocument.leave({0}, function () '{'\n", cssSelector);
        stringBuilder.append(formattedMessage);
    }

    /**
     * Ends the handler and writes to the parent
     * @return the parent object, used for fluent API
     */
    public JsFunctionBodyBuilder endLeaveHandler() {
        stringBuilder.append("});\n");
        parent.write(stringBuilder.toString());
        return parent;
    }

    /**
     * Writes to the buffer
     * @param string the string to be appended
     * @return this object, used for fluent API
     */
    public JsLeaveHandlerBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }

    /**
     * Adds a call to notify that a condition has been satisfied to bromium
     * @param hashcode the hashcode of the event to be satisfied
     * @return this object, used for fluent API
     */
    public JsLeaveHandlerBuilder notifySatisfiedCondition(String hashcode) {
        String toBeAdded = MessageFormat.format("\t\tbromium.notifySatisfiedCondition({0});\n\t", hashcode);
        stringBuilder.append(toBeAdded);
        return this;
    }

    /**
     * Adds a call to notify that a condition has not been satisfied to bromium
     * @param hashcode the hashcode of the event that is not satisfied
     * @return this object, used for fluent API
     */
    public JsLeaveHandlerBuilder notifyNotSatisfiedCondition(String hashcode) {
        String toBeAdded = MessageFormat.format("\t\tbromium.notifyNotSatisfiedCondition({0});\n\t", hashcode);
        stringBuilder.append(toBeAdded);
        return this;
    }
}
