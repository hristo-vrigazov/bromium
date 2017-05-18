package unit.suppliers;

import com.hribol.spiderman.replay.config.suppliers.DesiredCapabilitiesSupplier;
import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class DesiredCapabilitiesSupplierTest {

    @Test
    public void canSupplyCapabilitiesWithProxy() {
        Proxy proxy = mock(Proxy.class);
        DesiredCapabilitiesSupplier supplier = new DesiredCapabilitiesSupplier(proxy);
        DesiredCapabilities desiredCapabilities = supplier.get();

        assertTrue(desiredCapabilities.getCapability(CapabilityType.PROXY).equals(proxy));
    }
}
