package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.webdriver.IncludeInvokeRecorderGenerator;
import com.hribol.bromium.record.javascript.generation.webdriver.WebDriverActionRecorderGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class IncludeInvokeRecorderGeneratorTest {

    @Test
    public void registersActionAfterCodeIsGenerated() {
        String eventName = "eventName";
        String functionCode = "function something(a) {}", invocationCode = "something(#a'";

        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        RecorderTypeRegistry recordingTypeRegistry = mock(RecorderTypeRegistry.class);
        when(recordingTypeRegistry.getRecordingCodeForType(eventName, webDriverActionConfiguration))
                .thenReturn(functionCode, invocationCode);

        WebDriverActionRecorderGenerator webDriverActionRecorderGenerator = new IncludeInvokeRecorderGenerator(recordingTypeRegistry);

        String actual = webDriverActionRecorderGenerator.generate(eventName, webDriverActionConfiguration);

        assertEquals(functionCode, actual);
        verify(recordingTypeRegistry).register(eventName, webDriverActionConfiguration);
    }

}
