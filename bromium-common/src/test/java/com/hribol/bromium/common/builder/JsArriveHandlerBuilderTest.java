package com.hribol.bromium.common.builder;

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
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsArriveHandlerBuilder jsArriveHandlerBuilder = new JsArriveHandlerBuilder("#title", jsFunctionBodyBuilder);

        jsArriveHandlerBuilder.write("\t\t\tvar something = 5;\n\t\t");

        jsArriveHandlerBuilder.endArriveHandler();

        verify(jsFunctionBodyBuilder).write("\tdocument.arrive(#title, options, function () {\n" +
                "\t\t\tvar something = 5;\n" +
                "\t\t});\n");
    }

    @Test
    public void canCreateNotifySatisfiedCondition() {
        String hashCode = "1293";
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsArriveHandlerBuilder jsArriveHandlerBuilder = new JsArriveHandlerBuilder("#title", jsFunctionBodyBuilder);

        jsArriveHandlerBuilder
                .notifySatisfiedCondition(hashCode)
                .endArriveHandler();

        verify(jsFunctionBodyBuilder).write("\tdocument.arrive(#title, options, function () {\n" +
                "\t\tbromium.notifySatisfiedCondition(1293);\n" +
                "\t});\n");
    }

    @Test
    public void canCreateNotNullEventHandler() {
        String trailingString = "});\n";
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsArriveHandlerBuilder jsArriveHandlerBuilder = new JsArriveHandlerBuilder(trailingString, jsFunctionBodyBuilder);

        assertNotNull(jsArriveHandlerBuilder.attachListenerForEvent("click"));
    }
}
