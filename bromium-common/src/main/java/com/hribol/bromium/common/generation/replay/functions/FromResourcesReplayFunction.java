package com.hribol.bromium.common.generation.replay.functions;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.hribol.bromium.core.utils.Constants.EVENT;
import static com.hribol.bromium.core.utils.Constants.HASHCODE;
import static com.hribol.bromium.core.utils.Constants.INDEX;

public class FromResourcesReplayFunction implements ReplayFunction {

    private String jsFunctionName;
    private String javascriptCode;
    private Template invocationCodeTemplate;

    public FromResourcesReplayFunction(String jsFunctionName, Handlebars handlebars) throws IOException {
        this.jsFunctionName = jsFunctionName;
        this.javascriptCode = IOUtils.toString(getClass().getResourceAsStream("/replay/functions/" + jsFunctionName + ".js")) + System.lineSeparator();
        this.invocationCodeTemplate = handlebars.compile("/replay/invocations/" + jsFunctionName);
    }

    @Override
    public ReplayFunctionInvocation getInvocation(StepAndWebDriverActionConfiguration generationInformation) {
        Map<String, String> context = new HashMap<>();
        context.put(INDEX, String.valueOf(generationInformation.getIndex()));
        try {
            Map<String, String> testCaseStep = generationInformation.getTestCaseStep();
            List<String> hashcodeList = new ArrayList<>();
            hashcodeList.add(jsFunctionName);
            WebDriverActionConfiguration webDriverActionConfiguration = generationInformation.getWebDriverActionConfiguration();

            for (Map.Entry<String, ParameterConfiguration> entry: webDriverActionConfiguration.getParametersConfiguration().entrySet()) {
                ParameterConfiguration parameterConfiguration = entry.getValue();
                String parameterValue = !parameterConfiguration.isExposed()
                        ? parameterConfiguration.getValue()
                        : testCaseStep.get(parameterConfiguration.getAlias());
                context.put(entry.getKey(), parameterValue);
                hashcodeList.add(parameterValue);
            }
            String hashCode = String.valueOf(hashcodeList
                    .stream()
                    .collect(Collectors.joining(" "))
                    .hashCode());
            context.put(HASHCODE, hashCode);
            String compiled = invocationCodeTemplate.apply(context) + System.lineSeparator();
            return () -> compiled;
        } catch (IOException e) {
            throw new IllegalStateException("Could not compile template!", e);
        }
    }

    /**
     * @return the javascript code
     */
    @Override
    public String getJavascriptCode() {
        return javascriptCode;
    }
}
