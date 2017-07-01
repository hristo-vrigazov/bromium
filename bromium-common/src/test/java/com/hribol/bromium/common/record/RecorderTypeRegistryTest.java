package com.hribol.bromium.common.record;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 07.06.17.
 */
public class RecorderTypeRegistryTest {
//
//    @Test
//    public void ifRecorderTypeActionWhichIsNotInRegistryIsAddedThenItsFunctionAndInvocationAreGenerated() {
//        MocksContainer mocks = new MocksContainer();
//
//        RecorderTypeRegistry recorderTypeRegistry = new RecorderTypeRegistry(mocks.recorderFunctionFactory);
//
//        String generatedCode = recorderTypeRegistry.generate(mocks.eventName, mocks.webDriverActionConfiguration);
//
//        assertEquals(mocks.functionCode + mocks.invocationCode, generatedCode);
//    }
//
//    @Test
//    public void ifBothRecorderTypeAndInvocationAreIncludedEmptyStringIsReturned() {
//        MocksContainer mocks = new MocksContainer();
//
//        RecorderTypeRegistry recorderTypeRegistry = new RecorderTypeRegistry(mocks.recorderFunctionFactory);
//
//        recorderTypeRegistry.register(mocks.eventName, mocks.webDriverActionConfiguration);
//
//        String generatedCode = recorderTypeRegistry.generate(mocks.eventName, mocks.webDriverActionConfiguration);
//
//        assertEquals("", generatedCode);
//    }
//
//    @Test
//    public void ifRecorderTypeIsRegisteredAndInvocationIsNotThenInvocationStringIsReturned() {
//        MocksContainer mocks = new MocksContainer();
//
//        RecorderTypeRegistry recorderTypeRegistry = new RecorderTypeRegistry(mocks.recorderFunctionFactory);
//
//        recorderTypeRegistry.register(mocks.eventName, mocks.webDriverActionConfiguration);
//
//        String generatedCode = recorderTypeRegistry.generate(mocks.eventName, mocks.anotherWebDriverActionConfiguration);
//
//        assertEquals(mocks.anotherInvocationCode, generatedCode);
//    }
//
//    @Test
//    public void registeringTwoInvocationsOfTheSameFunction() {
//        MocksContainer mocks = new MocksContainer();
//
//        RecorderTypeRegistry recorderTypeRegistry = new RecorderTypeRegistry(mocks.recorderFunctionFactory);
//
//        recorderTypeRegistry.register(mocks.eventName, mocks.webDriverActionConfiguration);
//        recorderTypeRegistry.register(mocks.eventName, mocks.anotherWebDriverActionConfiguration);
//
//        assertEquals("", recorderTypeRegistry.generate(
//                mocks.eventName,
//                mocks.webDriverActionConfiguration));
//        assertEquals("", recorderTypeRegistry.generate(
//                mocks.eventName,
//                mocks.anotherWebDriverActionConfiguration));
//
//    }
//
//    @Test
//    public void registeringAnInvocationTwoTimes() {
//        MocksContainer mocks = new MocksContainer();
//
//        RecorderTypeRegistry recorderTypeRegistry = new RecorderTypeRegistry(mocks.recorderFunctionFactory);
//
//        recorderTypeRegistry.register(mocks.eventName, mocks.webDriverActionConfiguration);
//        recorderTypeRegistry.register(mocks.eventName, mocks.webDriverActionConfiguration);
//
//        assertEquals("", recorderTypeRegistry.generate(mocks.eventName, mocks.webDriverActionConfiguration));
//        assertEquals(mocks.anotherInvocationCode,
//                recorderTypeRegistry
//                        .generate(mocks.eventName, mocks.anotherWebDriverActionConfiguration));
//    }
//
//    private static class MocksContainer {
//        private RecorderFunctionFactory recorderFunctionFactory;
//        private WebDriverActionConfiguration webDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
//        private WebDriverActionConfiguration anotherWebDriverActionConfiguration = mock(WebDriverActionConfiguration.class);
//        private String functionCode = "function something(a) {} ";
//        private String invocationCode = " something('#a')";
//        private String anotherInvocationCode = " something('#b')";
//        private String eventName = "eventName";
//        private RecorderFunction recorderFunction = mock(RecorderFunction.class);
//        private RecorderFunctionInvocation recorderFunctionInvocation = mock(RecorderFunctionInvocation.class);
//        private RecorderFunctionInvocation anotherFunctionInvocation = mock(RecorderFunctionInvocation.class);
//
//        public MocksContainer() {
//            when(recorderFunction.getJavascriptCode()).thenReturn(functionCode);
//
//            when(recorderFunctionInvocation.getJavascriptCode()).thenReturn(invocationCode);
//            when(anotherFunctionInvocation.getJavascriptCode()).thenReturn(anotherInvocationCode);
//
//            recorderFunctionFactory = mock(RecorderFunctionFactory.class);
//            when(recorderFunctionFactory.create(webDriverActionConfiguration)).thenReturn(recorderFunction);
//            when(recorderFunctionFactory.create(anotherWebDriverActionConfiguration)).thenReturn(recorderFunction);
//
//            when(recorderFunction.getInvocation(eventName, webDriverActionConfiguration)).thenReturn(recorderFunctionInvocation);
//            when(recorderFunction.getInvocation(eventName, anotherWebDriverActionConfiguration)).thenReturn(anotherFunctionInvocation);
//        }
//    }
}
