package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.common.FunctionFactoryBase;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.functions.ClickClassByTextReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ClickCssSelectorReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ClickDataIdReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ElementByCssToBePresentReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.EmptyReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.TextOfElementFoundByCssSelectorToBeReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.TypeTextInElementFoundByCssSelectorReplayFunction;
import com.hribol.bromium.common.generation.replay.invocations.ClickClassByTextReplayInvocation;
import com.hribol.bromium.common.generation.replay.invocations.ClickCssSelectorReplayInvocation;
import com.hribol.bromium.common.generation.replay.invocations.ClickDataIdReplayInvocationFunction;
import com.hribol.bromium.common.generation.replay.invocations.ElementByCssToBePresentReplayInvocation;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.common.generation.replay.invocations.TextOfElementFoundByCssSelectorToBeInvocation;
import com.hribol.bromium.common.generation.replay.invocations.TypeTextInElementFoundByCssSelectorReplayInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

import static com.hribol.bromium.core.utils.WebDriverActions.*;

/**
 * Represents a base factory for creating replay functions which can be extended through the
 * {@link #addCustom()} method.
 */
public abstract class BaseReplayFunctionFactory extends
        FunctionFactoryBase<
                GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>,
                WebDriverActionConfiguration>  {


    public BaseReplayFunctionFactory(Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier,
                                     JsCollector jsCollector) {
        super(emptyGeneratedFunctionSupplier, jsCollector);
    }

    @Override
    protected void addPredefined() {
        add(CLICK_CSS_SELECTOR, new ClickCssSelectorReplayFunction(new JsCollector(), ClickCssSelectorReplayInvocation::new));
        add(CLICK_CLASS_BY_TEXT, new ClickClassByTextReplayFunction(new JsCollector(), ClickClassByTextReplayInvocation::new));
        add(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR,
                new TypeTextInElementFoundByCssSelectorReplayFunction(new JsCollector(), TypeTextInElementFoundByCssSelectorReplayInvocation::new));
        add(ELEMENT_BY_CSS_TO_BE_PRESENT, new ElementByCssToBePresentReplayFunction(new JsCollector(), ElementByCssToBePresentReplayInvocation::new));
        add(TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE,
                new TextOfElementFoundByCssSelectorToBeReplayFunction(new JsCollector(), TextOfElementFoundByCssSelectorToBeInvocation::new));
        add(CONFIRM_ALERT, new EmptyReplayFunction());
        add(CLICK_DATA_ID, new ClickDataIdReplayFunction(new JsCollector(), ClickDataIdReplayInvocationFunction::new));
    }
}
