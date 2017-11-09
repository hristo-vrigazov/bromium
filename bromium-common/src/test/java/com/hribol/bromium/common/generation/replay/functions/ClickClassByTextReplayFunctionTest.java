package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import org.junit.Test;

import static com.hribol.bromium.common.replay.parsers.ClickClassByTextParser.INITIAL_COLLECTOR_CLASS;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ClickClassByTextReplayFunctionTest {

    private static final String EXAMPLE_CLASS = ".val-button";
    private static final String EXAMPLE_TEXT_ALIAS = "text-alias";
    private static final String EXAMPLE_TEXT_VALUE = "text-value";


    @Test
    public void generatesCorrectly() {
        final String expected = "function ClickClassByText(initialCollectorClass, text, hashCode) {\n" +
                "\tdocument.arrive(\".\" + initialCollectorClass, options, function () {\n" +
                "\t\tbromium.notifySatisfiedBasedOnText(this, text, hashCode);\n" +
                "\t});\n" +
                "}";

        JsCollector jsCollector = new JsCollector();
        ClickClassByTextReplayFunction.ClickClassByTextReplayInvocationProvider provider =
                mock(ClickClassByTextReplayFunction.ClickClassByTextReplayInvocationProvider.class);

        ReplayFunction replayFunction = new ClickClassByTextReplayFunction(jsCollector, provider);
        assertEquals(expected.trim(), replayFunction.getJavascriptCode().trim());
    }

    @Test
    public void correctHashCode() {
        final String expectedHashCode = "-425754230";
        JsCollector jsCollector = new JsCollector();
        ReplayFunctionInvocation expected = mock(ReplayFunctionInvocation.class);
        ClickClassByTextReplayFunction.ClickClassByTextReplayInvocationProvider provider =
                mock(ClickClassByTextReplayFunction.ClickClassByTextReplayInvocationProvider.class);
        when(provider.get(EXAMPLE_CLASS, EXAMPLE_TEXT_VALUE, expectedHashCode)).thenReturn(expected);
        StepAndWebDriverActionConfiguration stepAndWebDriverActionConfiguration = buildMock();

        ReplayFunction replayFunction = new ClickClassByTextReplayFunction(jsCollector, provider);

        ReplayFunctionInvocation actual = replayFunction.getInvocation(stepAndWebDriverActionConfiguration);
        assertEquals(expected, actual);
    }

    private StepAndWebDriverActionConfiguration buildMock() {
        StepAndWebDriverActionConfiguration stepAndWebDriverActionConfiguration = mock(StepAndWebDriverActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(stepAndWebDriverActionConfiguration.getGenerationFunctionInformation().getParametersConfiguration()
                .get(INITIAL_COLLECTOR_CLASS).getValue())
                .thenReturn(EXAMPLE_CLASS);
        when(stepAndWebDriverActionConfiguration.getGenerationFunctionInformation().getParametersConfiguration()
                .get(TEXT).getAlias())
                .thenReturn(EXAMPLE_TEXT_ALIAS);
        when(stepAndWebDriverActionConfiguration.getTestCaseStep().get(EXAMPLE_TEXT_ALIAS)).thenReturn(EXAMPLE_TEXT_VALUE);
        return stepAndWebDriverActionConfiguration;
    }

}
