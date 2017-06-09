package com.hribol.bromium.common.record.application;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.application.ApplicationActionRecorder;
import com.hribol.bromium.record.javascript.generation.webdriver.WebDriverActionRecorderGenerator;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecordingWebDriverActionsOnlyTest {

    @Test
    public void generatesCodeBasedOnWebDriverAction() {
        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getWebDriverAction()).thenReturn(webDriverActionConfiguration);

        WebDriverActionRecorderGenerator webDriverActionRecorderGenerator = mock(WebDriverActionRecorderGenerator.class);
        ApplicationActionRecorder applicationActionRecorder = new RecordingWebDriverActionsOnly(webDriverActionRecorderGenerator);

        String generatedString = applicationActionRecorder.generate(applicationActionConfiguration);

        verify(webDriverActionRecorderGenerator).generate(anyString(), eq(webDriverActionConfiguration));
    }
}
