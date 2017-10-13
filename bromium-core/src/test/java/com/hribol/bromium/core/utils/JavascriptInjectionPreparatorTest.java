package com.hribol.bromium.core.utils;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class JavascriptInjectionPreparatorTest {

    @Test
    public void jsInjectorProducesValidScriptTag() throws IOException {
        String pathToJSInjectionFile = getClass().getResource("/eventsRecorder.js").getFile();
        JavascriptInjectionPreparator javascriptInjectionPreparator = new JavascriptInjectionPreparator(pathToJSInjectionFile);

        String outputJS = javascriptInjectionPreparator.getInjectionCode();

        assertTrue(outputJS.startsWith("<script>"));
        assertTrue(outputJS.endsWith("</script>"));
    }
}
