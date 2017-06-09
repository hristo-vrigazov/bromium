package com.hribol.bromium.cli;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.common.record.RecorderTypeRegistry;
import com.hribol.bromium.common.record.application.IncludeInvokeGenerator;
import com.hribol.bromium.common.record.application.RecordingWebDriverActionsOnly;
import com.hribol.bromium.common.record.factory.PredefinedRecorderFunctionFactory;
import com.hribol.bromium.record.TypeRegistry;
import com.hribol.bromium.record.javascript.generation.ApplicationActionGenerator;
import com.hribol.bromium.record.javascript.generation.RecorderFunctionFactory;
import com.hribol.bromium.record.javascript.generation.WebDriverActionGenerator;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class RecordingInjectionModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(RecorderFunctionFactory.class).to(PredefinedRecorderFunctionFactory.class);
        binder.bind(TypeRegistry.class).to(RecorderTypeRegistry.class);
        binder.bind(WebDriverActionGenerator.class).to(IncludeInvokeGenerator.class);
        binder.bind(ApplicationActionGenerator.class).to(RecordingWebDriverActionsOnly.class);
    }
}
