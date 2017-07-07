package com.hribol.bromium.common.builder;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class JsLeaveHandlerBuilderTest {
    @Test
    public void canBuildLeaveHandler() {
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsLeaveHandlerBuilder jsArriveHandlerBuilder = new JsLeaveHandlerBuilder("#title", jsFunctionBodyBuilder);

        jsArriveHandlerBuilder.write("\t\t\tvar something = 5;\n\t\t");

        jsArriveHandlerBuilder.endLeaveHandler();

        verify(jsFunctionBodyBuilder).write("\tdocument.leave(#title, function () {\n" +
                "\t\t\tvar something = 5;\n" +
                "\t\t});\n");
    }

    @Test
    public void canCreateNotifySatisfiedCondition() {
        String hashCode = "1293";
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsLeaveHandlerBuilder jsArriveHandlerBuilder = new JsLeaveHandlerBuilder("#title", jsFunctionBodyBuilder);

        jsArriveHandlerBuilder
                .notifySatisfiedCondition(hashCode)
                .endLeaveHandler();

        verify(jsFunctionBodyBuilder).write("\tdocument.leave(#title, function () {\n" +
                "\t\tbromium.notifySatisfiedCondition(1293);\n" +
                "\t});\n");
    }

    @Test
    public void canCreateNotifyNotSatisfiedCondition() {
        String hashCode = "1293";
        JsFunctionBodyBuilder jsFunctionBodyBuilder = mock(JsFunctionBodyBuilder.class);
        JsLeaveHandlerBuilder jsArriveHandlerBuilder = new JsLeaveHandlerBuilder("#title", jsFunctionBodyBuilder);

        jsArriveHandlerBuilder
                .notifyNotSatisfiedCondition(hashCode)
                .endLeaveHandler();

        verify(jsFunctionBodyBuilder).write("\tdocument.leave(#title, function () {\n" +
                "\t\tbromium.notifyNotSatisfiedCondition(1293);\n" +
                "\t});\n");
    }
}
