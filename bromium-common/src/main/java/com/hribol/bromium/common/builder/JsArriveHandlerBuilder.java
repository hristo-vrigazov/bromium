package com.hribol.bromium.common.builder;

import java.text.MessageFormat;

/**
 * A handler for when a css selector arrives
 */
public class JsArriveHandlerBuilder {

    private StringBuilder stringBuilder;
    private JsFunctionBodyBuilder parent;

    /**
     * Creates a new handler builder object
     * @param cssSelector the css selector of the object to arrive
     * @param parent the builder of the body of the parent function, used to write
     */
    public JsArriveHandlerBuilder(String cssSelector, JsFunctionBodyBuilder parent) {
        this.stringBuilder = new StringBuilder();
        this.parent = parent;
        String formattedMessage = MessageFormat.format("\tdocument.arrive({0}, options, function () '{'\n", cssSelector);
        stringBuilder.append(formattedMessage);
    }

    /**
     * Attaches event listener for a given event, for example a click, keydown, etc.
     * @param event the event to listen for
     * @return a builder object used for building the body of the event listener
     */
    public JsEventListenerBodyBuilder attachListenerForEvent(String event) {
        return new JsEventListenerBodyBuilder(event, this);
    }

    /**
     * Ends the arrive handler, writes buffer to parent
     * @return the builder of the parent function body
     */
    public JsFunctionBodyBuilder endArriveHandler() {
        stringBuilder.append("});\n");
        parent.write(stringBuilder.toString());
        return parent;
    }

    /**
     * Appends to the current buffer
     * @param string the string to be appended
     * @return this object, used for fluent API
     */
    public JsArriveHandlerBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }

    /**
     * Notifies that a condition has been satisfied
     * @param hashcode
     * @return
     */
    public JsArriveHandlerBuilder notifySatisfiedCondition(String hashcode) {
        String toBeAdded = MessageFormat.format("\t\tbromium.notifySatisfiedCondition({0});\n\t", hashcode);
        stringBuilder.append(toBeAdded);
        return this;
    }
}
