package com.hribol.bromium.record.javascript.generation.functions.factory;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.functions.ClickCssSelectorRecorderFunction;
import com.hribol.bromium.record.javascript.generation.functions.EmptyRecorderFunction;
import com.hribol.bromium.record.javascript.generation.functions.RecorderFunction;
import com.hribol.bromium.record.javascript.generation.invocations.RecorderFunctionInvocation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 08.06.17.
 */
public abstract class BaseRecorderFunctionFactory implements RecorderFunctionFactory {

    private Map<String, RecorderFunction> typeToRecorderFunction;

    public BaseRecorderFunctionFactory() {
        typeToRecorderFunction = new HashMap<>();
        addPredefined();
        addCustom();
    }

    protected abstract void addCustom();

    private void addPredefined() {
        add(CLICK_CSS_SELECTOR, new ClickCssSelectorRecorderFunction());
    }

    @Override
    public RecorderFunction create(WebDriverActionConfiguration webDriverActionConfiguration) {
        return Optional
                .ofNullable(typeToRecorderFunction.get(webDriverActionConfiguration.getWebDriverActionType()))
                .orElse(new EmptyRecorderFunction());
    }

    protected void add(String webDriverActionType, RecorderFunction recorderFunction) {
        typeToRecorderFunction.put(webDriverActionType, recorderFunction);
    }
}