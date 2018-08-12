package com.hribol.bromium.common.generation.record;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.generation.JavascriptGenerator;
import com.hribol.bromium.dsl.bromium.ClassByText;
import com.hribol.bromium.dsl.bromium.CssSelector;
import com.hribol.bromium.dsl.bromium.CssSelectorByText;
import com.hribol.bromium.dsl.bromium.RowIndex;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecordContextBuildersGenerator implements JavascriptGenerator<ApplicationConfiguration> {

    private List<String> functionDefinitions;

    public RecordContextBuildersGenerator() {
        Stream<String> callbackStream = getCallbackFunctions()
                .stream()
                .map(jsFunctionName -> readJsFunctionFromResources("callbacks", jsFunctionName));

        Stream<String> eagerStream = getEagerFunctions()
                .stream()
                .map(jsFunctionName -> readJsFunctionFromResources("eager", jsFunctionName));

        this.functionDefinitions = Stream.concat(callbackStream, eagerStream).collect(Collectors.toList());
    }

    private String readJsFunctionFromResources(String directory, String jsFunctionName) {
        try {
            return IOUtils.toString(getClass().getResourceAsStream("/record/context/" + directory + "/" + jsFunctionName + ".js")) + System.lineSeparator();
        } catch (IOException e) {
            throw new IllegalStateException("Could not read from resources!", e);
        }
    }

    @Override
    public String generate(ApplicationConfiguration generationInformation) {
        //TODO: probably more complicated logic here, take into account the configuration
        return functionDefinitions.stream().collect(Collectors.joining(System.lineSeparator()));
    }

    private List<String> getCallbackFunctions() {
        return Arrays.asList(
                ClassByText.class.getSimpleName(),
                CssSelector.class.getSimpleName(),
                RowIndex.class.getSimpleName(),
                CssSelectorByText.class.getSimpleName()
        );
    }

    private List<String> getEagerFunctions() {
        return Arrays.asList(
                ClassByText.class.getSimpleName(),
                CssSelector.class.getSimpleName(),
                CssSelectorByText.class.getSimpleName()
        );
    }

}
