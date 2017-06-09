package com.hribol.bromium.record.javascript.generation.builder;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsParameterCollectorBuilderTest {

    @Test
    public void canCollectParameters() {
        String trailingString = "};\n";
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = mock(JsEventListenerBodyBuilder.class);
        JsParameterCollectorBuilder jsParameterCollectorBuilder = new JsParameterCollectorBuilder(trailingString, jsEventListenerBodyBuilder);

        jsParameterCollectorBuilder
                .parameter("key1", "value1")
                .parameter("key2", "value2")
                .buildParameters();

        verify(jsEventListenerBodyBuilder).write("key1: value1,key2: value2,};\n");
    }
}
