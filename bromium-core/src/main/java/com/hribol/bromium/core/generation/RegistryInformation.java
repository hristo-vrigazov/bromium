package com.hribol.bromium.core.generation;

/**
 * Created by hvrigazov on 01.07.17.
 */
public interface RegistryInformation<T extends GenerationFunctionInformation> extends GenerationInformation {
    T getGenerationFunctionInformation();
}
