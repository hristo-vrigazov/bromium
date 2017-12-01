package com.hribol.bromium.common.generation.record.invocations;

import org.junit.Test;

import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 10.08.17.
 */
public class TypeTextInElementFoundByCssSelectorRecorderFunctionInvocationTest {

    @Test
    public void createsJsCodeSuitableForInjection() {
        String cssSelector = "#ico";
        String eventName = "something";
        String textAlias = "alias-text";
        TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation typeTextInElementFoundByCssSelectorRecorderFunctionInvocation =
                new TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation(cssSelector, eventName, textAlias);

        assertTrue(equalToIgnoringWhiteSpace("TypeTextInElementFoundByCssSelector(\"#ico\", \"something\", \"alias-text\")")
        .matches(typeTextInElementFoundByCssSelectorRecorderFunctionInvocation.getJavascriptCode()));
    }

}
