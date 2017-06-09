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
        verify(jsCollector).write(expectedFunction);
    }

    @Test
    public void canDeclareFunctionWithOneParameterAndBody() {
        JsCollector jsCollector = mock(JsCollector.class);
        String functionName = "something";

        JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder = new JsFunctionDeclarerBuilder(functionName, jsCollector);

        jsFunctionDeclarerBuilder
                .withParameters("x")
                .write("\tconsole.log(x);");

        String expectedFunction = "function something(x) {\n" +
                "\tconsole.log(x);}\n";
        verify(jsCollector).write(expectedFunction);
    }

    @Test
    public void canDeclareFunctionWithNoParametersAndBody() {
        JsCollector jsCollector = mock(JsCollector.class);
        String functionName = "something";

        JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder = new JsFunctionDeclarerBuilder(functionName, jsCollector);

        jsFunctionDeclarerBuilder
                .withParameters()
                .write("\tconsole.log('There are no parameters');");

        String expectedFunction = "function something() {\n" +
                "\tconsole.log('There are no parameters');}\n";
        verify(jsCollector).write(expectedFunction);
    }

    @Test
    public void canCreateNotNullBodyBuilder() {
        JsCollector jsCollector = mock(JsCollector.class);
        String functionName = "something";

        JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder = new JsFunctionDeclarerBuilder(functionName, jsCollector);

        assertNotNull(jsFunctionDeclarerBuilder.startBody());
    }
}
