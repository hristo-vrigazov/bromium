package com.hribol.bromium.common.parsing.dsl.convert;

import com.google.inject.Inject;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.Model;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A class which converts an AST {@link Model} to {@link ApplicationConfiguration} by the traversing
 * the abstract syntax tree
 */
public class TraversingBasedASTNodeConverter implements ASTNodeConverter<Model, ApplicationConfiguration> {

    private ASTNodeConverter<ApplicationAction, ApplicationActionConfiguration> actionConverter;

    @Inject
    public TraversingBasedASTNodeConverter(ASTNodeConverter<ApplicationAction, ApplicationActionConfiguration>
                                                            actionConverter) {
        this.actionConverter = actionConverter;
    }

    @Override
    public ApplicationConfiguration convert(Model model) {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        applicationConfiguration.setApplicationName(model.getName());
        applicationConfiguration.setVersion(model.getVersion());

        List<ApplicationActionConfiguration> actionConfigurations = model
                .getActions()
                .stream()
                .map(applicationAction -> actionConverter.convert(applicationAction))
                .collect(Collectors.toList());

        applicationConfiguration.setApplicationActionConfigurationList(actionConfigurations);

        return applicationConfiguration;
    }
}
