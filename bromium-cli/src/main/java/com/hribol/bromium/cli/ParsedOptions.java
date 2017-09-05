package com.hribol.bromium.cli;

import java.util.Map;

/**
 * Created by hvrigazov on 08.07.17.
 */
public class ParsedOptions {

    private Map<String, Object> opts;

    public static final String DRIVER = "--driver";
    public static final String JS = "--js";
    public static final String URL = "--url";
    public static final String BROWSER = "--browser";
    public static final String OUTPUT = "--output";
    public static final String TIMEOUT = "--timeout";
    public static final String APPLICATION = "--application";
    public static final String CASE = "--case";
    public static final String PRECISION = "--precision";
    public static final String SCREEN = "--screen";
    public static final String MEASUREMENTS = "--measurements";

    public ParsedOptions(Map<String, Object> opts) {
        this.opts = opts;
    }

    public Integer getMeasurementsPrecisionMilli() {
        return getInt(PRECISION);
    }

    public String getPathToTestCase() {
        return getString(CASE);
    }

    public String getPathToApplicationConfiguration() {
        return getString(APPLICATION);
    }

    public String getPathToDriver() {
        return getString(DRIVER);
    }

    public String getPathToJS() {
        return getString(JS);
    }

    public String getBaseUrl() {
        String originalUrl = getString(URL);
        if (!originalUrl.endsWith("/")) {
            return originalUrl + "/";
        }
        return originalUrl;
    }

    public String getMeasurements() {
        return getString(MEASUREMENTS);
    }

    public String getBrowserType() {
        return getString(BROWSER);
    }

    public String getOutputFile() {
        return getString(OUTPUT);
    }

    public Integer getTimeout() {
        return getInt(TIMEOUT);
    }

    public Integer getInt(String key) {
        return Integer.valueOf(getString(key));
    }

    public String getString(String key) {
        return (String) opts.get(key);
    }

    public Integer getScreenNumber() {
        return getInt(SCREEN);
    }
}
