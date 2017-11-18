package com.hribol.bromium.common.generation.record.invocations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 10.11.17.
 */
public class ClickClassByTextRecorderInvocationTest {

    @Test
    public void generatesCorrectly() {
        String initialCollectorClass = "pesho";
        String text = "text";
        String eventName = "event";

        String expected = "ClickClassByText(\"pesho\",\"text\",\"event\");".trim();

        ClickClassByTextRecorderInvocation clickClassByTextRecorderInvocation =
                new ClickClassByTextRecorderInvocation(initialCollectorClass, text, eventName);

        String actual = clickClassByTextRecorderInvocation.getJavascriptCode().trim();

        assertEquals(expected, actual);
    }

}
