package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.generation.common.FunctionFactoryBase;
import com.hribol.bromium.common.generation.replay.functions.ClickCssSelectorReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 02.07.17.
 */
public abstract class BaseReplayFunctionFactory extends
        FunctionFactoryBase<
                GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>,
                WebDriverActionConfiguration>  {


    public BaseReplayFunctionFactory(Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier) {
        super(emptyGeneratedFunctionSupplier);
    }

    protected abstract void addCustom();

    @Override
    protected void addPredefined() {
        add(CLICK_CSS_SELECTOR, new ClickCssSelectorReplayFunction());
    }
}
