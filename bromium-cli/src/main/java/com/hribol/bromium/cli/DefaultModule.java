package com.hribol.bromium.cli;

import com.google.inject.*;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.google.inject.throwingproviders.CheckedProvides;
import com.google.inject.throwingproviders.ThrowingProviderBinder;
import com.hribol.bromium.common.browsers.ChromeDriverServiceSupplier;
import com.hribol.bromium.common.browsers.ChromeDriverSupplier;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.filtering.GetHtmlFromCurrentHostPredicate;
import com.hribol.bromium.common.filtering.RequestToPageLoadingEventConverter;
import com.hribol.bromium.common.filtering.SplitQueryStringOfRequest;
import com.hribol.bromium.common.filtering.UriContainsStringPredicate;
import com.hribol.bromium.common.generation.common.EmptyFunction;
import com.hribol.bromium.common.generation.common.IncludeInvokeGenerator;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.common.generation.record.*;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.replay.*;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.common.ProxyDriverIntegrator;
import com.hribol.bromium.common.record.RecordBrowser;
import com.hribol.bromium.common.replay.SignalizingStateConditionsUpdater;
import com.hribol.bromium.core.utils.*;
import com.hribol.bromium.core.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.record.RecordingState;
import com.hribol.bromium.common.replay.DriverOperations;
import com.hribol.bromium.common.replay.ExecutorDependencies;
import com.hribol.bromium.common.replay.ActionExecutor;
import com.hribol.bromium.common.replay.factory.DefaultApplicationActionFactory;
import com.hribol.bromium.common.replay.factory.PredefinedWebDriverActionFactory;
import com.hribol.bromium.common.replay.factory.TestCaseStepToApplicationActionConverter;
import com.hribol.bromium.common.synchronization.SignalizationBasedEventSynchronizer;
import com.hribol.bromium.core.TestScenarioSteps;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.FunctionRegistry;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.providers.IOURIProvider;
import com.hribol.bromium.core.suite.UbuntuVirtualScreenProcessCreator;
import com.hribol.bromium.core.suite.VirtualScreenProcessCreator;
import com.hribol.bromium.core.suppliers.WebDriverSupplier;
import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.core.parsing.JsonApplicationConfigurationParser;
import com.hribol.bromium.core.parsing.StepsReader;
import com.hribol.bromium.record.RecordRequestFilter;
import com.hribol.bromium.record.RecordResponseFilter;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.execution.WebDriverActionExecutor;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
import com.hribol.bromium.replay.filters.ConditionsUpdater;
import com.hribol.bromium.replay.filters.ReplayRequestFilter;
import com.hribol.bromium.replay.filters.ReplayResponseFilter;
import com.hribol.bromium.replay.settings.DriverServiceSupplier;
import io.netty.handler.codec.http.HttpRequest;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.filters.RequestFilter;
import net.lightbody.bmp.filters.ResponseFilter;
import net.lightbody.bmp.proxy.CaptureType;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.Main.Commands.REPLAY;
import static com.hribol.bromium.core.ConventionConstants.SUBMIT_EVENT_URL;
import static com.hribol.bromium.core.DependencyInjectionConstants.*;
import static com.hribol.bromium.core.utils.Constants.CONDITION_SATISFIED_URL;
import static com.hribol.bromium.core.utils.Constants.HAR_EXTENSION;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Guice module used for creation of the dependency graph
 */
public class DefaultModule extends AbstractModule {
    private String command;
    private Map<String, Object> opts;

    private TypeLiteral<JavascriptGenerator<NameWebDriverActionConfiguration>>
            javascriptGeneratorByNameAndWebDriverActionConfiguration = new TypeLiteral<JavascriptGenerator<NameWebDriverActionConfiguration>>() {};

    public DefaultModule(String command, Map<String, Object> opts) {
        this.command = command;
        this.opts = opts;
    }

    @Override
    protected void configure() {
        bind(BaseRecorderFunctionFactory.class).to(PredefinedRecorderFunctionFactory.class);
        bind(FunctionRegistry.class).to(RecorderFunctionRegistry.class);
        bind(javascriptGeneratorByNameAndWebDriverActionConfiguration)
                .to(new TypeLiteral<IncludeInvokeGenerator<NameWebDriverActionConfiguration>>() {});
        bind(new TypeLiteral<JavascriptGenerator<ApplicationActionConfiguration>>(){})
                .to(RecordingWebDriverActionsOnly.class);
        bind(new TypeLiteral<FunctionRegistry<NameWebDriverActionConfiguration>>(){})
                .to(RecorderFunctionRegistry.class);
        bind(new TypeLiteral<Predicate<HttpRequest>>() {})
                .annotatedWith(Names.named(SHOULD_INJECT_JS_PREDICATE))
                .to(GetHtmlFromCurrentHostPredicate.class);

        bind(HttpRequestToTestCaseStepConverter.class)
                .annotatedWith(Names.named(CONVENTION_EVENT_DETECTOR_CONVERTOR))
                .to(SplitQueryStringOfRequest.class);

        bind(ApplicationConfigurationParser.class).to(JsonApplicationConfigurationParser.class);

        // TODO: other OSes should have a different binding
        bind(VirtualScreenProcessCreator.class).to(UbuntuVirtualScreenProcessCreator.class);
        bindConstant().annotatedWith(Names.named(RECORD_TEMPLATE_RESOURCE)).to("/record.js");
        bindConstant().annotatedWith(Names.named(REPLAY_TEMPLATE_RESOURCE)).to("/replay.js");

        // state
        bind(RecordingState.class).in(Singleton.class);
        bind(ReplayingState.class).in(Singleton.class);

        install(ThrowingProviderBinder.forModule(this));
    }

    @Provides
    @Named(CONVENTION_EVENT_DETECTOR_PREDICATE)
    public Predicate<HttpRequest> getConventionEventDetectorPredicate() {
        return new UriContainsStringPredicate(SUBMIT_EVENT_URL);
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
    @Named(BROWSER_TYPE)
    public String getBrowserType(ParsedOptions parsedOptions) {
        return parsedOptions.getBrowserType();
    }

    @Provides
    @Named(BASE_URL)
    public String getBaseUrl(ParsedOptions parsedOptions) {
        return parsedOptions.getBaseUrl();
    }

    @Provides
    @Named(PATH_TO_DRIVER)
    public String getPathToDriver(ParsedOptions parsedOptions) {
        return parsedOptions.getPathToDriver();
    }

    @Provides
    @Named(OUTPUT_FILE)
    public String getOutputFile(ParsedOptions parsedOptions) {
        return parsedOptions.getOutputFile();
    }

    @Provides
    @Named(TIMEOUT)
    public Integer getTimeout(ParsedOptions parsedOptions) {
        return parsedOptions.getTimeout();
    }

    @Provides
    @Named(MEASUREMENTS_PRECISION_MILLI)
    public Integer getMeasurementsPrecisionMilli(ParsedOptions parsedOptions) {
        return parsedOptions.getMeasurementsPrecisionMilli();
    }

    @Provides
    @Named(CONFIGURATION_FILE)
    public File getConfigurationFile(ParsedOptions parsedOptions) {
        return new File(parsedOptions.getPathToApplicationConfiguration());
    }

    @Provides
    @Named(MEASUREMENTS_FILE)
    public File getMeasurementsFile(ParsedOptions parsedOptions) {
        return new File(parsedOptions.getMeasurements());
    }

    @Provides
    @Named(HAR_FILE)
    public File getHarFile(ParsedOptions parsedOptions) {
        return new File(parsedOptions.getMeasurements() + HAR_EXTENSION);
    }

    @CheckedProvides(IOProvider.class)
    @Named(CONFIGURATION_INPUT_STREAM)
    public InputStream getConfigurationInputStream(@Named(CONFIGURATION_FILE) File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @CheckedProvides(IOProvider.class)
    public ApplicationConfiguration getApplicationConfiguration(ApplicationConfigurationParser applicationConfigurationParser,
                                                                @Named(CONFIGURATION_FILE)
                                                                Provider<File> fileProvider) throws IOException {
        File inputStream = fileProvider.get();
        return applicationConfigurationParser.parseApplicationConfiguration(inputStream);
    }

    @Provides
    public WebDriverActionFactory getWebDriverActionFactory(ParsedOptions parsedOptions) {
        return new PredefinedWebDriverActionFactory(parsedOptions.getBaseUrl());
    }

    @Provides
    @Named(COMMAND)
    public String getCommand() {
        return command;
    }

    @Provides
    @Named(CONVENTION_EVENT_DETECTOR)
    public EventDetector getConventionBasedEventDetector(@Named(CONVENTION_EVENT_DETECTOR_PREDICATE)
                                                         Predicate<HttpRequest> detectorPredicate,
                                                         @Named(CONVENTION_EVENT_DETECTOR_CONVERTOR)
                                                         HttpRequestToTestCaseStepConverter detectorConverter) {
        return new EventDetectorImpl(detectorPredicate, detectorConverter);
    }

    @CheckedProvides(IOProvider.class)
    @Named(PAGE_LOADING_EVENT_DETECTOR)
    public EventDetector getPageLoadingEventDetector(GetHtmlFromCurrentHostPredicate getHtmlFromCurrentHostPredicate,
                                                     IOProvider<RequestToPageLoadingEventConverter>
                                                             requestToPageLoadingEventConverterIOProvider) throws IOException {
        return new EventDetectorImpl(getHtmlFromCurrentHostPredicate,
                requestToPageLoadingEventConverterIOProvider.get());
    }


    @CheckedProvides(IOProvider.class)
    public List<EventDetector> getEventDetectors(@Named(CONVENTION_EVENT_DETECTOR) EventDetector conventionEventDetector,
                                                 @Named(PAGE_LOADING_EVENT_DETECTOR) IOProvider<EventDetector>
                                                         pageLoadingEventDetectorIOProvider) throws IOException {
        List<EventDetector> eventDetectors = new ArrayList<>();
        eventDetectors.add(conventionEventDetector);
        eventDetectors.add(pageLoadingEventDetectorIOProvider.get());
        return eventDetectors;
    }

    @Provides
    @Named(CONDITION_SATISFIED_PREDICATE)
    public Predicate<HttpRequest> getConditionSatisfiedPredicate() {
        return new UriContainsStringPredicate(CONDITION_SATISFIED_URL);
    }

    @Provides
    @Named(CONDITION_NOT_SATISFIED_PREDICATE)
    public Predicate<HttpRequest> getConditionNotSatisfiedPredicate() {
        return new UriContainsStringPredicate(CONDITION_NOT_SATISFIED_PREDICATE);
    }

    @Provides
    public List<ConditionsUpdater> getConditionsUpdaters(@Named(CONDITION_SATISFIED_PREDICATE)
                                                         Predicate<HttpRequest> conditionSatisfiedPredicate,
                                                         @Named(CONDITION_NOT_SATISFIED_PREDICATE)
                                                         Predicate<HttpRequest> conditionNotSatisfiedPredicate) {
        List<ConditionsUpdater> conditionsUpdaters = new ArrayList<>();
        conditionsUpdaters.add(new ConditionsUpdater(conditionSatisfiedPredicate, new SignalizingStateConditionsUpdater()));
        conditionsUpdaters.add(new ConditionsUpdater(conditionNotSatisfiedPredicate, ReplayingState::setConditionNotSatisfied));
        return conditionsUpdaters;
    }

    @CheckedProvides(IOProvider.class)
    public RequestFilter getRequestFilter(@Named(COMMAND) String command,
                                          IOProvider<List<EventDetector>> eventDetectorListProvider,
                                          Provider<RecordingState> recordingStateProvider,
                                          Provider<ReplayingState> replayingStateProvider,
                                          Provider<List<ConditionsUpdater>> conditionsUpdaters) throws IOException {
        switch (command) {
            case RECORD:
                return new RecordRequestFilter(recordingStateProvider.get(), eventDetectorListProvider.get());
            case REPLAY:
                return new ReplayRequestFilter(replayingStateProvider.get(), conditionsUpdaters.get());
            default:
                throw new NoSuchCommandException();
        }
    }

    @CheckedProvides(IOProvider.class)
    public ResponseFilter getResponseFilter(@Named(COMMAND) String command,
                                            ReplayingState replayingState,
                                            @Named(SHOULD_INJECT_JS_PREDICATE) Predicate<HttpRequest> httpRequestPredicate,
                                            @Named(RECORDING_JAVASCRIPT_CODE) IOProvider<String>
                                                        recordingJavascriptCodeProvider,
                                            @Named(REPLAYING_JAVASCRIPT_CODE) IOProvider<String>
                                                        replayingJavascriptCodeProvider) throws IOException {
        switch (command) {
            case RECORD:
                return new RecordResponseFilter(recordingJavascriptCodeProvider.get(), httpRequestPredicate);
            case REPLAY:
                return new ReplayResponseFilter(replayingJavascriptCodeProvider.get(), replayingState, httpRequestPredicate);
            default:
                throw new NoSuchCommandException();
        }
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
    public TestScenarioFactory getTestScenarioFactory(IOProvider<ApplicationActionFactory> applicationActionFactoryIOProvider,
                                                      StepsReader stepsReader) throws IOException {
        ApplicationActionFactory applicationActionFactory = applicationActionFactoryIOProvider.get();
        return new TestScenarioFactory(applicationActionFactory, stepsReader);
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
    public TestScenarioSteps getTestCaseSteps(StepsReader stepsReader,
                                              @Named(TEST_CASE_INPUT_STREAM) IOProvider<InputStream> testCaseInputStreamProvider)
            throws IOException {
        return stepsReader.readSteps(testCaseInputStreamProvider.get());
    }

    @CheckedProvides(IOProvider.class)
    public StepsAndConfiguration getStepsAndConfiguration(IOProvider<TestScenarioSteps> stepsProvider,
                                                          IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider) throws IOException {
        TestScenarioSteps testCaseSteps = stepsProvider.get();
        ApplicationConfiguration applicationConfiguration = applicationConfigurationIOProvider.get();
        return new StepsAndConfiguration(testCaseSteps, applicationConfiguration);
    }

    @CheckedProvides(IOProvider.class)
    @Named(BASE_REPLAYING_TEMPLATE)
    public String getBaseReplayingTemplate(@Named(REPLAY_TEMPLATE_RESOURCE) String templateResource) throws IOException {
        return IOUtils.toString(getClass().getResourceAsStream(templateResource));
    }

    @CheckedProvides(IOProvider.class)
    @Named(BASE_RECORDING_TEMPLATE)
    public String getBaseRecordingTemplate(@Named(RECORD_TEMPLATE_RESOURCE) String templateResource) throws IOException {
        return IOUtils.toString(getClass().getResourceAsStream(templateResource));
    }

    @Provides
    @Named(SCREEN_NUMBER)
    public Integer getScreenNumber(ParsedOptions parsedOptions) {
        return parsedOptions.getScreenNumber();
    }

    @Provides
    @Named(SCREEN)
    public String getScreenAsScreen(@Named(SCREEN_NUMBER) Integer screenNumber,
                                    VirtualScreenProcessCreator virtualScreenProcessCreator) {
        return virtualScreenProcessCreator.getScreen(screenNumber);
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
    public RecordingJavascriptGenerator getRecordingJavascriptGenerator(@Named(BASE_RECORDING_TEMPLATE) IOProvider<String>
                                                                                baseTemplateProvider,
                                                                        JavascriptGenerator<ApplicationActionConfiguration>
                                                                                applicationActionJavascriptGenerator)
            throws IOException {
        return new RecordingJavascriptGenerator(baseTemplateProvider.get(), applicationActionJavascriptGenerator);
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
    @Named(GENERATED_RECORD_JAVASCRIPT)
    public String getGeneratedRecordJavascript(IOProvider<RecordingJavascriptGenerator> recordingJavascriptGeneratorIOProvider,
                                               IOProvider<ApplicationConfiguration> configurationIOProvider) throws IOException {
        ApplicationConfiguration configuration = configurationIOProvider.get();
        RecordingJavascriptGenerator recordingJavascriptGenerator = recordingJavascriptGeneratorIOProvider.get();
        return recordingJavascriptGenerator.generate(configuration);
    }

    @CheckedProvides(IOProvider.class)
    @Named(REPLAYING_JAVASCRIPT_INJECTOR)
    public JavascriptInjectionPreparator getReplayingJavascriptInjector(@Named(GENERATED_REPLAY_JAVASCRIPT)
                                                                IOProvider<String> generatedReplayJavascript) throws IOException {
        String generatedCode = generatedReplayJavascript.get();
        return new JavascriptInjectionPreparator(new StringReader(generatedCode));
    }

    @CheckedProvides(IOProvider.class)
    @Named(RECORDING_JAVASCRIPT_INJECTOR)
    public JavascriptInjectionPreparator getRecordingJavascriptInjector(@Named(GENERATED_RECORD_JAVASCRIPT)
                                                            IOProvider<String> generatedRecordJavascript) throws IOException {
        String generatedCode = generatedRecordJavascript.get();
        return new JavascriptInjectionPreparator(new StringReader(generatedCode));
    }

    @CheckedProvides(IOProvider.class)
    @Named(REPLAYING_JAVASCRIPT_CODE)
    public String getReplayingJavascriptCode(@Named(REPLAYING_JAVASCRIPT_INJECTOR)
                                                         IOProvider<JavascriptInjectionPreparator> javascriptInjectorIOProvider) throws IOException {
        return javascriptInjectorIOProvider.get().getInjectionCode();
    }

    @CheckedProvides(IOProvider.class)
    @Named(RECORDING_JAVASCRIPT_CODE)
    public String getRecordingJavascriptCode(@Named(RECORDING_JAVASCRIPT_INJECTOR)
                                                     IOProvider<JavascriptInjectionPreparator> javascriptInjectorIOProvider) throws IOException {
        String generatedJavascriptCode = javascriptInjectorIOProvider.get().getInjectionCode();
        System.out.println(generatedJavascriptCode);
        return generatedJavascriptCode;
    }


    @CheckedProvides(IOURIProvider.class)
    public ExecutorDependencies getExecutorBuilder(ExecutorDependencies executorDependencies,
                                                   @Named(TIMEOUT) int timeout,
                                                   @Named(BASE_URL) String baseUrl,
                                                   @Named(REPLAYING_JAVASCRIPT_CODE) IOProvider<String>
                                                          replayingJavascriptCodeProvider,
                                                   @Named(SCREEN) String screen,
                                                   @Named(SCREEN_NUMBER) int screenNumber,
                                                   @Named(PATH_TO_DRIVER) String pathToDriver,
                                                   @Named(MEASUREMENTS_PRECISION_MILLI) int measurementsPrecisionMilli,
                                                   EventSynchronizer eventSynchronizer,
                                                   ReplayingState replayingState,
                                                   IOURIProvider<DriverOperations> driverOperationsIOURIProvider) throws IOException, URISyntaxException {
        return executorDependencies
                .pathToDriverExecutable(pathToDriver)
                .baseURL(baseUrl)
                .timeoutInSeconds(timeout)
                .measurementsPrecisionInMilliseconds(measurementsPrecisionMilli)
                .javascriptInjectionCode(replayingJavascriptCodeProvider.get())
                .screenNumber(screenNumber)
                .screenToUse(screen)
                .replayingState(replayingState)
                .eventSynchronizer(eventSynchronizer)
                .driverOperations(driverOperationsIOURIProvider.get());
    }

    @CheckedProvides(IOURIProvider.class)
    public RecordBrowser getRecordBrowser(@Named(BASE_URL) String baseUrl,
                                          IOURIProvider<DriverOperations> driverOperationsIOURIProvider,
                                          RecordingState recordingState) throws IOException, URISyntaxException {
        return new RecordBrowser(
                baseUrl,
                driverOperationsIOURIProvider.get(),
                recordingState::getTestScenarioSteps);
    }

    @CheckedProvides(IOURIProvider.class)
    public WebDriverActionExecutor getWebDriverActionExecution(IOURIProvider<ExecutorDependencies> executorBuilderIOProvider) throws IOException, URISyntaxException {
        return new ActionExecutor(executorBuilderIOProvider.get());
    }

    @CheckedProvides(IOURIProvider.class)
    public ReplayBrowser getReplayBrowser(IOProvider<TestScenarioFactory> testScenarioFactoryIOProvider,
                                          IOURIProvider<WebDriverActionExecutor> execution) throws IOException, URISyntaxException {
        return new ReplayBrowser(testScenarioFactoryIOProvider.get(), execution.get());
    }

    @Named(BASE_URI)
    @Provides
    public URI getBaseUri(@Named(BASE_URL) String baseUrl) {
        return URI.create(baseUrl);
    }

    @CheckedProvides(IOURIProvider.class)
    public ProxyDriverIntegrator getProxyDriverIntegrator(IOProvider<RequestFilter> requestFilterIOProvider,
                                                          IOProvider<ResponseFilter> responseFilterIOURIProvider,
                                                          WebDriverSupplier webDriverSupplier,
                                                          DriverServiceSupplier driverServiceSupplier,
                                                          @Named(PATH_TO_DRIVER) String pathToDriverExecutable,
                                                          @Named(SCREEN) String screen,
                                                          @Named(TIMEOUT) int timeout) throws IOException, URISyntaxException {
        return getProxyDriverIntegrator(requestFilterIOProvider.get(),
                webDriverSupplier,
                driverServiceSupplier,
                pathToDriverExecutable,
                screen,
                timeout,
                responseFilterIOURIProvider.get());
    }

    private ProxyDriverIntegrator getProxyDriverIntegrator(RequestFilter recordRequestFilter,
                                                           WebDriverSupplier webDriverSupplier,
                                                           DriverServiceSupplier driverServiceSupplier,
                                                           @Named(PATH_TO_DRIVER) String pathToDriverExecutable,
                                                           @Named(SCREEN) String screen,
                                                           @Named(TIMEOUT) int timeout,
                                                           ResponseFilter responseFilter) throws IOException {
        BrowserMobProxy proxy = createBrowserMobProxy(timeout, recordRequestFilter, responseFilter);
        proxy.start(0);
        System.out.println("Proxy running on port " + proxy.getPort());
        Proxy seleniumProxy = createSeleniumProxy(proxy);
        DesiredCapabilities desiredCapabilities = createDesiredCapabilities(seleniumProxy);
        DriverService driverService = driverServiceSupplier.getDriverService(pathToDriverExecutable, screen);
        WebDriver driver = webDriverSupplier.get(driverService, desiredCapabilities);

        return new ProxyDriverIntegrator(driver, proxy, driverService);
    }

    @Provides
    public WebDriverSupplier getInvisibleWebDriverSupplier(@Named(BROWSER_TYPE) String browserType) {
        switch (browserType) {
            case CHROME:
                return new ChromeDriverSupplier();
            default:
                throw new BrowserTypeNotSupportedException();
        }
    }

    @Provides
    public DriverServiceSupplier getDriverServiceSupplier(@Named(BROWSER_TYPE) String browserType) {
        switch (browserType) {
            case CHROME:
                return new ChromeDriverServiceSupplier();
            default:
                throw new BrowserTypeNotSupportedException();
        }
    }

    @CheckedProvides(IOURIProvider.class)
    public DriverOperations getDriverOperations(IOURIProvider<ProxyDriverIntegrator> proxyDriverIntegratorIOURIProvider) throws IOException, URISyntaxException {
        return new DriverOperations(proxyDriverIntegratorIOURIProvider.get());
    }

    public BrowserMobProxy createBrowserMobProxy(int timeout, RequestFilter requestFilter, ResponseFilter responseFilter) {
        BrowserMobProxyServer proxy = new BrowserMobProxyServer();
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        proxy.newHar("measurements");
        proxy.addRequestFilter(requestFilter);
        proxy.addResponseFilter(responseFilter);
        proxy.setIdleConnectionTimeout(timeout, TimeUnit.SECONDS);
        proxy.setRequestTimeout(timeout, TimeUnit.SECONDS);
        return proxy;
    }

    public Proxy createSeleniumProxy(BrowserMobProxy proxy) {
        return ClientUtil.createSeleniumProxy(proxy);
    }

    public DesiredCapabilities createDesiredCapabilities(Proxy proxy) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        return capabilities;
    }

    @Provides
    @Singleton
    public EventSynchronizer getEventSynchronizer(@Named(TIMEOUT) Integer timeout) {
        return new SignalizationBasedEventSynchronizer(timeout);
    }

    @CheckedProvides(IOProvider.class)
    public ActionsFilter getActionsFilter(IOProvider<ApplicationConfiguration> applicationConfigurationIOProvider) throws IOException {
        return new ActionsFilter(applicationConfigurationIOProvider.get().getApplicationActionConfigurationList());
    }

    @CheckedProvides(IOProvider.class)
    public RequestToPageLoadingEventConverter getHttpRequestToTestCaseStepConverter(@Named(BASE_URL) String baseUrl,
                                                                                    IOProvider<ActionsFilter> actionsFilterIOProvider) throws IOException {
        return new RequestToPageLoadingEventConverter(baseUrl, actionsFilterIOProvider.get());
    }
}

