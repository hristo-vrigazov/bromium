package com.hribol.bromium.common.generation.replay.invocations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class TextOfElementFoundByCssSelectorToBeInvocationTest {

    private final static String cssSelector = "#paragraph";
    private final static String text = "text";
    private final static String hashCode = "283901";

    @Test
    public void generatesCorrectly() {
        ReplayFunctionInvocation invocation = new TextOfElementFoundByCssSelectorToBeInvocation(cssSelector, text, hashCode);

        String expected = "\nTextOfElementWithCssSelectorToBe(\"#paragraph\",\"text\",\"283901\");\n";
        String actual = invocation.getJavascriptCode();
        assertEquals(expected, actual);
    }

}
