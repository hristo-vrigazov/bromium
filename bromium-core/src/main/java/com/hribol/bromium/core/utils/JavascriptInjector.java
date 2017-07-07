package com.hribol.bromium.core.utils;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Created by hvrigazov on 10.03.17.
 */
public class JavascriptInjector {

    private String injectionCode;

    public JavascriptInjector(Reader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<script>");
        stringBuilder.append("(function() {").append(System.lineSeparator());
        stringBuilder.append(IOUtils.toString(reader));
        stringBuilder
                .append(System.lineSeparator()).append("})();")
                .append("</script>");

        this.injectionCode = stringBuilder.toString();
    }

    public JavascriptInjector(InputStream inputStream) throws IOException {
        this(new BufferedReader(new InputStreamReader(inputStream)));
    }

    public JavascriptInjector(String pathToJsInjectionFile) throws IOException {
        this(new FileInputStream(pathToJsInjectionFile));
    }

    public String getInjectionCode() {
        return injectionCode;
    }
}
