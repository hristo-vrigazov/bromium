package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ReplayingJavascriptGeneratorTest {

    private final String baseTemplate = "baseTemplate";
    private final String SOME_EVENT = "SOME_EVENT";


    @Test
    public void canGenerateIfSuitableActionIsPresent() {
        final String generatedCodeForAction = "generaated";
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getName()).thenReturn(SOME_EVENT);
        List<ApplicationActionConfiguration> applicationActionConfigurations = new ArrayList<>();
        applicationActionConfigurations.add(applicationActionConfiguration);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);
        when(applicationConfiguration.getApplicationActionConfigurationList()).thenReturn(applicationActionConfigurations);

        Map<String, String> testCaseStep = new HashMap<>();
        testCaseStep.put(EVENT, SOME_EVENT);
        TestScenarioSteps testCaseSteps = new TestScenarioSteps();
        testCaseSteps.add(testCaseStep);

        StepsAndConfiguration stepsAndConfiguration = mock(StepsAndConfiguration.class);
        when(stepsAndConfiguration.getTestCaseSteps()).thenReturn(testCaseSteps);
        when(stepsAndConfiguration.getApplicationConfiguration()).thenReturn(applicationConfiguration);

        StepAndActionConfiguration stepAndActionConfiguration = mock(StepAndActionConfiguration.class);
        JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration = mock(JavascriptGenerator.class);
        when(generatorByStepAndActionConfiguration.generate(stepAndActionConfiguration)).thenReturn(generatedCodeForAction);

        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier = mock(StepAndActionConfigurationSupplier.class);
        when(stepAndActionConfigurationSupplier.get(testCaseStep, applicationActionConfiguration)).thenReturn(stepAndActionConfiguration);

        ReplayingJavascriptGenerator replayingJavascriptGenerator = new ReplayingJavascriptGenerator(baseTemplate,
                generatorByStepAndActionConfiguration, stepAndActionConfigurationSupplier);

        String actual = replayingJavascriptGenerator.generate(stepsAndConfiguration);

        assertEquals(baseTemplate + System.lineSeparator() + System.lineSeparator() + generatedCodeForAction, actual);
    }


    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwsExceptionIfSuitableActionIsNotFound() {
        final String generatedCodeForAction = "generaated";
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getName()).thenReturn(SOME_EVENT);
        List<ApplicationActionConfiguration> applicationActionConfigurations = new ArrayList<>();
        applicationActionConfigurations.add(applicationActionConfiguration);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);
        when(applicationConfiguration.getApplicationActionConfigurationList()).thenReturn(applicationActionConfigurations);

        Map<String, String> testCaseStep = new HashMap<>();
        testCaseStep.put(EVENT, "blabla");
        TestScenarioSteps testCaseSteps = new TestScenarioSteps();
        testCaseSteps.add(testCaseStep);

        StepsAndConfiguration stepsAndConfiguration = mock(StepsAndConfiguration.class);
        when(stepsAndConfiguration.getTestCaseSteps()).thenReturn(testCaseSteps);
        when(stepsAndConfiguration.getApplicationConfiguration()).thenReturn(applicationConfiguration);

        StepAndActionConfiguration stepAndActionConfiguration = mock(StepAndActionConfiguration.class);
        JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration = mock(JavascriptGenerator.class);
        when(generatorByStepAndActionConfiguration.generate(stepAndActionConfiguration)).thenReturn(generatedCodeForAction);

        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier = mock(StepAndActionConfigurationSupplier.class);
        when(stepAndActionConfigurationSupplier.get(testCaseStep, applicationActionConfiguration)).thenReturn(stepAndActionConfiguration);

        ReplayingJavascriptGenerator replayingJavascriptGenerator = new ReplayingJavascriptGenerator(baseTemplate,
                generatorByStepAndActionConfiguration, stepAndActionConfigurationSupplier);

        expectedException.expect(IllegalStateException.class);
        String actual = replayingJavascriptGenerator.generate(stepsAndConfiguration);

    }

}
