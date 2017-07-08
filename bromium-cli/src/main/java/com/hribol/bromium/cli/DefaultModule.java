package com.hribol.bromium.cli;

import com.google.inject.*;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.google.inject.throwingproviders.CheckedProvides;
import com.google.inject.throwingproviders.ThrowingProviderBinder;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.cli.commands.RecordCommand;
import com.hribol.bromium.cli.factory.ExecutionFactory;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.cli.providers.IOProvider;
import com.hribol.bromium.cli.providers.IOURIProvider;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.common.EmptyFunction;
import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.common.generation.record.RecorderFunctionRegistry;
import com.hribol.bromium.common.generation.record.BaseRecorderFunctionFactory;
import com.hribol.bromium.common.generation.record.functions.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.common.IncludeInvokeGenerator;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.RecordingWebDriverActionsOnly;
import com.hribol.bromium.common.generation.record.PredefinedRecorderFunctionFactory;
import com.hribol.bromium.common.generation.replay.*;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.common.replay.factory.DefaultApplicationActionFactory;
import com.hribol.bromium.common.replay.factory.PredefinedWebDriverActionFactory;
import com.hribol.bromium.common.replay.factory.TestCaseStepToApplicationActionConverter;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.FunctionRegistry;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.core.utils.parsing.StepsReader;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Constants.*;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class DefaultModule extends AbstractModule {
    private Map<String, Object> opts;

    public DefaultModule(Map<String, Object> opts) {
        this.opts = opts;
    }

    @Override
    protected void configure() {
        bind(BaseRecorderFunctionFactory.class).to(PredefinedRecorderFunctionFactory.class);
        bind(FunctionRegistry.class).to(RecorderFunctionRegistry.class);
        bind(new TypeLiteral<JavascriptGenerator<NameWebDriverActionConfiguration>>() {})
                .to(new TypeLiteral<IncludeInvokeGenerator<NameWebDriverActionConfiguration>>() {});
        bind(new TypeLiteral<JavascriptGenerator<ApplicationActionConfiguration>>(){})
                .to(RecordingWebDriverActionsOnly.class);
        bind(new TypeLiteral<FunctionRegistry<NameWebDriverActionConfiguration>>(){})
                .to(RecorderFunctionRegistry.class);
        bindConstant().annotatedWith(Names.named(RECORD_TEMPLATE_RESOURCE)).to("/record.js");
        bindConstant().annotatedWith(Names.named(REPLAY_TEMPLATE_RESOURCE)).to("/replay.js");

        install(ThrowingProviderBinder.forModule(this));
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
    public RecordCommand getRecordCommand(RecordCommand.Builder builder,
                                          PromptUtils promptUtils,
                                          ParsedOptions parsedOptions,
                                          RecordBrowserFactory recordBrowserFactory) {

        return builder
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

    @Provides
    @Named(CONFIGURATION_FILE)
    public File getConfigurationFile(ParsedOptions parsedOptions) {
        return new File(parsedOptions.getPathToApplicationConfiguration());
    }

    @CheckedProvides(IOProvider.class)
    @Named(CONFIGURATION_INPUT_STREAM)
    public InputStream getConfigurationInputStream(@Named(CONFIGURATION_FILE) File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @CheckedProvides(IOProvider.class)
    public ApplicationConfiguration getApplicationConfiguration(ApplicationConfigurationParser applicationConfigurationParser,
                                                                @Named(CONFIGURATION_INPUT_STREAM)
                                                                        IOProvider<InputStream> fileInputStreamProvider) throws IOException {
        InputStream inputStream = fileInputStreamProvider.get();
        return applicationConfigurationParser.parseApplicationConfiguration(inputStream);
    }

    @Provides
    public WebDriverActionFactory getWebDriverActionFactory(ParsedOptions parsedOptions) {
        return new PredefinedWebDriverActionFactory(parsedOptions.getBaseUrl());
    }

    @Provides
    public TestCaseStepToApplicationActionConverter getTestCaseStepToApplicationActionConverter(WebDriverActionFactory webDriverActionFactory) {
        return new TestCaseStepToApplicationActionConverter(webDriverActionFactory);
    }

    @CheckedProvides(IOProvider.class)
    public ApplicationActionFactory getApplicationActionFactory(IOProvider<ApplicationConfiguration>
                                                                            applicationConfigurationIOProvider,
                                                                TestCaseStepToApplicationActionConverter testCaseStepToApplicationActionConverter) throws IOException {
        ApplicationConfiguration applicationConfiguration = applicationConfigurationIOProvider.get();
        return new DefaultApplicationActionFactory(applicationConfiguration, testCaseStepToApplicationActionConverter);
    }

    @CheckedProvides(IOProvider.class)
    public TestScenarioFactory getTestScenarioFactory(IOProvider<ApplicationActionFactory> applicationActionFactoryIOProvider) throws IOException {
        ApplicationActionFactory applicationActionFactory = applicationActionFactoryIOProvider.get();
        return new TestScenarioFactory(applicationActionFactory);
    }

    @Provides
    @Named(TEST_CASE_FILE)
    public File getTestCaseFile(ParsedOptions parsedOptions) {
        return new File(parsedOptions.getPathToTestCase());
    }

    @CheckedProvides(IOProvider.class)
    @Named(TEST_CASE_INPUT_STREAM)
    public InputStream getTestCaseInputStream(@Named(TEST_CASE_FILE) File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @CheckedProvides(IOProvider.class)
    public List<Map<String, String>> getTestCaseSteps(StepsReader stepsReader,
                                                      @Named(TEST_CASE_INPUT_STREAM) IOProvider<InputStream> testCaseInputStreamProvider)
            throws IOException {
        return stepsReader.readSteps(testCaseInputStreamProvider.get());
    }

    @CheckedProvides(IOProvider.class)
    public StepsAndConfiguration getStepsAndConfiguration(IOProvider<List<Map<String, String>>> stepsProvider,
                                                          IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider) throws IOException {
        List<Map<String, String>> testCaseSteps = stepsProvider.get();
        ApplicationConfiguration applicationConfiguration = applicationConfigurationIOProvider.get();
        return new StepsAndConfiguration(testCaseSteps, applicationConfiguration);
    }

    @CheckedProvides(IOProvider.class)
    @Named(BASE_REPLAYING_TEMPLATE)
    public String getBaseReplayingTemplate(@Named(REPLAY_TEMPLATE_RESOURCE) String templateResource) throws IOException {
        return IOUtils.toString(getClass().getResourceAsStream(templateResource));
    }

    @Provides
    public BaseReplayFunctionFactory getBaseReplayFunctionFactory(
            Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>>
                    emptyFunctionSupplier,
            JsCollector jsCollector) {
        return new PredefinedReplayFunctionFactory(emptyFunctionSupplier, jsCollector);
    }

    @Provides
    public ReplayFunctionRegistry getReplayFunctionRegistry(BaseReplayFunctionFactory baseReplayFunctionFactory) {
        return new ReplayFunctionRegistry(baseReplayFunctionFactory);
    }

    @Provides
    public JavascriptGenerator<StepAndWebDriverActionConfiguration> getIncludeInvokeGeneratorByStepAndWebDriverActionConfiguration(
            ReplayFunctionRegistry replayFunctionRegistry
    ) {
        return new IncludeInvokeGenerator<>(replayFunctionRegistry);
    }

    @Provides
    public JavascriptGenerator<StepAndActionConfiguration> getReplayGeneratorByStepAndActionConfiguration(
            JavascriptGenerator<StepAndWebDriverActionConfiguration> generator,
            StepAndWebDriverActionConfigurationSupplier supplier) {
        return new ReplayGeneratorByStepAndActionConfiguration(generator, supplier);
    }

    @CheckedProvides(IOProvider.class)
    public ReplayingJavascriptGenerator getReplayingJavascriptGenerator(@Named(BASE_REPLAYING_TEMPLATE) IOProvider<String>
                                                                                    baseTemplateProvider,
                                                                        JavascriptGenerator<StepAndActionConfiguration> generatorByStepAndActionConfiguration,
                                                                        StepAndActionConfigurationSupplier stepAndActionConfigurationSupplier)
            throws IOException {
        return new ReplayingJavascriptGenerator(baseTemplateProvider.get(), generatorByStepAndActionConfiguration, stepAndActionConfigurationSupplier);
    }

    @CheckedProvides(IOProvider.class)
    @Named(GENERATED_REPLAY_JAVASCRIPT)
    public String getGeneratedReplayJavascript(IOProvider<ReplayingJavascriptGenerator> replayingJavascriptGeneratorProvider,
                                               IOProvider<StepsAndConfiguration> stepsAndConfigurationIOProvider) throws IOException {
        StepsAndConfiguration stepsAndConfiguration = stepsAndConfigurationIOProvider.get();
        ReplayingJavascriptGenerator replayingJavascriptGenerator = replayingJavascriptGeneratorProvider.get();
        return replayingJavascriptGenerator.generate(stepsAndConfiguration);
    }

    @CheckedProvides(IOProvider.class)
    @Named(REPLAYING_JAVASCRIPT_INJECTOR)
    public JavascriptInjector getJavascriptInjector(@Named(GENERATED_REPLAY_JAVASCRIPT)
                                                                IOProvider<String> generatedReplayJavascript) throws IOException {
        String generatedCode = generatedReplayJavascript.get();
        return new JavascriptInjector(new StringReader(generatedCode));
    }

    @CheckedProvides(IOProvider.class)
    @Named(REPLAYING_JAVASCRIPT_CODE)
    public String getReplayingJavascriptCode(@Named(REPLAYING_JAVASCRIPT_INJECTOR)
                                                         IOProvider<JavascriptInjector> javascriptInjectorIOProvider) throws IOException {
        System.out.println(javascriptInjectorIOProvider.get().getInjectionCode());
        return javascriptInjectorIOProvider.get().getInjectionCode();
    }


    @CheckedProvides(IOProvider.class)
    public ExecutorBuilder getExecutorBuilder(ExecutorBuilder executorBuilder,
                                              ParsedOptions parsedOptions,
                                              @Named(REPLAYING_JAVASCRIPT_CODE) IOProvider<String>
                                                          replayingJavascriptCodeProvider) throws IOException {
        return executorBuilder
                .pathToDriverExecutable(parsedOptions.getPathToDriver())
                .baseURL(parsedOptions.getBaseUrl())
                .timeoutInSeconds(parsedOptions.getTimeout())
                .measurementsPrecisionInMilliseconds(parsedOptions.getMeasurementsPrecisionMilli())
                .javascriptInjectionCode(replayingJavascriptCodeProvider.get());
    }

    @CheckedProvides(IOURIProvider.class)
    public WebDriverActionExecution getWebDriverActionExecution(ExecutionFactory executionFactory,
                                                                IOProvider<ExecutorBuilder> executorBuilderIOProvider,
                                                                ParsedOptions parsedOptions) throws IOException, URISyntaxException {
        return executionFactory.create(parsedOptions.getBrowserType(), executorBuilderIOProvider.get());
    }

    @CheckedProvides(IOURIProvider.class)
    public ReplayBrowser getReplayBrowser(IOProvider<TestScenarioFactory> testScenarioFactoryIOProvider,
                                          IOURIProvider<WebDriverActionExecution> execution) throws IOException, URISyntaxException {
        return new ReplayBrowser(testScenarioFactoryIOProvider.get(), execution.get());
    }
}
