package com.hribol.bromium.core.utils;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * This class is responsible for preparing an already generated javascript code
 * for injection in the HTML
 */
public class JavascriptInjectionPreparator {

    private String injectionCode;

    public JavascriptInjectionPreparator(Reader reader) throws IOException {
        this.injectionCode = "<script>" +
                "(function() {" + System.lineSeparator() +
                IOUtils.toString(reader) +
                System.lineSeparator() + "})();" +
                "</script>";
    }

    public JavascriptInjectionPreparator(InputStream inputStream) throws IOException {
        this(new BufferedReader(new InputStreamReader(inputStream)));
    }

    public JavascriptInjectionPreparator(String pathToJsInjectionFile) throws IOException {
        this(new FileInputStream(pathToJsInjectionFile));
    }

    public String getInjectionCode() {
        return injectionCode;
    }
}
