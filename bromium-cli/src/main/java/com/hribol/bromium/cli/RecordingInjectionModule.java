package com.hribol.bromium.cli;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.hribol.bromium.common.generation.common.EmptyFunction;
import com.hribol.bromium.common.generation.record.RecorderTypeRegistry;
import com.hribol.bromium.common.generation.record.BaseRecorderFunctionFactory;
import com.hribol.bromium.common.generation.record.functions.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.common.IncludeInvokeGenerator;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.RecordingWebDriverActionsOnly;
import com.hribol.bromium.common.generation.record.PredefinedRecorderFunctionFactory;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.generation.TypeRegistry;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class RecordingInjectionModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(BaseRecorderFunctionFactory.class).to(PredefinedRecorderFunctionFactory.class);
        binder.bind(TypeRegistry.class).to(RecorderTypeRegistry.class);
        binder.bind(new TypeLiteral<JavascriptGenerator<NameWebDriverActionConfiguration>>() {})
                .to(new TypeLiteral<IncludeInvokeGenerator<NameWebDriverActionConfiguration>>() {});
        binder.bind(new TypeLiteral<JavascriptGenerator<ApplicationActionConfiguration>>(){})
                .to(RecordingWebDriverActionsOnly.class);
        binder.bind(new TypeLiteral<TypeRegistry<NameWebDriverActionConfiguration>>(){})
                .to(RecorderTypeRegistry.class);
    }

    @Provides
    public Supplier<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>> getEmptyFunctionSupplier() {
        return EmptyFunction::new;
    }
}
