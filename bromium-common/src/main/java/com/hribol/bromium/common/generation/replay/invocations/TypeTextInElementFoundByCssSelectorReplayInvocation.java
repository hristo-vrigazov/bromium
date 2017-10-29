package com.hribol.bromium.common.generation.replay.invocations;

import java.text.MessageFormat;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class TypeTextInElementFoundByCssSelectorReplayInvocation implements ReplayFunctionInvocation {
    private String cssSelector;
    private String hashCode;

    public TypeTextInElementFoundByCssSelectorReplayInvocation(String cssSelector, String hashCode) {
        this.cssSelector = cssSelector;
        this.hashCode = hashCode;
    }


    @Override
    public String getJavascriptCode() {
        return MessageFormat.format(
                "\n" +
                        "{0}(\"{1}\", \"{2}\")" +
                        "\n",
                CLICK_CSS_SELECTOR,
                cssSelector,
                hashCode
        );
    }
}
