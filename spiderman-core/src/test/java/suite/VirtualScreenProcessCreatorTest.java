package suite;

import com.hribol.automation.core.suite.VirtualScreenProcessCreator;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class VirtualScreenProcessCreatorTest {

    @Test
    public void xvfbIsInstalledAndProcessIsCreated() throws IOException {
        VirtualScreenProcessCreator virtualScreenProcessCreator = new VirtualScreenProcessCreator();
        Process process = virtualScreenProcessCreator.createXvfbProcess(0);

        assertTrue(process.isAlive());
        process.destroy();
    }

}
