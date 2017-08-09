package com.hribol.bromium.common.generation.record.invocations;

import java.text.MessageFormat;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;

/**
 * Created by hvrigazov on 09.08.17.
 */
public class TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation implements RecorderFunctionInvocation {

    private String cssSelector;
    private String eventName;

    public TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation(String cssSelector, String eventName) {
        this.cssSelector = cssSelector;
        this.eventName = eventName;
    }

    @Override
    public String getJavascriptCode() {
        return MessageFormat.format(
                "\n" +
                        "{0}(\"{1}\", \"{2}\")" +
                        "\n",
                TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR,
                cssSelector,
                eventName
        );
    }
}
