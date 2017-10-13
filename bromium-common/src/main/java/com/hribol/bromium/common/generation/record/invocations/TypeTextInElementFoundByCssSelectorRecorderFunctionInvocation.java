package com.hribol.bromium.common.generation.record.invocations;

import java.text.MessageFormat;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;

/**
 * Represents a recorder function invocation for {@link com.hribol.bromium.common.replay.actions.TypeTextInElementFoundByCssSelector}
 */
public class TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation implements RecorderFunctionInvocation {

    private String cssSelector;
    private String eventName;
    private String textAlias;

    public TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation(String cssSelector, String eventName, String textAlias) {
        this.cssSelector = cssSelector;
        this.eventName = eventName;
        this.textAlias = textAlias;
    }

    @Override
    public String getJavascriptCode() {
        return MessageFormat.format(
                "\n" +
                        "{0}(\"{1}\", \"{2}\", \"{3}\")" +
                        "\n",
                TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR,
                cssSelector,
                eventName,
                textAlias
        );
    }
}
