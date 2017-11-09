package com.hribol.bromium.common.generation.replay.invocations;

import com.hribol.bromium.common.generation.record.invocations.ClickClassByTextRecorderInvocation;
import org.junit.Test;

/**
 * Created by hvrigazov on 10.11.17.
 */
public class ClickClassByTextReplayInvocationTest {

    @Test
    public void generatesCorrectly() {
        String initialCollectorClass = "v-button";
        String text = "text";
        String eventName = "Loaded button";
        String expected = "ClickClassByText(\"v-button\",\"text\",\"Loaded button\");".trim();

        ClickClassByTextRecorderInvocation clickClassByTextRecorderInvocation = new ClickClassByTextRecorderInvocation(
                initialCollectorClass, text, eventName
        );

        String actual = clickClassByTextRecorderInvocation.getJavascriptCode().trim();
    }

}
