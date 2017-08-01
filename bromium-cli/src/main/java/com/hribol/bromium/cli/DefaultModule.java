package com.hribol.bromium.cli;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import com.google.inject.throwingproviders.CheckedProvides;
import com.google.inject.throwingproviders.ThrowingProviderBinder;
import com.hribol.bromium.browsers.chrome.base.ChromeDriverSupplier;
import com.hribol.bromium.browsers.chrome.replay.ChromeDriverServiceSupplier;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.common.EmptyFunction;
import com.hribol.bromium.common.generation.common.IncludeInvokeGenerator;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.helper.StepsAndConfiguration;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndActionConfigurationSupplier;
import com.hribol.bromium.common.generation.helper.suppliers.StepAndWebDriverActionConfigurationSupplier;
import com.hribol.bromium.common.generation.record.*;
import com.hribol.bromium.common.generation.record.functions.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.replay.*;
import com.hribol.bromium.common.generation.replay.functions.ReplayFunctionInvocation;
import com.hribol.bromium.common.ProxyDriverIntegrator;
import com.hribol.bromium.common.record.RecordBrowser;
import com.hribol.bromium.core.utils.GetHtmlFromCurrentHostPredicate;
import com.hribol.bromium.record.RecordingState;
import com.hribol.bromium.common.replay.DriverOperations;
import com.hribol.bromium.common.replay.ExecutorBuilder;
import com.hribol.bromium.common.replay.WebDriverActionExecutionBase;
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
import com.hribol.bromium.core.utils.JavascriptInjector;
import com.hribol.bromium.core.utils.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.core.utils.parsing.StepsReader;
import com.hribol.bromium.record.RecordRequestFilter;
import com.hribol.bromium.record.RecordResponseFilter;
import com.hribol.bromium.replay.ReplayBrowser;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.execution.WebDriverActionExecution;
import com.hribol.bromium.replay.execution.application.ApplicationActionFactory;
import com.hribol.bromium.replay.execution.factory.WebDriverActionFactory;
import com.hribol.bromium.replay.execution.scenario.TestScenarioFactory;
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
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static com.hribol.bromium.cli.Main.Commands.RECORD;
import static com.hribol.bromium.cli.Main.Commands.REPLAY;
import static com.hribol.bromium.core.DependencyInjectionConstants.*;
import static org.openqa.selenium.remote.BrowserType.CHROME;

/**
 * Created by hvrigazov on 09.06.17.
 */
public class DefaultModule extends AbstractModule {
    private String command;
    private Map<String, Object> opts;

    public DefaultModule(String command, Map<String, Object> opts) {
        this.command = command;
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
        bind(new TypeLiteral<Predicate<HttpRequest>>() {}).to(GetHtmlFromCurrentHostPredicate.class);
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
    @Named(COMMAND)
    public String getCommand() {
        return command;
    }

    @Provides
    public RequestFilter getRequestFilter(@Named(COMMAND) String command,
                                          RecordingState recordingState,
                                          ReplayingState replayingState) {
        switch (command) {
            case RECORD:
                return new RecordRequestFilter(recordingState);
            case REPLAY:
                return new ReplayRequestFilter(replayingState);
            default:
                throw new NoSuchCommandException();
        }
    }

    @CheckedProvides(IOProvider.class)
    public ResponseFilter getResponseFilter(@Named(COMMAND) String command,
                                            ReplayingState replayingState,
                                            Predicate<HttpRequest> httpRequestPredicate,
                                            @Named(RECORDING_JAVASCRIPT_CODE) IOProvider<String>
                                                        recordingJavascriptCodeProvider,
                                            @Named(REPLAYING_JAVASCRIPT_CODE) IOProvider<String>
                                                        replayingJavascriptCodeProvider) throws IOException {
        switch (command) {
            case RECORD:
                return new RecordResponseFilter(recordingJavascriptCodeProvider.get(), httpRequestPredicate);
            case REPLAY:
                return new ReplayResponseFilter(replayingJavascriptCodeProvider.get(), replayingState,httpRequestPredicate);
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
        RecordingJavascriptGenerator replayingJavascriptGenerator = recordingJavascriptGeneratorIOProvider.get();
        return replayingJavascriptGenerator.generate(configuration);
    }

    @CheckedProvides(IOProvider.class)
    @Named(REPLAYING_JAVASCRIPT_INJECTOR)
    public JavascriptInjector getReplayingJavascriptInjector(@Named(GENERATED_REPLAY_JAVASCRIPT)
                                                                IOProvider<String> generatedReplayJavascript) throws IOException {
        String generatedCode = generatedReplayJavascript.get();
        return new JavascriptInjector(new StringReader(generatedCode));
    }

    @CheckedProvides(IOProvider.class)
    @Named(RECORDING_JAVASCRIPT_INJECTOR)
    public JavascriptInjector getRecordingJavascriptInjector(@Named(GENERATED_RECORD_JAVASCRIPT)
                                                            IOProvider<String> generatedRecordJavascript) throws IOException {
        String generatedCode = generatedRecordJavascript.get();
        return new JavascriptInjector(new StringReader(generatedCode));
    }

    @CheckedProvides(IOProvider.class)
    @Named(REPLAYING_JAVASCRIPT_CODE)
    public String getReplayingJavascriptCode(@Named(REPLAYING_JAVASCRIPT_INJECTOR)
                                                         IOProvider<JavascriptInjector> javascriptInjectorIOProvider) throws IOException {
        return javascriptInjectorIOProvider.get().getInjectionCode();
    }

    @CheckedProvides(IOProvider.class)
    @Named(RECORDING_JAVASCRIPT_CODE)
    public String getRecordingJavascriptCode(@Named(RECORDING_JAVASCRIPT_INJECTOR)
                                                     IOProvider<JavascriptInjector> javascriptInjectorIOProvider) throws IOException {
        return javascriptInjectorIOProvider.get().getInjectionCode();
    }


    @CheckedProvides(IOURIProvider.class)
    public ExecutorBuilder getExecutorBuilder(ExecutorBuilder executorBuilder,
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
        return executorBuilder
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
    public WebDriverActionExecution getWebDriverActionExecution(IOURIProvider<ExecutorBuilder> executorBuilderIOProvider) throws IOException, URISyntaxException {
        return new WebDriverActionExecutionBase(executorBuilderIOProvider.get());
    }

    @CheckedProvides(IOURIProvider.class)
    public ReplayBrowser getReplayBrowser(IOProvider<TestScenarioFactory> testScenarioFactoryIOProvider,
                                          IOURIProvider<WebDriverActionExecution> execution) throws IOException, URISyntaxException {
        return new ReplayBrowser(testScenarioFactoryIOProvider.get(), execution.get());
    }

    @Named(BASE_URI)
    @Provides
    public URI getBaseUri(@Named(BASE_URL) String baseUrl) {
        return URI.create(baseUrl);
    }

    @CheckedProvides(IOURIProvider.class)
    public ProxyDriverIntegrator getProxyDriverIntegrator(RequestFilter requestFilter,
                                                          IOProvider<ResponseFilter> responseFilterIOURIProvider,
                                                          WebDriverSupplier webDriverSupplier,
                                                          DriverServiceSupplier driverServiceSupplier,
                                                          @Named(PATH_TO_DRIVER) String pathToDriverExecutable,
                                                          @Named(SCREEN) String screen,
                                                          @Named(TIMEOUT) int timeout) throws IOException, URISyntaxException {
        return getProxyDriverIntegrator(requestFilter, webDriverSupplier, driverServiceSupplier, pathToDriverExecutable, screen, timeout,
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
}

