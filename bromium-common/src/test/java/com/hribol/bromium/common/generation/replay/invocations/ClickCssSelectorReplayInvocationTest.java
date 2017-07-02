package com.hribol.bromium.common.generation.replay.invocations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ClickCssSelectorReplayInvocationTest {

    @Test
    public void createsJsCodeSuitableForInjection() {
        String cssSelector = "#ico";
        String hashCode = "1283";
        ClickCssSelectorReplayInvocation clickCssSelectorRecorderFunctionInvocation =
                new ClickCssSelectorReplayInvocation(cssSelector, hashCode);

        assertEquals("\n" +
                        "ClickCssSelector(\"#ico\", \"1283\")\n",
                clickCssSelectorRecorderFunctionInvocation.getJavascriptCode());
    }

}
