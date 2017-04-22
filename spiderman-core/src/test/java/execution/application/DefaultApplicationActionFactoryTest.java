package execution.application;

import com.hribol.automation.core.config.ApplicationActionConfiguration;
import com.hribol.automation.core.config.ApplicationConfiguration;
import com.hribol.automation.core.execution.application.ApplicationAction;
import com.hribol.automation.core.execution.application.ApplicationActionFactory;
import com.hribol.automation.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.automation.core.execution.application.TestCaseToApplicationActionConverter;
import com.hribol.automation.core.execution.factory.WebDriverActionFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
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

        TestCaseToApplicationActionConverter testCaseToApplicationActionConverter =
                mock(TestCaseToApplicationActionConverter.class);

        ApplicationAction applicationAction = mock(ApplicationAction.class);

        Map<String, String> testCaseStep = new HashMap<>();
        testCaseStep.put("event", actionName);

        when(testCaseToApplicationActionConverter.convert(applicationActionConfiguration, testCaseStep))
                .thenReturn(applicationAction);

        ApplicationActionFactory applicationActionFactory =
                new DefaultApplicationActionFactory(url, applicationConfiguration, testCaseToApplicationActionConverter);

        ApplicationAction initialPageLoading = applicationActionFactory.getInitialPageLoading();

        assertFalse(initialPageLoading.getPrecondition().isPresent());
        assertEquals(applicationAction, applicationActionFactory.create(testCaseStep));
    }

    @Test
    public void canCreatePageLoading() {
        String url = "http://tenniskafe.com";
        String applicationName = "tenniskafe";
        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);
        when(applicationConfiguration.getApplicationName()).thenReturn(applicationName);
        WebDriverActionFactory webDriverActionFactory = mock(WebDriverActionFactory.class);

        ApplicationActionFactory applicationActionFactory =
                new DefaultApplicationActionFactory(url, applicationConfiguration, webDriverActionFactory);

        assertFalse(applicationActionFactory.getInitialPageLoading().getPrecondition().isPresent());
        assertFalse(applicationActionFactory.getInitialPageLoading().getPostcondition().isPresent());
    }
}
