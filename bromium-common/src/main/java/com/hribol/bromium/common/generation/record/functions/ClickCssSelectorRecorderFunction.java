package com.hribol.bromium.common.generation.record.functions;

import com.google.inject.Inject;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.record.invocations.ClickCssSelectorRecorderFunctionInvocation;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class ClickCssSelectorRecorderFunction implements RecorderFunction {

    private String functionDeclarationCode;

    @Inject
    public ClickCssSelectorRecorderFunction(JsCollector jsCollector) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(CLICK_CSS_SELECTOR)
                .withParameters(CSS_SELECTOR, "eventName")
                .startBody()
                .whenCssSelectorArrives(CSS_SELECTOR)
                .attachListenerForEvent("click")
                .startCollectingParameters("parameters")
                .parameter("event", "eventName")
                .buildParameters()
                .notifyBromium("parameters")
                .endListener()
                .endArriveHandler()
                .endBody()
                .build();
    }

    @Override
    public String getJavascriptCode() {
        return functionDeclarationCode;
    }

    @Override
    public RecorderFunctionInvocation getInvocation(NameWebDriverActionConfiguration generationInformation) {
        String eventName = generationInformation.getEventName();
        WebDriverActionConfiguration webDriverActionConfiguration = generationInformation.getWebDriverActionConfiguration();

        String cssSelector = webDriverActionConfiguration
                .getParametersConfiguration()
                .get(CSS_SELECTOR)
                .getValue();

        return new ClickCssSelectorRecorderFunctionInvocation(cssSelector, eventName);
    }
}
