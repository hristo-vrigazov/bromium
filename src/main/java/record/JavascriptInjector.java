package record;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import exceptions.JavascriptFileNotFoundException;
import exceptions.JavascriptFolderNotFoundException;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by hvrigazov on 10.03.17.
 */
public class JavascriptInjector {

    private String injectionCode;

    public JavascriptInjector() throws JavascriptFolderNotFoundException, JavascriptFileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("javascriptInjection/");

        if (resource == null) {
            throw new JavascriptFolderNotFoundException();
        }

        File javascriptInjectionDirectory = new File(resource.getFile());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<script>");
        stringBuilder.append("(function() {").append(System.lineSeparator());
        for (File javascriptFiletoBeInjected: javascriptInjectionDirectory.listFiles()) {
            try {
                stringBuilder.append(Files.toString(javascriptFiletoBeInjected, Charsets.UTF_8));
            } catch (IOException e) {
                throw new JavascriptFileNotFoundException();
            }
        }
        stringBuilder
                .append(System.lineSeparator()).append("})();")
                .append("</script>");

        this.injectionCode = stringBuilder.toString();
        System.out.println(injectionCode);
    }

    public String getInjectionCode() {
        return injectionCode;
    }
}
