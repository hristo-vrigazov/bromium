package com.hribol.bromium.common.generation.common;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.core.generation.GeneratedFunction;
import com.hribol.bromium.core.generation.GenerationFunctionInformation;
import com.hribol.bromium.core.generation.GenerationInformation;
import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 03.07.17.
 */
public class FunctionFactoryBaseTest{

    public static final String KEY = "key";

    @Test
    public void ifFunctionIsNotRegisteredThenEmptyFunctionSupplierIsCalled() {
        GeneratedFunction expected = mock(GeneratedFunction.class);
        Supplier<GeneratedFunction> emptyGeneratedFunctionSupplier = mock(Supplier.class);
        when(emptyGeneratedFunctionSupplier.get()).thenReturn(expected);

        JsCollector jsCollector = mock(JsCollector.class);
        GenerationFunctionInformation generationFunctionInformation = mock(GenerationFunctionInformation.class);
        when(generationFunctionInformation.getKey()).thenReturn(KEY);

        FunctionFactoryBase<GeneratedFunction, GenerationFunctionInformation>
                functionFactoryBase =
                new FunctionFactoryBase<GeneratedFunction, GenerationFunctionInformation>
                        (emptyGeneratedFunctionSupplier, jsCollector) {
            @Override
            protected void addCustom() {

            }

            @Override
            protected void addPredefined() {

            }
        };

        GeneratedFunction actual = functionFactoryBase.create(generationFunctionInformation);

        assertEquals(expected, actual);
    }

    @Test
    public void ifFunctionIsRegisteredAsPredefinedThenItIsReturned() {
        GeneratedFunction expected = mock(GeneratedFunction.class);
        Supplier<GeneratedFunction> emptyGeneratedFunctionSupplier = mock(Supplier.class);

        JsCollector jsCollector = mock(JsCollector.class);
        GenerationFunctionInformation generationFunctionInformation = mock(GenerationFunctionInformation.class);
        when(generationFunctionInformation.getKey()).thenReturn(KEY);

        FunctionFactoryBase<GeneratedFunction, GenerationFunctionInformation>
                functionFactoryBase =
                new FunctionFactoryBase<GeneratedFunction, GenerationFunctionInformation>
                        (emptyGeneratedFunctionSupplier, jsCollector) {
                    @Override
                    protected void addCustom() {

                    }

                    @Override
                    protected void addPredefined() {
                        add(KEY, expected);
                    }
                };

        GeneratedFunction actual = functionFactoryBase.create(generationFunctionInformation);

        assertEquals(expected, actual);
    }

    @Test
    public void ifFunctionIsRegisteredAsCustomThenItIsReturned() {
        GeneratedFunction expected = mock(GeneratedFunction.class);
        Supplier<GeneratedFunction> emptyGeneratedFunctionSupplier = mock(Supplier.class);

        JsCollector jsCollector = mock(JsCollector.class);
        GenerationFunctionInformation generationFunctionInformation = mock(GenerationFunctionInformation.class);
        when(generationFunctionInformation.getKey()).thenReturn(KEY);

        FunctionFactoryBase<GeneratedFunction, GenerationFunctionInformation>
                functionFactoryBase =
                new FunctionFactoryBase<GeneratedFunction, GenerationFunctionInformation>
                        (emptyGeneratedFunctionSupplier, jsCollector) {
                    @Override
                    protected void addCustom() {
                        add(KEY, expected);
                    }

                    @Override
                    protected void addPredefined() {
                    }
                };

        GeneratedFunction actual = functionFactoryBase.create(generationFunctionInformation);

        assertEquals(expected, actual);
    }

}
