package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.common.FunctionFactoryBase;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionProvider;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import java.util.Arrays;
import java.util.List;

import static com.hribol.bromium.core.utils.WebDriverActions.*;


/**
 * Represents a base factory for creating replay functions which can be extended through the
 * {@link #addCustom()} method.
 */
public abstract class BaseReplayFunctionFactory extends
        FunctionFactoryBase<
                StepAndWebDriverActionConfiguration,
                ReplayFunctionInvocation,
                ReplayFunction,
                WebDriverActionConfiguration>  {

    public BaseReplayFunctionFactory(ReplayFunctionProvider recorderFunctionProvider,
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
                ELEMENT_BY_CSS_TO_BE_PRESENT,
                TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE,
                SET_VARIABLE_TO_TEXT_OF_ELEMENT_WITH_CSS_SELECTOR,
                CLICK_ID,
                CLICK_NAME,
                SELECT_VALUE
        );
    }
}
