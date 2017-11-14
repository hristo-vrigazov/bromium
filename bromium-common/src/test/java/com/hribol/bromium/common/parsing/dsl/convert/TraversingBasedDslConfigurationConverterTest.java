package com.hribol.bromium.common.parsing.dsl.convert;

import com.google.inject.Injector;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.dsl.BromiumStandaloneSetup;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 08.11.17.
 */
public class TraversingBasedDslConfigurationConverterTest {

    public static final String EXAMPLE_NAME = "Example name";
    public static final String EXAMPLE_VERSION = "8.2.5";
    public static final String TYPE_USERNAME_FIELD = "typeUsernameField";
    public static final String TYPE = "Type";
    public static final String USERNAME = "username";

    @Test
    public void setsNameAndVersion() {
        Model model = mock(Model.class);
        when(model.getName()).thenReturn(EXAMPLE_NAME);
        when(model.getVersion()).thenReturn(EXAMPLE_VERSION);
        when(model.getActions()).thenReturn(new EListMock<>());

        TraversingBasedDslConfigurationConverter converter = new TraversingBasedDslConfigurationConverter();
        ApplicationConfiguration configuration = converter.convert(model);

        assertEquals(EXAMPLE_NAME, configuration.getApplicationName());
        assertEquals(EXAMPLE_VERSION, configuration.getVersion());
    }

    @Test
    public void correctlyCreatesElementIsPresent() {
        Model exampleModel = readExample();

        TraversingBasedDslConfigurationConverter converter = new TraversingBasedDslConfigurationConverter();

        ApplicationConfiguration actual = converter.convert(exampleModel);

        assertEquals(EXAMPLE_NAME, actual.getApplicationName());
        assertEquals(EXAMPLE_VERSION, actual.getVersion());
    }

    private Model readExample() {
        File file = new File(getClass().getResource("/actions.brm").getFile());
        Injector injector = new BromiumStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource resource = rs.getResource(URI.createURI(file.getAbsolutePath()), true);
        return (Model) resource.getAllContents().next();
    }

    private class EListMock<E> extends ArrayList<E> implements EList<E> {

        @Override
        public void move(int newPosition, E object) {
            super.set(newPosition, object);
        }

        @Override
        public E move(int newPosition, int oldPosition) {
            E elem = super.get(oldPosition);
            super.set(newPosition, elem);
            return elem;
        }
    }

}
