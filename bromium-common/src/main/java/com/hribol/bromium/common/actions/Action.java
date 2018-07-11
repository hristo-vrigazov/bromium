package com.hribol.bromium.common.actions;

import com.hribol.bromium.replay.parsers.WebDriverActionParameterParser;

import java.util.ArrayList;

/**
 * To add a new action, one should:
 * <ul>
 *     <li>Create an action name</li>
 *     <li>Create a parser (translates raw map to an actual action) by extending {@link WebDriverActionParameterParser}</li>
 *     <li>Add the parser to {@link com.hribol.bromium.common.replay.factory.WebDriverActionFactoryBase}</li>
 *     <li>Create an action class, extending {@link com.hribol.bromium.replay.actions.WebDriverAction}</li>
 *     <li>Create a function in bromium-common record/functions</li>
 *     <li>Create a function in bromium-common replay/functions</li>
 *     <li>Create an invocation in bromium-common record/invocations</li>
 *     <li>Create an invocation in bromium-common record/invocations</li>
 *     <li>Create a rule which matches the action name in Bromium.xtext</li>
 *     <li>Add the rule to an action or condition in Bromium.xtext</li>
 * </ul>
 */
public interface Action {

    WebDriverActionParameterParser getParser();

    String getWebDriverActionName();

    class Actions extends ArrayList<Action> {}

}
