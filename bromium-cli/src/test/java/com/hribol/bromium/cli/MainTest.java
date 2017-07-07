package com.hribol.bromium.cli;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.handlers.InitCommandHandler;
import com.hribol.bromium.cli.handlers.RecordCommandHandler;
import com.hribol.bromium.cli.handlers.UpdateCommandHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.apache.commons.io.IOUtils;

import java.io.FileNotFoundException;
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
        IOUtils.class,
        Main.class,
        Guice.class
})
public class MainTest {

    @Test
    public void dispatchesCorrectly() throws Exception {
        String[] args = {
          "init"
        };

        InitCommandHandler initCommandHandler = mock(InitCommandHandler.class);
        Injector injector = mock(Injector.class);
        PowerMockito.mockStatic(Guice.class);
        when(Guice.createInjector(any(Module.class))).thenReturn(injector);
        when(injector.getInstance(InitCommandHandler.class)).thenReturn(initCommandHandler);

        Main.main(args);

        verify(initCommandHandler).handle(anyMap());
    }

    @Test
    public void logsExceptionIfFileNotFound() throws Exception {
        String[] args = {
                "record",
                "-d", "chromedriver",
                "-a", "/home/hvrigazov/bromium-data/demo-app/configurations/demo.json",
                "-u", "http://localhost:3000",
                "-o", "bromium-core/src/test/resources/dynamic-testCase.json"
        };

        RecordCommandHandler initCommandHandler = mock(RecordCommandHandler.class);
        doThrow(FileNotFoundException.class).when(initCommandHandler).handle(anyMap());

        Injector injector = mock(Injector.class);
        PowerMockito.mockStatic(Guice.class);
        when(Guice.createInjector(any(Module.class))).thenReturn(injector);

        when(injector.getInstance(RecordCommandHandler.class)).thenReturn(initCommandHandler);

        Main.main(args);
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
