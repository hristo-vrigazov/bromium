package com.hribol.bromium.common.parsing;

import com.hribol.bromium.core.config.ApplicationActionConfiguration;
import com.hribol.bromium.core.config.ApplicationConfiguration;
import com.hribol.bromium.core.config.SyntaxDefinitionConfiguration;
import com.hribol.bromium.core.parsing.ApplicationConfigurationParser;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 26.10.17.
 */
public class DslParserTest {

    public static final String EXAMPLE_NAME = "Example name";
    public static final String EXAMPLE_VERSION = "8.2.5";
    public static final String TYPE_USERNAME_FIELD = "typeUsernameField";
    public static final String TYPE = "Type";

    @Test
    public void parsesNameAndThreeDottedVersionCorrectly() throws IOException {
        File file = new File(getClass().getResource("/name.brm").getFile());

        ApplicationConfigurationParser parser = new DslParser();

        ApplicationConfiguration applicationConfiguration = parser.parseApplicationConfiguration(file);

        assertEquals(EXAMPLE_NAME, applicationConfiguration.getApplicationName());
        assertEquals(EXAMPLE_VERSION, applicationConfiguration.getVersion());
    }

    @Test
    public void parsesActionsWithExposedParameters() throws IOException {
        File file = new File(getClass().getResource("/actions.brm").getFile());

        ApplicationConfigurationParser parser = new DslParser();

        ApplicationConfiguration applicationConfiguration = parser.parseApplicationConfiguration(file);

        ApplicationActionConfiguration typeUserNameField = applicationConfiguration.getApplicationActionConfigurationList().get(0);

        assertEquals(TYPE_USERNAME_FIELD, typeUserNameField.getName());

        List<SyntaxDefinitionConfiguration> syntaxDefinitionConfigurations = typeUserNameField.getSyntaxDefinitionConfigurationList();

        assertEquals(TYPE, syntaxDefinitionConfigurations.get(0).getContent());
    }


}
