package com.hribol.bromium.replay.execution.application;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.replay.execution.factory.PredefinedWebDriverActionFactory;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 22.04.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        ApplicationActionFactory.class,
        DefaultApplicationActionFactory.class,
        WebDriverActionFactory.class,
        PredefinedWebDriverActionFactory.class,
        TestCaseStepToApplicationActionConverter.class
})
public class DefaultApplicationActionFactoryTest {

    @Test
    public void canCreatePageLoadingAndOtherActions() {
        String url = "http://tenniskafe.com";
        String actionName = "actionName";
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getName()).thenReturn(actionName);

        List<ApplicationActionConfiguration> applicationActionConfigurationList = new ArrayList<>();
        applicationActionConfigurationList.add(applicationActionConfiguration);

        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);
        when(applicationConfiguration.getApplicationActionConfigurationList()).thenReturn(applicationActionConfigurationList);

        TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter =
                mock(TestCaseStepToApplicationActionConverter.class);

        ApplicationAction applicationAction = mock(ApplicationAction.class);

        Map<String, String> testCaseStep = new HashMap<>();
        testCaseStep.put("event", actionName);

        when(testCaseStepToApplicationActionConverter.convert(applicationActionConfiguration, testCaseStep))
                .thenReturn(applicationAction);

        ApplicationActionFactory applicationActionFactory =
                new DefaultApplicationActionFactory(applicationConfiguration, testCaseStepToApplicationActionConverter);

        assertEquals(applicationAction, applicationActionFactory.create(testCaseStep));
    }

    @Test
    public void urlConstructor() throws Exception {
        String url = "http://tenniskafe.com";
        String event = "ACTION_NAME";
        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getName()).thenReturn(event);

        PredefinedWebDriverActionFactory webDriverActionFactory = mock(PredefinedWebDriverActionFactory.class);
        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);

        List<ApplicationActionConfiguration> applicationActionConfigurationList = new ArrayList<>();
        applicationActionConfigurationList.add(applicationActionConfiguration);
        when(applicationConfiguration.getApplicationActionConfigurationList()).thenReturn(applicationActionConfigurationList);

        TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter = mock(TestCaseStepToApplicationActionConverter.class);

        whenNew(PredefinedWebDriverActionFactory.class).withArguments(url).thenReturn(webDriverActionFactory);
        whenNew(TestCaseStepToApplicationActionConverter.class).withArguments(webDriverActionFactory).thenReturn(testCaseStepToApplicationActionConverter);

        ApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(applicationConfiguration, url);

        ApplicationAction applicationAction = mock(ApplicationAction.class);

        Map<String, String> testCaseStep = new HashMap<>();
        testCaseStep.put(EVENT, event);

        when(testCaseStepToApplicationActionConverter.convert(applicationActionConfiguration, testCaseStep))
                .thenReturn(applicationAction);

        ApplicationAction actualAction = applicationActionFactory.create(testCaseStep);

        assertEquals(applicationAction, actualAction);
    }

}
