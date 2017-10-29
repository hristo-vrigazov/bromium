package com.hribol.bromium.common.generation.replay.functions;

import com.google.inject.Inject;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.common.generation.replay.invocations.TypeTextInElementFoundByCssSelectorReplayInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.utils.WebDriverActions;

import java.text.MessageFormat;
import java.util.Map;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;
import static com.hribol.bromium.common.generation.replay.functions.Constants.HASHCODE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

/**
 * Created by hvrigazov on 29.10.17.
 */
public class TypeTextInElementFoundByCssSelectorReplayFunction implements ReplayFunction {
    private String functionDeclarationCode;

    @Inject
    public TypeTextInElementFoundByCssSelectorReplayFunction(JsCollector jsCollector) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR)
                .withParameters(CSS_SELECTOR, HASHCODE)
                .startBody()
                .whenCssSelectorArrives(CSS_SELECTOR)
                .notifySatisfiedCondition(HASHCODE)
                .endArriveHandler()
                .whenCssSelectorLeaves(CSS_SELECTOR)
                .notifyNotSatisfiedCondition(HASHCODE)
                .endLeaveHandler()
                .endBody()
                .build();
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
        String hashCode = String.valueOf(MessageFormat.format("{0} {1}", WebDriverActions.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR, cssSelector).hashCode());
        return new TypeTextInElementFoundByCssSelectorReplayInvocation(cssSelector, hashCode);
    }
}
