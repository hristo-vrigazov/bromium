package unit.config;

import com.hribol.spiderman.replay.config.ApplicationActionConfiguration;
import com.hribol.spiderman.replay.config.WebDriverActionConfiguration;
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
        applicationActionConfiguration.setWebDriverAction(webdriverAction);
        applicationActionConfiguration.setConditionAfterExecution(conditionAfterExecution);
        applicationActionConfiguration.setExpectsHttpRequest(expectsHttp);

        assertEquals(name, applicationActionConfiguration.getName());
        assertEquals(conditionBeforeExecution, applicationActionConfiguration.getConditionBeforeExecution());
        assertEquals(webdriverAction, applicationActionConfiguration.getWebDriverAction());
        assertEquals(conditionAfterExecution, applicationActionConfiguration.getConditionAfterExecution());
        assertEquals(expectsHttp, applicationActionConfiguration.expectsHttpRequest());
    }

}
