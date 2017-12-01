package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;

import static com.hribol.bromium.common.builder.JsFunctionNames.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.EVENT_NAME;
import static com.hribol.bromium.core.utils.Constants.INPUT_VALUE;
import static com.hribol.bromium.core.utils.Constants.PARAMETERS;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static com.hribol.bromium.core.utils.JsEvents.CHANGE;

/**
 * A {@link RecorderFunction} for {@link com.hribol.bromium.common.replay.actions.TypeTextInElementFoundByCssSelector}
 */
public class TypeTextInElementFoundByCssSelectorRecorderFunction implements RecorderFunction {

    private String functionDeclarationCode;
    private InvocationProvider invocationProvider;

    public TypeTextInElementFoundByCssSelectorRecorderFunction(JsCollector jsCollector, InvocationProvider invocationProvider) {
        this.functionDeclarationCode = jsCollector
                .declareFunction(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR)
                .withParameters(CSS_SELECTOR, EVENT_NAME, TEXT)
                .startBody()
                    .whenCssSelectorArrives(CSS_SELECTOR)
                        .attachListenerForEvent(CHANGE)
                            .startCollectingParameters(PARAMETERS)
                                .parameterWithConstantKey(EVENT, EVENT_NAME)
                                //TODO: this assumes that the text is always an exposed parameter, but
                                // we should handle both cases
                                .parameter(TEXT, INPUT_VALUE)
                            .buildParameters()
                            .notifyBromium(PARAMETERS)
                        .endListener()
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
        return invocationProvider.get(cssSelector, eventName, textAlias);
    }

    public interface InvocationProvider {
        RecorderFunctionInvocation get(String cssSelector, String eventName, String textAlias);
    }
}
