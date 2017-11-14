package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.dsl.bromium.*;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

/**
 * A class which converts an AST {@link Model} to {@link ApplicationConfiguration} by the traversing
 * the abstract syntax tree
 */
public class TraversingBasedDslConfigurationConverter implements DslConfigurationConverter {

    @Override
    public ApplicationConfiguration convert(Model model) {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        applicationConfiguration.setApplicationName(model.getName());
        applicationConfiguration.setVersion(model.getVersion());

        for (ApplicationAction applicationAction: model.getActions()) {
            ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
            applicationActionConfiguration.setName(applicationAction.getName());

            for (SyntaxDefinition syntaxDefinition: applicationAction.getSyntaxDefinitions())  {
                SyntaxDefinitionConfiguration syntaxDefinitionConfiguration = new SyntaxDefinitionConfiguration();
                syntaxDefinitionConfiguration.setContent(syntaxDefinition.getContent());
                if (syntaxDefinition.getParameter() != null) {
                    syntaxDefinitionConfiguration.setExposedParameter(syntaxDefinition.getParameter().getName());
                }
                applicationActionConfiguration.addSyntaxDefinition(syntaxDefinitionConfiguration);
            }

            if (applicationAction.getPrecondition() != null) {
                WebDriverActionConfiguration precondition = new WebDriverActionConfiguration();
                precondition.setWebDriverActionType(applicationAction.getPrecondition().getAction().eClass().getName());
                applicationActionConfiguration.setConditionBeforeExecution(precondition);
            }


            applicationConfiguration.addApplicationActionConfiguration(applicationActionConfiguration);
        }

        return applicationConfiguration;
    }
}
