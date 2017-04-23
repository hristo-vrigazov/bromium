package com.hribol.spiderman.core.suppliers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.function.Supplier;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class DesiredCapabilitiesSupplier implements Supplier<DesiredCapabilities> {

    private Proxy proxy;

    public DesiredCapabilitiesSupplier(Proxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public DesiredCapabilities get() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        return capabilities;
    }
}
