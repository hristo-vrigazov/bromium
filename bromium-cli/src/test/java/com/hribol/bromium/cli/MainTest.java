package com.hribol.bromium.cli;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.hribol.bromium.cli.commands.InitCommand;
import com.hribol.bromium.cli.commands.RecordCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.apache.commons.io.IOUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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

        InitCommand initCommand = mock(InitCommand.class);
        Injector injector = mock(Injector.class);
        PowerMockito.mockStatic(Guice.class);
        when(Guice.createInjector(any(Module.class))).thenReturn(injector);
        when(injector.getInstance(InitCommand.class)).thenReturn(initCommand);

        Main.main(args);

        verify(initCommand).run();
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

        RecordCommand recordCommand = mock(RecordCommand.class);
        doThrow(FileNotFoundException.class).when(recordCommand).run();

        Injector injector = mock(Injector.class);
        PowerMockito.mockStatic(Guice.class);
        when(Guice.createInjector(any(Module.class))).thenReturn(injector);

        when(injector.getInstance(RecordCommand.class)).thenReturn(recordCommand);

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
