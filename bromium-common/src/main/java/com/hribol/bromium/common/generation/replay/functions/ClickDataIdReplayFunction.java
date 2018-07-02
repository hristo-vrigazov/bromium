package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.utils.WebDriverActions;

import java.text.MessageFormat;
import java.util.Map;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_DATA_ID;
import static com.hribol.bromium.common.generation.replay.functions.Constants.HASHCODE;
import static com.hribol.bromium.core.utils.Constants.DATA_ID;

public class ClickDataIdReplayFunction implements ReplayFunction {

    private String javascriptCode;
    private InvocationProvider provider;

    public ClickDataIdReplayFunction(JsCollector jsCollector, InvocationProvider provider) {
        this.javascriptCode = jsCollector
                .declareFunction(CLICK_DATA_ID)
                .withParameters(DATA_ID, HASHCODE)
                .startBody()
                .whenCssSelectorArrives("'input[data-id=\"' + " + DATA_ID + " + '\"]'")
                .notifySatisfiedCondition(HASHCODE)
                .endArriveHandler()
                .endBody()
                .build();
        this.provider = provider;
    }

    @Override
    public ReplayFunctionInvocation getInvocation(StepAndWebDriverActionConfiguration generationInformation) {
        Map<String, ParameterConfiguration> parametersConfiguration = generationInformation.getGenerationFunctionInformation().getParametersConfiguration();
        String dataId = generationInformation.getTestCaseStep().get(parametersConfiguration.get(DATA_ID).getAlias());
        String hashCode = String.valueOf(MessageFormat.format("{0} {1}",
                WebDriverActions.CLICK_DATA_ID, dataId)
                .hashCode());
        return provider.get(dataId, hashCode);
    }

    @Override
    public String getJavascriptCode() {
        return javascriptCode;
    }

    public interface InvocationProvider {
        ReplayFunctionInvocation get(String dataId, String hashCode);
    }
}
