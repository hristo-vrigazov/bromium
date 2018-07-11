package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.GeneratedFunctionFactory;
import com.hribol.bromium.core.generation.GeneratedInvocation;
import com.hribol.bromium.core.generation.GenerationFunctionInformation;
import com.hribol.bromium.core.generation.GenerationInformation;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a base factory for creating generated functions by given information.
 * @param <T> the generated function class
 * @param <V> the information needed to generate the function
 */
public abstract class FunctionFactoryBase
        <
                T extends GenerationInformation,
                V extends GeneratedInvocation,
                R extends GeneratedFunction<T, V>,
                S extends GenerationFunctionInformation
        >
        implements GeneratedFunctionFactory<R, S> {

    private Map<String, R> typeToGeneratedFunction;
    protected JsFunctionProvider<T, V, R> functionProvider;
    private List<String> additionalActions;

    /**
     * Creates a new base factory for creating generated functions by given information.
     */
    public FunctionFactoryBase(JsFunctionProvider<T, V, R> functionProvider,
                               List<String> additionalActions) {
        this.functionProvider = functionProvider;
        this.additionalActions = additionalActions;
        this.typeToGeneratedFunction = new HashMap<>();
        addActions();
    }

    protected void addActions() {
        addPredefined();
        addCustom();
    }
    /**
     * A method for adding custom actions
     */
    protected void addCustom() {
        try {
            for (String jsFunctionName: this.additionalActions) {
                add(jsFunctionName, functionProvider.get(jsFunctionName));
            }
        } catch (IOException e) {
            throw new IllegalStateException("IO exception while reading recorder functions", e);
        }
    }

    protected void addPredefined() {
        try {
            List<String> defaultFunctionNames = getJsFunctionNames();
            for (String jsFunctionName: defaultFunctionNames) {
                add(jsFunctionName, functionProvider.get(jsFunctionName));
            }
        } catch (IOException e) {
            throw new IllegalStateException("IO exception while reading recorder functions", e);
        }
    }

    protected abstract List<String> getJsFunctionNames();

    /**
     * {@inheritDoc}
     */
    @Override
    public R create(S generationFunctionInformation) {
        return typeToGeneratedFunction.get(generationFunctionInformation.getKey());
    }

    /**
     * Registers a given type to be dispatched to a given generated function
     * @param webDriverActionType the type to be dispatched
     * @param generatedFunction the generated function to be created
     */
    protected void add(String webDriverActionType, R generatedFunction) {
        typeToGeneratedFunction.put(webDriverActionType, generatedFunction);
    }
}
