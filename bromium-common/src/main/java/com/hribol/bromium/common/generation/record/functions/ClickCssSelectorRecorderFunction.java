package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.CSS_SELECTOR;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.EVENT_NAME;
import static com.hribol.bromium.core.utils.Constants.PARAMETERS;
import static com.hribol.bromium.core.utils.JsEvents.CLICK;

/**
 * A {@link RecorderFunction} for {@link com.hribol.bromium.common.replay.actions.ClickCssSelector}
 */
public class ClickCssSelectorRecorderFunction implements RecorderFunction {

    private String functionDeclarationCode;
    private InvocationProvider invocationProvider;

    public ClickCssSelectorRecorderFunction(JsCollector jsCollector, InvocationProvider invocationProvider) {
        this.invocationProvider = invocationProvider;
        this.functionDeclarationCode = jsCollector
                .declareFunction(CLICK_CSS_SELECTOR)
                .withParameters(CSS_SELECTOR, EVENT_NAME)
                .startBody()
                    .whenCssSelectorArrives(CSS_SELECTOR)
                        .attachListenerForEvent(CLICK)
                            .startCollectingParameters(PARAMETERS)
                                .parameterWithConstantKey(EVENT, EVENT_NAME)
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
        String eventName = generationInformation.getEventName();
        WebDriverActionConfiguration webDriverActionConfiguration = generationInformation.getWebDriverActionConfiguration();

        String cssSelector = webDriverActionConfiguration
                .getParametersConfiguration()
                .get(CSS_SELECTOR)
                .getValue();

        return invocationProvider.get(cssSelector, eventName);
    }

    public interface InvocationProvider {
        RecorderFunctionInvocation get(String cssSelector, String eventName);
    }
}
