package com.hribol.bromium.common.record.generation;

import com.hribol.bromium.common.FunctionFactoryBase;
import com.hribol.bromium.common.record.functions.ClickCssSelectorRecorderFunction;
import com.hribol.bromium.common.record.functions.RecorderFunctionInvocation;
import com.hribol.bromium.common.record.generation.NameWebDriverActionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 08.06.17.
 */
public abstract class BaseRecorderFunctionFactory extends
        FunctionFactoryBase<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>, WebDriverActionConfiguration> {

    public BaseRecorderFunctionFactory(Supplier<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>> emptyGeneratedFunctionSupplier) {
        super(emptyGeneratedFunctionSupplier);
    }

    protected abstract void addCustom();

    @Override
    protected void addPredefined() {
        add(CLICK_CSS_SELECTOR, new ClickCssSelectorRecorderFunction());
    }

}
