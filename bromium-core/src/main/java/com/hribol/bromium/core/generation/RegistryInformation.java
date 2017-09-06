package com.hribol.bromium.core.generation;

/**
 * Represents information stored in {@link FunctionRegistry}, which can be used to generate
 * function, thus having the {@link T} parameter
 */
public interface RegistryInformation<T extends GenerationFunctionInformation> extends GenerationInformation {

    /**
     * Returns the generation function information
     * @return the generation function information
     */
    T getGenerationFunctionInformation();
}
