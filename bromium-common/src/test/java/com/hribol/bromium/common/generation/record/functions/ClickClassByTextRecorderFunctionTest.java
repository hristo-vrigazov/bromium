package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ClickClassByTextRecorderFunctionTest {

    @Test
    public void generatesCorrectly() {
        JsCollector jsCollector = new JsCollector();
        RecorderFunction recorderFunction = new ClickClassByTextRecorderFunction(jsCollector);

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

}
