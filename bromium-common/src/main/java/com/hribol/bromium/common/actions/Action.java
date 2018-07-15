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
 *
 * Optional:
 * <ul>
 *     <li>Add a custom completion rule in BromiumProposalProvider in the DSL project</li>
 * </ul>
 *
 * Register in factories
 * <ul>
 *     <li>{@link com.hribol.bromium.common.generation.record.BaseRecorderFunctionFactory}</li>
 *     <li>{@link com.hribol.bromium.common.generation.replay.BaseReplayFunctionFactory}</li>
 * </ul>
 *
 * For integration tests:
 * <ul>
 *     <li>Create a new html page for the integration test under bromium-demo-app resources.</li>
 *     <li>Add it to DemoApp#resourcesToBeExtractedInDirectory</li>
 *     <li>Add it to TestUtils#Pages</li>
 *     <li>Add a new action to the demo.brm file in the integration-tests folder</li>
 *     <li>Add the name of the action from the previous step to TestUtils#Events</li>
 *     <li>Create a test case in resources/integration-tests</li>
 *     <li>Add the filename of the test case from the previous step to TestUtils#Resources</li>
 *     <li>Create a class which extends IntegrationTestAssertingThatStatusIsSuccess with the resource from above</li>
 *     <li>Create a class which extends BaseRecordIntegrationTest and performs the actions manually and compares the steps</li>
 * </ul>
 *
 */
public interface Action {

    WebDriverActionParameterParser getParser();

    String getWebDriverActionName();

    class Actions extends ArrayList<Action> {}

}
