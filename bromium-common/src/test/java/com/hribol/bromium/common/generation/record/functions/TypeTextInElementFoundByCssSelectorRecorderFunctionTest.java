package com.hribol.bromium.common.generation.record.functions;

import org.junit.Test;

import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 10.08.17.
 */
public class TypeTextInElementFoundByCssSelectorRecorderFunctionTest {

    private final String expected = "function TypeTextInElementFoundByCssSelector(cssSelector, eventName, text) {\n" +
            "\tdocument.arrive(cssSelector, options, function () {\n" +
            "\t\tthis.addEventListener(\"change\", function(e) {\n" +
            "\t\t\tvar parameters = {};\n" +
            "\t\t\tparameters[\"event\"] = eventName;\n" +
            "parameters[text] = this.value;\n" +
            "\t\t\t\t\t\t\tbromium.notifyEvent(parameters);\n" +
            "\t\t});\n" +
            "\t});\n" +
            "}\n";

    @Test
    public void correctlyGenerates() throws Exception {
        RecorderFunctionMocks mocks = new RecorderFunctionMocks(expected);
        TypeTextInElementFoundByCssSelectorRecorderFunction typeTextInElementFoundByCssSelectorRecorderFunction =
                new TypeTextInElementFoundByCssSelectorRecorderFunction(mocks.getJsCollector());
        System.out.println(typeTextInElementFoundByCssSelectorRecorderFunction.getJavascriptCode());
        assertTrue(equalToIgnoringWhiteSpace(expected).matches(typeTextInElementFoundByCssSelectorRecorderFunction.getJavascriptCode()));
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        RecorderFunctionMocks mocks = new RecorderFunctionMocks(expected);
        TypeTextInElementFoundByCssSelectorRecorderFunction typeTextInElementFoundByCssSelectorRecorderFunction =
                new TypeTextInElementFoundByCssSelectorRecorderFunction(mocks.getJsCollector());
        assertNotNull(typeTextInElementFoundByCssSelectorRecorderFunction.getInvocation(mocks.getNameWebDriverActionConfiguration()));
    }

}
