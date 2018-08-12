package com.hribol.bromium.common.generation.record;

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
        String contextBuilders = "contextBuilders";
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

        JavascriptGenerator<ApplicationConfiguration> contextBuildersGenerator = mock(JavascriptGenerator.class);
        when(contextBuildersGenerator.generate(applicationConfiguration)).thenReturn(contextBuilders);

        JavascriptGenerator javascriptGenerator = new RecordingJavascriptGenerator(baseTemplate, applicationActionGenerator, contextBuildersGenerator);
        String generatedJavascript = javascriptGenerator.generate(applicationConfiguration);

        assertTrue(generatedJavascript.contains(generatedCodeForFirstAction));
        assertTrue(generatedJavascript.contains(generatedCodeForSecondAction));
        String expected = baseTemplate
                + System.lineSeparator() + contextBuilders
                + System.lineSeparator() + generatedCodeForFirstAction
                + System.lineSeparator() + generatedCodeForSecondAction
                + System.lineSeparator();
        assertEquals(expected, generatedJavascript);
    }
}
