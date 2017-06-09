package com.hribol.bromium.common.record.functions;

import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.record.javascript.generation.builder.JsCollector;
import com.hribol.bromium.record.javascript.generation.functions.RecorderFunction;
import com.hribol.bromium.common.record.invocations.ClickCssSelectorRecorderFunctionInvocation;
import com.hribol.bromium.record.javascript.generation.invocations.RecorderFunctionInvocation;

import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.record.javascript.generation.builder.JsFunctionNames.CLICK_CSS_SELECTOR;

/**
 * Created by hvrigazov on 08.06.17.
 */
public class ClickCssSelectorRecorderFunction implements RecorderFunction {

    private String functionDeclarationCode;

    public ClickCssSelectorRecorderFunction() {
        this(new JsCollector());
    }

    public ClickCssSelectorRecorderFunction(JsCollector jsCollector) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(CLICK_CSS_SELECTOR)
                .withParameters(CSS_SELECTOR, "eventName")
                .startBody()
                .whenCssSelectorArrives("cssSelector")
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
    public RecorderFunctionInvocation getInvocation(String eventName, WebDriverActionConfiguration webDriverActionConfiguration) {
        String cssSelector = webDriverActionConfiguration
                .getParametersConfiguration()
                .get(CSS_SELECTOR)
                .getValue();

        return new ClickCssSelectorRecorderFunctionInvocation(cssSelector, eventName);
    }
}
