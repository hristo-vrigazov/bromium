package com.hribol.bromium.replay.execution.scenario;

import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.utils.parsing.StepsReader;
import com.hribol.bromium.replay.execution.application.ApplicationAction;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.core.utils.ConfigurationUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class TestScenarioFactoryTest {

    @Test
    public void canCreateScenarioFromFile() throws IOException {
        String pathToTestCase = getClass().getResource("/testCase.json").getFile();

        WebDriverAction pageLoadingWebDriverAction = mock(WebDriverAction.class);
        ApplicationAction initialPageLoading = mock(ApplicationAction.class);
        when(initialPageLoading.getWebdriverAction()).thenReturn(Optional.of(pageLoadingWebDriverAction));
        ApplicationActionFactory applicationActionFactory = mock(ApplicationActionFactory.class);

        TestScenarioSteps testCaseSteps = ConfigurationUtils.readSteps(pathToTestCase);

        createMock(applicationActionFactory, testCaseSteps);

        StepsReader stepsReader = mock(StepsReader.class);
        when(stepsReader.readSteps(any())).thenReturn(testCaseSteps);
        TestScenarioFactory testScenarioFactory = new TestScenarioFactory(applicationActionFactory, stepsReader);
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToTestCase);

        assertEquals(testCaseSteps.size(), testScenario.getActions().size());
    }

    @Test
    public void canCreateScenarioFromInput() throws IOException {
        String pathToTestCase = getClass().getResource("/testCase.json").getFile();
        FileInputStream fileInputStream = new FileInputStream(pathToTestCase);

        WebDriverAction pageLoadingWebDriverAction = mock(WebDriverAction.class);
        ApplicationAction initialPageLoading = mock(ApplicationAction.class);
        when(initialPageLoading.getWebdriverAction()).thenReturn(Optional.of(pageLoadingWebDriverAction));
        ApplicationActionFactory applicationActionFactory = mock(ApplicationActionFactory.class);

        TestScenarioSteps testCaseSteps = ConfigurationUtils.readSteps(pathToTestCase);

        createMock(applicationActionFactory, testCaseSteps);

        StepsReader stepsReader = mock(StepsReader.class);
        when(stepsReader.readSteps(fileInputStream)).thenReturn(testCaseSteps);
        TestScenarioFactory testScenarioFactory = new TestScenarioFactory(applicationActionFactory, stepsReader);
        TestScenario testScenario = testScenarioFactory.createFromInputStream(fileInputStream);

        assertEquals(testCaseSteps.size(), testScenario.getActions().size());
    }

    private void createMock(ApplicationActionFactory applicationActionFactory, TestScenarioSteps testCaseSteps) {
        for (Map<String, String> testCaseStep: testCaseSteps) {
            ApplicationAction domainSpecificAction = mock(ApplicationAction.class);
            String something = "something";
            WebDriverAction webDriverAction = mock(WebDriverAction.class);
            when(webDriverAction.getName()).thenReturn(something);
            when(domainSpecificAction.getPrecondition()).thenReturn(Optional.empty());
            when(domainSpecificAction.getWebdriverAction()).thenReturn(Optional.of(webDriverAction));
            when(domainSpecificAction.getPostcondition()).thenReturn(Optional.empty());
            when(applicationActionFactory.create(testCaseStep)).thenReturn(domainSpecificAction);
        }
    }
}
