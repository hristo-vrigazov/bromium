package com.hribol.bromium.core.config;

import com.codebox.bean.JavaBeanTester;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ApplicationActionConfigurationTest {

    @Test
    public void canAddSyntaxDefinitionConfigurations() {
        SyntaxDefinitionConfiguration syntaxDefinitionConfiguration = mock(SyntaxDefinitionConfiguration.class);

        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.addSyntaxDefinition(syntaxDefinitionConfiguration);

        assertEquals(1, applicationActionConfiguration.getSyntaxDefinitionConfigurationList().size());
        assertEquals(syntaxDefinitionConfiguration, applicationActionConfiguration.getSyntaxDefinitionConfigurationList().get(0));
    }

    @Test
    public void expectsHttpRequestIsFalseInitially() {
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();

        assertEquals(false, applicationActionConfiguration.expectsHttpRequest());
    }

    @Test
    public void expectsHttpRequestCanBeWritten() {
        ApplicationActionConfiguration applicationActionConfiguration = new ApplicationActionConfiguration();
        applicationActionConfiguration.setExpectsHttpRequest(true);

        assertEquals(true, applicationActionConfiguration.expectsHttpRequest());
    }

    @Test
    public void testAsBean() {
        JavaBeanTester.builder(ApplicationActionConfiguration.class).test();
    }

}
