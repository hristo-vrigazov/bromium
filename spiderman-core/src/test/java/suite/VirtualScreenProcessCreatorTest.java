package suite;

import com.hribol.spiderman.core.suite.UbuntuVirtualScreenProcessCreator;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by hvrigazov on 21.04.17.
 */
public class VirtualScreenProcessCreatorTest {

    @Test
    public void xvfbIsInstalledAndProcessIsCreated() throws IOException {
        UbuntuVirtualScreenProcessCreator virtualScreenProcessCreator = new UbuntuVirtualScreenProcessCreator();
        Process process = virtualScreenProcessCreator.createXvfbProcess(0);

        assertTrue(process.isAlive());
        process.destroy();
    }

}
