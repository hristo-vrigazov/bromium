package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CLASS_BY_TEXT;
import static com.hribol.bromium.common.replay.parsers.ClickClassByTextParser.INITIAL_COLLECTOR_CLASS;
import static com.hribol.bromium.common.replay.parsers.ClickClassByTextParser.INITIAL_COLLECTOR_CLASS_JS_ALIAS;
import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.EVENT_NAME;
import static com.hribol.bromium.core.utils.Constants.INNER_TEXT;
import static com.hribol.bromium.core.utils.Constants.PARAMETERS;
import static com.hribol.bromium.core.utils.Constants.TEXT;
import static com.hribol.bromium.core.utils.JsEvents.CLICK;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ClickClassByTextRecorderFunction implements RecorderFunction {

    private String javascriptCode;
    private InvocationProvider invocationProvider;

    // can't use "class" because it is a reversed keyword in javascrpt

    public ClickClassByTextRecorderFunction(JsCollector jsCollector, InvocationProvider invocationProvider) {
        this.invocationProvider = invocationProvider;
        this.javascriptCode = jsCollector
                .declareFunction(CLICK_CLASS_BY_TEXT)
                    // text in here means the alias for text
                    // TODO: write alternative function for the case when the text is not exposed
                    .withParameters(INITIAL_COLLECTOR_CLASS_JS_ALIAS, TEXT, EVENT_NAME)
                    .startBody()
                        .whenCssSelectorArrives("\".\" + " + INITIAL_COLLECTOR_CLASS_JS_ALIAS)
                            .attachListenerForEvent(CLICK)
                                .startCollectingParameters(PARAMETERS)
                                .parameterWithConstantKey(EVENT, EVENT_NAME)
                                .parameter(TEXT, INNER_TEXT)
                            .buildParameters()
                            .notifyBromium(PARAMETERS)
                            .endListener()
                        .endArriveHandler()
                    .endBody()
                .build();
    }

    @Override
    public String getJavascriptCode() {
        return javascriptCode;
    }

    @Override
    public RecorderFunctionInvocation getInvocation(NameWebDriverActionConfiguration generationInformation) {
        String eventName = generationInformation.getEventName();
        WebDriverActionConfiguration webDriverActionConfiguration = generationInformation.getWebDriverActionConfiguration();

        String initialCollectorClass = webDriverActionConfiguration
                .getParametersConfiguration()
                .get(INITIAL_COLLECTOR_CLASS)
                .getValue();

        String aliasText = webDriverActionConfiguration
                .getParametersConfiguration()
                .get(TEXT)
                .getAlias();

        return invocationProvider.get(initialCollectorClass, aliasText, eventName);
    }

    public interface InvocationProvider {
        RecorderFunctionInvocation get(String initialCollectorClass, String aliasText, String eventName);
    }
}
