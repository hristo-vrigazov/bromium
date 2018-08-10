package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.SetVariableToTextOfElementWithCssSelector;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.execution.factory.ActionCreationContext;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.common.actions.Constants.VARIABLE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

public class SetVariableToTextOfElementWithCssSelectorParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(ActionCreationContext actionCreationContext) {
        Map<String, String> parameters = actionCreationContext.getParameters();
        int step = actionCreationContext.getStep();
        String variable = parameters.get(VARIABLE);
        String selector = parameters.get(CSS_SELECTOR);
        return new SetVariableToTextOfElementWithCssSelector(variable, selector, step);
    }

}
