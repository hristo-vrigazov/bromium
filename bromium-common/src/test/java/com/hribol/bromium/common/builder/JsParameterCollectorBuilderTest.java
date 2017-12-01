package com.hribol.bromium.common.builder;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsParameterCollectorBuilderTest {

    @Test
    public void canCollectParameters() {
        JsEventListenerBodyBuilder jsEventListenerBodyBuilder = mock(JsEventListenerBodyBuilder.class);
        JsParameterCollectorBuilder jsParameterCollectorBuilder = new JsParameterCollectorBuilder("params", jsEventListenerBodyBuilder);

        final ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        jsParameterCollectorBuilder
                .parameter("key1", "value1")
                .parameterWithConstantKey("key2", "value2")
                .buildParameters();

        verify(jsEventListenerBodyBuilder).write(captor.capture());
        assertTrue(equalToIgnoringWhiteSpace(captor.getValue()).matches("\t\t\tvar params = {};\n" +
                "\t\t\t\tparams[key1] = value1;\n" +
                "\t\t\t\tparams[\"key2\"] = value2;\n" +
                "\t\t\t\t"));

    }
}
