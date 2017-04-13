package edu.hvrigazov.automation.record;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

/**
 * Created by hvrigazov on 10.03.17.
 */
public class JavascriptInjector {

    private String injectionCode;

    public JavascriptInjector(String pathToJsInjectionFile) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<script>");
        stringBuilder.append("(function() {").append(System.lineSeparator());
        stringBuilder.append(Files.toString(new File(pathToJsInjectionFile), Charsets.UTF_8));
        stringBuilder
                .append(System.lineSeparator()).append("})();")
                .append("</script>");

        this.injectionCode = stringBuilder.toString();
    }

    public String getInjectionCode() {
        return injectionCode;
    }
}
