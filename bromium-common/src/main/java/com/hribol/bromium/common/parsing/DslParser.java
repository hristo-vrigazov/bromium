package com.hribol.bromium.common.parsing;

import com.google.inject.Injector;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.dsl.BromiumStandaloneSetup;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.Model;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Parses an application configuration written in Bromium DSL language
 */
public class DslParser implements ApplicationConfigurationParser {

    private ResourceSet resourceSet;
    private IResourceValidator validator;

    public DslParser() {
        Injector injector = new BromiumStandaloneSetup().createInjectorAndDoEMFRegistration();
        resourceSet = injector.getInstance(ResourceSet.class);
        validator = injector.getInstance(IResourceValidator.class);
    }

    @Override
    public ApplicationConfiguration parseApplicationConfiguration(File file) throws IOException {
        Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);

        List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);

        if (!issues.isEmpty()) {
            throw new IllegalStateException("Invalid bromium configuration. Issues: " + issues);
        }

        Model model = (Model) resource.getAllContents().next();

        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        applicationConfiguration.setApplicationName(model.getName());
        applicationConfiguration.setVersion(model.getVersion());

        for (ApplicationAction applicationAction: model.getActions()) {
            ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
            applicationActionConfiguration.setName(applicationAction.getName());

            for (SyntaxDefinition syntaxDefinition: applicationAction.getSyntaxDefinitions())  {

            }

            applicationConfiguration.addApplicationActionConfiguration(applicationActionConfiguration);
        }

        return applicationConfiguration;
    }

    @Override
    public ApplicationConfiguration parseApplicationConfiguration(String filename) throws IOException {
        return null;
    }
}
