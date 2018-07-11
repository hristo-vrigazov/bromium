package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.common.generation.common.FunctionFactoryBase;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.functions.RecorderFunction;
import com.hribol.bromium.common.generation.record.functions.RecorderFunctionProvider;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import java.util.Arrays;
import java.util.List;

import static com.hribol.bromium.core.utils.WebDriverActions.*;

/**
 * Represents a factory for creating recorder functions which can be extended through the
 * {@link #addCustom()} method.
 */
public abstract class BaseRecorderFunctionFactory extends
        FunctionFactoryBase<
                NameWebDriverActionConfiguration,
                RecorderFunctionInvocation,
                RecorderFunction,
                WebDriverActionConfiguration> {

    public BaseRecorderFunctionFactory(RecorderFunctionProvider recorderFunctionProvider,
                                       List<String> additionalActions) {
        super(recorderFunctionProvider, additionalActions);
    }

    @Override
    protected List<String> getJsFunctionNames() {
        return Arrays.asList(
                CLICK_CSS_SELECTOR,
                TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR,
                CLICK_CLASS_BY_TEXT,
                CONFIRM_ALERT,
                CLICK_DATA_ID,
                SET_VARIABLE_TO_TEXT_OF_ELEMENT_WITH_CSS_SELECTOR
        );
    }
}
