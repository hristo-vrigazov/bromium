package com.hribol.bromium.common.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class JsFunctionBodyBuilderTest {

    @Test
    public void canBuildBody() {
        JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder = mock(JsFunctionDeclarerBuilder.class);
        JsFunctionBodyBuilder jsFunctionBodyBuilder = new JsFunctionBodyBuilder(jsFunctionDeclarerBuilder);

        jsFunctionBodyBuilder.write("a").write("b");

        jsFunctionBodyBuilder.endBody();

        verify(jsFunctionDeclarerBuilder).write("ab");
    }

    @Test
    public void createsANotNullArriveHandler() {
        JsFunctionDeclarerBuilder jsFunctionDeclarerBuilder = mock(JsFunctionDeclarerBuilder.class);
        JsFunctionBodyBuilder jsFunctionBodyBuilder = new JsFunctionBodyBuilder(jsFunctionDeclarerBuilder);

        assertNotNull(jsFunctionBodyBuilder.whenCssSelectorArrives("#title"));
    }
}
