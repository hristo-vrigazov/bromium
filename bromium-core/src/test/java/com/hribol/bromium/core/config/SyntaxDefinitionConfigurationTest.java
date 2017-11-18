package com.hribol.bromium.core.config;

import com.codebox.bean.JavaBeanTester;
import org.junit.Test;

public class SyntaxDefinitionConfigurationTest {

    @Test
    public void testBean() {
        JavaBeanTester.builder(SyntaxDefinitionConfiguration.class).test();
    }


}
