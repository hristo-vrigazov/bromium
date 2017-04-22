package execution.executor;

import com.hribol.automation.core.execution.application.ApplicationAction;
import com.hribol.automation.core.execution.application.ApplicationActionFactory;
import com.hribol.automation.core.execution.executor.TestScenario;
import com.hribol.automation.core.execution.executor.TestScenarioFactory;
import com.hribol.automation.core.execution.executor.TestScenarioFactoryImpl;
import com.hribol.automation.core.actions.WebDriverAction;
import com.hribol.automation.core.utils.ConfigurationUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class TestScenarioFactoryTest {

    @Test
    public void canCreateScenarioFromFile() throws IOException {
        String pathToTestCase = getClass().getResource("/testCase.json").getFile();

        WebDriverAction pageLoadingWebDriverAction = mock(WebDriverAction.class);
        ApplicationAction initialPageLoading = mock(ApplicationAction.class);
        when(initialPageLoading.getWebdriverAction()).thenReturn(Optional.of(pageLoadingWebDriverAction));
        ApplicationActionFactory applicationActionFactory = mock(ApplicationActionFactory.class);
        when(applicationActionFactory.getInitialPageLoading()).thenReturn(initialPageLoading);

        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(pathToTestCase);

        for (Map<String, String> testCaseStep: testCaseSteps) {
            ApplicationAction domainSpecificAction = mock(ApplicationAction.class);
            String something = "something";
            WebDriverAction webDriverAction = mock(WebDriverAction.class);
            when(webDriverAction.getName()).thenReturn(something);
            when(domainSpecificAction.getWebdriverAction()).thenReturn(Optional.of(webDriverAction));
            when(applicationActionFactory.create(testCaseStep)).thenReturn(domainSpecificAction);
        }

        TestScenarioFactory testScenarioFactory = new TestScenarioFactoryImpl();
        TestScenario testScenario = testScenarioFactory.createFromFile(applicationActionFactory, pathToTestCase);

        assertEquals(testCaseSteps.size() + 1, testScenario.getActions().size());
    }
}
