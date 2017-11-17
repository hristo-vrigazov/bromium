package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.Model;
import com.hribol.bromium.dsl.bromium.WebDriverAction;
import org.junit.Test;

import java.util.Map;

import static com.hribol.bromium.core.utils.WebDriverActions.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 17.11.17.
 */
public class ActionASTNodeConverterTest extends BaseDSLConfigurationConverterTest {

    private Model model = readExample();
    private ParametersConfigurationConverter parametersConfigurationConverter = mock(ParametersConfigurationConverter.class);
    private Map<String, ParameterConfiguration> parameterConfigurationMap = mock(Map.class);

    @Test
    public void convertTypeTextInElementFoundByCssSelectorUser() throws Exception {
        baseTest(0, TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR);
    }

    @Test
    public void convertClickCssSelector() throws Exception {
        baseTest(1, CLICK_CSS_SELECTOR);
    }

    @Test
    public void convertTypeTextInElementFoundByCssSelectorPass() throws Exception {
        baseTest(2, TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR);
    }

    @Test
    public void convertClickClassByText() throws Exception {
        baseTest(3, CLICK_CLASS_BY_TEXT);
    }

    private void baseTest(int i, String expectedWebDriverActionType) {
        WebDriverAction precondition = model.getActions().get(i).getWebDriverAction();
        initMocks(precondition);

        ActionASTNodeConverter conditionASTNodeConverter = new ActionASTNodeConverter(parametersConfigurationConverter);
        WebDriverActionConfiguration actual = conditionASTNodeConverter.convert(precondition);

        assertEquals(expectedWebDriverActionType, actual.getWebDriverActionType());
        assertEquals(parameterConfigurationMap, actual.getParametersConfiguration());
    }

    private void initMocks(WebDriverAction webDriverAction) {
        when(parametersConfigurationConverter.convert(webDriverAction.getParameterNames(),
                webDriverAction.getParameterValues())).thenReturn(parameterConfigurationMap);
    }
}
