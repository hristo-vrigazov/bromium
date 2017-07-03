package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.core.generation.GenerationInformation;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class EmptyFunctionTest {

    @Test
    public void generatesEmptyString() {
        EmptyFunction emptyFunction = new EmptyFunction();
        assertTrue(emptyFunction.getJavascriptCode().isEmpty());
    }

    @Test
    public void invocationIsEmpty() {
        GenerationInformation generationInformation = mock(GenerationInformation.class);
        EmptyFunction emptyFunction = new EmptyFunction();
        assertTrue(emptyFunction.getInvocation(generationInformation) instanceof EmptyInvocation);
    }
}
