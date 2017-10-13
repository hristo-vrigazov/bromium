package com.hribol.bromium.common.builder;

import java.text.MessageFormat;

/**
 * Builds the body of an event listener
 */
public class JsEventListenerBodyBuilder {
    private JsArriveHandlerBuilder parent;
    private StringBuilder stringBuilder;

    /**
     * Creates a new object for building the body of an event listener
     * @param event the event for which we are listening
     * @param parent the parent
     */
    public JsEventListenerBodyBuilder(String event, JsArriveHandlerBuilder parent) {
        this.parent = parent;
        this.stringBuilder = new StringBuilder();
        String message = MessageFormat.format("\t\tthis.addEventListener(\"{0}\", function(e) '{'\n", event);
        stringBuilder.append(message);
    }

    /**
     * Creates a new object for building parameters map
     * @param parameters name of the variable for the parameters
     * @return the object for building parameters map
     */
    public JsParameterCollectorBuilder startCollectingParameters(String parameters) {
        return new JsParameterCollectorBuilder(parameters, this);
    }

    /**
     * Notifies that event has happened
     * @param parameters the name of the variable with the parameters
     * @return this object, used for fluent API
     */
    public JsEventListenerBodyBuilder notifyBromium(String parameters) {
        String toBeAdded = MessageFormat.format("\t\t\tbromium.notifyEvent({0});", parameters);
        stringBuilder.append(toBeAdded);
        return this;
    }

    /**
     * Ends listener and writes buffer to parent
     * @return the parent object, used for fluent API
     */
    public JsArriveHandlerBuilder endListener() {
        stringBuilder.append("\n\t\t});");
        parent.write(stringBuilder.toString());
        parent.write("\n\t");
        return parent;
    }

    /**
     * Appends to the buffer
     * @param string the string to be appended
     * @return this object, used for fluent API
     */
    public JsEventListenerBodyBuilder write(String string) {
        stringBuilder.append(string);
        return this;
    }
}
