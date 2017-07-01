package com.hribol.bromium.common.record;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingJavascriptGeneratorTest {

    @Test
    public void concatenatesApplicationActionRecorders() {
        String baseTemplate = "baseTemplate";
        String generatedCodeForFirstAction = "generated1";
        String generatedCodeForSecondAction = "generated2";

        ApplicationActionConfiguration firstAction = mock(ApplicationActionConfiguration.class);
        ApplicationActionConfiguration secondAction = mock(ApplicationActionConfiguration.class);

        List<ApplicationActionConfiguration> applicationActionConfigurationList = new ArrayList<>();
        applicationActionConfigurationList.add(firstAction);
        applicationActionConfigurationList.add(secondAction);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);
        when(applicationConfiguration.getApplicationActionConfigurationList()).thenReturn(applicationActionConfigurationList);

        JavascriptGenerator<ApplicationActionConfiguration> applicationActionGenerator = mock(JavascriptGenerator.class);
        when(applicationActionGenerator.generate(firstAction)).thenReturn(generatedCodeForFirstAction);
        when(applicationActionGenerator.generate(secondAction)).thenReturn(generatedCodeForSecondAction);

        JavascriptGenerator javascriptGenerator = new RecordingJavascriptGenerator(baseTemplate, applicationActionGenerator);
        String generatedJavascript = javascriptGenerator.generate(applicationConfiguration);

        assertTrue(generatedJavascript.contains(generatedCodeForFirstAction));
        assertTrue(generatedJavascript.contains(generatedCodeForSecondAction));
        assertEquals(generatedJavascript, baseTemplate + generatedCodeForFirstAction + generatedCodeForSecondAction);
    }

//    @Test
//    public void DELETEME() throws IOException {
//        String baseTemplate = IOUtils.toString(getClass().getResourceAsStream("/template.js"));
//        RecorderFunctionFactory recorderFunctionFactory = new PredefinedRecorderFunctionFactory();
//        RecorderTypeRegistry recorderTypeRegistry = new RecorderTypeRegistry(recorderFunctionFactory);
//        WebDriverActionGenerator webDriverActionRecorderGenerator = new IncludeInvokeGenerator(recorderTypeRegistry);
//        ApplicationActionGenerator applicationActionRecorder = new RecordingWebDriverActionsOnly(webDriverActionRecorderGenerator);
//        JavascriptGenerator javascriptGenerator = new RecordingJavascriptGenerator(baseTemplate, applicationActionRecorder);
//
//        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
//        webDriverActionConfiguration.setWebDriverActionType(CLICK_CSS_SELECTOR);
//
//        ParameterConfiguration parameterConfiguration = new ParameterConfiguration();
//        parameterConfiguration.setValue("#ajax-demo");
//        Map<String, ParameterConfiguration> parameterConfigurationMap = new HashMap<>();
//        parameterConfigurationMap.put(CSS_SELECTOR, parameterConfiguration);
//        webDriverActionConfiguration.setParametersConfiguration(parameterConfigurationMap);
//
//        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
//        applicationActionConfiguration.setWebDriverAction(webDriverActionConfiguration);
//        applicationActionConfiguration.setName("someone clicked ico!");
//
//        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
//        applicationConfiguration.addApplicationActionConfiguration(applicationActionConfiguration);
//
//        System.out.println(javascriptGenerator.generate(applicationConfiguration));
//    }
}
