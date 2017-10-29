package com.hribol.bromium.common.generation.replay.invocations;

import java.text.MessageFormat;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class ElementArrivedReplayInvocation implements ReplayFunctionInvocation {
    private String cssSelector;
    private String hashCode;
    private String functionName;

    public ElementArrivedReplayInvocation(String cssSelector, String hashCode, String functionName) {
        this.cssSelector = cssSelector;
        this.hashCode = hashCode;
        this.functionName = functionName;
    }

    @Override
    public String getJavascriptCode() {
        return MessageFormat.format(
                "\n" +
                        "{0}(\"{1}\", \"{2}\")" +
                        "\n",
                functionName,
                cssSelector,
                hashCode
        );
    }
}
