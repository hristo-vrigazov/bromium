package com.hribol.bromium.core.suppliers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.function.Supplier;

/**
 * Supplies an instance of {@link DesiredCapabilities} by a given {@link Proxy}
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
