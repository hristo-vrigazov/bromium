package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.common.generation.replay.invocations.TextOfElementFoundByCssSelectorToBeInvocation;
import com.hribol.bromium.common.replay.actions.TextOfElementFoundByCssSelectorToBe;
import com.hribol.bromium.core.config.ParameterConfiguration;

import java.text.MessageFormat;
import java.util.Map;

import static com.hribol.bromium.common.builder.JsFunctionNames.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;
import static com.hribol.bromium.common.generation.replay.functions.Constants.HASHCODE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.TEXT;

/**
 * Replay function for {@link TextOfElementFoundByCssSelectorToBe}
 */
public class TextOfElementFoundByCssSelectorToBeReplayFunction implements ReplayFunction {

    private String functionDeclarationCode;
    private InvocationProvider invocationProvider;

    public TextOfElementFoundByCssSelectorToBeReplayFunction(JsCollector jsCollector, InvocationProvider invocationProvider) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE)
                .withParameters(CSS_SELECTOR, TEXT, HASHCODE)
                .startBody()
                    .whenCssSelectorArrives(CSS_SELECTOR)
                        .notifySatisfiedBasedOnText(TEXT, HASHCODE)
                    .endArriveHandler()
                .endBody()
                .build();
        this.invocationProvider = invocationProvider;
    }

    @Override
    public String getJavascriptCode() {
        return functionDeclarationCode;
    }

    @Override
    public ReplayFunctionInvocation getInvocation(StepAndWebDriverActionConfiguration generationInformation) {
        Map<String, ParameterConfiguration> parametersConfiguration = generationInformation.getGenerationFunctionInformation().getParametersConfiguration();
        ParameterConfiguration cssSelectorConfiguration = parametersConfiguration.get(CSS_SELECTOR);
        String cssSelector = cssSelectorConfiguration.getValue();
        ParameterConfiguration textConfiguration = parametersConfiguration.get(TEXT);
        String text = textConfiguration.getValue();
        String hashCode = String.valueOf(MessageFormat.format("{0} {1} {2}", TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE, cssSelector, text).hashCode());
        return invocationProvider.get(cssSelector, text, hashCode);
    }

    public interface InvocationProvider {
        TextOfElementFoundByCssSelectorToBeInvocation get(String cssSelector, String text, String hashCode);
    }
}
