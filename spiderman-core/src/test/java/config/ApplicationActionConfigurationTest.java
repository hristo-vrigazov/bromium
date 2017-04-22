package config;

import com.hribol.automation.core.config.ApplicationActionConfiguration;
import com.hribol.automation.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ApplicationActionConfigurationTest {

    @Test
    public void applicationActionConfigurationSettersAndGetters() {
        String name = "name";
        WebDriverActionConfiguration conditionBeforeExecution = mock(WebDriverActionConfiguration.class);
        WebDriverActionConfiguration webdriverAction = mock(WebDriverActionConfiguration.class);
        WebDriverActionConfiguration conditionAfterExecution = mock(WebDriverActionConfiguration.class);
        boolean expectsHttp = true;

        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();

        applicationActionConfiguration.setName(name);
        applicationActionConfiguration.setConditionBeforeExecution(conditionBeforeExecution);
        applicationActionConfiguration.setWebdriverAction(webdriverAction);
        applicationActionConfiguration.setConditionAfterExecution(conditionAfterExecution);
        applicationActionConfiguration.setExpectsHttpRequest(expectsHttp);

        assertEquals(name, applicationActionConfiguration.getName());
        assertEquals(conditionBeforeExecution, applicationActionConfiguration.getConditionBeforeExecution());
        assertEquals(webdriverAction, applicationActionConfiguration.getWebdriverAction());
        assertEquals(conditionAfterExecution, applicationActionConfiguration.getConditionAfterExecution());
        assertEquals(expectsHttp, applicationActionConfiguration.expectsHttpRequest());
    }

}
