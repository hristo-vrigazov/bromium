package com.hribol.bromium.core.generation;

/**
 * Represents a javascript function which is generated. It supplies the function definition code
 * and can provide the {@link GeneratedInvocation} which can be used to generate the code to invoke
 * the function.
 */
public interface GeneratedFunction<T extends GenerationInformation, V extends GeneratedInvocation>
        extends JavascriptCodeSupplier {

    /**
     * By a given generation information, returns an instance which can be used to
     * generate an invocation of the function
     * @param generationInformation - the information needed for the invocation
     * @return an instance which can be used to generate an invocation of the function
     */
    V getInvocation(T generationInformation);
}
