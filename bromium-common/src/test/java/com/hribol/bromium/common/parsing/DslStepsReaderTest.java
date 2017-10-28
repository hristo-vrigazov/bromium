package com.hribol.bromium.common.parsing;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.parsing.StepsReader;
import org.junit.Test;

import java.io.*;
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
        File file = new File(getClass().getResource("/actionsWithoutParameters.txt").getFile());
        InputStream inputStream = new FileInputStream(file);

        StepsReader stepsReader = new DslStepsReader(createNoAliasesMockConfiguration());

        TestScenarioSteps testScenarioSteps = stepsReader.readSteps(inputStream);

        assertEquals(1, testScenarioSteps.size());
        assertEquals(clickLoginButton(), testScenarioSteps.get(0));
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


}
