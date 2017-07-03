package com.hribol.bromium.common.generation.helper.suppliers;

import com.hribol.bromium.common.generation.record.RecordingJavascriptGenerator;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 03.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(RecordingJavascriptGeneratorSupplier.class)
public class RecordingJavascriptGeneratorSupplierTest {

    @Test
    public void createsExpectedInstance() throws Exception {
        String baseTemplate = "something";
        JavascriptGenerator<ApplicationActionConfiguration> generator = mock(JavascriptGenerator.class);

        RecordingJavascriptGenerator expected = mock(RecordingJavascriptGenerator.class);

        PowerMockito.whenNew(RecordingJavascriptGenerator.class)
                .withArguments(baseTemplate, generator)
                .thenReturn(expected);

        RecordingJavascriptGeneratorSupplier recordingJavascriptGeneratorSupplier = new RecordingJavascriptGeneratorSupplier();
        RecordingJavascriptGenerator actual = recordingJavascriptGeneratorSupplier.get(baseTemplate, generator);

        assertEquals(expected, actual);
    }
}
