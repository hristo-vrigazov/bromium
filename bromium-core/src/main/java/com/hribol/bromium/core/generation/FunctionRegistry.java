package com.hribol.bromium.core.generation;

/**
 * Represents a class which can register registry information, or generate code
 * by given registry information.
 */
public interface FunctionRegistry<T extends RegistryInformation> extends JavascriptGenerator<T> {

    /**
     * Adds an entry to the registy.
     * @param registerEntry the entry that should be added to the registry
     */
    void register(T registerEntry);
}
