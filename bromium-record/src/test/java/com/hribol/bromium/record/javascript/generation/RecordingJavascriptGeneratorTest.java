package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.record.javascript.generation.application.ApplicationActionRecorder;
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
        String generatedCodeForFirstAction = "generated1";
        String generatedCodeForSecondAction = "generated2";

        ApplicationActionConfiguration firstAction = mock(ApplicationActionConfiguration.class);
        ApplicationActionConfiguration secondAction = mock(ApplicationActionConfiguration.class);

        List<ApplicationActionConfiguration> applicationActionConfigurationList = new ArrayList<>();
        applicationActionConfigurationList.add(firstAction);
        applicationActionConfigurationList.add(secondAction);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);
        when(applicationConfiguration.getApplicationActionConfigurationList()).thenReturn(applicationActionConfigurationList);

        ApplicationActionRecorder applicationActionRecorder = mock(ApplicationActionRecorder.class);
        when(applicationActionRecorder.generate(firstAction)).thenReturn(generatedCodeForFirstAction);
        when(applicationActionRecorder.generate(secondAction)).thenReturn(generatedCodeForSecondAction);

        JavascriptGenerator javascriptGenerator = new RecordingJavascriptGenerator(applicationActionRecorder);
        String generatedJavascript = javascriptGenerator.generate(applicationConfiguration);

        assertTrue(generatedJavascript.contains(generatedCodeForFirstAction));
        assertTrue(generatedJavascript.contains(generatedCodeForSecondAction));
        assertEquals(generatedJavascript, generatedCodeForFirstAction + generatedCodeForSecondAction);
    }
}
