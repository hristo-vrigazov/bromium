package com.hribol.bromium.common.generation.common;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class EmptyInvocationTest {

    @Test
    public void generatesEmptyString() {
        EmptyInvocation emptyInvocation = new EmptyInvocation();
        assertTrue(emptyInvocation.getJavascriptCode().isEmpty());
    }
}
