package com.hribol.bromium.cli.commands;

import com.google.inject.Inject;
import com.hribol.bromium.cli.factory.RecordBrowserFactory;
import com.hribol.bromium.common.record.RecordBrowserBase;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hvrigazov on 11.04.17.
 */
public class RecordCommand implements Command {
    private final String pathToDriver;
    private final String pathToApplicationConfiguration;
    private final String baseUrl;
    private final String outputFile;
    private final String browserType;
    private final int timeout;
    private RecordBrowserFactory recordBrowserFactory;
    private PromptUtils promptUtils;

    public RecordCommand(Builder builder) {
        this.pathToDriver = builder.getPathToDriver();
        this.pathToApplicationConfiguration = builder.getPathToApplicationConfiguration();
        this.baseUrl = builder.getBaseUrl();
        this.outputFile = builder.getOutputFile();
        this.timeout = builder.getTimeout();
        this.browserType = builder.getBrowserType();
        this.recordBrowserFactory = builder.getRecordBrowserFactory();
        this.promptUtils = builder.getPromptUtils();
    }

    @Override
    public void run() {
        try {
            RecordBrowserBase recordBrowserBase = recordBrowserFactory.create(browserType, pathToDriver, pathToApplicationConfiguration);
            recordBrowserBase.record(baseUrl, timeout);
            promptUtils.promptForRecording();
            recordBrowserBase.dumpActions(this.outputFile);
            recordBrowserBase.cleanUp();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            e.printStackTrace();
        }

    }

    public static class Builder {
        public String getPathToDriver() {
            return pathToDriver;
        }

        public String getPathToApplicationConfiguration() {
            return pathToApplicationConfiguration;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public String getOutputFile() {
            return outputFile;
        }

        public String getBrowserType() {
            return browserType;
        }

        public int getTimeout() {
            return timeout;
        }

        public RecordBrowserFactory getRecordBrowserFactory() {
            return recordBrowserFactory;
        }

        public PromptUtils getPromptUtils() {
            return promptUtils;
        }

        private String pathToDriver;
        private String pathToApplicationConfiguration;
        private String baseUrl;
        private String outputFile;
        private String browserType;
        private int timeout;
        private RecordBrowserFactory recordBrowserFactory;
        private PromptUtils promptUtils;

        public Builder pathToDriver(String pathToDriver) {
            this.pathToDriver = pathToDriver;
            return this;
        }

        public Builder pathToApplicationConfiguration(String pathToApplicationConfiguration) {
            this.pathToApplicationConfiguration = pathToApplicationConfiguration;
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder outputFile(String outputFile) {
            this.outputFile = outputFile;
            return this;
        }

        public Builder browserType(String browserType) {
            this.browserType = browserType;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder recordBrowserFactory(RecordBrowserFactory recordBrowserFactory) {
            this.recordBrowserFactory = recordBrowserFactory;
            return this;
        }

        public Builder promptUtils(PromptUtils promptUtils) {
            this.promptUtils = promptUtils;
            return this;
        }

        public RecordCommand build() {
            return new RecordCommand(this);
        }
    }
}
