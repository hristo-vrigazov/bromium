package com.hribol.bromium.common.generation.replay.invocations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 29.10.17.
 */
public abstract class ElementArrivedReplayInvocationTest {

    private String functionName;
    private ElementArrivedReplayInvocationProvider provider;

    protected ElementArrivedReplayInvocationTest(String functionName, ElementArrivedReplayInvocationProvider provider) {
        this.functionName = functionName;
        this.provider = provider;
    }

    @Test
    public void createsJsCodeSuitableForInjection() {
        String cssSelector = "#ico";
        String hashCode = "1283";
        ReplayFunctionInvocation replayFunctionInvocation = provider.get(cssSelector, hashCode);

        assertEquals("\n" +
                        functionName + "(\"#ico\",\"1283\");\n",
                replayFunctionInvocation.getJavascriptCode());
    }

    public interface ElementArrivedReplayInvocationProvider {
        ReplayFunctionInvocation get(String cssSelector, String hashCode);
    }

}
