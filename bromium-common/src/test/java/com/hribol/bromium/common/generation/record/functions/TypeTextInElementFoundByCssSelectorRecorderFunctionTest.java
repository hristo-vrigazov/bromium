package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import org.junit.Test;

import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    private TypeTextInElementFoundByCssSelectorRecorderFunction.InvocationProvider invocationProvider;

    @Test
    public void correctlyGenerates() throws Exception {
        invocationProvider = mock(TypeTextInElementFoundByCssSelectorRecorderFunction.InvocationProvider.class);
        RecorderFunctionMocks mocks = new RecorderFunctionMocks();
        TypeTextInElementFoundByCssSelectorRecorderFunction typeTextInElementFoundByCssSelectorRecorderFunction =
                new TypeTextInElementFoundByCssSelectorRecorderFunction(mocks.getJsCollector(), invocationProvider);
        assertTrue(equalToIgnoringWhiteSpace(expected).matches(typeTextInElementFoundByCssSelectorRecorderFunction.getJavascriptCode()));
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        RecorderFunctionInvocation expected = mock(RecorderFunctionInvocation.class);
        invocationProvider = mock(TypeTextInElementFoundByCssSelectorRecorderFunction.InvocationProvider.class);
        RecorderFunctionMocks mocks = new RecorderFunctionMocks();
        when(invocationProvider.get(mocks.getCssSelector(), mocks.getEventName(), mocks.getTextAlias()))
                .thenReturn(expected);
        TypeTextInElementFoundByCssSelectorRecorderFunction typeTextInElementFoundByCssSelectorRecorderFunction =
                new TypeTextInElementFoundByCssSelectorRecorderFunction(mocks.getJsCollector(), invocationProvider);
        RecorderFunctionInvocation actual = typeTextInElementFoundByCssSelectorRecorderFunction.getInvocation(mocks.getNameWebDriverActionConfiguration());

        assertEquals(expected, actual);
    }

}
