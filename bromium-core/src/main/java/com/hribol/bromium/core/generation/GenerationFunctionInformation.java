package com.hribol.bromium.core.generation;

/**
 * Information needed for generating a javascript function. Has to be identifiable by
 * a given key, which is supplied through the {@link #getKey()} method.
 */
public interface GenerationFunctionInformation {

    /**
     * Supplies a string which uniquely identifies the generation information.
     * @return
     */
    String getKey();
}
