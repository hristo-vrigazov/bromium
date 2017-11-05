package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.common.generation.replay.invocations.TextOfElementFoundByCssSelectorToBeInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.common.builder.JsFunctionNames.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class TextOfElementFoundByCssSelectorToBeReplayFunctionTest {

    @Test
    public void generatesInCorrectWay() {
        JsCollector jsCollector = new JsCollector();
        ReplayFunction replayFunction = new TextOfElementFoundByCssSelectorToBeReplayFunction(jsCollector);

        String expected = "function TextOfElementFoundByCssSelectorToBe(cssSelector, text, hashCode) {\n" +
                "\tdocument.arrive(cssSelector, options, function () {\n" +
                "\t\tbromium.notifySatisfiedBasedOnText(this, text, hashCode);\n" +
                "\t});\n" +
                "\tdocument.leave(cssSelector, function () {\n" +
                "\t\tbromium.notifyNotSatisfiedCondition(hashCode);\n" +
                "\t});\n" +
                "}".trim();
        String actual = replayFunction.getJavascriptCode().trim();

        assertEquals(expected, actual);
    }

    @Test
    public void createsCorrectInstance() {
        String cssSelector = "#status";
        String text = "Done";
        String expected = "531465102";
        JsCollector jsCollector = mock(JsCollector.class, RETURNS_DEEP_STUBS);
        ParameterConfiguration cssParameterConfiguration = mock(ParameterConfiguration.class);
        when(cssParameterConfiguration.getValue()).thenReturn(cssSelector);
        ParameterConfiguration textConfiguration = mock(ParameterConfiguration.class);
        when(textConfiguration.getValue()).thenReturn(text);
        Map<String, ParameterConfiguration> parameterConfigurationMap = new HashMap<>();
        parameterConfigurationMap.put(CSS_SELECTOR, cssParameterConfiguration);
        parameterConfigurationMap.put(TEXT, textConfiguration);
        StepAndWebDriverActionConfiguration stepAndWebDriverActionConfiguration = mock(StepAndWebDriverActionConfiguration.class, RETURNS_DEEP_STUBS);
        when(stepAndWebDriverActionConfiguration.getGenerationFunctionInformation().getParametersConfiguration())
                .thenReturn(parameterConfigurationMap);

        ReplayFunction replayFunction = new TextOfElementFoundByCssSelectorToBeReplayFunction(jsCollector);
        ReplayFunctionInvocation invocation = replayFunction.getInvocation(stepAndWebDriverActionConfiguration);

        assertTrue(invocation instanceof TextOfElementFoundByCssSelectorToBeInvocation);

    }

}