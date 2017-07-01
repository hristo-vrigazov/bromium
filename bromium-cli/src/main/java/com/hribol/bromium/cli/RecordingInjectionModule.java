package com.hribol.bromium.cli;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.hribol.bromium.common.record.RecorderTypeRegistry;
import com.hribol.bromium.common.record.application.IncludeInvokeGenerator;
import com.hribol.bromium.common.record.application.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.record.application.RecordingWebDriverActionsOnly;
import com.hribol.bromium.common.record.factory.PredefinedRecorderFunctionFactory;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.record.TypeRegistry;
import com.hribol.bromium.core.generation.RecorderFunctionFactory;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class RecordingInjectionModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(RecorderFunctionFactory.class).to(PredefinedRecorderFunctionFactory.class);
        binder.bind(TypeRegistry.class).to(RecorderTypeRegistry.class);
        binder.bind(new TypeLiteral<JavascriptGenerator<NameWebDriverActionConfiguration>>() {})
                .to(IncludeInvokeGenerator.class);
        binder.bind(new TypeLiteral<JavascriptGenerator<ApplicationActionConfiguration>>(){})
        .to(RecordingWebDriverActionsOnly.class);
    }
}
