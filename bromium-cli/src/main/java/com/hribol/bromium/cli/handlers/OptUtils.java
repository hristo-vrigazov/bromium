package com.hribol.bromium.cli.handlers;

import java.util.Map;

/**
 * Created by hvrigazov on 09.05.17.
 */
public class OptUtils {

    public static final String DRIVER = "--driver";
    public static final String JS = "--js";
    public static final String URL = "--url";
    public static final String BROWSER = "--browser";
    public static final String OUTPUT = "--output";
    public static final String TIMEOUT = "--timeout";
    public static final String APPLICATION = "--application";
    public static final String CASE = "--case";
    public static final String MEASUREMENTS = "--measurements";
    public static final String PRECISION = "--precision";

    public static int getMeasurementsPrecisionMilli(Map<String, Object> opts) {
        return getInt(opts, PRECISION);
    }

    public static String getPathToTestCase(Map<String, Object> opts) {
        return getString(opts, CASE);
    }

    public static String getPathToApplicationConfiguration(Map<String, Object> opts) {
        return getString(opts, APPLICATION);
    }

    public static String getPathToDriver(Map<String, Object> opts) {
        return getString(opts, DRIVER);
    }

    public static String getPathToJS(Map<String, Object> opts) {
        return getString(opts, JS);
    }

    public static String getBaseUrl(Map<String, Object> opts) {
        return getString(opts, URL);
    }

    public static String getBrowserType(Map<String, Object> opts) {
        return getString(opts, BROWSER);
    }

    public static String getOutputFile(Map<String, Object> opts) {
        return getString(opts, OUTPUT);
    }

    public static Integer getTimeout(Map<String, Object> opts) {
        return getInt(opts, TIMEOUT);
    }

    public static Integer getInt(Map<String, Object> opts, String key) {
        return Integer.valueOf(getString(opts, key));
    }

    public static String getString(Map<String, Object> opts, String key) {
        return (String) opts.get(key);
    }
}
