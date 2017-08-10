package com.hribol.bromium.common.generation.record.functions;

import org.junit.Test;

import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


/**
 * Created by hvrigazov on 09.06.17.
// */

public class ClickCssSelectorRecorderFunctionTest {

    private final String expected = "function ClickCssSelector(cssSelector, eventName) {\n" +
            "\tdocument.arrive(cssSelector, options, function () {\n" +
            "\t\tthis.addEventListener(\"click\", function(e) {\n" +
            "\t\t\tvar parameters = {};\n" +
            "\t\t\tparameters[\"event\"] = eventName;\n" +
            "\t\t\tbromium.notifyEvent(parameters);\n" +
            "\t\t});\n" +
            "\t});\n" +
            "}";

    @Test
    public void buildsDeclarationFunction() throws Exception {
        RecorderFunctionMocks mocks = new RecorderFunctionMocks(expected);

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction =
                new ClickCssSelectorRecorderFunction(mocks.getJsCollector());

        assertTrue(equalToIgnoringWhiteSpace(expected).matches(clickCssSelectorRecorderFunction.getJavascriptCode()));
    }

    @Test
    public void createsNotNullRecorderFunction() throws Exception {
        RecorderFunctionMocks mocks = new RecorderFunctionMocks(expected);

        ClickCssSelectorRecorderFunction clickCssSelectorRecorderFunction = new ClickCssSelectorRecorderFunction(mocks.getJsCollector());

        assertNotNull(clickCssSelectorRecorderFunction.getInvocation(mocks.getNameWebDriverActionConfiguration()));
    }

}
