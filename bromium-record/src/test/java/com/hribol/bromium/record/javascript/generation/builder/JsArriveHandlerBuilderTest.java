package com.hribol.bromium.record.javascript.generation.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsArriveHandlerBuilderTest {

    @Test
    public void canBuildArriveHandler() {
        String trailingString = "});\n";
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsArriveHandlerBuilder jsArriveHandlerBuilder = new JsArriveHandlerBuilder(trailingString, jsFunctionBodyBuilder);

        jsArriveHandlerBuilder.write("a").write("b");

        jsArriveHandlerBuilder.endArriveHandler();

        verify(jsFunctionBodyBuilder).write("ab});\n");
    }

    @Test
    public void canCreateNotNullEventHandler() {
        String trailingString = "});\n";
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsArriveHandlerBuilder jsArriveHandlerBuilder = new JsArriveHandlerBuilder(trailingString, jsFunctionBodyBuilder);

        assertNotNull(jsArriveHandlerBuilder.attachListenerForEvent("click"));
    }
}
