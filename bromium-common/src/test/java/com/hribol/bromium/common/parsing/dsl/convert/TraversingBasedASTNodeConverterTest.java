package com.hribol.bromium.common.parsing.dsl.convert;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.Model;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 08.11.17.
 */
public class TraversingBasedASTNodeConverterTest extends BaseDSLConfigurationConverterTest {

    public static final String EXAMPLE_NAME = "Example name";
    public static final String EXAMPLE_VERSION = "8.2.5";
    public static final String TYPE_USERNAME_FIELD = "typeUsernameField";
    public static final String TYPE = "Type";
    public static final String USERNAME = "username";

    private ASTNodeConverter<ApplicationAction, ApplicationActionConfiguration> actionConverter;

    private Model exampleModel = readExample();

    @Test
    public void setsNameAndVersion() {
        Model model = mock(Model.class);
        actionConverter = mock(ASTNodeConverter.class);
        when(model.getName()).thenReturn(EXAMPLE_NAME);
        when(model.getVersion()).thenReturn(EXAMPLE_VERSION);
        when(model.getActions()).thenReturn(new EListMock<>());

        TraversingBasedASTNodeConverter converter = new TraversingBasedASTNodeConverter(actionConverter);
        ApplicationConfiguration configuration = converter.convert(model);

        assertEquals(EXAMPLE_NAME, configuration.getApplicationName());
        assertEquals(EXAMPLE_VERSION, configuration.getVersion());
    }

    @Test
    public void correctlyCreatesElementIsPresent() {
        actionConverter = mock(ASTNodeConverter.class);
        List<ApplicationActionConfiguration> mockConfigurations = new ArrayList<>();
        for (ApplicationAction applicationAction: exampleModel.getActions()) {
            ApplicationActionConfiguration actionConfigurationMock = mock(ApplicationActionConfiguration.class);
            mockConfigurations.add(actionConfigurationMock);
            when(actionConverter.convert(applicationAction)).thenReturn(actionConfigurationMock);
        }

        TraversingBasedASTNodeConverter converter = new TraversingBasedASTNodeConverter(actionConverter);

        ApplicationConfiguration actual = converter.convert(exampleModel);

        assertEquals(EXAMPLE_NAME, actual.getApplicationName());
        assertEquals(EXAMPLE_VERSION, actual.getVersion());

        List<ApplicationActionConfiguration> actionConfigurations = actual.getApplicationActionConfigurationList();

        assertEquals(4, actionConfigurations.size());
        assertEquals(actionConfigurations, mockConfigurations);
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
