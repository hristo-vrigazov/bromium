package com.hribol.bromium.common.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsCollectorTest {

    @Test
    public void canBuildJs() {
        String expected = "expected";
        JsCollector jsCollector = new JsCollector();
        assertNotNull(jsCollector.declareFunction("something"));

        jsCollector.write(expected);

        String actual = jsCollector.build();

        assertEquals(expected, actual);
    }
}
