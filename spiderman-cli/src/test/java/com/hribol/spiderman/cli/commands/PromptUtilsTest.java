package com.hribol.spiderman.cli.commands;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hvrigazov on 26.04.17.
 */
public class PromptUtilsTest {

    @Test
    public void promptUtilsCanGetTextIO() {
        PromptUtils promptUtils = new PromptUtils();
        assertNotNull(promptUtils.getTextIO());
    }
}
