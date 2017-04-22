package actions;

import com.hribol.automation.core.actions.ConvertedApplicationAction;
import com.hribol.automation.core.execution.application.ApplicationAction;
import com.hribol.automation.core.actions.WebDriverAction;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ConvertedApplicationActionTest {

    @Test
    public void convertedApplicationActionReturnsCorrectWebDriverActions() {
        WebDriverAction preCondition = mock(WebDriverAction.class);
        WebDriverAction webDriverAction = mock(WebDriverAction.class);
        WebDriverAction postCondition = mock(WebDriverAction.class);

        Optional<WebDriverAction> preConditionOptional = Optional.of(preCondition);
        Optional<WebDriverAction> webDriverActionOptional = Optional.of(webDriverAction);
        Optional<WebDriverAction> postConditionOptional = Optional.of(postCondition);

        ApplicationAction applicationAction = new ConvertedApplicationAction(
                preConditionOptional,
                webDriverActionOptional,
                postConditionOptional);

        assertEquals(preConditionOptional, applicationAction.getPrecondition());
        assertEquals(webDriverActionOptional, applicationAction.getWebdriverAction());
        assertEquals(postConditionOptional, applicationAction.getPostcondition());
    }
}
