package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import org.junit.Test;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ClickClassByTextReplayFunctionTest {

    @Test
    public void generatesCorrectly() {
        JsCollector jsCollector = new JsCollector();

        ReplayFunction replayFunction = new ClickClassByTextReplayFunction(jsCollector);
        System.out.println(replayFunction.getJavascriptCode());
    }


}
