package com.hribol.bromium.core.generation;

/**
 * Created by hvrigazov on 01.07.17.
 */
public interface GeneratedFunction<T extends GenerationInformation, V extends GeneratedInvocation>
        extends JavascriptCodeSupplier {
    V getInvocation(T generationInformation);
}
