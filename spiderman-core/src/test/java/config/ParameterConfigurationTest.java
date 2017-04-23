package config;

import com.hribol.spiderman.core.config.ParameterConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hvrigazov on 22.04.17.
 */
public class ParameterConfigurationTest {

    @Test
    public void parameterConfigurationGettersAndSetters() {
        String parameterName = "parameterName";
        boolean expose = true;
        String value = "value";
        String alias = "alias";

        ParameterConfiguration parameterConfiguration = new ParameterConfiguration();
        parameterConfiguration.setParameterName(parameterName);
        parameterConfiguration.setExpose(expose);
        parameterConfiguration.setValue(value);
        parameterConfiguration.setAlias(alias);

        assertEquals(parameterName, parameterConfiguration.getParameterName());
        assertEquals(expose, parameterConfiguration.isExposed());
        assertEquals(value, parameterConfiguration.getValue());
        assertEquals(alias, parameterConfiguration.getAlias());
    }
}
