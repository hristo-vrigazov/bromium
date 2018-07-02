package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.record.invocations.ClickDataIdInvocation;
import org.junit.Test;

public class ClickDataIdRecorderFunctionTest {

    @Test
    public void test() {
        JsCollector jsCollector = new JsCollector();
        ClickDataIdRecorderFunction recorderFunction = new ClickDataIdRecorderFunction(jsCollector, ClickDataIdInvocation::new);

    }

}
