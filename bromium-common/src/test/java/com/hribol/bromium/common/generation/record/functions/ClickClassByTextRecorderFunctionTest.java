package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ClickClassByTextRecorderFunctionTest {

    private ClickClassByTextRecorderFunction.InvocationProvider invocationProvider;

    @Test
    public void generatesCorrectly() {
        invocationProvider = mock(ClickClassByTextRecorderFunction.InvocationProvider.class);
        JsCollector jsCollector = new JsCollector();
        RecorderFunction recorderFunction = new ClickClassByTextRecorderFunction(jsCollector, invocationProvider);

        String expected = "function ClickClassByText(initialCollectorClass, text, eventName) {\n" +
                "\tdocument.arrive(\".\" + initialCollectorClass, options, function () {\n" +
                "\t\tthis.addEventListener(\"click\", function(e) {\n" +
                "\t\t\tvar parameters = {};\n" +
                "\t\t\t\tparameters[\"event\"] = eventName;\n" +
                "\t\t\t\tparameters[text] = this.innerText;\n" +
                "\t\t\t\tbromium.notifyEvent(parameters);\n" +
                "\t\t});\n" +
                "\t});\n" +
                "}";
        String actual = recorderFunction.getJavascriptCode();

        assertEquals(expected.trim(), actual.trim());
    }

    @Test
    public void hashCodeCorrect() throws Exception {
        RecorderFunctionInvocation expected = mock(RecorderFunctionInvocation.class);
        invocationProvider = mock(ClickClassByTextRecorderFunction.InvocationProvider.class);
        JsCollector jsCollector = new JsCollector();
        RecorderFunctionMocks mocks = new RecorderFunctionMocks();
        when(invocationProvider.get(mocks.getInitialCollectorClass(), mocks.getTextAlias(), mocks.getEventName()))
                .thenReturn(expected);

        RecorderFunction recorderFunction = new ClickClassByTextRecorderFunction(jsCollector, invocationProvider);
        RecorderFunctionInvocation actual = recorderFunction.getInvocation(mocks.getNameWebDriverActionConfiguration());

        assertEquals(expected, actual);
    }

}
