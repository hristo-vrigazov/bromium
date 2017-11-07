package com.hribol.bromium.common.parsing;

import com.hribol.bromium.common.parsing.dsl.convert.DslConfigurationConverter;
import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.parsing.ApplicationConfigurationParser;
import com.hribol.bromium.dsl.bromium.Model;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 26.10.17.
 */
public class DslParserTest {

    private ApplicationConfiguration applicationConfiguration;
    private Model model;
    private Resource resource;
    private ResourceSet resourceSet;
    private IResourceValidator resourceValidator;
    private DslConfigurationConverter dslConfigurationConverter;

    @Test
    public void ifNoIssuesThenDelegatedToConverter() throws IOException {
        File file = new File(getClass().getResource("/name.brm").getFile());
        initMocks(file);
        when(resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)).thenReturn(new ArrayList<>());

        ApplicationConfigurationParser parser = new DslParser(resourceSet, resourceValidator, dslConfigurationConverter);

        ApplicationConfiguration actual = parser.parseApplicationConfiguration(file);

        assertEquals(applicationConfiguration, actual);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parsesActionsWithExposedParameters() throws IOException {
        File file = new File(getClass().getResource("/actions.brm").getFile());
        initMocks(file);
        List<Issue> issues = Arrays.asList(mock(Issue.class));
        when(resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)).thenReturn(issues);

        ApplicationConfigurationParser parser = new DslParser(resourceSet, resourceValidator, dslConfigurationConverter);

        expectedException.expect(IllegalStateException.class);
        parser.parseApplicationConfiguration(file);
    }

    private void initMocks(File file) {
        applicationConfiguration = mock(ApplicationConfiguration.class);
        model = mock(Model.class);
        resource = mock(Resource.class, RETURNS_DEEP_STUBS);
        when(resource.getAllContents().next()).thenReturn(model);
        resourceSet = mock(ResourceSet.class);
        when(resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true)).thenReturn(resource);
        resourceValidator = mock(IResourceValidator.class);
        dslConfigurationConverter = mock(DslConfigurationConverter.class);
        when(dslConfigurationConverter.convert(model)).thenReturn(applicationConfiguration);
    }
}
