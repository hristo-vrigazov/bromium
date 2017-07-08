package com.hribol.bromium.cli;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.cli.handlers.ParsedOptions;
import com.hribol.bromium.common.generation.common.EmptyFunction;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.RecorderFunctionRegistry;
import com.hribol.bromium.common.generation.record.BaseRecorderFunctionFactory;
import com.hribol.bromium.common.generation.record.functions.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.common.IncludeInvokeGenerator;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.RecordingWebDriverActionsOnly;
import com.hribol.bromium.common.generation.record.PredefinedRecorderFunctionFactory;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.generation.FunctionRegistry;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.JavascriptGenerator;

import java.util.Map;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Constants.RECORD_TEMPLATE_RESOURCE;
import static com.hribol.bromium.cli.Constants.REPLAY_TEMPLATE_RESOURCE;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class DefaultModule implements Module {
    private Map<String, Object> opts;

    public DefaultModule(Map<String, Object> opts) {
        this.opts = opts;
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(BaseRecorderFunctionFactory.class).to(PredefinedRecorderFunctionFactory.class);
        binder.bind(FunctionRegistry.class).to(RecorderFunctionRegistry.class);
        binder.bind(new TypeLiteral<JavascriptGenerator<NameWebDriverActionConfiguration>>() {})
                .to(new TypeLiteral<IncludeInvokeGenerator<NameWebDriverActionConfiguration>>() {});
        binder.bind(new TypeLiteral<JavascriptGenerator<ApplicationActionConfiguration>>(){})
                .to(RecordingWebDriverActionsOnly.class);
        binder.bind(new TypeLiteral<FunctionRegistry<NameWebDriverActionConfiguration>>(){})
                .to(RecorderFunctionRegistry.class);
        binder.bindConstant().annotatedWith(Names.named(RECORD_TEMPLATE_RESOURCE)).to("/record.js");
        binder.bindConstant().annotatedWith(Names.named(REPLAY_TEMPLATE_RESOURCE)).to("/replay.js");

    }

    @Provides
    public Supplier<GeneratedFunction<NameWebDriverActionConfiguration, RecorderFunctionInvocation>>
        getEmptyFunctionSupplierForNameWebDriverActionConfiguration() {
        return EmptyFunction::new;
    }

    @Provides
    public Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>>
        getEmptyFunctionSupplierForStepAndWebDriverActionConfiguration() {
        return EmptyFunction::new;
    }

    @Provides
    public ParsedOptions getParsedOptions() {
        return new ParsedOptions(opts);
    }

    @Provides
    public RecordCommand getRecordCommandBuilder(PromptUtils promptUtils,
                                                 ParsedOptions parsedOptions,
                                                 RecordBrowserFactory recordBrowserFactory) {
        return new RecordCommand.Builder()
                .pathToDriver(parsedOptions.getPathToDriver())
                .pathToApplicationConfiguration(parsedOptions.getPathToApplicationConfiguration())
                .baseUrl(parsedOptions.getBaseUrl())
                .outputFile(parsedOptions.getOutputFile())
                .browserType(parsedOptions.getBrowserType())
                .timeout(parsedOptions.getTimeout())
                .recordBrowserFactory(recordBrowserFactory)
                .promptUtils(promptUtils)
                .build();
    }
}
