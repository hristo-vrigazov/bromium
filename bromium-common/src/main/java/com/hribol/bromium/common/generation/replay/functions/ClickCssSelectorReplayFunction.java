package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.replay.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ClickCssSelectorReplayInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.utils.WebDriverActions;

import java.text.MessageFormat;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;

/**
 * Created by hvrigazov on 02.07.17.
 */
public class ClickCssSelectorReplayFunction implements ReplayFunction {

    private String functionDeclarationCode;

    public ClickCssSelectorReplayFunction() {
        this(new JsCollector());
    }

    public ClickCssSelectorReplayFunction(JsCollector jsCollector) {
        this.functionDeclarationCode = "function ClickCssSelector(cssSelector, hashCode) {\n" +
                "    document.arrive(cssSelector, options, function () {\n" +
                "        bromium.notifySatisfiedCondition(hashCode);\n" +
                "    });\n" +
                "    document.leave(cssSelector, function () {\n" +
                "        bromium.notifyNotSatisfiedCondition(hashCode);\n" +
                "    });\n" +
                "}";
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
