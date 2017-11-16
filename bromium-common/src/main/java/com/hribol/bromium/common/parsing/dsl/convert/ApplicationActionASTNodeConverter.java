package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;
import com.hribol.bromium.dsl.bromium.WebDriverAction;
import com.hribol.bromium.dsl.bromium.WebDriverActionCondition;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A class which converts {@link ApplicationAction} from the AST to {@link ApplicationActionConfiguration}
 */
public class ApplicationActionASTNodeConverter implements ASTNodeConverter<ApplicationAction, ApplicationActionConfiguration> {

    private ASTNodeConverter<WebDriverActionCondition, WebDriverActionConfiguration> conditionToActionConverter;
    private ASTNodeConverter<WebDriverAction, WebDriverActionConfiguration> actionToActionConverter;
    private ASTNodeConverter<SyntaxDefinition, SyntaxDefinitionConfiguration> syntaxDefinitionConverter;

    public ApplicationActionASTNodeConverter(ASTNodeConverter<WebDriverActionCondition, WebDriverActionConfiguration> conditionToActionConverter,
                                             ASTNodeConverter<WebDriverAction, WebDriverActionConfiguration> actionToActionConverter,
                                             ASTNodeConverter<SyntaxDefinition, SyntaxDefinitionConfiguration> syntaxDefinitionConverter) {
        this.conditionToActionConverter = conditionToActionConverter;
        this.actionToActionConverter = actionToActionConverter;
        this.syntaxDefinitionConverter = syntaxDefinitionConverter;
    }


    @Override
    public ApplicationActionConfiguration convert(ApplicationAction applicationAction) {
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setName(applicationAction.getName());

        if (Optional.ofNullable(applicationAction.getPrecondition()).isPresent()) {
            WebDriverActionConfiguration precondition = conditionToActionConverter.convert(applicationAction.getPrecondition().getAction());
            applicationActionConfiguration.setConditionBeforeExecution(precondition);
        }

        WebDriverActionConfiguration action = actionToActionConverter.convert(applicationAction.getWebDriverAction());
        applicationActionConfiguration.setWebDriverAction(action);

        if (Optional.ofNullable(applicationAction.getPostcondition()).isPresent()) {
            WebDriverActionConfiguration postcondition = conditionToActionConverter.convert(applicationAction.getPostcondition().getAction());
            applicationActionConfiguration.setConditionAfterExecution(postcondition);
        }

        List<SyntaxDefinitionConfiguration> syntaxDefinitions = applicationAction
                .getSyntaxDefinitions()
                .stream()
                .map(syntaxDefinition -> syntaxDefinitionConverter.convert(syntaxDefinition))
                .collect(Collectors.toList());

        applicationActionConfiguration.setSyntaxDefinitionConfigurationList(syntaxDefinitions);

        applicationActionConfiguration.setExpectsHttpRequest(!applicationAction.getExpectHttpRequest().isNot());
        return applicationActionConfiguration;
    }
}
