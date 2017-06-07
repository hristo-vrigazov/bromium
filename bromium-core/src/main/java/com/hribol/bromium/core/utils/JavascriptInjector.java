package com.hribol.bromium.core.utils;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hvrigazov on 10.03.17.
 */
public class JavascriptInjector {

    private String injectionCode;

    public JavascriptInjector(InputStream inputStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<script>");
        stringBuilder.append("(function() {").append(System.lineSeparator());
        stringBuilder.append(IOUtils.toString(inputStream));
        stringBuilder
                .append(System.lineSeparator()).append("})();")
                .append("</script>");

        this.injectionCode = stringBuilder.toString();
    }

    public JavascriptInjector(String pathToJsInjectionFile) throws IOException {
        this(new FileInputStream(pathToJsInjectionFile));
    }

    public String getInjectionCode() {
        return injectionCode;
    }
}
