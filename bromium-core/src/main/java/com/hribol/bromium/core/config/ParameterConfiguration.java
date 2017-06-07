package com.hribol.bromium.core.config;

/**
 * Configuration of a parameter of a webdriver action
 */
public class ParameterConfiguration {
    private String parameterName;
    private boolean expose;
    private String value;
    private String alias;

    /**
     * Gets the name of the parameter
     * @return the name of the parameter
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * Sets the name of the parameter
     * @param parameterName the name of the parameter
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * Whether a parameter is exposed. If a parameter is exposed, it means that
     * it will be passed on application action level through an alias. E.g if
     * we want to create an application action for clicking on a navigation bar CLICK_NAV_BAR,
     * we would use ClickClassByText. The "class" parameter would not be exposed,
     * because its value would be set here, for example "navbar-button".
     * The "text" parameter would be exposed, e.g under the alias "tab", because
     * CLICK_NAV_BAR("News"), CLICK_NAV_BAR("Sports") are the same application action, only
     * for a different tab(text).
     * @return whether the action is exposed
     */
    public boolean isExposed() {
        return expose;
    }

    /**
     * Sets whether the action is exposed.  If a parameter is exposed, it means that
     * it will be passed on application action level through an alias. E.g if
     * we want to create an application action for clicking on a navigation bar CLICK_NAV_BAR,
     * we would use ClickClassByText. The "class" parameter would not be exposed,
     * because its value would be set here, for example "navbar-button".
     * The "text" parameter would be exposed, e.g under the alias "tab", because
     * CLICK_NAV_BAR("News"), CLICK_NAV_BAR("Sports") are the same application action, only
     * for a different tab(text).
     * @param expose the new value
     */
    public void setExpose(boolean expose) {
        this.expose = expose;
    }

    /**
     * Gets the value of the parameter, if it is not exposed.
     * @return the value of the parameter
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the parameter
     * @param value the value of the parameter
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the alias of the parameter, if it is exposed
     * @return the alias of the parameter
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the alias of the parameter, if it is exposed
     * @param alias the alias the parameter
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
