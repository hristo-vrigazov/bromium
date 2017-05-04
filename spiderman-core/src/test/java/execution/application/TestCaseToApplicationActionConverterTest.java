package execution.application;

import com.hribol.spiderman.core.config.ApplicationActionConfiguration;
import com.hribol.spiderman.core.config.ParameterConfiguration;
import com.hribol.spiderman.core.config.WebDriverActionConfiguration;
import com.hribol.spiderman.core.execution.application.ApplicationAction;
import com.hribol.spiderman.core.execution.application.TestCaseToApplicationActionConverter;
import com.hribol.spiderman.core.actions.WebDriverAction;
import com.hribol.spiderman.core.execution.factory.WebDriverActionFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.hribol.spiderman.core.utils.Constants.EVENT;
import static com.hribol.spiderman.core.utils.Constants.EXPECTS_HTTP;
import static com.hribol.spiderman.core.utils.Constants.NOTHING;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class TestCaseToApplicationActionConverterTest {

    @Test
    public void canCreateCorrectAction() {
        String actionType = "CLICK_CLASS_BY_TEXT";
        String text = "text";
        String ATP = "ATP";
        String clickMegaMenu = "clickMegaMenu";
        String megaMenuLink = "mega-menu-link";
        String initialCollectorClass = "initialCollectorClass";

        Map<String, String> testCaseStep = new HashMap<>();
        testCaseStep.put(text, ATP);
        testCaseStep.put(EVENT, clickMegaMenu);

        Map<String, String> tempMap = new HashMap<>();
        tempMap.put(EVENT, clickMegaMenu);
        tempMap.put(initialCollectorClass, megaMenuLink);
        tempMap.put(text, ATP);

        ParameterConfiguration initialCollectorClassParameterConfiguration = mock(ParameterConfiguration.class);
        when(initialCollectorClassParameterConfiguration.getParameterName()).thenReturn(initialCollectorClass);
        when(initialCollectorClassParameterConfiguration.isExposed()).thenReturn(false);
        when(initialCollectorClassParameterConfiguration.getValue()).thenReturn(megaMenuLink);

        ParameterConfiguration textParameterConfiguration = mock(ParameterConfiguration.class);
        when(textParameterConfiguration.getParameterName()).thenReturn(text);
        when(textParameterConfiguration.isExposed()).thenReturn(true);
        when(textParameterConfiguration.getAlias()).thenReturn(text);


        WebDriverAction webDriverAction = mock(WebDriverAction.class);
        WebDriverActionFactory webDriverActionFactory = mock(WebDriverActionFactory.class);

        when(webDriverActionFactory.create(actionType, tempMap, false)).thenReturn(webDriverAction);

        WebDriverActionConfiguration preconditionActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(preconditionActionConfiguration.getWebDriverActionType()).thenReturn(NOTHING);

        WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(webDriverActionConfiguration.getWebDriverActionType()).thenReturn(actionType);
        Map<String, ParameterConfiguration> parameterConfigurationMap = new HashMap<>();
        parameterConfigurationMap.put(initialCollectorClass, initialCollectorClassParameterConfiguration);
        parameterConfigurationMap.put(text, textParameterConfiguration);
        when(webDriverActionConfiguration.getParametersConfiguration()).thenReturn(parameterConfigurationMap);

        WebDriverActionConfiguration postconditionActionConfiguration = mock(WebDriverActionConfiguration.class);
        when(postconditionActionConfiguration.getWebDriverActionType()).thenReturn(NOTHING);

        ApplicationActionConfiguration applicationActionConfiguration = mock(ApplicationActionConfiguration.class);
        when(applicationActionConfiguration.getConditionBeforeExecution()).thenReturn(preconditionActionConfiguration);
        when(applicationActionConfiguration.getWebDriverAction()).thenReturn(webDriverActionConfiguration);
        when(applicationActionConfiguration.getConditionAfterExecution()).thenReturn(postconditionActionConfiguration);
        when(applicationActionConfiguration.getName()).thenReturn(clickMegaMenu);

        TestCaseToApplicationActionConverter testCaseToApplicationActionConverter =
                new TestCaseToApplicationActionConverter(webDriverActionFactory);

        ApplicationAction applicationAction =
                testCaseToApplicationActionConverter.convert(applicationActionConfiguration, testCaseStep);

        assertFalse(applicationAction.getPrecondition().isPresent());
        assertFalse(applicationAction.getPostcondition().isPresent());
        assertTrue(applicationAction.getWebdriverAction().isPresent());
        assertEquals(webDriverAction, applicationAction.getWebdriverAction().get());
    }
}
