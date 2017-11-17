package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.Model;
import com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector;
import com.hribol.bromium.dsl.bromium.WebDriverActionCondition;
import org.junit.Test;

import java.util.Map;

import static com.hribol.bromium.core.utils.WebDriverActions.ELEMENT_BY_CSS_TO_BE_PRESENT;
import static com.hribol.bromium.core.utils.WebDriverActions.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 17.11.17.
 */
public class ConditionASTNodeConverterTest extends BaseDSLConfigurationConverterTest {

    private Model model = readExample();
    private ParametersConfigurationConverter parametersConfigurationConverter = mock(ParametersConfigurationConverter.class);
    private Map<String, ParameterConfiguration> parameterConfigurationMap = mock(Map.class);

    @Test
    public void convertElementByCssIsPresent() throws Exception {
        WebDriverActionCondition precondition = model.getActions().get(0).getPrecondition().getAction();
        initMocks(precondition);

        ConditionASTNodeConverter conditionASTNodeConverter = new ConditionASTNodeConverter(parametersConfigurationConverter);
        WebDriverActionConfiguration actual = conditionASTNodeConverter.convert(precondition);

        assertEquals(ELEMENT_BY_CSS_TO_BE_PRESENT, actual.getWebDriverActionType());
        assertEquals(parameterConfigurationMap, actual.getParametersConfiguration());
    }

    @Test
    public void convertTextOfElementWithCssSelectorToBe() throws Exception {
        WebDriverActionCondition precondition = model.getActions().get(2).getPrecondition().getAction();
        initMocks(precondition);

        ConditionASTNodeConverter conditionASTNodeConverter = new ConditionASTNodeConverter(parametersConfigurationConverter);
        WebDriverActionConfiguration actual = conditionASTNodeConverter.convert(precondition);

        assertEquals(TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE, actual.getWebDriverActionType());
        assertEquals(parameterConfigurationMap, actual.getParametersConfiguration());
    }

    private void initMocks(WebDriverActionCondition webDriverActionCondition) {
        when(parametersConfigurationConverter.convert(webDriverActionCondition.getParameterNames(),
                webDriverActionCondition.getParameterValues())).thenReturn(parameterConfigurationMap);
    }

}