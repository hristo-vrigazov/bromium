package com.hribol.bromium.record.javascript.generation.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsFunctionDeclarerBuilderTest {

    @Test
    public void canDeclareAFunctionWithBody() {
        JsCollector jsCollector = mock(JsCollector.class);
        String functionName = "something";

        JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder = new JsFunctionDeclarerBuilder(functionName, jsCollector);

        jsFunctionDeclarerBuilder
                .withParameters("x", "y")
                .write("\tconsole.log(x + y);");

        String expectedFunction = "function something(x, y) {\n" +
                "\tconsole.log(x + y);}\n";
        assertNotNull(jsFunctionDeclarerBuilder.startBody());
        verify(jsCollector).write(expectedFunction);
    }
}
