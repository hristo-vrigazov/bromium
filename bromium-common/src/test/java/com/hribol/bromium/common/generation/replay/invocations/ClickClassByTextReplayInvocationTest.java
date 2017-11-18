package com.hribol.bromium.common.generation.replay.invocations;

import com.hribol.bromium.common.generation.record.invocations.ClickClassByTextRecorderInvocation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 10.11.17.
 */
public class ClickClassByTextReplayInvocationTest {

    @Test
    public void generatesCorrectly() {
        String initialCollectorClass = "v-button";
        String text = "text";
        String hashCode = "123123";
        String expected = "ClickClassByText(\"v-button\",\"text\",\"123123\");".trim();

        ClickClassByTextReplayInvocation clickClassByTextRecorderInvocation = new ClickClassByTextReplayInvocation(
                initialCollectorClass, text, hashCode
        );

        String actual = clickClassByTextRecorderInvocation.getJavascriptCode().trim();

        assertEquals(expected, actual);
    }

}
