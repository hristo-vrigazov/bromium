package com.hribol.bromium.replay.execution;

import com.hribol.bromium.replay.execution.synchronization.EventDispatcher;
import com.hribol.bromium.replay.execution.synchronization.NoHttpRequestsInQueue;
import com.hribol.bromium.replay.execution.synchronization.ThreadEventSynchronizer;
import com.hribol.bromium.replay.filters.ProxyFacade;
import com.hribol.bromium.replay.filters.ProxyFacadeSupplier;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class ExecutorBuilder {
    private static final String DRIVER_EXECUTABLE = "DRIVER_EXECUTABLE";
    private Integer maxRetries;
    private String pathToDriverExecutable;
    private Integer timeout;
    private Integer measurementsPrecisionMilli;
    private String baseURL;
    private AutomationResultBuilder automationResultBuilder;
    private ProxyFacadeSupplier proxyFacadeSupplier;
    private String javascriptInjectionCode;
    private EventDispatcher eventDispatcher;
    private ProxyFacade proxyFacade;
    private NoHttpRequestsInQueue noHttpRequestsInQueue;

    public ExecutorBuilder pathToDriverExecutable(String pathToDriverExecutable) {
        this.pathToDriverExecutable = pathToDriverExecutable;
        return this;
    }

    public ExecutorBuilder javascriptInjectionCode(String javascriptInjectionCode) {
        this.javascriptInjectionCode = javascriptInjectionCode;
        return this;
    }

    public ExecutorBuilder timeoutInSeconds(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    public ExecutorBuilder measurementsPrecisionInMilliseconds(Integer measurementsPrecisionMilli) {
        this.measurementsPrecisionMilli = measurementsPrecisionMilli;
        return this;
    }

    public ExecutorBuilder maxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    public ExecutorBuilder baseURL(String baseURL) {
        this.baseURL = baseURL;
        return this;
    }

    public ExecutorBuilder automationResultBuilder(AutomationResultBuilder automationResultBuilder) {
        this.automationResultBuilder = automationResultBuilder;
        return this;
    }

    public ExecutorBuilder proxyFacadeSupplier(ProxyFacadeSupplier proxyFacadeSupplier) {
        this.proxyFacadeSupplier = proxyFacadeSupplier;
        return this;
    }

    public ExecutorBuilder eventDispatcher(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
        return this;
    }

    public String getBaseURL() {
        if (baseURL == null) {
            throw new IllegalStateException("Base URI is not set. Please use the baseURL method");
        }

        return baseURL;
    }

    public String getPathToDriverExecutable() throws IOException {
        pathToDriverExecutable = Optional.ofNullable(pathToDriverExecutable).orElse(System.getenv(DRIVER_EXECUTABLE));
        if (!Optional.ofNullable(pathToDriverExecutable).isPresent()) {
            throw new IOException("Path to driver executable not set. Please either set it using" +
                    " pathToDriverExecutable method or by setting the environment variable" +
                    " DRIVER_EXECUTABLE");
        }

        return pathToDriverExecutable;
    }

    public int getTimeout() {
        if (!Optional.ofNullable(timeout).isPresent()) {
            this.timeout = 10;
        }

        return timeout;
    }

    public int getMeasurementsPrecisionMilli() {
        if (!Optional.ofNullable(measurementsPrecisionMilli).isPresent()) {
            this.measurementsPrecisionMilli = 500;
        }

        return measurementsPrecisionMilli;
    }

    public int getMaxRetries() {
        if (!Optional.ofNullable(maxRetries).isPresent()) {
            this.maxRetries = 50;
        }

        return maxRetries;
    }

    public AutomationResultBuilder getAutomationResultBuilder() {
        if (!Optional.ofNullable(automationResultBuilder).isPresent()) {
            this.automationResultBuilder = new InstanceBasedAutomationResultBuilder();
        }

        return automationResultBuilder;
    }

    public ProxyFacadeSupplier getProxyFacadeSupplier() {
        if (!Optional.ofNullable(proxyFacadeSupplier).isPresent()) {
            this.proxyFacadeSupplier = new ProxyFacadeSupplier();
        }

        return proxyFacadeSupplier;
    }

    public String getJavascriptInjectionCode() {
        return javascriptInjectionCode;
    }

    public EventDispatcher getEventDispatcher() {
        if (!Optional.ofNullable(eventDispatcher).isPresent()) {
            this.eventDispatcher = new ThreadEventSynchronizer();
        }

        return eventDispatcher;
    }

    public ProxyFacade getProxyFacade() throws URISyntaxException {
        if (!Optional.ofNullable(proxyFacade).isPresent()) {
            this.proxyFacade = getProxyFacadeSupplier().get(baseURL, javascriptInjectionCode);
        }

        return proxyFacade;
    }

    public NoHttpRequestsInQueue noHttpRequestsInQueue() throws URISyntaxException {
        return new NoHttpRequestsInQueue(getProxyFacade().getResponseFilter(), getEventDispatcher());
    }

    public WebDriverActionExecutionException webDriverActionExecutionException(String message, Throwable e) {
        return new WebDriverActionExecutionException(message, e, getAutomationResultBuilder());
    }
}