package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;

import java.text.MessageFormat;
import java.util.Map;

import static com.hribol.bromium.common.generation.replay.functions.Constants.HASHCODE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

/**
 * A common subclass for all replay functions that wait until an element with css selector
 * arrives
 */
public class ElementArrivedReplayFunction implements ReplayFunction {

    private String functionDeclarationCode;
    private String webDriverAction;
    private ElementArrivedInvocationProvider elementArrivedInvocationProvider;

    public ElementArrivedReplayFunction(String webDriverAction,
                                        JsCollector jsCollector,
                                        ElementArrivedInvocationProvider elementArrivedInvocationProvider) {
        this.webDriverAction = webDriverAction;
        this.elementArrivedInvocationProvider = elementArrivedInvocationProvider;

        this.functionDeclarationCode = jsCollector
                .declareFunction(webDriverAction)
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
        String hashCode = String.valueOf(MessageFormat.format("{0} {1}", webDriverAction, cssSelector).hashCode());
        return elementArrivedInvocationProvider.get(cssSelector, hashCode);
    }

    public interface ElementArrivedInvocationProvider {
        ReplayFunctionInvocation get(String cssSelector, String hashCode);
    }


}
