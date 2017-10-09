package com.hribol.bromium.common.generation.replay.functions;

import com.google.inject.Inject;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ClickCssSelectorReplayInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.utils.WebDriverActions;

import java.text.MessageFormat;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;
import static com.hribol.bromium.common.generation.replay.functions.Constants.HASHCODE;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

/**
 * A {@link ReplayFunction} for {@link com.hribol.bromium.common.replay.actions.ClickCssSelector}
 */
public class ClickCssSelectorReplayFunction implements ReplayFunction {

    private String functionDeclarationCode;

    @Inject
    public ClickCssSelectorReplayFunction(JsCollector jsCollector) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(CLICK_CSS_SELECTOR)
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
        WebDriverActionConfiguration webDriverActionConfiguration = generationInformation.getWebDriverActionConfiguration();
        ParameterConfiguration cssSelectorConfiguration = webDriverActionConfiguration.getParametersConfiguration().get(CSS_SELECTOR);
        String cssSelector = cssSelectorConfiguration.getValue();
        String hashCode = String.valueOf(MessageFormat.format("{0} {1}", WebDriverActions.CLICK_CSS_SELECTOR, cssSelector).hashCode());
        return new ClickCssSelectorReplayInvocation(cssSelector, hashCode);
    }
}
