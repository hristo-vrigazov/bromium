package com.hribol.bromium.common.replay.parsers;

import com.hribol.bromium.common.replay.actions.SetVariableToTextOfElementWithCssSelector;
import com.hribol.bromium.replay.actions.WebDriverAction;
import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.Map;

import static com.hribol.bromium.common.actions.Constants.VARIABLE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

public class SetVariableToTextOfElementWithCssSelectorParser implements WebDriverActionParameterParser {

    @Override
    public WebDriverAction create(Map<String, String> parameters, int step, boolean expectHttpRequest) {
        String variable = parameters.get(VARIABLE);
        String selector = parameters.get(CSS_SELECTOR);
        return new SetVariableToTextOfElementWithCssSelector(variable, selector, step);
    }

}
