package com.hribol.bromium.core.suppliers;

import com.hribol.bromium.core.utils.JavascriptInjector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by hvrigazov on 03.07.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(JavascriptInjectorSupplier.class)
public class JavascriptInjectorSupplierTest {

    @Test
    public void createsInstanceByReader() throws Exception {
        Reader reader = new StringReader("something");

        JavascriptInjector expected = mock(JavascriptInjector.class);
        PowerMockito.whenNew(JavascriptInjector.class).withArguments(reader).thenReturn(expected);

        JavascriptInjectorSupplier javascriptInjectorSupplier = new JavascriptInjectorSupplier();

        JavascriptInjector actual = javascriptInjectorSupplier.get(reader);

        assertEquals(expected, actual);
    }
}
