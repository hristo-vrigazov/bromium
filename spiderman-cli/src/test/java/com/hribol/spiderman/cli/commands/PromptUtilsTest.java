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

import java.io.IOException;
import java.util.List;

import static com.hribol.spiderman.cli.MainMenuChoice.ACTION;
import static com.hribol.spiderman.cli.MainMenuChoice.ASSERTION;
import static com.hribol.spiderman.cli.MainMenuChoice.SAVE_AND_EXIT;
import static com.hribol.spiderman.cli.commands.PromptUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyList;
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

    public static final String TEXT = "text";
    public static final String MEGA_MENU_TAB_TEXT = "megaMenuTabText";
    public static final String CLICK_MEGA_MENU = "clickMegaMenu";
    public static final String ATP = "ATP";
    public static final String ELEMENT_TEXT_TO_BE = "ELEMENT_TEXT_TO_BE";
    private static final String ELEMENT_TO_BE_CLICKABLE = "ELEMENT_TO_BE_CLICKABLE";
    public static final String CLICK_CLASS_BY_TEXT = "CLICK_CLASS_BY_TEXT";
    public static final String INITIAL_COLLECTOR_CLASS = "INITIAL_COLLECTOR_CLASS";
    public static final String MEGA_MENU_LINK = "mega-menu-link";
    public static final String TITLE_TEXT = "TITLE_TEXT";

    @Test
    public void promptUtilsCanGetVersion() {
        String expected = "0.0.1";

        StringInputReader stringInputReader = mock(StringInputReader.class);
        when(stringInputReader.read(anyString())).thenReturn(expected);
        when(stringInputReader.withDefaultValue(anyString())).thenReturn(stringInputReader);

        CharInputReader charInputReader = mock(CharInputReader.class);
        when(charInputReader.read(PRESS_ANY_KEY_WHEN_FINISHED_RECORDING)).thenReturn('a');

        TextIO textIO = mock(TextIO.class);
        when(textIO.newStringInputReader()).thenReturn(stringInputReader);
        when(textIO.newCharInputReader()).thenReturn(charInputReader);

        mockStatic(TextIoFactory.class);
        when(TextIoFactory.getTextIO()).thenReturn(textIO);

        PromptUtils promptUtils = new PromptUtils();

        String actual = promptUtils.promptForVersion();

        assertEquals(expected, actual);

        promptUtils.promptForRecording();
    }

    @Test
    public void mainMenuDispatchesCorrectly() {
        TextTerminal textTerminal = mock(TextTerminal.class);
        TextIO textIO = mock(TextIO.class);
        when(textIO.getTextTerminal()).thenReturn(textTerminal);
        mockStatic(TextIoFactory.class);
        when(TextIoFactory.getTextIO()).thenReturn(textIO);

        EnumInputReader enumInputReader = mock(EnumInputReader.class);
        when(enumInputReader.read(LET_S_ADD_ANOTHER_ONE_CHOOSE_FROM_BELOW))
                .thenReturn(ACTION, ASSERTION, SAVE_AND_EXIT);

        StringInputReader webDriverActionTypeReader = mock(StringInputReader.class);
        when(webDriverActionTypeReader.read(TYPE)).thenReturn(
                NOTHING, CLICK_CLASS_BY_TEXT, NOTHING,
                NOTHING, ELEMENT_TEXT_TO_BE, NOTHING);

        StringInputReader stringInputReader = mock(StringInputReader.class);
        when(stringInputReader.read(ACTION_NAME)).thenReturn(CLICK_MEGA_MENU);
        when(stringInputReader.read(ASSERTION_NAME)).thenReturn(MEGA_MENU_TAB_TEXT);
        when(stringInputReader.read(PARAMETER_NAME)).thenReturn(
                INITIAL_COLLECTOR_CLASS, TITLE_TEXT,
                TEXT);
        when(stringInputReader.withPossibleValues(anyList())).thenReturn(webDriverActionTypeReader);
        when(stringInputReader.read(VALUE_OF + INITIAL_COLLECTOR_CLASS)).thenReturn(MEGA_MENU_LINK);
        when(stringInputReader.read(VALUE_OF + TEXT)).thenReturn(ATP);
        when(stringInputReader.read(ALIAS_FOR + TITLE_TEXT)).thenReturn(TEXT);

        BooleanInputReader booleanInputReader = mock(BooleanInputReader.class);
        when(booleanInputReader.read(EXPECT_HTTP_REQUEST_AFTER_THE_ACTION)).thenReturn(
                true,
                false);
        when(booleanInputReader.read(ADD_A_PARAMETER)).thenReturn(
                true, true, false,
                true, false
        );

        when(booleanInputReader.read(SHOULD_I_EXPOSE + INITIAL_COLLECTOR_CLASS)).thenReturn(false);
        when(booleanInputReader.read(SHOULD_I_EXPOSE + TITLE_TEXT)).thenReturn(true);
        when(booleanInputReader.read(SHOULD_I_EXPOSE + TEXT)).thenReturn(false);

        when(textIO.newEnumInputReader(MainMenuChoice.class)).thenReturn(enumInputReader);
        when(textIO.newStringInputReader()).thenReturn(stringInputReader);
        when(textIO.newBooleanInputReader()).thenReturn(booleanInputReader);

        PromptUtils promptUtils = new PromptUtils();

        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        promptUtils.showAssertionActionChoice(applicationConfiguration);

        List<ApplicationActionConfiguration> applicationActionConfigurationList = applicationConfiguration.getApplicationActionConfigurationList();

        ApplicationActionConfiguration firstApplicationAction = applicationActionConfigurationList.get(0);
        assertEquals(firstApplicationAction.expectsHttpRequest(), true);
        assertEquals(NOTHING, firstApplicationAction.getConditionBeforeExecution().getWebDriverActionType());
        assertEquals(CLICK_CLASS_BY_TEXT, firstApplicationAction.getWebDriverAction().getWebDriverActionType());
        assertEquals(NOTHING, firstApplicationAction.getConditionAfterExecution().getWebDriverActionType());

        ApplicationActionConfiguration assertion = applicationActionConfigurationList.get(1);
        assertEquals(NOTHING, assertion.getConditionBeforeExecution().getWebDriverActionType());
        assertEquals(ELEMENT_TEXT_TO_BE, assertion.getWebDriverAction().getWebDriverActionType());
        assertEquals(NOTHING, assertion.getConditionAfterExecution().getWebDriverActionType());
    }
}
