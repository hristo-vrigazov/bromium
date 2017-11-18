package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.utils.WebDriverActions;

import java.text.MessageFormat;
import java.util.Map;

import static com.hribol.bromium.common.builder.JsFunctionNames.CLICK_CLASS_BY_TEXT;
import static com.hribol.bromium.common.generation.replay.functions.Constants.HASHCODE;
import static com.hribol.bromium.common.replay.parsers.ClickClassByTextParser.INITIAL_COLLECTOR_CLASS;
import static com.hribol.bromium.common.replay.parsers.ClickClassByTextParser.INITIAL_COLLECTOR_CLASS_JS_ALIAS;
import static com.hribol.bromium.core.utils.Constants.TEXT;

/**
 * Created by hvrigazov on 04.11.17.
 */
public class ClickClassByTextReplayFunction implements ReplayFunction {

    private String javascriptCode;
    private InvocationProvider provider;

    public ClickClassByTextReplayFunction(JsCollector jsCollector, InvocationProvider provider) {
        this.javascriptCode = jsCollector
                .declareFunction(CLICK_CLASS_BY_TEXT)
                .withParameters(INITIAL_COLLECTOR_CLASS_JS_ALIAS, TEXT, HASHCODE)
                .startBody()
                    .whenCssSelectorArrives("\".\" + " + INITIAL_COLLECTOR_CLASS_JS_ALIAS)
                        .notifySatisfiedBasedOnText(TEXT, HASHCODE)
                    .endArriveHandler()
                .endBody()
                .build();
        this.provider = provider;
    }


    @Override
    public String getJavascriptCode() {
        return javascriptCode;
    }

    @Override
    public ReplayFunctionInvocation getInvocation(StepAndWebDriverActionConfiguration generationInformation) {
        Map<String, ParameterConfiguration> parametersConfiguration = generationInformation.getGenerationFunctionInformation().getParametersConfiguration();
        String initialCollectorClass = parametersConfiguration.get(INITIAL_COLLECTOR_CLASS).getValue();
        String text = generationInformation.getTestCaseStep().get(parametersConfiguration.get(TEXT).getAlias());
        String hashCode = String.valueOf(MessageFormat.format("{0} .{1} {2}",
                WebDriverActions.CLICK_CLASS_BY_TEXT, initialCollectorClass, text)
                .hashCode());
        return provider.get(initialCollectorClass, text, hashCode);
    }

    public interface InvocationProvider {
        ReplayFunctionInvocation get(String initialCollectorClass, String text, String hashCode);
    }
}
