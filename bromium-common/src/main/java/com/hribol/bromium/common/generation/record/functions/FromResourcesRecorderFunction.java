package com.hribol.bromium.common.generation.record.functions;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.hribol.bromium.common.generation.helper.NameWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.record.invocations.RecorderFunctionInvocation;
import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.core.config.ParameterConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.hribol.bromium.core.utils.Constants.EVENT;

public class FromResourcesRecorderFunction implements RecorderFunction {

    private String jsFunctionName;
    private String javascriptCode;
    private Template invocationCodeTemplate;

    public FromResourcesRecorderFunction(String jsFunctionName, Handlebars handlebars) throws IOException {
        this.javascriptCode = IOUtils.toString(getClass().getResourceAsStream("/record/functions/" + jsFunctionName + ".js")) + System.lineSeparator();
        this.invocationCodeTemplate = handlebars.compile("/record/invocations/" + jsFunctionName);
        this.jsFunctionName = jsFunctionName;
    }

    /**
     * By a given generation information, returns an instance which can be used to
     * generate an invocation of the function
     *
     * @param generationInformation - the information needed for the invocation
     * @return an instance which can be used to generate an invocation of the function
     */
    @Override
    public RecorderFunctionInvocation getInvocation(NameWebDriverActionConfiguration generationInformation) {
        Map<String, String> context = new HashMap<>();
        try {
            String eventName = generationInformation.getEventName();
            context.put(EVENT, eventName);
            WebDriverActionConfiguration webDriverActionConfiguration = generationInformation.getWebDriverActionConfiguration();

            //TODO: here we have the context provider, we should create the function
            for (Map.Entry<String, ParameterConfiguration> entry: webDriverActionConfiguration.getParametersConfiguration().entrySet()) {
                ParameterConfiguration parameterConfiguration = entry.getValue();
                if (!parameterConfiguration.isExposed()) {
                    context.put(entry.getKey(), parameterConfiguration.getValue());
                } else {
                    context.put(entry.getKey(), parameterConfiguration.getAlias());
                }
            }
            String compiled = invocationCodeTemplate.apply(context) + System.lineSeparator();
            String wrapped = "(function() { \n\t" + compiled + " \n})();";
            return () -> wrapped;
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
