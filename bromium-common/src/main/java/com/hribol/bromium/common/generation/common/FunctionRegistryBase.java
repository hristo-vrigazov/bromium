package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.core.generation.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hvrigazov on 01.07.17.
 */
public class FunctionRegistryBase
        <T extends RegistryInformation<S>,
        V extends GeneratedInvocation,
        S extends GenerationFunctionInformation> implements FunctionRegistry<T> {
    private Set<GeneratedFunction<T, V>> functions = new HashSet<>();
    private Set<GeneratedInvocation> invocations = new HashSet<>();
    private GeneratedFunctionFactory<GeneratedFunction<T, V>, S> generatedFunctionFactory;

    public FunctionRegistryBase(GeneratedFunctionFactory<GeneratedFunction<T, V>, S> generatedFunctionFactory) {
        this.generatedFunctionFactory = generatedFunctionFactory;
    }

    @Override
    public String generate(T generationInformation) {
        S generationFunctionInformation = generationInformation.getGenerationFunctionInformation();
        StringBuilder stringBuilder = new StringBuilder();
        GeneratedFunction<T, V> generatedFunction = generatedFunctionFactory.create(generationFunctionInformation);

        if (!functions.contains(generatedFunction)) {
            stringBuilder.append(generatedFunction.getJavascriptCode());
        }

        V recorderFunctionInvocation = generatedFunction.getInvocation(generationInformation);
        if (!invocations.contains(recorderFunctionInvocation)) {
            stringBuilder.append(recorderFunctionInvocation.getJavascriptCode());
        }

        return stringBuilder.toString();
    }

    @Override
    public void register(T registerEntry) {
        S generationFunctionInformation = registerEntry.getGenerationFunctionInformation();

        GeneratedFunction<T, V> function = generatedFunctionFactory.create(generationFunctionInformation);

        if (!functions.contains(function)) {
            functions.add(function);
        }

        V invocation = function.getInvocation(registerEntry);
        if (!invocations.contains(invocation)) {
            invocations.add(invocation);
        }
    }
}
