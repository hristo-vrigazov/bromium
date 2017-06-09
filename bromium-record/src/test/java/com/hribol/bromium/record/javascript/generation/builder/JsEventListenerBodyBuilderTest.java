package com.hribol.bromium.record.javascript.generation.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsEventListenerBodyBuilderTest {

    @Test
    public void canBuildListener() {
        String trailingString = "});\n";
        JsArriveHandlerBuilder jsArriveHandlerBuilder = mock(JsArriveHandlerBuilder.class);
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = new JsEventListenerBodyBuilder(trailingString, jsArriveHandlerBuilder);

        jsEventListenerBodyBuilder.write("a").write("b").endListener();

        verify(jsArriveHandlerBuilder).write("ab});\n");
    }

    @Test
    public void canAddBromiumNotification() {
        String trailingString = "});\n";
        JsArriveHandlerBuilder jsArriveHandlerBuilder = mock(JsArriveHandlerBuilder.class);
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = new JsEventListenerBodyBuilder(trailingString, jsArriveHandlerBuilder);

        jsEventListenerBodyBuilder.notifyBromium("params");
        jsEventListenerBodyBuilder.endListener();

        verify(jsArriveHandlerBuilder).write("\t\t\tbromium.notifyEvent(params)});\n");
    }

    @Test
    public void canStartCollectingParameters() {
        String trailingString = "});\n";
        JsArriveHandlerBuilder jsArriveHandlerBuilder = mock(JsArriveHandlerBuilder.class);
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = new JsEventListenerBodyBuilder(trailingString, jsArriveHandlerBuilder);

        assertNotNull(jsEventListenerBodyBuilder.startCollectingParameters("something"));
    }
}
