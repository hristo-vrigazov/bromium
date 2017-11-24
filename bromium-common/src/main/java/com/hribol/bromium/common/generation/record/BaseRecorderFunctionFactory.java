package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.common.FunctionFactoryBase;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.functions.ClickClassByTextRecorderFunction;
import com.hribol.bromium.common.generation.record.functions.ClickCssSelectorRecorderFunction;
import com.hribol.bromium.common.generation.record.functions.TypeTextInElementFoundByCssSelectorRecorderFunction;
import com.hribol.bromium.common.generation.record.invocations.ClickClassByTextRecorderInvocation;
import com.hribol.bromium.common.generation.record.invocations.ClickCssSelectorRecorderFunctionInvocation;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.record.invocations.TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CLASS_BY_TEXT;
import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;
import static com.hribol.bromium.core.utils.WebDriverActions.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;

/**
 * Represents a factory for creating recorder functions which can be extended through the
 * {@link #addCustom()} method.
 */
public abstract class BaseRecorderFunctionFactory extends
        FunctionFactoryBase<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>, WebDriverActionConfiguration> {

    public BaseRecorderFunctionFactory(Supplier<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>> emptyGeneratedFunctionSupplier,
                                       JsCollector jsCollector) {
        super(emptyGeneratedFunctionSupplier, jsCollector);
    }

    @Override
    protected void addPredefined() {
        add(CLICK_CSS_SELECTOR, new ClickCssSelectorRecorderFunction(jsCollector,
                ClickCssSelectorRecorderFunctionInvocation::new));
        add(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR,
                new TypeTextInElementFoundByCssSelectorRecorderFunction(jsCollector,
                        TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation::new));
        add(CLICK_CLASS_BY_TEXT, new ClickClassByTextRecorderFunction(jsCollector,
                ClickClassByTextRecorderInvocation::new));
    }

}
