package com.hribol.bromium.common.parsing.dsl.convert;

import com.google.inject.Injector;
import com.hribol.bromium.dsl.BromiumStandaloneSetup;
import com.hribol.bromium.dsl.bromium.Model;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.File;

/**
 * Created by hvrigazov on 16.11.17.
 */
public abstract class BaseDSLConfigurationConverterTest {

    protected Model readExample() {
        File file = new File(getClass().getResource("/actions.brm").getFile());
        Injector injector = new BromiumStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource resource = rs.getResource(URI.createURI(file.getAbsolutePath()), true);
        return (Model) resource.getAllContents().next();
    }

}
