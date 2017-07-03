package com.hribol.bromium.core.generation;

/**
 * Created by hvrigazov on 09.06.17.
 */
public interface FunctionRegistry<T extends RegistryInformation> extends JavascriptGenerator<T> {
    void register(T registerEntry);
}
