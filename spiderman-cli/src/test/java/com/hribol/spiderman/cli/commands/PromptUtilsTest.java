package com.hribol.spiderman.cli.commands;

import com.hribol.spiderman.cli.MainMenuChoice;
import com.hribol.spiderman.core.config.ApplicationActionConfiguration;
import com.hribol.spiderman.core.config.ApplicationConfiguration;
import com.hribol.spiderman.replay.ReplayBrowserConfiguration;
import org.beryx.textio.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static com.hribol.spiderman.cli.MainMenuChoice.SAVE_AND_EXIT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

/**
 * Created by hvrigazov on 26.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        TextIoFactory.class,
        ReplayBrowserConfiguration.Builder.class})
public class PromptUtilsTest {

    @Test
    public void promptUtilsCanGetVersion() {
        String expected = "0.0.1";

        StringInputReader stringInputReader = mock(StringInputReader.class);
        when(stringInputReader.read(anyString())).thenReturn(expected);
        when(stringInputReader.withDefaultValue(anyString())).thenReturn(stringInputReader);

        TextIO textIO = mock(TextIO.class);
        when(textIO.newStringInputReader()).thenReturn(stringInputReader);
        mockStatic(TextIoFactory.class);
        when(TextIoFactory.getTextIO()).thenReturn(textIO);

        PromptUtils promptUtils = new PromptUtils();

        String actual = promptUtils.promptForVersion();

        assertEquals(expected, actual);
    }

    @Test
    public void mainMenuDispatchesCorrectly() {
        TextTerminal textTerminal = mock(TextTerminal.class);
        TextIO textIO = mock(TextIO.class);
        when(textIO.getTextTerminal()).thenReturn(textTerminal);
        mockStatic(TextIoFactory.class);
        when(TextIoFactory.getTextIO()).thenReturn(textIO);

        EnumInputReader enumInputReader = mock(EnumInputReader.class);
        when(enumInputReader.read(anyString())).thenReturn(SAVE_AND_EXIT);
        when(textIO.newEnumInputReader(MainMenuChoice.class)).thenReturn(enumInputReader);

        PromptUtils promptUtils = new PromptUtils();

        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        promptUtils.showAssertionActionChoice(applicationConfiguration);
    }
}
