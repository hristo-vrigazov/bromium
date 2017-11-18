package com.hribol.bromium.common.parsing;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.parsing.StepsReader;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.common.parsing.DslStepsDumperTest.*;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 28.10.17.
 */
public class DslStepsReaderTest {

    @Test
    public void canParseStepsWithParametersInThem() throws IOException {
        File file = new File(getClass().getResource("/actionsWithParameters.txt").getFile());
        InputStream inputStream = new FileInputStream(file);

        StepsReader stepsReader = new DslStepsReader(createAliasesMockConfiguration());

        TestScenarioSteps testScenarioSteps = stepsReader.readSteps(inputStream);

        assertEquals(2, testScenarioSteps.size());
        assertEquals(loadPageStep(), testScenarioSteps.get(0));
        assertEquals(typeInNameInputStep(), testScenarioSteps.get(1));
    }

    @Test
    public void canParseStepsWithNoParametersInThem() throws IOException {
        InputStream stream = new ByteArrayInputStream("clickLoginButtonActionName: Click login button ".getBytes(StandardCharsets.UTF_8.name()));

        StepsReader stepsReader = new DslStepsReader(createNoAliasesMockConfiguration());

        TestScenarioSteps testScenarioSteps = stepsReader.readSteps(stream);

        assertEquals(1, testScenarioSteps.size());
        assertEquals(clickLoginButton(), testScenarioSteps.get(0));
    }

    @Test
    public void canParseStepsThatFinishWithParameters() throws IOException {
        InputStream stream = new ByteArrayInputStream("typeInPasswordInput: Type in password input admin".getBytes(StandardCharsets.UTF_8.name()));

        StepsReader stepsReader = new DslStepsReader(createConfigurationinishingWithExposedParameter());

        TestScenarioSteps testScenarioSteps = stepsReader.readSteps(stream);

        assertEquals(1, testScenarioSteps.size());
        assertEquals(typeInPasswordField(), testScenarioSteps.get(0));
    }

    @Rule
    public ExpectedException exceptions = ExpectedException.none();

    @Test
    public void ifUnknownActionIfSendExceptionIsThrown() throws IOException {
        exceptions.expect(IllegalStateException.class);
        InputStream stream = new ByteArrayInputStream("something: Type in password input admin".getBytes(StandardCharsets.UTF_8.name()));

        StepsReader stepsReader = new DslStepsReader(createConfigurationinishingWithExposedParameter());

        TestScenarioSteps testScenarioSteps = stepsReader.readSteps(stream);

        assertEquals(1, testScenarioSteps.size());
        assertEquals(typeInPasswordField(), testScenarioSteps.get(0));
    }

    private Map<String, String> typeInNameInputStep() {
        Map<String, String> typeStep = new HashMap<>();
        typeStep.put(EVENT, typeInNameInputActionName);
        typeStep.put(aliasText, "admin");
        return typeStep;
    }

    private Map<String, String> loadPageStep() {
        Map<String, String> pageStep = new HashMap<>();
        pageStep.put(EVENT, "loadPage");
        pageStep.put(aliasUrl, "text-field.html");
        return pageStep;
    }

    private Map<String, String> clickLoginButton() {
        Map<String, String> clickLoginButton = new HashMap<>();
        clickLoginButton.put(EVENT, clickLoginButtonActionName);
        return clickLoginButton;
    }

    private Map<String, String> typeInPasswordField() {
        Map<String, String> step = new HashMap<>();
        step.put(EVENT, typeInPasswordActionName);
        step.put(aliasPassword, "admin");
        return step;
    }


}
