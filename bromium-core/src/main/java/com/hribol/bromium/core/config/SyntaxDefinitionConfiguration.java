package com.hribol.bromium.core.config;

/**
 * A combination of hardcoded string and a definition of exposed parameter that
 * can be used for aliasing a given parameter of a web driver actions
 */
public class SyntaxDefinitionConfiguration {
    private String content;
    private String exposedParameter;

    public String getExposedParameter() {
        return exposedParameter;
    }

    public void setExposedParameter(String exposedParameter) {
        this.exposedParameter = exposedParameter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
