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
 * Created by hvrigazov on 09.06.17.
// */

public class ClickCssSelectorRecorderFunctionTest {

    private final String expected = "function ClickCssSelector(selector, eventName) {\n" +
            "\tdocument.arrive(selector, options, function () {\n" +
            "\t\tthis.addEventListener(\"click\", function(e) {\n" +
            "\t\t\tvar parameters = {};\n" +
            "\t\t\tparameters[\"event\"] = eventName;\n" +
            "\t\t\tbromium.notifyEvent(parameters);\n" +
            "\t\t});\n" +
            "\t});\n" +
            "}";

    private ClickCssSelectorRecorderFunction.InvocationProvider invocationProvider;

    @Test
    public void buildsDeclarationFunction() throws Exception {
        invocationProvider = mock(ClickCssSelectorRecorderFunction.InvocationProvider.class);
        RecorderFunctionMocks mocks = new RecorderFunctionMocks();

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction =
                new ClickCssSelectorRecorderFunction(mocks.getJsCollector(), invocationProvider);

        assertTrue(equalToIgnoringWhiteSpace(expected).matches(clickCssSelectorRecorderFunction.getJavascriptCode()));
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        RecorderFunctionInvocation expected = mock(RecorderFunctionInvocation.class);
        invocationProvider = mock(ClickCssSelectorRecorderFunction.InvocationProvider.class);

        RecorderFunctionMocks mocks = new RecorderFunctionMocks();

        when(invocationProvider.get(mocks.getCssSelector(), mocks.getEventName()))
                .thenReturn(expected);

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction =
                new ClickCssSelectorRecorderFunction(mocks.getJsCollector(), invocationProvider);

        RecorderFunctionInvocation actual = clickCssSelectorRecorderFunction.getInvocation(mocks.getNameWebDriverActionConfiguration());

        assertEquals(expected, actual);
    }

}
