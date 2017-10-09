package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.common.generation.record.invocations.TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.*;
import static com.hribol.bromium.core.utils.JsEvents.CHANGE;

/**
 * A {@link RecorderFunction} for {@link com.hribol.bromium.common.replay.actions.TypeTextInElementFoundByCssSelector}
 */
public class TypeTextInElementFoundByCssSelectorRecorderFunction implements RecorderFunction {

    private String functionDeclarationCode;

    public TypeTextInElementFoundByCssSelectorRecorderFunction(JsCollector jsCollector) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR)
                .withParameters(CSS_SELECTOR, EVENT_NAME, TEXT)
                .startBody()
                .whenCssSelectorArrives(CSS_SELECTOR)
                .attachListenerForEvent(CHANGE)
                .startCollectingParameters(PARAMETERS)
                .parameterWithConstantKey(EVENT, EVENT_NAME)
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
        String textAlias = generationInformation.getWebDriverActionConfiguration()
                .getParametersConfiguration()
                .get(TEXT)
                .getAlias();
        return new TypeTextInElementFoundByCssSelectorRecorderFunctionInvocation(cssSelector, eventName, textAlias);
    }
}
