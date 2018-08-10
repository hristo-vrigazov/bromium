package com.hribol.bromium.common.parsing.dsl.convert;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ContextProvider;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;
import com.hribol.bromium.dsl.bromium.WebDriverAction;
import com.hribol.bromium.dsl.bromium.WebDriverActionCondition;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static com.hribol.bromium.core.utils.Constants.NOTHING;

/**
 * A class which converts {@link ApplicationAction} from the AST to {@link ApplicationActionConfiguration}
 */
public class ApplicationActionASTNodeConverter implements ASTNodeConverter<ApplicationAction, ApplicationActionConfiguration> {

    private ASTNodeConverter<WebDriverActionCondition, WebDriverActionConfiguration> conditionToActionConverter;
    private ASTNodeConverter<WebDriverAction, WebDriverActionConfiguration> actionToActionConverter;
    private ASTNodeConverter<SyntaxDefinition, SyntaxDefinitionConfiguration> syntaxDefinitionConverter;
    private ASTContextProviderConverter astContextProviderConverter;

    @Inject
    public ApplicationActionASTNodeConverter(ASTNodeConverter<WebDriverActionCondition, WebDriverActionConfiguration> conditionToActionConverter,
                                             ASTNodeConverter<WebDriverAction, WebDriverActionConfiguration> actionToActionConverter,
                                             ASTNodeConverter<SyntaxDefinition, SyntaxDefinitionConfiguration> syntaxDefinitionConverter,
                                             ASTContextProviderConverter astContextProviderConverter) {
        this.conditionToActionConverter = conditionToActionConverter;
        this.actionToActionConverter = actionToActionConverter;
        this.syntaxDefinitionConverter = syntaxDefinitionConverter;
        this.astContextProviderConverter = astContextProviderConverter;
    }


    @Override
    public ApplicationActionConfiguration convert(ApplicationAction applicationAction) {
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setName(applicationAction.getName());

        if (applicationAction.getPrecondition() == null) {
            applicationActionConfiguration.setConditionBeforeExecution(nothingConfiguration());
        } else {
            applicationActionConfiguration.setConditionBeforeExecution(conditionToActionConverter
                    .convert(applicationAction.getPrecondition().getAction()));
        }

        WebDriverActionConfiguration action = actionToActionConverter.convert(applicationAction.getWebDriverAction());
        applicationActionConfiguration.setWebDriverAction(action);

        if (applicationAction.getPostcondition() == null) {
            applicationActionConfiguration.setConditionAfterExecution(nothingConfiguration());
        } else {
            applicationActionConfiguration.setConditionAfterExecution(conditionToActionConverter
                    .convert(applicationAction.getPostcondition().getAction()));
        }

        ContextProvider contextProvider = astContextProviderConverter.convert(applicationAction.getActionContext());
        applicationActionConfiguration.setContextProvider(contextProvider);

        List<SyntaxDefinitionConfiguration> syntaxDefinitions = applicationAction
                .getSyntaxDefinitions()
                .stream()
                .map(syntaxDefinition -> syntaxDefinitionConverter.convert(syntaxDefinition))
                .collect(Collectors.toList());

        applicationActionConfiguration.setSyntaxDefinitionConfigurationList(syntaxDefinitions);

        if (applicationAction.getExpectHttpRequest() == null) {
            applicationActionConfiguration.setExpectsHttpRequest(false);
        } else {
            applicationActionConfiguration.setExpectsHttpRequest(!applicationAction.getExpectHttpRequest().isNot());
        }
        return applicationActionConfiguration;
    }

    private WebDriverActionConfiguration nothingConfiguration() {
        WebDriverActionConfiguration webDriverActionConfiguration = new WebDriverActionConfiguration();
        webDriverActionConfiguration.setParametersConfiguration(new HashMap<>());
        webDriverActionConfiguration.setWebDriverActionType(NOTHING);
        return webDriverActionConfiguration;
    }
}
