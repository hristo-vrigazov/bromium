package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 17.11.17.
 */
public class SyntaxDefinitionASTNodeConverterTest {

    @Test
    public void convertWithoutExposedParameters() {
        final String content = "type";
        SyntaxDefinition syntaxDefinition = mock(SyntaxDefinition.class);
        when(syntaxDefinition.getContent()).thenReturn(content);

        SyntaxDefinitionASTNodeConverter converter = new SyntaxDefinitionASTNodeConverter();
        SyntaxDefinitionConfiguration actual = converter.convert(syntaxDefinition);

        assertEquals(content, actual.getContent());
    }

    @Test
    public void convertWithExposedParameters() {
        final String exposedParameter = "text";
        SyntaxDefinition syntaxDefinition = mock(SyntaxDefinition.class, RETURNS_DEEP_STUBS);
        when(syntaxDefinition.getParameter().getName()).thenReturn(exposedParameter);

        SyntaxDefinitionASTNodeConverter converter = new SyntaxDefinitionASTNodeConverter();
        SyntaxDefinitionConfiguration actual = converter.convert(syntaxDefinition);

        assertEquals(exposedParameter, actual.getExposedParameter());
    }

}