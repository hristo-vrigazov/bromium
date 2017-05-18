package unit.suppliers;

import com.hribol.spiderman.replay.config.suppliers.SeleniumProxySupplier;
import net.lightbody.bmp.BrowserMobProxy;
import org.junit.Test;
import org.openqa.selenium.Proxy;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 23.04.17.
 */
public class SeleniumProxySupplierTest {

    @Test
    public void canSuppySeleniumProxy() {
        BrowserMobProxy browserMobProxy = mock(BrowserMobProxy.class);
        SeleniumProxySupplier supplier = new SeleniumProxySupplier(browserMobProxy);
        Proxy seleniumProxy = supplier.get();
        assertNotNull(seleniumProxy);
    }
}
