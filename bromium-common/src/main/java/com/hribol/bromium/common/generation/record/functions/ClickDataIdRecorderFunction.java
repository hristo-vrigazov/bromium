package com.hribol.bromium.common.generation.record.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_DATA_ID;
import static com.hribol.bromium.core.utils.Constants.*;
import static com.hribol.bromium.core.utils.JsEvents.CLICK;

public class ClickDataIdRecorderFunction implements RecorderFunction {

    private String javascriptCode;
    private InvocationProvider invocationProvider;

    public ClickDataIdRecorderFunction(JsCollector jsCollector, InvocationProvider invocationProvider) {
        this.invocationProvider = invocationProvider;
        this.javascriptCode = jsCollector
                .declareFunction(CLICK_DATA_ID)
                    .withParameters(DATA_ID, EVENT_NAME)
                    .startBody()
                        .whenCssSelectorArrives(INPUT_DATA_ID)
                            .attachListenerForEvent(CLICK)
                                .startCollectingParameters(PARAMETERS)
                                    .parameterWithConstantKey(EVENT, EVENT_NAME)
                                    .parameter(DATA_ID, THIS_DATA_ID)
                                .buildParameters()
                                .notifyBromium(PARAMETERS)
                            .endListener()
                        .endArriveHandler()
                    .endBody()
                .build();
    }

    @Override
    public RecorderFunctionInvocation getInvocation(NameWebDriverActionConfiguration generationInformation) {
        String eventName = generationInformation.getEventName();
        WebDriverActionConfiguration configuration = generationInformation.getWebDriverActionConfiguration();

        String dataId = configuration
                .getParametersConfiguration()
                .get(DATA_ID)
                .getAlias();

        return invocationProvider.get(dataId, eventName);
    }

    @Override
    public String getJavascriptCode() {
        return javascriptCode;
    }

    public interface InvocationProvider {
        RecorderFunctionInvocation get(String dataId, String eventName);
    }

}
