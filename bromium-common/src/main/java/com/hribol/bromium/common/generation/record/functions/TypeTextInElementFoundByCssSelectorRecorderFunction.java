package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.record.invocations.TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.*;
import static com.hribol.bromium.core.utils.JsEvents.CHANGE;

/**
 * Created by hvrigazov on 09.08.17.
 */
public class TypeTextInElementFoundByCssSelectorRecorderFunction implements RecorderFunction {

    private String functionDeclarationCode;

    public TypeTextInElementFoundByCssSelectorRecorderFunction(JsCollector jsCollector) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR)
                .withParameters(CSS_SELECTOR, EVENT_NAME)
                .startBody()
                .whenCssSelectorArrives(CSS_SELECTOR)
                .attachListenerForEvent(CHANGE)
                .startCollectingParameters(PARAMETERS)
                .parameter(EVENT, EVENT_NAME)
                .parameter(TEXT, INPUT_VALUE)
                .buildParameters()
                .notifyBromium(PARAMETERS)
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
        String cssSelector = generationInformation.getWebDriverActionConfiguration()
                .getParametersConfiguration()
                .get(CSS_SELECTOR)
                .getValue();
        String eventName = generationInformation.getEventName();
        return new TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation(cssSelector, eventName);
    }
}
