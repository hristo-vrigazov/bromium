package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.Model;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

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
    //TODO: add more tests and finish implementation


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
