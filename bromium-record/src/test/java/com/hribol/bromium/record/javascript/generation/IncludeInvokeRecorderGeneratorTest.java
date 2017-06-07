package com.hribol.bromium.record.javascript.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
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
    public void ifActionWithTheSameTypeIsNotYetIncludedInJavascriptRecorderBuilderThenItsInvocationIsIncluded() {
        String recordingString = "function clickId(id) { }";
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        JavascriptRecorderBuilder javascriptRecorderBuilder = mock(JavascriptRecorderBuilder.class);
        when(javascriptRecorderBuilder.isActionWithTheSameTypeIncluded(webDriverActionConfiguration)).thenReturn(false);
        when(javascriptRecorderBuilder.getRecordingCodeForType(webDriverActionConfiguration)).thenReturn(recordingString);

        WebDriverActionRecorderGenerator includeInvokeRecorderGenerator = new IncludeInvokeRecorderGenerator(javascriptRecorderBuilder);

        assertEquals(recordingString, includeInvokeRecorderGenerator.generate(webDriverActionConfiguration));

        verify(javascriptRecorderBuilder).registerRecordingType(webDriverActionConfiguration);
    }

    @Test
    public void ifActionWithTheSameTypeHasAlreadyBeenIncludedThenInvocationIsAdded() {
        String invocationString = "clickCssSelectorListener('#something')";
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        JavascriptRecorderBuilder javascriptRecorderBuilder = mock(JavascriptRecorderBuilder.class);
        when(javascriptRecorderBuilder.isActionWithTheSameTypeIncluded(webDriverActionConfiguration)).thenReturn(true);
        when(javascriptRecorderBuilder.getInvocationCodeForType(webDriverActionConfiguration)).thenReturn(invocationString);

        WebDriverActionRecorderGenerator includeInvokeRecorderGenerator = new IncludeInvokeRecorderGenerator(javascriptRecorderBuilder);

        assertEquals(invocationString, includeInvokeRecorderGenerator.generate(webDriverActionConfiguration));

        verify(javascriptRecorderBuilder).registerInvocationOfRecordingType(webDriverActionConfiguration);
    }

}
