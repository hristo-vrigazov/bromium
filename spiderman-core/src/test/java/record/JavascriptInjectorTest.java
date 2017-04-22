package record;

import com.hribol.automation.core.record.JavascriptInjector;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class JavascriptInjectorTest {

    @Test
    public void jsInjectorProducesValidScriptTag() throws IOException {
        String pathToJSInjectionFile = getClass().getResource("/eventsRecorder.js").getFile();
        JavascriptInjector javascriptInjector = new JavascriptInjector(pathToJSInjectionFile);

        String outputJS = javascriptInjector.getInjectionCode();

        assertTrue(outputJS.startsWith("<script>"));
        assertTrue(outputJS.endsWith("</script>"));
    }
}
