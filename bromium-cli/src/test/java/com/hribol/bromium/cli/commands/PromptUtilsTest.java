package com.hribol.bromium.cli.commands;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by hvrigazov on 01.12.17.
 */
public class PromptUtilsTest {

    @Test
    public void callSystemInRead() throws IOException {
        InputStream inputStream = mock(InputStream.class);
        System.setIn(inputStream);
        PromptUtils promptUtils = new PromptUtils();
        promptUtils.promptForRecording();
        verify(inputStream).read();
    }

}