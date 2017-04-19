package com.hribol.automation.config;

/**
 * Created by hvrigazov on 17.03.17.
 */
public class ParameterConfiguration {
    private String parameterName;
    private boolean expose;
    private String value;
    private String alias;

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public boolean isExposed() {
        return expose;
    }

    public void setExpose(boolean expose) {
        this.expose = expose;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
