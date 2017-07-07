package com.hribol.bromium.common.generation.replay.invocations;

import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;

import java.text.MessageFormat;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ClickCssSelectorReplayInvocation implements ReplayFunctionInvocation {
    private String cssSelector;
    private String hashCode;

    public ClickCssSelectorReplayInvocation(String cssSelector, String hashCode) {
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
