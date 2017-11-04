package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class TextOfElementFoundByCssSelectorToBeReplayFunctionTest {

    @Test
    public void generatesInCorrectWay() {
        JsCollector jsCollector = new JsCollector();
        ReplayFunction replayFunction = new TextOfElementFoundByCssSelectorToBeReplayFunction(jsCollector);

        String expected = "function TextOfElementFoundByCssSelectorToBe(cssSelector, text, hashCode) {\n" +
                "\tdocument.arrive(cssSelector, options, function () {\n" +
                "\t\tbromium.notifySatisfiedBasedOnText(this, text, hashCode);\n" +
                "\t});\n" +
                "\tdocument.leave(cssSelector, function () {\n" +
                "\t\tbromium.notifyNotSatisfiedCondition(hashCode);\n" +
                "\t});\n" +
                "}".trim();
        String actual = replayFunction.getJavascriptCode().trim();

        assertEquals(expected, actual);
    }

}