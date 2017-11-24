package com.hribol.bromium.core.utils;

import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * This class is responsible for preparing an already generated javascript code
 * for injection in the HTML
 */
public class JavascriptInjectionPreparator {

    private String injectionCode;

    /**
     * Creates an object which can be used to inject javascript in HTML code.
     * @param reader the reader from which the generated javascript is read
     * @throws IOException if exception happens while reading from the {@link Reader} to {@link String}
     */
    public JavascriptInjectionPreparator(Reader reader) throws IOException {
        this.injectionCode = "<script>" +
                "(function() {" + System.lineSeparator() +
                IOUtils.toString(reader) +
                System.lineSeparator() + "})();" +
                "</script>";
    }

    /**
     * Creates an object which can be used to inject javascript in HTML code.
     * @param inputStream the input stream from which the generated javascript is read
     * @throws IOException if exception happens while reading from the {@link InputStream} to {@link String}
     */
    public JavascriptInjectionPreparator(InputStream inputStream) throws IOException {
        this(new BufferedReader(new InputStreamReader(inputStream)));
    }

    /**
     * Creates an object which can be used to inject javascript in HTML code.
     * @param pathToJsInjectionFile the path to a file from which the generated javascript is read
     * @throws IOException if exception happens while reading from the file
     */
    public JavascriptInjectionPreparator(String pathToJsInjectionFile) throws IOException {
        this(new FileInputStream(pathToJsInjectionFile));
    }

    public String getInjectionCode() {
        return injectionCode;
    }
}
