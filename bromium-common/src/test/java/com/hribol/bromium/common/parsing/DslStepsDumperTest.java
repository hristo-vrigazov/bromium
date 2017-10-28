package com.hribol.bromium.common.parsing;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.parsing.StepsDumper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 28.10.17.
 */
public class DslStepsDumperTest {

    public static final String loadPageActionName = "loadPage";
    public static final String typeInNameInputActionName = "typeInNameInput";
    public static final String clickLoginButtonActionName = "clickLoginButtonActionName";
    public static final String outputFilename = "tmp.json";

    public static final String aliasUrl = "alias-url";
    public static final String aliasUrlValue = "text-field.html";

    public static final String aliasText = "alias-text";
    public static final String aliasTextValue = "admin";


    @Test
    public void dumpsStepsReplacingAliases() throws IOException {
        Map<String, String> firstStep = new HashMap<>();
        firstStep.put(EVENT, loadPageActionName);
        firstStep.put(aliasUrl, aliasUrlValue);

        Map<String, String> secondStep = new HashMap<>();
        secondStep.put(EVENT, typeInNameInputActionName);
        secondStep.put(aliasText, aliasTextValue);

        TestScenarioSteps testScenarioSteps = new TestScenarioSteps();
        testScenarioSteps.add(firstStep);
        testScenarioSteps.add(secondStep);

        File outputFile = new File(outputFilename);

        Map<String, ApplicationActionConfiguration> actionConfigurationMap = createAliasesMockConfiguration();

        StepsDumper stepsDumper = new DslStepsDumper(actionConfigurationMap);
        stepsDumper.dump(testScenarioSteps, outputFilename);

        List<String> lines = Files.readLines(outputFile, Charsets.UTF_8);
        assertEquals(2, lines.size());
        assertEquals("loadPage: Load text-field.html page ", lines.get(0));
        assertEquals("typeInNameInput: Type admin in name input ", lines.get(1));

        assertTrue(outputFile.delete());
    }

    @Test
    public void correctlyHandlesNoAliases() throws IOException {
        Map<String, String> firstStep = new HashMap<>();
        firstStep.put(EVENT, clickLoginButtonActionName);

        TestScenarioSteps testScenarioSteps = new TestScenarioSteps();
        testScenarioSteps.add(firstStep);

        File outputFile = new File(outputFilename);

        Map<String, ApplicationActionConfiguration> actionConfigurationMap = createNoAliasesMockConfiguration();

        StepsDumper stepsDumper = new DslStepsDumper(actionConfigurationMap);
        stepsDumper.dump(testScenarioSteps, outputFilename);

        List<String> lines = Files.readLines(outputFile, Charsets.UTF_8);
        assertEquals(1, lines.size());
        assertEquals("clickLoginButtonActionName: Click login button ", lines.get(0));
        assertTrue(outputFile.delete());

    }

    public static Map<String, ApplicationActionConfiguration> createNoAliasesMockConfiguration() {
        Map<String, ApplicationActionConfiguration> actionConfigurationMap = new HashMap<>();
        actionConfigurationMap.put(clickLoginButtonActionName, getClickLoginButtonAction());
        return actionConfigurationMap;
    }

    public static Map<String, ApplicationActionConfiguration> createAliasesMockConfiguration() {
        Map<String, ApplicationActionConfiguration> actionConfigurationMap = new HashMap<>();
        actionConfigurationMap.put(loadPageActionName, getLoadPageAction());
        actionConfigurationMap.put(typeInNameInputActionName, getTypeIntoTextFieldAction());
        return actionConfigurationMap;
    }

    public static ApplicationActionConfiguration getTypeIntoTextFieldAction() {
        SyntaxDefinitionConfiguration typeSyntax = mock(SyntaxDefinitionConfiguration.class);
        when(typeSyntax.getContent()).thenReturn("Type");
        when(typeSyntax.getExposedParameter()).thenReturn(aliasText);

        SyntaxDefinitionConfiguration finishTypeSyntax = mock(SyntaxDefinitionConfiguration.class);
        when(finishTypeSyntax.getContent()).thenReturn("in name input");
        when(finishTypeSyntax.getExposedParameter()).thenReturn(null);

        List<SyntaxDefinitionConfiguration> typeIntoTextFieldSyntaxDefinition = new ArrayList<>();
        typeIntoTextFieldSyntaxDefinition.add(typeSyntax);
        typeIntoTextFieldSyntaxDefinition.add(finishTypeSyntax);

        ApplicationActionConfiguration typeIntoTextFieldAction = mock(ApplicationActionConfiguration.class);
        when(typeIntoTextFieldAction.getSyntaxDefinitionConfigurationList()).thenReturn(typeIntoTextFieldSyntaxDefinition);
        return typeIntoTextFieldAction;
    }

    public static ApplicationActionConfiguration getLoadPageAction() {
        SyntaxDefinitionConfiguration loadSyntax = mock(SyntaxDefinitionConfiguration.class);
        when(loadSyntax.getContent()).thenReturn("Load");
        when(loadSyntax.getExposedParameter()).thenReturn(aliasUrl);

        SyntaxDefinitionConfiguration finishLoadSyntax = mock(SyntaxDefinitionConfiguration.class);
        when(finishLoadSyntax.getContent()).thenReturn("page");
        when(finishLoadSyntax.getExposedParameter()).thenReturn(null);

        List<SyntaxDefinitionConfiguration> loadPageSyntaxDefinitions = new ArrayList<>();
        loadPageSyntaxDefinitions.add(loadSyntax);
        loadPageSyntaxDefinitions.add(finishLoadSyntax);

        ApplicationActionConfiguration loadPageAction = mock(ApplicationActionConfiguration.class);
        when(loadPageAction.getSyntaxDefinitionConfigurationList()).thenReturn(loadPageSyntaxDefinitions);
        return loadPageAction;
    }

    public static ApplicationActionConfiguration getClickLoginButtonAction() {
        SyntaxDefinitionConfiguration syntaxDefinitionConfiguration = mock(SyntaxDefinitionConfiguration.class);
        when(syntaxDefinitionConfiguration.getContent()).thenReturn("Click login button");
        when(syntaxDefinitionConfiguration.getExposedParameter()).thenReturn(null);

        List<SyntaxDefinitionConfiguration> syntaxDefinitionConfigurations = new ArrayList<>();
        syntaxDefinitionConfigurations.add(syntaxDefinitionConfiguration);

        ApplicationActionConfiguration action = mock(ApplicationActionConfiguration.class);
        when(action.getSyntaxDefinitionConfigurationList()).thenReturn(syntaxDefinitionConfigurations);
        return action;
    }
}
