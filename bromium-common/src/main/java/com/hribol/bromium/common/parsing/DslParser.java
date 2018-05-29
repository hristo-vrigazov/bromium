package com.hribol.bromium.common.parsing;

import com.google.inject.Inject;
import com.hribol.bromium.common.parsing.dsl.convert.ASTNodeConverter;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.dsl.bromium.Model;
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
    private ASTNodeConverter<Model, ApplicationConfiguration> ASTNodeConverter;

    @Inject
    public DslParser(ResourceSet resourceSet,
                     IResourceValidator validator,
                     ASTNodeConverter<Model, ApplicationConfiguration> ASTNodeConverter) {
        this.resourceSet = resourceSet;
        this.validator = validator;
        this.ASTNodeConverter = ASTNodeConverter;
    }

    @Override
    public ApplicationConfiguration parseApplicationConfiguration(File file) throws IOException {
        Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);

        List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);

        if (!issues.isEmpty()) {
            throw new IllegalStateException("Invalid bromium configuration. Issues: " + issues);
        }

        Model model = (Model) resource.getAllContents().next();
        return ASTNodeConverter.convert(model);
    }

    @Override
    public ApplicationConfiguration parseApplicationConfiguration(String filename) throws IOException {
        return parseApplicationConfiguration(new File(filename));
    }
}
