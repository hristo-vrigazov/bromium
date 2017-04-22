package execution.application;

import com.hribol.automation.core.config.ApplicationConfiguration;
import com.hribol.automation.core.execution.application.ApplicationAction;
import com.hribol.automation.core.execution.application.ApplicationActionFactory;
import com.hribol.automation.core.execution.application.DefaultApplicationActionFactory;
import com.hribol.automation.core.execution.webdriver.WebDriverActionFactory;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class DefaultApplicationActionFactoryTest {
    @Test
    public void canCreatePageLoadingAndOtherActions() {
        String url = "http://tenniskafe.com";
        ApplicationConfiguration applicationConfiguration = mock(ApplicationConfiguration.class);
        WebDriverActionFactory webDriverActionFactory = mock(WebDriverActionFactory.class);

        ApplicationActionFactory applicationActionFactory =
                new DefaultApplicationActionFactory(url, applicationConfiguration, webDriverActionFactory);

        ApplicationAction initialPageLoading = applicationActionFactory.getInitialPageLoading();
    }
}
