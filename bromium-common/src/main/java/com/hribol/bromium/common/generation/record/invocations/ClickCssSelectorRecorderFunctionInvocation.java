package com.hribol.bromium.common.generation.record.invocations;

import java.text.MessageFormat;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Represents an invocation of a recorder function for {@link com.hribol.bromium.common.replay.actions.ClickCssSelector}
 */
public class ClickCssSelectorRecorderFunctionInvocation implements RecorderFunctionInvocation {
    private String cssSelector;
    private String eventName;

    public ClickCssSelectorRecorderFunctionInvocation(String cssSelector, String eventName) {
        this.cssSelector = cssSelector;
        this.eventName = eventName;
    }

    @Override
    public String getJavascriptCode() {
        return MessageFormat.format(
                "\n" +
                        "{0}(\"{1}\", \"{2}\")" +
                        "\n",
                CLICK_CSS_SELECTOR,
                cssSelector,
                eventName
        );
    }
}
