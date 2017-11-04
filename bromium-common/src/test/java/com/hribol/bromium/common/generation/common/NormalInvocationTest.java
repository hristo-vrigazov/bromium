package com.hribol.bromium.common.generation.common;

import org.junit.Test;

import static java.text.MessageFormat.format;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class NormalInvocationTest {

    private static final String FUNCTION_NAME = "functionName";
    private static final String PARAMETER_1 = "parameter1";
    private static final String PARAMETER_2 = "parameter2";
    private static final String PARAMETER_3 = "parameter3";

    @Test
    public void formattingIsCorrectIfNoParameters() {
        NormalInvocation normalInvocation = new NormalInvocation(FUNCTION_NAME);

        String expected = "\n" + FUNCTION_NAME + "();\n";
        String actual = normalInvocation.getJavascriptCode();

        assertEquals(expected, actual);
    }

    @Test
    public void formattingIsCorrectIfOneParameter() {
        NormalInvocation normalInvocation = new NormalInvocation(FUNCTION_NAME, PARAMETER_1);
        String expected = format("\n{0}(\"{1}\");\n", FUNCTION_NAME, PARAMETER_1);
        String actual = normalInvocation.getJavascriptCode();

        assertEquals(expected, actual);
    }

    @Test
    public void formattingIsCorrectIfMultipleParameters() {
        NormalInvocation normalInvocation = new NormalInvocation(FUNCTION_NAME, PARAMETER_1, PARAMETER_2, PARAMETER_3);
        String expected = format("\n{0}(\"{1}\",\"{2}\",\"{3}\");\n", FUNCTION_NAME, PARAMETER_1, PARAMETER_2, PARAMETER_3);
        String actual = normalInvocation.getJavascriptCode();

        assertEquals(expected, actual);
    }
}
