package com.hribol.spiderman.cli;

import com.hribol.spiderman.cli.handlers.UpdateCommandHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Matchers.anyMap;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Created by hvrigazov on 09.05.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        Main.class,
        UpdateCommandHandler.class,
        IOUtils.class
})
public class MainTest {

    @Test
    public void dispatchesCorrectly() throws Exception {
        String[] args = {
          "update", "-a", "configuration.json"
        };

        UpdateCommandHandler updateCommandHandler = mock(UpdateCommandHandler.class);
        doNothing().when(updateCommandHandler).handle(anyMap());
        whenNew(UpdateCommandHandler.class).withAnyArguments().thenReturn(updateCommandHandler);

        Main.main(args);
        verify(updateCommandHandler).handle(anyMap());
    }

    @Test
    public void doesNotDoAnythingIfExceptionIsThrown() throws IOException {
        PowerMockito.mockStatic(IOUtils.class);
        PowerMockito.when(IOUtils.toString(any(InputStream.class))).thenThrow(new IOException("Exception while reading spec"));

        String[] args = {
                "update", "-a", "configuration.json"
        };

        Main.main(args);
    }
}
