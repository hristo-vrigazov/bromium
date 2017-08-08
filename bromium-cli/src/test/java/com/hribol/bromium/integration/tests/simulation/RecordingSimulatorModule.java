package com.hribol.bromium.integration.tests.simulation;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.hribol.bromium.cli.commands.PromptUtils;
import com.hribol.bromium.core.providers.IOProvider;
import com.hribol.bromium.core.suppliers.WebDriverSupplier;
import com.hribol.bromium.record.RecordingState;
import net.lightbody.bmp.filters.RequestFilter;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;

/**
 * Created by hvrigazov on 06.08.17.
 */
public class RecordingSimulatorModule extends AbstractModule {

    private WebDriverSupplier webDriverSupplier;

    public WebDriverSupplier getWebDriverSupplier() {
        return webDriverSupplier;
    }

    public PromptUtils getPromptUtils() {
        return promptUtils;
    }

    public RecordingState getRecordingState() {
        return recordingState;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public RequestFilter getRecordRequestFilter() {
        return recordRequestFilter;
    }

    private PromptUtils promptUtils;
    private RecordingState recordingState;
    private WebDriver webDriver;
    private RequestFilter recordRequestFilter;


    @SuppressWarnings("unchecked")
    public RecordingSimulatorModule(Injector originalInjector) throws IOException {
        this.webDriverSupplier = spy(originalInjector.getInstance(WebDriverSupplier.class));
        this.recordingState = spy(originalInjector.getInstance(RecordingState.class));
        this.promptUtils = spy(originalInjector.getInstance(PromptUtils.class));
        this.recordRequestFilter = spy(originalInjector.getInstance(
                Key.get(new TypeLiteral<IOProvider<RequestFilter>>() {})).get());

        doAnswer(invocationOnMock -> {
            Object driver = invocationOnMock.callRealMethod();
            setWebDriver((WebDriver) driver);
            return driver;
        }).when(webDriverSupplier).get(any(), any());
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = spy(webDriver);
    }

    @Override
    protected void configure() {
        bind(WebDriverSupplier.class).toProvider(() -> webDriverSupplier);
        bind(PromptUtils.class).toProvider(() -> promptUtils);
        bind(RecordingState.class).toProvider(() -> recordingState);
        bind(RequestFilter.class).toProvider(() -> recordRequestFilter);
    }

    /**
     * Executes a callback when the user is prompted for recording
     * @param runnable
     */
    public void whenPromptedForRecordingRunnable(Runnable runnable) {
        doAnswer(invocationOnMock -> {
            runnable.run();
            return null;
        }).when(promptUtils).promptForRecording();
    }
}
