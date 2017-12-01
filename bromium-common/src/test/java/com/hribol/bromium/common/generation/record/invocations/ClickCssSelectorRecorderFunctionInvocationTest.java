package com.hribol.bromium.common.generation.record.invocations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ClickCssSelectorRecorderFunctionInvocationTest {

    @Test
    public void createsJsCodeSuitableForInjection() {
        String cssSelector = "#ico";
        String eventName = "something";
        ClickCssSelectorRecorderFunctionInvocation clickCssSelectorRecorderFunctionInvocation =
                new ClickCssSelectorRecorderFunctionInvocation(cssSelector, eventName);

        String expected = "\nClickCssSelector(\"#ico\",\"something\");\n";
        String actual = clickCssSelectorRecorderFunctionInvocation.getJavascriptCode();
        assertEquals(expected.trim(), actual.trim());
    }
}
