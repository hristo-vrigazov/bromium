package com.hribol.bromium.common.record.builder;

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
        JsArriveHandlerBuilder jsArriveHandlerBuilder = mock(JsArriveHandlerBuilder.class);
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = new JsEventListenerBodyBuilder("click", jsArriveHandlerBuilder);

        jsEventListenerBodyBuilder.write("\t\t\t\tvar something = 5;").endListener();

        verify(jsArriveHandlerBuilder).write("\t\tthis.addEventListener(\"click\", function(e) {\n" +
                "\t\t\t\tvar something = 5;\n" +
                "\t\t});");
    }

    @Test
    public void canAddBromiumNotification() {
        JsArriveHandlerBuilder jsArriveHandlerBuilder = mock(JsArriveHandlerBuilder.class);
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = new JsEventListenerBodyBuilder("click", jsArriveHandlerBuilder);

        jsEventListenerBodyBuilder.notifyBromium("params");
        jsEventListenerBodyBuilder.endListener();

        verify(jsArriveHandlerBuilder).write("\t\tthis.addEventListener(\"click\", function(e) {\n" +
                "\t\t\tbromium.notifyEvent(params);\n" +
                "\t\t});");
    }

    @Test
    public void canStartCollectingParameters() {
        String trailingString = "});\n";
        JsArriveHandlerBuilder jsArriveHandlerBuilder = mock(JsArriveHandlerBuilder.class);
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = new JsEventListenerBodyBuilder(trailingString, jsArriveHandlerBuilder);

        assertNotNull(jsEventListenerBodyBuilder.startCollectingParameters("something"));
    }
}
