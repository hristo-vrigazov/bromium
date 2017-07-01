package com.hribol.bromium.core.generation;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;

/**
 * Created by hvrigazov on 09.06.17.
 */
public interface TypeRegistry<T extends RegistryInformation> extends JavascriptGenerator<T> {
    void register(T registerEntry);
}
