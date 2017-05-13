package unit.execution.scenario;

import com.hribol.spiderman.core.execution.application.ApplicationAction;
import com.hribol.spiderman.core.execution.application.ApplicationActionFactory;
import com.hribol.spiderman.core.execution.scenario.TestScenario;
import com.hribol.spiderman.core.execution.scenario.TestScenarioFactory;
import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.utils.ConfigurationUtils;
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

        List<Map<String, String>> testCaseSteps = ConfigurationUtils.readSteps(pathToTestCase);

        for (Map<String, String> testCaseStep: testCaseSteps) {
            ApplicationAction domainSpecificAction = mock(ApplicationAction.class);
            String something = "something";
            WebDriverAction webDriverAction = mock(WebDriverAction.class);
            when(webDriverAction.getName()).thenReturn(something);
            when(domainSpecificAction.getPrecondition()).thenReturn(Optional.empty());
            when(domainSpecificAction.getWebdriverAction()).thenReturn(Optional.of(webDriverAction));
            when(domainSpecificAction.getPostcondition()).thenReturn(Optional.empty());
            when(applicationActionFactory.create(testCaseStep)).thenReturn(domainSpecificAction);
        }

        TestScenarioFactory testScenarioFactory = new TestScenarioFactory(applicationActionFactory);
        TestScenario testScenario = testScenarioFactory.createFromFile(pathToTestCase);

        assertEquals(testCaseSteps.size(), testScenario.getActions().size());
    }
}
