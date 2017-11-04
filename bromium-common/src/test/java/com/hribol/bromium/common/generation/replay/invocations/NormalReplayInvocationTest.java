package com.hribol.bromium.common.generation.replay.invocations;

import org.junit.Test;

import static java.text.MessageFormat.format;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class NormalReplayInvocationTest {

    private static final String FUNCTION_NAME = "functionName";
    private static final String PARAMETER_1 = "parameter1";
    private static final String PARAMETER_2 = "parameter2";
    private static final String PARAMETER_3 = "parameter3";

    @Test
    public void formattingIsCorrectIfNoParameters() {
        NormalReplayInvocation normalReplayInvocation = new NormalReplayInvocation(FUNCTION_NAME);

        String expected = "\n" + FUNCTION_NAME + "();\n";
        String actual = normalReplayInvocation.getJavascriptCode();

        assertEquals(expected, actual);
    }

    @Test
    public void formattingIsCorrectIfOneParameter() {
        NormalReplayInvocation normalReplayInvocation = new NormalReplayInvocation(FUNCTION_NAME, PARAMETER_1);
        String expected = format("\n{0}(\"{1}\");\n", FUNCTION_NAME, PARAMETER_1);
        String actual = normalReplayInvocation.getJavascriptCode();

        assertEquals(expected, actual);
    }

    @Test
    public void formattingIsCorrectIfMultipleParameters() {
        NormalReplayInvocation normalReplayInvocation = new NormalReplayInvocation(FUNCTION_NAME, PARAMETER_1, PARAMETER_2, PARAMETER_3);
        String expected = format("\n{0}(\"{1}\",\"{2}\",\"{3}\");\n", FUNCTION_NAME, PARAMETER_1, PARAMETER_2, PARAMETER_3);
        String actual = normalReplayInvocation.getJavascriptCode();

        assertEquals(expected, actual);
    }
}
